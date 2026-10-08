package programmers.level1.p71_80;

public class Problem71 {
    public static void main(String[] args) {
        Solution71 s = new Solution71();
        System.out.println(s.solution("34:33", "13:00", "00:55", "02:55", new String[] {"next", "prev"}));
        System.out.println(s.solution("10:55", "00:05", "00:15", "06:55", new String[] {"prev", "next", "next"}));
        System.out.println(s.solution("07:22", "04:05", "00:15", "04:07", new String[] {"next"}));
    }
}

/**
 * 문제: [PCCP 기출문제] 1번 / 동영상 재생기
*/
class Solution71 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] opStartTimeStr = op_start.split(":");
        int opStartTime = Integer.parseInt(opStartTimeStr[0]) * 60 + Integer.parseInt(opStartTimeStr[1]);

        String[] opEndTimeStr = op_end.split(":");
        int opEndTime = Integer.parseInt(opEndTimeStr[0]) * 60 + Integer.parseInt(opEndTimeStr[1]);

        String[] posTimeStr = pos.split(":");
        int posTime = Integer.parseInt(posTimeStr[0]) * 60 + Integer.parseInt(posTimeStr[1]);

        String[] videoTimeStr = video_len.split(":");
        int videoTime = Integer.parseInt(videoTimeStr[0]) * 60 + Integer.parseInt(videoTimeStr[1]);

        for (String command : commands) {
            if (isOp(posTime, opStartTime, opEndTime)) {
                posTime = opEndTime;
            }

            switch (command) {
                case "prev" -> {
                    posTime -= 10;

                    if (posTime < 0) {
                        posTime = 0;
                    }
                }
                case "next" -> {
                    posTime += 10;
                    posTime = Math.min(posTime, videoTime);
                }
            }
        }

        if (isOp(posTime, opStartTime, opEndTime)) {
            posTime = opEndTime;
        }

        return String.format("%02d:%02d", posTime / 60, posTime % 60);
    }

    private boolean isOp(int posTime, int opStartTime, int opEndTime) {
        return posTime >= opStartTime && posTime <= opEndTime;
    }
}

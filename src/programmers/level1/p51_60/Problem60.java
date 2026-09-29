package programmers.level1.p51_60;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem60 {
    public static void main(String[] args) {
        Solution60 s = new Solution60();
        System.out.println(Arrays.deepToString(s.solution(new int[][]{{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}}, "date", 20300501, "remain")));
    }
}

/**
 * 문제: [PCCE 기출문제] 10번 / 데이터 분석
*/
class Solution60 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> cols = List.of("code", "date", "maximum", "remain");
        int extIndex = cols.indexOf(ext);
        int sortIndex = cols.indexOf(sort_by);

        return Arrays.stream(data)
            .filter(d -> d[extIndex] < val_ext)
            .sorted(Comparator.comparingInt(o -> o[sortIndex]))
            .toArray(int[][]::new);
    }
}

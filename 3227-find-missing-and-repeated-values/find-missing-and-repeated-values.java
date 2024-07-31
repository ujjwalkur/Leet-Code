public class Solution {
    public int[] findMissingAndRepeatedValues(int[][] v) {
        int n = v.length;
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m.put(v[i][j], m.getOrDefault(v[i][j], 0) + 1);
            }
        }

        int a = -1, b = -1;
        for (int i = 1; i <= n * n; i++) {
            var curValue = m.getOrDefault(i, 0) ;
            if (curValue == 2) {
                a = i;
            } else if (curValue == 0) {
                b = i;
            }
        }

        return new int[]{a, b};
    }
}
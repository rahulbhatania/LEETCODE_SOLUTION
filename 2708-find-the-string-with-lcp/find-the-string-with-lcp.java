class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;

        for (int i = 0; i < n; i++) {
            if (lcp[i][i] != n - i) return "";
            for (int j = 0; j < n; j++) {
                if (lcp[i][j] != lcp[j][i]) return "";
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == n - 1 || j == n - 1) {
                    if (lcp[i][j] > 1) return "";
                } else {
                    if (lcp[i][j] > 0 && lcp[i][j] != 1 + lcp[i + 1][j + 1]) {
                        return "";
                    }
                }
            }
        }

        char[] res = new char[n];
        for (int i = 0; i < n; i++) res[i] = '#';

        char ch = 'a';

        for (int i = 0; i < n; i++) {
            if (res[i] == '#') {
                if (ch > 'z') return "";
                for (int j = i; j < n; j++) {
                    if (lcp[i][j] > 0) {
                        res[j] = ch;
                    }
                }
                ch++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = 0;
                while (i + k < n && j + k < n && res[i + k] == res[j + k]) {
                    k++;
                }
                if (lcp[i][j] != k) return "";
            }
        }

        return new String(res);
    }
}
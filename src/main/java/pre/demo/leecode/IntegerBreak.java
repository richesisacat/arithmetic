package pre.demo.leecode;

/**
 * 整数拆分
 * <p>
 * https://leetcode-cn.com/problems/integer-break/
 */
public class IntegerBreak {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}

package dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbStairsSolution {

    public int climbStairs(int n){

        int dp[] = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    static int indexFor(int h, int length) {
                 return h & (length-1);
    }


    @Test
    public void test(){
       int a = indexFor(7647864,5);
       System.out.println(a);
        //assertEquals(8,climbStairs(5));
    }
}

//   1 2 3 5 8
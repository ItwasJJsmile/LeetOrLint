package recursion;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class JieCheng {
    private static Logger logger = LoggerFactory.getLogger(ReverseString.class);
    public static int sum = 1;

    public static int jieChengCount(int n){
        String a = "abc";
        if(n == 1){
            return sum;
        }else {
            return n * jieChengCount(n - 1);
        }
    }

    @Test
    public void test(){
        assertEquals(120,jieChengCount(5));
    }
}

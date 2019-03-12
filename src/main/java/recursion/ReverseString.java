package recursion;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReverseString {
    private static Logger logger = LoggerFactory.getLogger(ReverseString.class);


    public static char[] reverseString(char[] s, int lPointer, int rPointer) {

        char temp ;

        while(lPointer<rPointer){
            temp = s[lPointer];
            s[lPointer] = s[rPointer];
            s[rPointer] = temp;
            reverseString(s,++lPointer, --rPointer);
        }

        logger.warn("........ " + s);
        return s;
    }

    @Test
    public void test(){
        char[] cArray = {'a','b','c','d'};
        char[] reverseArray = {'d','c','b','a'};

        assertTrue(Arrays.equals(reverseString(cArray,0,cArray.length-1),reverseArray));
    }
}
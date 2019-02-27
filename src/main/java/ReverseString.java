import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseString {
    private static Logger logger = LoggerFactory.getLogger(ReverseString.class);


    public void reverseString(char[] s) {

    }

    private static void printReverse(char [] str) {
        helper(0, str);
    }

    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.println(String.valueOf(str[index]));
    }

    @Test
    public void test(){
        char[] cArray = {'a','b','c','d'};
        printReverse(cArray);
    }



}

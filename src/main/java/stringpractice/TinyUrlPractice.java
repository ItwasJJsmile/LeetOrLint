package stringpractice;

import org.junit.Test;

public class TinyUrlPractice {

    // Function to generate a short url from integer ID
    public String idToShortURL(int n)
    {
        // Map to store 62 possible characters
        char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        StringBuffer shorturl = new StringBuffer();

        // Convert given integer id to a base 62 number
        while (n > 0)
        {
            // use above map to store actual character
            // in short url
            shorturl.append(map[n % 62]);
            n = n / 100;
        }

        // Reverse shortURL to complete base conversion
        return shorturl.reverse().toString();
    }

    // Function to get integer ID back from a short url
    public int shortURLtoID(String shortURL)
    {
        int id = 0; // initialize result

        // A simple base conversion logic
        for (int i = 0; i < shortURL.length(); i++)
        {
            if ('a' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= 'z')
                id = id * 62 + shortURL.charAt(i) - 'a';
            if ('A' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= 'Z')
                id = id * 62 + shortURL.charAt(i) - 'A' + 26;
            if ('0' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= '9')
                id = id * 62 + shortURL.charAt(i) - '0' + 52;
        }
        return id;
    }

    //@Test
    public void test01(){
        int a = 10;
        System.out.println(10/2);
            int n1 = 6;
            int n2 = 68;

            String shorturl1 = idToShortURLReview(n1);
            String shorturl2 = idToShortURL(n2);

            System.out.println("Generated short url is " + shorturl1);
            System.out.println("Generated short url is " + shorturl2);
    }

    @Test
    public void test02(){

        int n1 = 111;
        int n2 = 7281;
        String shorturl1 = null;

        for(int i=0;i<199;i++){
            shorturl1 = idToShortURLReview(i);
            System.out.println(i + ". Generated short url is " + shorturl1);
        }

    }

    private String idToShortURLReview(int n) {
        if(n<0){
            return null;
        }

        char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuffer tinyUrl = new StringBuffer();

        while(n>0){
            tinyUrl.append(map[n%62]);
            n = n/62;
        }

        return tinyUrl.toString();
    }

}

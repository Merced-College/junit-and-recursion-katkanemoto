//Kanemoto
//4.14.26
//Testing Recursion

public class TestingRecursion2 {

    public static  String stringClean(String str) {

        //base case
        if(str.length() == 1) {
            return str;
        }

        //look at the first and second letters and see if they match
        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);

        if(firstLetter == secondLetter) {
            //take out first letter
            return stringClean(str.substring(1));
        }
        return firstLetter + stringClean(str.substring(1));

    }


    public static int countHi(String str) {

        //test for null str
        if(str == null) {
            return 0;
        }

        //base case
        if (str.length() <= 1) {
            return 0;
        }

        //check if the first 2 letters are an h and i
        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);

        if(firstLetter == 'h' && secondLetter == 'i') {
            //found an hi, count it and take it out of the String
            return 1 + countHi(str.substring(2));
        }

        return countHi(str.substring(1));
    }

    public static void main (String[] args) {

       // System.out.println(countHi("xxhixhxhihi"));
       System.out.println(stringClean("aabbcc"));

    }
}

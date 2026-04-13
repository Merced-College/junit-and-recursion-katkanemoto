//Kanemoto
//4.13.26
//Testing Recursion

public class TestingRecursion {

    public static int count8(int n) {

        //base case 8818
        if(n < 10)
            if(n == 8)
                return 1;
            else
                return 0;

        int onesPlace = n % 10;
        n /= 10; //n = n /10; we are getting rid of that ones place
        int tensPlace = n % 10;

        if(onesPlace == 8)
            if(tensPlace == 8)
                return 2 + count8(n);
            else
                return 1 + count8(n);
        
        else 
            return count8(n);

    }//end count8

    public static int strCount(String str, String sub) {
        //base case
        if(str.length() < sub.length())
            return 0;

        if(str.substring(0, sub.length()).equals(sub))
            return 1 + strCount(str.substring(sub.length()), sub);
        else
            return strCount(str.substring(1), sub);

    }

    public static void main(String[] args) {
        //System.out.println(count8(8818));
        System.out.println(strCount("catcowcat", "cat"));
    }

}
package CoreJavaPractice;

public class IntegerReverse {

    public static int intReverse(int x){
        String str = String.valueOf(x);
        String output = "";

        for(int i=str.length()-1; i>=0; i--){
            output =  output + str.charAt(i);
        }
        return Integer.parseInt(output);


//        int rev = 0;
//        while(x != 0){
//            int pop = x % 10;
//            x /= 10;
//            if(rev > Integer.MAX_VALUE || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//            if(rev < Integer.MIN_VALUE || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;

    }

    public static void main(String[] args) {
        int x = 1234;
        System.out.println(intReverse(x));
    }
}

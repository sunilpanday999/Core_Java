package CoreJavaPractice;

public class HighAndLowNumber {
    public static String highLow(String s) {
        int high = 1;
        int low = 1;
        String [] c = s.split(" ");
        int [] num = new int[c.length];
        for(int i=0; i<num.length;i++){
            num[i] = Integer.parseInt(c[i]);
            if(high < num[i]){
                high = num[i];
            }
            if(low > num[i]){
                low = num[i];
            }
        }
        String highLowNum = String.valueOf(high)+" "+String.valueOf(low);
        return highLowNum;
    }

    public static void main(String[] args) {
        System.out.println(highLow("1 2 3 4 5"));
    }
}

package CoreJavaPractice;

public class PerfectNumber {
    public static boolean checkPerfect(int num) {
        int number = 0;
        for(int i=1; i<num; i++){
            if(num%i == 0){
                number += i;
                if(number == num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfect(28));
    }
}

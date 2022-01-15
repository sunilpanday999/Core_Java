package CoreJavaPractice;

public class RooksAttack {
    public static boolean canCapture(String[] rooks) {

        for(int i = 0; i < rooks.length-1; i++) {
            if((rooks[i].charAt(0)==rooks[i+1].charAt(0)) || (rooks[i].charAt(1) == rooks[i+1].charAt(1))){
                return true;
            }
//            if(rooks[i].charAt(1)=='9'){
//                return true;
//            }
        }
        return false;
    }
    public static void main(String[] args) {
        String [] rooks = {"C9", "A9"};
        System.out.println(canCapture(rooks));
    }
}

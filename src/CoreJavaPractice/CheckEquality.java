package CoreJavaPractice;

public class CheckEquality {

    public static boolean checkEqual(Object a, Object b ){
        if(a == b){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkEqual(3, "true"));
    }
}

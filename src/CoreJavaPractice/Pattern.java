package CoreJavaPractice;

public class Pattern {

    public static void main(String[] args) {
       patterns(5);
    }

    public static void patterns(int n){
        for (int i=0; i< n; i++){
            for(int j=i; j<n; j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}

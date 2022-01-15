package CoreJavaPractice;

public class QuadraticCheckSolution {

    public static int checkSolution(int a, int b, int c){

        if(((b*b) - (4*a*c))> 0){
            return 2;
        }
        else if(((b*b) - (4*a*c))==0){
            return 1;
        }
      return 0;
    }

    public static void main(String[] args) {
        System.out.println(checkSolution(2, 5, 3));
    }
}

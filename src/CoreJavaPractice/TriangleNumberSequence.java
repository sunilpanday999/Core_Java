package CoreJavaPractice;

public class TriangleNumberSequence {
    public static int triangle(int n) {

        //1 = 1  2 = 3; 3=6; 4=10; 5=15; {1,3,6,10,15, x}
//        int numbers_of_dots = 1;
//        int index = 1;
//        for(int i=1; i<=n; i++){
//            System.out.print(numbers_of_dots+ " ");
//            index += 1;
//            numbers_of_dots += index;
//        }
//        return numbers_of_dots;

        int nums = 0;
        for(int i = 0; i<=n; i++){
            nums += i;
        }
        return nums;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(triangle(n));
    }

}

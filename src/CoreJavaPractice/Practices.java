package CoreJavaPractice;

public class Practices {

        // Create a public static method called practice that takes two ints as input and returns an int
        // If the parameters are the same, then multiply them together and return the result
        // If the first one is greater and it is even (remember modulo %), then add them together and return the result
        // Otherwise, subtract the first one from the second one and return the result
        // METHOD GOES HERE
        public static int practice(int a, int b){
            int result = 0;
            if (a==b){
                result = a*b;
            }
            else if (a > b && a%2 == 0) {
                result = a + b;
            }
            else{
                result = b - a;
            }
            return result;
        }

        public static void main(String[] args) {
            // use a nested for loop to call the practice method with all possible combinations for ints less than 3
            // print the results
            // outer for loop provided
            for (int i = 0; i < 3; i++) {
                for(int j=0; j < 3; j++){
                    int result = practice(i, j);
                    System.out.println(result);
                }
            }
            // if everything went well, then you should see these results:
            // 0 1 2 -1 1 1 2 3 4
        }
    }

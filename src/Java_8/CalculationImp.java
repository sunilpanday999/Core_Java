package Java_8;

interface Calculation{
    //Function Interface -> one abstract method and multiple default and static method

    //without argument
//    void switchOn ();

    //with arguement
//    void sum(int num);


    //  return type with multiple arguement
    void subtract(int a, int b);
}
public class CalculationImp {


    //we can express lamda expression only in functional interface

    public static void main(String[] args) {
        //lamda expression


//        Calculation calculation = () -> System.out.println("Printing the switch on method");
//        calculation.switchOn();


//        Calculation calculation = (num) -> System.out.println("Sum : " + num);
//        calculation.sum(20);

        String result = "";
        Calculation calculation = (a, b) -> {
            if (a > b){
                System.out.println("Negative");
            }
            else{
                System.out.println("Positive");
            }
        };
        calculation.subtract(4, 5);
    }
}

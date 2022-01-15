package CoreJavaPractice;

public class SwapFirstAndLastName {
    public static String nameShuffle(String s) {
        int spaceBetweenFirstAndLastName = s.indexOf(" ");

        String firstName = s.substring(0, spaceBetweenFirstAndLastName);
        String lastName = s.substring(spaceBetweenFirstAndLastName+1);
        String name = lastName + " "+ firstName;

        return name;
    }

    public static void main(String[] args) {
        String s = "Sunil Panday";
        System.out.println(nameShuffle(s));
    }
}

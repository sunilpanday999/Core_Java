package CoreJavaPractice;

public class SimulateTheGame {
    public static String rps(String s1, String s2) {
            String rock = "Rock";
            String paper = "Paper";
            String scissors = "Scissors";
            if((s1.equalsIgnoreCase(rock) && s2.equalsIgnoreCase(paper)) ||
                    (s1.equalsIgnoreCase(scissors) && s2.equalsIgnoreCase(paper)) ||
                    (s1.equalsIgnoreCase(rock) && s2.equalsIgnoreCase(scissors))){
                return "Player1 wins";
            }
            else if((s2.equalsIgnoreCase(rock) && s1.equalsIgnoreCase(paper)) ||
                    (s2.equalsIgnoreCase(scissors) && s1.equalsIgnoreCase(paper)) ||
                    (s2.equalsIgnoreCase(rock) && s1.equalsIgnoreCase(scissors))) {
                return "Player2 wins";
            }
            return "Tie";

    }

    public static void main(String[] args) {
        System.out.println(rps("rock", "rock"));
    }
}

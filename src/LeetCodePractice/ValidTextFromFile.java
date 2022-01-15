package LeetCodePractice;

import java.io.*;

public class ValidTextFromFile {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/Users/sunilpanday/Core_Java/src/LeetCodePractice/file.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while((line = bufferedReader.readLine()) != null){
            if (line.contains(")")){
                System.out.println(line);
            }
        }

    }
}

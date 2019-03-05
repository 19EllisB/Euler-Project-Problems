import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

class ProblemSixteen {
    public static void main(String[] args) {
        File inputFile = new File("P16Num.txt");
        String outputFile = "P16IntArray.txt";
        Pattern p = Pattern.compile("[0-9]");
        try (Scanner input = new Scanner(inputFile);
        PrintWriter output = new PrintWriter(outputFile)) {
            output.print("{");
            while (input.hasNext(p)) {
                output.printf("%s, ", input.next(p));
            }
            output.print("}");
        } catch (FileNotFoundException e) {
            System.out.println("Woops! I couldn't find your input file");
        }
    }
}
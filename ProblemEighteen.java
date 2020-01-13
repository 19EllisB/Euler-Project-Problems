import java.util.*;
import java.util.regex.*;
import java.io.*;

class ProblemEighteen {
    public static void TriangleDataPrep() throws FileNotFoundException {
        //Scanner userInput = new Scanner(System.in); // allows user to input file names in the console

        //System.out.println("Choose a name for you input file");
        //String inputFilename = userInput.nextLine();
        String inputFilename = "Triangle.txt";
        String outputFilename = "PreppedTriangle.txt";

        File inputFile= new File(inputFilename); //loads file into memory

        try (Scanner input = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFilename)){ 
            while (input.hasNextLine()) {
                //String s = input.nextLine();
                Scanner inLine = new Scanner(input.nextLine());
                Pattern p = Pattern.compile("[0-9]+(?!$)"); //at least 1 digit not followed by the end of the input
                out.print("{");
                while (inLine.hasNextInt()) {
                    inLine.useDelimiter("[ ]+");//at least one space
                    if (inLine.hasNext(p)) {
                        inLine.useDelimiter("\\p{javaWhitespace}+"); // one or more whitespace characters
                        out.printf("%d, ", inLine.nextInt());
                    } else {
                        inLine.useDelimiter("\\p{javaWhitespace}+");
                        out.printf("%d", inLine.nextInt());
                    }
                }
                out.printf("}, %n");
            }
        } catch (FileNotFoundException exc) { //only thrown by not finding the input file
            System.out.println("Woops! I couldn't find your input file!");
        }
    }

    public static void main(String[] args) {
        int[][] triangle = {{75}, 
                {95, 64}, 
                {17, 47, 82}, 
                {18, 35, 87, 10}, 
                {20, 4, 82, 47, 65}, 
                {19, 1, 23, 75, 3, 34}, 
                {88, 2, 77, 73, 7, 63, 67}, 
                {99, 65, 4, 28, 6, 16, 70, 92}, 
                {41, 41, 26, 56, 83, 40, 80, 70, 33}, 
                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29}, 
                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14}, 
                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57}, 
                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48}, 
                {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31}, 
                {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}
        };
            
        for (int[] arr: triangle) {
            
        }
    }
}
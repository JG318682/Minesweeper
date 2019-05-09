import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Score
{
    private int score = Cell.score;

    private static final String DATA_FILE = "Score.txt";

    private static Scanner in;
    private static BufferedWriter out;


//      Returns a line of text from the input file

    public static String readString() {
        if (in == null) {
            try {
                in = new Scanner(new File(DATA_FILE));
            }
            catch (Exception e) {
                System.err.println("Cannot open file for input!");
                e.printStackTrace();
            }
        }
        try {
            if (in.hasNext()) {
                String s = in.nextLine();
                return s;
            }
            else {
                return null;
            }
        }
        catch (Exception e) {
            System.err.println("Cannot read  file!");
            e.printStackTrace();
        }
        return null;

    }


//      Writes a score to the file and creates a newline.

    public static void writeScore(int s) {
        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            }
            catch (Exception e) {
                System.err.println("Cannot create file for output!");
                e.printStackTrace();
            }
        }

        try {
            out.write(s);
            out.newLine();
        }
        catch (Exception e) {
            System.err.println("Cannot write file!");
            e.printStackTrace();
        }

    }

//     Saves and closes the file


    public static void saveAndClose() {
        if (in != null) {
            try {
                in.close();
                in = null;
            }
            catch (Exception e) {
                System.err.println("Cannot close input file!");
                e.printStackTrace();
            }
        }
        if (out != null) {
            try {
                out.close();
                out = null;
            }
            catch (Exception e) {
                System.err.println("Cannot close output file!");
                e.printStackTrace();
            }
        }
    }
}
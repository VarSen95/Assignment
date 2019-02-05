import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String temp;
        Temp t;
        System.out.println("Enter temperature putting a space between temp and unit");
        Scanner in = new Scanner(System.in);
        temp = in.nextLine();
        String[] tokens = temp.split(" ");

        if (tokens[1].equals("fahrenheit")) {

            t = new Temp(tokens[0], null, null);
            t.convert();
        } else if (tokens[1].equals("celsius")) {
            t = new Temp(null, tokens[0], null);
            t.convert();
        } else if (tokens[1].equals("kelvin")) {
            t = new Temp(null, null, tokens[0]);
            t.convert();
        }


    }
}
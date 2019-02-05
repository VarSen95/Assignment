package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int option;
        String temp;

        String[] tokens;
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to convert?\n ******************************** \n 1.TEMP \n 2.WEIGHT \n 3.HEIGHT \n ********************************");
        option=in.nextInt();              // Takes input from user
        switch(option) {
            case 1:
                System.out.println("Enter temperature putting a space between temp and unit");
                in = new Scanner(System.in);
                temp = in.nextLine();
                tokens = temp.split(" "); // Splits the string whenever a space is encountered.
                                                // Thus tokens[0] contains value and tokens[1] contains the unit

                if (tokens[1].equals("fahrenheit")) {

                    Temp t = new Temp(tokens[0], null, null);
                    t.convert();
                } else if (tokens[1].equals("celsius")) {
                    Temp t = new Temp(null, tokens[0], null);
                    t.convert();
                } else if (tokens[1].equals("kelvin")) {
                    Temp t = new Temp(null, null, tokens[0]);
                    t.convert();
                }
                break;

            case 2:
                System.out.println("Enter weight putting a space between weight and unit");
                in = new Scanner(System.in);
                temp = in.nextLine();
                tokens = temp.split(" ");

                if (tokens[1].equals("kilograms")) {

                    Weight w = new Weight(tokens[0], null);
                    w.convert();
                } else if (tokens[1].equals("pounds")) {
                    Weight w = new Weight(null, tokens[0]);
                    w.convert();
                }
                break;


            case 3:

                System.out.println("Enter height putting a space between height and unit");
                in = new Scanner(System.in);
                temp = in.nextLine();
                tokens = temp.split(" ");

                if (tokens[1].equals("inch")) {

                    Height w = new Height(tokens[0], null);
                    w.convert();
                } else if (tokens[1].equals("centimeters")) {
                    Height w = new Height(null, tokens[0]);
                    w.convert();
                }
                break;
        }

        }
}

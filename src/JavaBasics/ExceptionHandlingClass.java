package JavaBasics;

import java.io.*;

class NotPassedException extends Exception {

    NotPassedException() {
        super("Marks are insufficient to pass.");
    }
}

public class ExceptionHandlingClass {

    public static void main(String[] args) throws IOException, NotPassedException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the Student: ");
        String name = br.readLine();
        System.out.println("Enter the roll no. of the Student: ");
        int roll = Integer.parseInt(br.readLine());
        System.out.println("Enter the marks of the Student separated by space: ");
        String[] marks = br.readLine().split(" ");

        for (String mark : marks) {
            if (Integer.parseInt(mark) < 40) {
                throw new NotPassedException();
            }
        }

    }
}


package actions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Write{
    public int writeAction(){
        System.out.print("Input field: ");
        Scanner scanner = new Scanner(System.in);
        int number = 5;
        try {
            number = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("!Exeption! Enter a number");
            writeAction();
        }
        return number;
    }

}

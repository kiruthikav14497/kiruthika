package prp;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer that you would like to have reversed: ");
        int number = input.nextInt();

        reverse(number);
    }

    public static void reverse(int userInteger)
    {
        int tempDigit = 0;

        while (userInteger > 0){

            tempDigit = userInteger % 10;
            System.out.print(tempDigit);
            userInteger = userInteger / 10;
        }

	}

}

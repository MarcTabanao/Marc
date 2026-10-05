import java.util.Scanner;

public class Mac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amount;
        int total= 0;
        int count = 0;

        System.out.println("Enter the amount spent):");
        amount = input.nextInt();

        while (amount != -0) {

            total = amount + count;
            count++;

            System.out.println("Enter the amount spend (O to stop): ");
            amount = input.nextInt();
        }
        System.out.println("The Total amount Spent= " + total);
        System.out.println("The Number of item purchased= " + count);


    }
}

import java.util.Scanner;

public class Assignment_4_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int constant = 200;

        while(input.hasNext()){

            double items = input.nextDouble();
            double extraMoney = items*0.09;
            total += extraMoney;


        }
        if(total>0) {
            System.out.printf("This is the total earnings %f", total+constant);
        }
        else{
            System.out.println("No items were entered.");
        }


    }



}

public class ForCounter {
    public static void main(String[] args) {

//        int counter = 0;
//
//        for ( counter = 0; counter < 10; counter++){
//
//            System.out.printf("%d ", counter + 1);
//        }
//        System.out.printf("%d ", counter);
        int total = 0;

        // loop over even numbers from 2 to 20
        for( int number = 1; number <= 20; number +=2){
            //body of for loop
            System.out.printf("%d ", number);
            total += number;
        }
        System.out.println("total = " + total);
        System.out.printf("Sum is %d%n", total);

    } // main
} // ForCounter

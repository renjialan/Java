// while loop in class
public class WhileCounter {

    public static void main(String[] args) {

        int counter = 1; // declare and initialize control variable

        while(counter <= 10 ){

            System.out.printf("%d ", counter); // %d hexadecimal int

            ++counter; // increment control variable
        }

        counter = 1; // reset counter to one

        // POST increment test
        System.out.println("");
        System.out.println("counter = " + counter);
        System.out.println("counter++ = " + counter ++);
        System.out.println("counter = " + counter);

        // PRE increment test
        System.out.println("");
        System.out.println("counter = " + counter);
        System.out.println("++counter = " + ++counter) ;
        System.out.println("counter = " + counter);


    } //main
} // WhileCounter

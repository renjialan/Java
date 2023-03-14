// Initializing the elements of an array to default values of zero
public class InitArray {
    public static void main(String[] args) {

        // declare variable array and initialize it with an array object
//        int[] array = new int[10]; // create the array object
//
//
//
//        System.out.printf("%s%8s%n", "Index", "Value");
//
//        // output each array element's value
//        for (int counter = 0; counter < array.length; counter ++){
//            System.out.printf("%5d%8d%n", counter, array[counter]);
//        }
////////////////////////////////////////////////////////////////////
        // calculating the values to be placed into the elements of an array

        // declare variable array and initialize it with an array object
//        final int ARRAY_LENGTH = 10; // declare constant, but there is no real constant
//        int[] array = new int[ARRAY_LENGTH]; // create array
//
//        // calculate value for each array element
//        for ( int counter = 0; counter < array.length; counter ++) {
//            array[counter] = 2 + (2 * counter);
//        }
//
//        System.out.printf("%s%8s%n", "Index", "Value"); // column headings
//
//        // output each array element's value
//        for (int counter = 0; counter < array.length; counter ++){
//            System.out.printf("%5d%8d%n", counter, array[counter]);
//        }
        //////////////////////////////////////////////////////////////
        // Sum array
        int[] array = {23, 88, 43, 21, 55, 66, 77,8}; // create array

        int total= 0;

        // calculate value for each array element
        for ( int counter = 0; counter < array.length; counter ++) {
            total += array[counter];
            System.out.printf("array[%d]=%d%n", counter, array[counter]);
        }

       // System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        // output each array element's value

            System.out.printf("Total in array %d%n", total);

    }
}




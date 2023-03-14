import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTry {
    public static void main(String[] args) {
    int variable = 1;
    int[] numbers = new int[5];


        for(variable = 1; variable <= 5 ;variable++){
            numbers[variable] = variable + numbers[variable];

        }
        System.out.println(Arrays.toString(numbers));


    }
}

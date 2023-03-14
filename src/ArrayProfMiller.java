import java.util.Scanner;

public class ArrayProfMiller {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int input = n.nextInt();
        int[] array = new int[10];
        for(int i=0; i<input; i++){
            System.out.println("value of array["+i+"]");
            array[i] = n.nextInt();
        }
        for(int i = 0; i<array.length;i++){
            System.out.println("The value of z["+i+"] is"+array[i]);
        }


        }
    }

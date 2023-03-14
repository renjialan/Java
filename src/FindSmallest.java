import java.sql.SQLOutput;
import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int something = scanner.nextInt();
        int another = 0;
        while(scanner.hasNext()) {

            //System.out.println(something);
            for(int i=0; i<something;i++){

                    if(something > another){
                        something = another;

                    } // if
                    else{
                    continue;
                    } // else

            } // for
            System.out.println(something);

        } // while




    } // main
} // FindSmallest

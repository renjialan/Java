import java.util.Scanner;


public class Diamond {
    public static void main(String[] args) {

        ////////////////////////////////////////////////////////
        // Version 1
//        for(int i=0; i<=4;i++){
//
//            switch (i){
//                case 0:
//                    System.out.println("*");
//                    break;
//                case 1:
//                    System.out.println("* * *");
//                    break;
//                case 2:
//                    System.out.println("* * * * *");
//                    break;
//                case 3:
//                    System.out.println("* * * * * * *");
//                    break;
//                case 4:
//                    System.out.println("* * * * * * * * * " );
//                    break;
//                default:
//                    System.out.println("Encountered an error 1");
//            }
//        }
//        for(int n=3; n>=0 ;n--){
//
//            switch (n){
//                case 0:
//                    System.out.println("*");
//                    break;
//                case 1:
//                    System.out.println("* * *");
//                    break;
//                case 2:
//                    System.out.println("* * * * *");
//                    break;
//                case 3:
//                    System.out.println("* * * * * * *");
//                    break;
//                default:
//                    System.out.println("Encountered an error");
//            }
//    }
//}}

/////////////////////////////////////////////////////////////////////////////
// version 2
//        String a = "* ";
//        for(int i=1; i<=7;i++){
//            if(i%2!=0) {
//                System.out.println(a.repeat(i));
//            }
//
//            }
//        for(int n=5; n>=0 ;n--){
//            if(n%2!=0){
//                System.out.println(a.repeat(n));
//            }
//
//            }
//        }
//    }
//////////////////////////////////////////////////////////////////////
        // Version 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines do you want? Enter an odd number:");
        int input = scanner.nextInt();

        String a = "* ";
        for(int i = 1; input >= i; i++){
            if(i%2!=0) {
                System.out.println(a.repeat(i));
            }

        }
        for(int n=input; n>1 ;n--){

            if(n%2!=0){
                System.out.println(a.repeat(n - 2));

            }

        }
    }

    private static void exit() {
    }
}

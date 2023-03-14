import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

//        int frequency1 = 0; // count of 1s rolled
//        int frequency2 = 0; // count of 2s rolled
//        int frequency3 = 0; // count of 3s rolled
//        int frequency4 = 0; // count of 4s rolled
//        int frequency5 = 0; // count of 5s rolled
//        int frequency6 = 0; // count of 6s rolled000_000; roll++

        int[] frequency = new int[7];


        // tally counts for 60,000,000 rolls of  die
        for (int roll = 1; roll <= 60_000_000; roll++) {
            ++frequency[1 + randomNumbers.nextInt(6)];
            // use face value 1-6 to determine which counter to increment
//            switch (face){
//                case 1:
//                    ++frequency1;
//                    break;
//                case 2:
//                    ++frequency2;
//                    break;
//                case 3:
//                    ++frequency3;
//                    break;
//                case 4:
//                    ++frequency4;
//                    break;
//                case 5:
//                    ++frequency5;
//                    break;
//                case 6:
//                    ++frequency6;
//                    break;
//                default:
//                    System.out.println("Encountered an error!"+
//                            "We received a die value"+
//                            " beyond the range: [1, 6]");
//            }
//        }
            // header row
            System.out.printf("%s%10s%n", "Face", "Frequency");


            for (int face = 1; face < frequency.length; face++) {
                System.out.printf("%4d%10d%n", face, frequency[face]);
            }
        }
    }
}
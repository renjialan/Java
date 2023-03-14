public class Assignment_4_22 {
    public static void main(String[] args) {
        int output = 1;
        System.out.println("N 10*N 100*N 1000*N");

        int var;
        for (var = 0; var < 5; var++) {
            System.out.printf("%d %d   %d   %d%n", output, output * 10, output * 100, output * 1000);

            output++;
        }

    }


}

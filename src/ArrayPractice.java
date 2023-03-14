public class ArrayPractice {
    public static void main(String[] args) {
        int[] array= {2,4,6,8,10};

        for(int x =0; x<array.length;x++){
            //System.out.println(array[x]);

            if (x%2==1){
                array[x] *= 2;

            }
            System.out.println(array[x]);




        }
    }
}

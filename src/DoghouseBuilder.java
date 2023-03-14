public class DoghouseBuilder {
    public static void main(String[] args) {

        DogHouse OliveDoghouse = new DogHouse();
        DogHouse HaydenDoghouse = new DogHouse();
        DogHouse RTDoghouse = new DogHouse();

        OliveDoghouse.setHeight(3);
        OliveDoghouse.setWidth(2);
        OliveDoghouse.setDoghouseColor("Green");
        OliveDoghouse.setDoghouseName("Olive Doghouse object");

        System.out.println(OliveDoghouse.getDoghouseName());

        RTDoghouse.setDoghouseName("RTDoghouse");
    } // main
} // DoghouseBuilder

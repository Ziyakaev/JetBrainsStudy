class Cat {

    // write static and instance variables
    String name;
    int age;
    public static int counter;

    public Cat(String name, int age) {
        // implement the constructor
        this.name = name;
        this.age = age;
        counter++;
        checkForManyCats(counter);
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        return counter;// implement the static method
    }

    private void checkForManyCats(int counter){
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }
}
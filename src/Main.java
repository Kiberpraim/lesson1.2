public class Main {
    public static void main(String[] args) {
        String commands[] = {"Сидеть","Лежать"};
        Shelter shelter = new Shelter("Уют", "Карпинка");
        Dog dog = new Dog(Color.BLACK,shelter);
        Dog dog1 = new Dog(Color.BROWN,shelter,"REX","Mongrel");
        Dog dog2 = new Dog(Color.WHITE, shelter,"Laika","American Eskimo",commands);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        System.out.println(dog1.getInfo());
        dog1.makeVoice("Ауу");
        System.out.println(dog2.getInfo());
        dog2.makeVoice("Гав",2);
    }
}
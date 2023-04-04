import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public Pet(Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }

    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(1,20);
    }

    public String getInfo(){
        return "Age: " + age + "\t Color: " + color + "\t Shelter: " + shelter.getName() + "\t Address: " + shelter.getAddress();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
}

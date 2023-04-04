public final class  Dog extends Pet{
    private String name = "Нет имени";
    private String breed = "Не известен";
    private String[] commands;

    public Dog(Color color, Shelter shelter) {
        super(color, shelter);
    }

    public Dog(Color color, Shelter shelter, String name, String breed) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
    }

    public Dog(Color color, Shelter shelter, String name, String breed, String[] commands) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public void makeVoice(){
        System.out.println("Гав");
    }
    public void makeVoice(String voice, int number){
        for (int i = 0; i < number; i++) {
            System.out.print(" " + voice);
        }
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }

    private String getCommand(){
        String command;
        if (commands == null){
            return "Не знает";
        } else if (commands.length == 1) {
            return commands[0];
        }else{
            command = commands[0];
            for (int i = 1; i < commands.length; i++) {
                command = command + ", " + commands[i];
            }
        }
        return command;
    }
    public final String getInfo(){
        return "Name: " + name + "\t Age: " + this.getAge() + "\t Breed: " + breed + "\t Color: " + this.getColor() + "\t Shelter: " + this.getShelter().getName() + "\t Address: " + this.getShelter().getAddress() + "\nCommands: " + getCommand();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
}

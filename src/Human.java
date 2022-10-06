public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String Print(String T){
        String greating = name + " " + age + T;
        return greating;
    }
}


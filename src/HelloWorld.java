public class HelloWorld {

    String name;
    int age;
    String programme;

    public HelloWorld(String name, int age, String programme) {
        this.name = name;
        this.age = age;
        this.programme = programme;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) { this.age = age; }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getProgramme() {
        return programme;
    }

    
    public static void main(String[] args) {

    }
}

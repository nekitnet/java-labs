public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void displayInfo() {
        System.out.println("Студент: " + name + ", возраст: " + age + ", группа: " + group);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Иван Иванов", 20, "ИС-21");
        Student s2 = new Student("Мария Петрова", 21, "ИС-21");
        s1.displayInfo();
        s2.displayInfo();
    }
}

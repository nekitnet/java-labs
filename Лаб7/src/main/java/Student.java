public class Student {
    private String name;
    private int course;
    private String group;

    private static int totalStudents = 0;
    private static int totalCourses = 0;

    public Student(String name, int course, String group) {
        this.name = name;
        this.course = course;
        this.group = group;
        totalStudents++;
        totalCourses += course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    public static double getAverageCourse() {
        if (totalStudents == 0) {
            return 0;
        }
        return (double) totalCourses / totalStudents;
    }

    public static void main(String[] args) {
        new Student("Иванов", 1, "ИС-21");
        new Student("Петров", 2, "ИС-21");
        new Student("Сидорова", 3, "ПО-22");
        new Student("Кузнецов", 4, "ПО-22");
        new Student("Морозова", 1, "ИС-21");
        new Student("Волков", 2, "ПО-22");

        System.out.println("Всего студентов: " + Student.getTotalStudents());
        System.out.println("Сумма курсов: " + Student.getTotalCourses());
        System.out.println("Средний курс: " + Student.getAverageCourse());
    }
}

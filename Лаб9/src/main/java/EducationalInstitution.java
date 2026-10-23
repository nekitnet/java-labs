public abstract class EducationalInstitution {
    private String name;
    private String address;
    private int students;

    public EducationalInstitution(String name, String address, int students) {
        this.name = name;
        this.address = address;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getStudents() {
        return students;
    }

    public abstract String getType();

    public abstract String getAdmissionRequirements();

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Студентов/учеников: " + students);
        System.out.println("Тип: " + getType());
        System.out.println("Требования: " + getAdmissionRequirements());
    }
}

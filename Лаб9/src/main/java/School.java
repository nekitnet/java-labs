public class School extends EducationalInstitution {
    private int grades;

    public School(String name, String address, int students, int grades) {
        super(name, address, students);
        this.grades = grades;
    }

    public int getGrades() {
        return grades;
    }

    public String getType() {
        return "Школа";
    }

    public String getAdmissionRequirements() {
        return "Требуется справка о прививках";
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Классов: " + grades);
        System.out.println();
    }
}

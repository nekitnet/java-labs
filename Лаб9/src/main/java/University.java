public class University extends EducationalInstitution {
    private int faculties;

    public University(String name, String address, int students, int faculties) {
        super(name, address, students);
        this.faculties = faculties;
    }

    public int getFaculties() {
        return faculties;
    }

    public String getType() {
        return "Университет";
    }

    public String getAdmissionRequirements() {
        return "Требуются результаты ЕГЭ";
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Факультетов: " + faculties);
        System.out.println();
    }
}

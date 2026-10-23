public class Employee {
    private String fullName;
    private String position;
    private double salary;

    private static int totalEmployees = 0;
    private static double totalSalary = 0;

    public Employee(String fullName, String position, double salary) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        totalEmployees++;
        totalSalary += salary;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static double getTotalSalary() {
        return totalSalary;
    }

    public static double getAverageSalary() {
        if (totalEmployees == 0) {
            return 0;
        }
        return totalSalary / totalEmployees;
    }

    public static void main(String[] args) {
        new Employee("Иванов И.И.", "Разработчик", 1200);
        new Employee("Петров П.П.", "Тестировщик", 900);
        new Employee("Сидоров С.С.", "Аналитик", 1100);
        new Employee("Кузнецов К.К.", "Дизайнер", 950);
        new Employee("Морозов М.М.", "Руководитель", 2000);

        System.out.println("Всего сотрудников: " + Employee.getTotalEmployees());
        System.out.println("Общий фонд оплаты: " + Employee.getTotalSalary());
        System.out.println("Средняя зарплата: " + Employee.getAverageSalary());
    }
}

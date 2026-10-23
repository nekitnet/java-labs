public class Main {
    public static void main(String[] args) {
        EducationalInstitution[] inst = new EducationalInstitution[5];
        inst[0] = new School("Школа №1", "ул. Ленина, 10", 800, 11);
        inst[1] = new School("Школа №42", "ул. Пушкина, 25", 1200, 11);
        inst[2] = new School("Школа №7", "пр. Мира, 5", 600, 9);
        inst[3] = new University("МГУ", "Ломоносовский пр., 1", 30000, 30);
        inst[4] = new University("МИФИ", "Каширское шоссе, 31", 7000, 10);

        for (int i = 0; i < inst.length; i++) {
            inst[i].displayInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторная работа 15: Git и GitHub ===");
        System.out.println();

        System.out.println("Три состояния файла в Git:");
        System.out.println("  modified  - файл изменен, но еще не зафиксирован");
        System.out.println("  staged    - измененный файл подготовлен к следующему коммиту");
        System.out.println("  committed - данные безопасно сохранены в базе данных");
        System.out.println();

        System.out.println("Основные команды:");
        String[][] commands = {
                {"git init", "создать новый репозиторий"},
                {"git clone <url>", "клонировать удаленный репозиторий"},
                {"git status", "показать состояние файлов"},
                {"git add <файл>", "добавить файл в индекс"},
                {"git commit -m \"...\"", "зафиксировать изменения"},
                {"git log", "показать историю коммитов"},
                {"git branch <имя>", "создать ветку"},
                {"git checkout <имя>", "переключиться на ветку"},
                {"git merge <имя>", "сделать слияние ветки"},
                {"git push", "отправить изменения на удаленный репозиторий"},
                {"git pull", "получить и слить изменения"},
        };
        for (String[] c : commands) {
            System.out.printf("  %-22s - %s%n", c[0], c[1]);
        }
        System.out.println();

        System.out.println("Примеры ветвления:");
        System.out.println("  git checkout -b lr6   - создать ветку и переключиться");
        System.out.println("  git merge lr6         - слить lr6 в текущую ветку");
        System.out.println("  git push -u origin lr6 - отправить ветку в GitHub");
        System.out.println();

        System.out.println("Работа с GitHub:");
        System.out.println("  1. Fork / создание ветки");
        System.out.println("  2. Коммит и push изменений");
        System.out.println("  3. Pull Request с описанием");
        System.out.println("  4. Merge pull request (обычным merge - merge-коммит)");
    }
}

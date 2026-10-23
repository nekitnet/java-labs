public class Book {
    private String title;
    private String author;
    private int pages;

    private static int totalBooks = 0;
    private static int totalPages = 0;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        totalBooks++;
        totalPages += pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static int getTotalPages() {
        return totalPages;
    }

    public static double getAveragePages() {
        if (totalBooks == 0) {
            return 0;
        }
        return (double) totalPages / totalBooks;
    }

    public static void main(String[] args) {
        new Book("Война и мир", "Толстой", 1225);
        new Book("Преступление и наказание", "Достоевский", 670);
        new Book("Мастер и Маргарита", "Булгаков", 480);
        new Book("Анна Каренина", "Толстой", 864);

        System.out.println("Всего книг: " + Book.getTotalBooks());
        System.out.println("Всего страниц: " + Book.getTotalPages());
        System.out.println("Среднее число страниц: " + Book.getAveragePages());
    }
}

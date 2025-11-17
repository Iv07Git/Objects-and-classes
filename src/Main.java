public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Война и мир", author1, 2010);
        Book book2 = new Book("Евгений Онегин", author2, 1990);

        book1.setYearPublication(2000);

        System.out.println("Книга " + book1.getName() + ", Автор " + book1.getAuthor().getName() +
                " " + book1.getAuthor().getFamily() + ", Год публикации: " + book1.getYearPublication());
        System.out.println("Книга " + book2.getName() + ", Автор " + book2.getAuthor().getName() +
                " " + book2.getAuthor().getFamily() + ", Год публикации: " + book2.getYearPublication());

        System.out.println(book1.equals(book2));
        System.out.println(book2);
    }
}
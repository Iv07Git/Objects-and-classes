import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearPublication;
    public Book (String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getName () {
        return this.name;
    }

    public Author getAuthor () {
        return this.author;
    }

    public  int getYearPublication () {
        return this.yearPublication;
    }

    public void setYearPublication (int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Книга " + name + ", " + author.toString() + ", год публикации: " + yearPublication;
    }

    @Override
    public boolean equals (Objects other) {
        if (this == other)
            return true;
        if (!(other instanceof Book))
            return false;
        Book book = (Book) other;
        return yearPublication == book.yearPublication &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublication);
    }
}

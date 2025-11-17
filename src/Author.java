import java.util.Objects;

public class Author {
    private String name;
    private String family;

    public Author (String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getName () {
        return this.name;
    }

    public String getFamily () {
        return this.family;
    }

        @Override
        public String toString () {
            return "Автор: " + this.name + " " + family;
        }

        @Override
        public boolean equals (Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Author author = (Author) obj;
            return Objects.equals(name, author.name) && Objects.equals(family, author.family);
        }

        @Override
        public int hashCode () {
            return Objects.hash(name, family);
        }
}

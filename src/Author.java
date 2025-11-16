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
}

public class Book {
    private String name;
    private String author;
    private int pages;
    private int year;
    private String genre;
    private String publisher;

    public String name() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String genre() {
        return this.genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String publisher() {
        return this.publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int pages() {
        return this.pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public int year() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  "Book {\n" +
                "    name:'" + name + "',\n" +
                "    author: " + author + ",\n" +
                "    year: " + year + ",\n" +
                "    pages: " + pages + ",\n" +
                "    genre: " + genre + ",\n" +
                "    publisher: " + publisher + "\n" +
                '}';
    }
}
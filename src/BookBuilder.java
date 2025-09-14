public interface BookBuilder {
    void setName(String name);
    void setAuthor(String author);
    void setYear(int year);
    void setPages(int pages);
    void setGenre(String genre);
    void setPublisher(String publisher);
    Book build();
}

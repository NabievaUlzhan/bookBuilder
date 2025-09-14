public class DesktopBookBuilder implements BookBuilder {
    private Book book = new Book();

    @Override
    public void setName(String name) {
        book.setName(name);
    }
    @Override
    public void setAuthor(String author) {
        book.setAuthor(author);
    }
    @Override
    public void setGenre(String genre) {
        book.setGenre(genre);
    }
    @Override
    public void setPublisher(String publisher) {
        book.setPublisher(publisher);
    }
    @Override
    public void setYear(int year) {
        book.setYear(year);
    }
    @Override
    public void setPages(int pages) {
        book.setPages(pages);
    }
    @Override
    public Book build() {
        return book;
    }
}
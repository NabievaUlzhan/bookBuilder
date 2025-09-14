public class BookDirector {
    public Book construct(BookBuilder builder) {
        builder.setName("The Master and Margarita");
        builder.setAuthor("Mikhail Bulgakov" +
                "Elena Sergeevna Bulgakova");
        builder.setYear(1967);
        builder.setPages(508);
        builder.setGenre("Fantasy, farce, supernatural, romance, satire, Modernist literature");
        builder.setPublisher("YMCA Press");
        return builder.build();
    }
}
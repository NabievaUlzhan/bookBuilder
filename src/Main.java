//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BookDirector director = new BookDirector();
        BookBuilder builder = new DesktopBookBuilder();
        Book book = director.construct(builder);
        System.out.println(book);
    }
}
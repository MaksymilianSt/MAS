package zwykła;

import java.util.HashSet;
import java.util.Set;

public class Author {
    private int id;
    private String name;
    private Set<Book> books = new HashSet<>();

    public Author(){
        this.id = 0;
        this.name = "Asocjacja zwykła";
    }
    public void addBook(Book book){
        if(book == null || books.contains(book)){
            return;
        }
        books.add(book);
        book.addAuthor(this);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}

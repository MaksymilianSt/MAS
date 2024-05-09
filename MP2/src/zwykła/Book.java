package zwykła;

public class Book {
    private int id;
    private String title;
    private Author author;

public Book(){
    this.id = 1;
    this.title = "asocjacja zwykla";
}
    public void addAuthor(Author author){
        if(this.author != null){
            return;
        }
        this.author = author;
        author.addBook(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

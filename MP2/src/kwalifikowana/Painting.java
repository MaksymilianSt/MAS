package kwalifikowana;

public class Painting {
    private int id;
    private String title;
    private Painter painter;

    public Painting() {
        this.id = 0;
        this.title = "asocjacja kwalifikowana";

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Painter getAuthor() {
        return painter;
    }


    public void addPainter(Painter painter){
        if(this.painter != null){
            return;
        }
        this.painter = painter;
        painter.addPainting(this);
    }

    @Override
    public String toString() {
        return "Painting{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}

package kwalifikowana;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class Painter {
    private int id;
    private String name;
    private Map<Integer, Painting> paintings = new HashMap<>();;

    public Painter(){
        this.id = 0;
        this.name = "asocjacja kwalifikowana";
    }

    public void addPainting(Painting painting){
        if(painting == null || this.paintings.containsKey(painting.getId())){
            return;
        }
        this.paintings.put(painting.getId(), painting);
        painting.addPainter(this);
    }
    public Painting getPainting(int id){
        return Optional.ofNullable(paintings.get(id))
                .orElseThrow(() -> new RuntimeException("Book not found"));

    }

    @Override
    public String toString() {
        return "Painter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", paintings=" + paintings +
                '}';
    }
}

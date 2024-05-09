package kompozycja;

import java.util.HashSet;
import java.util.Set;

public class Building {
    private String name;
    private Set<Room> rooms = new HashSet<>();

    public Building(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room createRoom(int roomNr) {
        var room = new Room(roomNr);
        rooms.add(room);

        return room;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms +
                '}';
    }

    public class Room {
        private int classNr;

        private Room(int classNr) {
            this.classNr = classNr;
        }

        public Building getBuilding() {
            return Building.this;
        }

        @Override
        public String toString() {
            return "Room{" +
                    "classNr= " + classNr +
                    ", building= " + name +
                    '}';
        }
    }
}

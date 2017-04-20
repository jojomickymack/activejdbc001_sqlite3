package central;

import org.javalite.activejdbc.Base;

public class Main {
    public static void main(String[] args) {
        Base.open("org.sqlite.JDBC", "jdbc:sqlite:db.sqlite3", "user1", "xxxxx");

        Cat cat = new Cat();
        cat.set("name", "toodles");
        cat.set("color", "brown");
        cat.saveIt();
    }
}




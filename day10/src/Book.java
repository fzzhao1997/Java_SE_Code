import java.util.HashMap;


//字典类继承HashMap
public class Book extends HashMap {
    public Book() {
        this.put("A", 1);
        this.put("J", 10);
        this.put("Q", 10);
        this.put("K", 10);
        this.put("黑桃", 1);
        this.put("梅花", 1);
        this.put("方块", 1);
        this.put("红桃", 1);
    }
}


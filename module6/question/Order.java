package question;
import java.util.Date;


public class Order {
    private Item item;
    private User user;
    private Date date;
    private static int counter;
    private boolean active;

    public Order(Item item, User user) {
        this.item = item;
        this.user = user;
        this.date = new Date();
    }

    public static int getCounter() {
        return counter;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static void setCounter(int counter) {
        Order.counter = counter;
    }

    public Item getItem() {
        return item;
    }

    public User getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

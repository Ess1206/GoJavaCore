package question;

/**
 * Created by Stan on 20.09.2016.
 */
public class DAOImpl implements DAO {
    @Override
    public Order save(Order order) {
        System.out.println(order + " Saved");
        return order;
    }
}

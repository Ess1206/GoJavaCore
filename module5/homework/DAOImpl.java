package homework;

/**
 * Created by Stan on 18.09.2016.
 */
public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room+" is saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room+" is deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room+" is updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id ,0, 0, null, null);
        System.out.println(room+" is found");
        return room;
    }
}

package practies;

public interface PersonDao {

  Person save(Person person);
  
  Person findByEmail(String email);

}

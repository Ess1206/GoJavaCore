package practies;

import java.util.Map;

public class PersonController1 {
  
  private static PersonDao personDao = new PersonDaoImpl();

  public String save(Map<String, String> requestParams) throws PersonException {
    if(!requestParams.containsKey("firstName")) {
      throw new PersonException("Отсутствует обязательный параметр \"Имя\"");
    }
/*
    if(!requestParams.containsKey("lastName")) {
      throw new PersonException("Отсутствует обязательный параметр \"Фамилия\"");
    }
*/    
    if(!requestParams.containsKey("email")) {
      throw new PersonException("Отсутствует обязательный параметр \"Email\"");
    }
    final String firstName = requestParams.get("firstName");
 //   final String email = requestParams.get("email");
      final String email = checkForNull(requestParams, "email");
//   final String lastName = requestParams.get("lastName");
    
    // рекомендую не использовать тернарники, а использовать подобную конструкцию
    final String lastName;

    if (requestParams.get("lastName") != null) {
      lastName = requestParams.get("lastName");
    } else {
      lastName = "";
    }

//    String lastname

    Person person = new Person(firstName, lastName, email);

    personDao.save(person);
    return person.toString();
  }



  public String findByEmail(Map<String, String> requestParams) throws PersonException {
    if(!requestParams.containsKey("email")) {
      throw new PersonException("Отсутствует обязательный параметр \"Email\"");
    }
    final String email = requestParams.get("email");

    Person person = personDao.findByEmail(email);
    if(person == null) {
      throw new PersonException("В базе нет персоны с таким email");
    }
    return person.toString();
  }

  private String checkForNull(Map<String , String> requestParam, String param){
    String res;
    if (requestParam.get(param)!=null){
      res = requestParam.get(param);
    }else res = "";
  return res;
  }

}

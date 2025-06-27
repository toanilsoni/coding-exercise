package collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Person {

  private final String id;
  private final String name;

  Person(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

}


public class ListToMap {

  public static void main(String[] args) {
    List<Person> personList = new ArrayList<Person>();
    personList.add(new Person("1", "Jack"));
    personList.add(new Person("2", "Jack"));
    personList.add(new Person("3", "Jahnavi"));
    mapNameToIds(personList);
  }

  /**
   * Given a List of Person objects, return a Map where the key is a Person's "name" and the value
   * is List of all Person's "ids" with that name
   * <p>
   * Input: [ {id: "1", name: "Jack"}, {id: "2", name: "Jack"}, {id: "3", name: "Jahnavi"} ] Output:
   * { "Jack": ["1", "2"] , "Jahnavi": ["3"] }
   *
   * @param persons a list of Person objects
   * @return a Map of "name" to "id"s based on the given `persons`
   */
  public static Map<String, List<String>> mapNameToIds(List<Person> persons) {

    Map<String, List<String>> mapNameToIds = new HashMap<String, List<String>>();

    for (Person person : persons) {
      String personName = person.getName();
      String personId = person.getId();

      List<String> existingIds = mapNameToIds.get(personName);
      if (existingIds != null) {
        existingIds.add(personId);
      } else {
        List<String> newList = new ArrayList<String>();
        newList.add(personId);
        mapNameToIds.put(personName, newList);
      }
    }

    for (Entry<String, List<String>> entry : mapNameToIds.entrySet())
      System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    return mapNameToIds;
  }
}

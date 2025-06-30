import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {
    String name;
    String id;

    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }

    public void setString(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

}

public class Practice
{
    public  static void main(String [] args){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Anil", "1"));
        personList.add(new Person("Sunil", "2"));
        personList.add(new Person("Anil", "3"));

        mapNameToIds(personList);

    }

    public static void mapNameToIds(List<Person> personList){
        Map<String, List<String>> personMap = new HashMap<>();
        for(Person p: personList){

            if(personMap.containsKey(p.name)){
                List<String> existingIds = personMap.get(p.name);
                existingIds.add(p.getId());
                personMap.put(p.name, existingIds);
            } else{
                List<String> newList = new ArrayList<>();
                newList.add(p.getId());
                personMap.put(p.name, newList);
            }
        }

        for(Map.Entry<String, List<String>> mapValue : personMap.entrySet()){
            System.out.println(mapValue.getKey() + " " + mapValue.getValue());
        }

    }
}

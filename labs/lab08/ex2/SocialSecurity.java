import java.util.List;
import java.util.ArrayList;

public class SocialSecurity {

    private List<Person> peopleWithSocialSecurity = new ArrayList<>();

    public void regist(Person person) {
        peopleWithSocialSecurity.add(person);
        System.out.println(person.getName() + " has been registered at Seguranca Social");
    }

    public List<Person> getPeopleWithSocialSecurity() {
        return peopleWithSocialSecurity;
    }
    
}

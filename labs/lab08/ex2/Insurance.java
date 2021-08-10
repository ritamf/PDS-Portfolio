import java.util.List;
import java.util.ArrayList;

public class Insurance {

    private List<Person> peopleWithInsurance = new ArrayList<>();

    public void regist(Person person) {
        peopleWithInsurance.add(person);
        System.out.println(person.getName() + " has been registered at Insurance");
    }

    public List<Person> getPeopleWithSocialSecurity() {
        return peopleWithInsurance;
    }
}

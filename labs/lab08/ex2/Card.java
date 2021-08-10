public class Card {

    private Integer card_id;
    private Person person;

    public Card(Integer card_id, Person p) {
        this.card_id=card_id;
        this.person=p;
    }

    public Person getPerson() {
        return person;
    }

    public Integer getCard_id() {
        return card_id;
    }

    
}

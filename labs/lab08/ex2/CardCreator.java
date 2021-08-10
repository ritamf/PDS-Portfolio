import java.util.List;
import java.util.ArrayList;

public class CardCreator {

    private List<Card> cards = new ArrayList<>();
    private Integer card_id = 0;

    public CardCreator() {}

    public Card create(Person person) {

        Card card = new Card(card_id, person);
        cards.add(card);
        card_id+=1;

        System.out.println(card.getPerson().getName() + " was given a company card");

        return card;
    }

    public List<Card> getCards() {
        return cards;
    }
}

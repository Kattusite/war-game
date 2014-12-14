import java.util.*;
public class CardList
{
    ArrayList<Card> cards;
    Random r;
    String name;
    public CardList()
    {
        cards = new ArrayList<Card>();
        r = new Random();
        name = "default";
    }
    public CardList(String nm)
    {
        this();
        name = nm;
    }
    public ArrayList<Card> getArrayList()
    {
        return cards;
    }
    public void remove(int index)
    {
        cards.remove(index);
    }
    public void add(Card c)
    {
        cards.add(c);
    }
    public Card get(int index)
    {
        return cards.get(index);
    }
    public String getName()
    {
        return name;
    }
    public int getRandomIndex()
    {
        return r.nextInt(cards.size());
    }
    public void shuffle()
    //Take a random card and put it on top of the deck, n times
    {
        Card temp;
        int n = 255;
        //small values of m result in very poor shuffles
        for (int k = 0; k < n; k++)
        {
            int index = r.nextInt(52);
            temp = cards.get(index);
            cards.remove(index);
            cards.add(temp);
        }
    }
    public int size()
    {
        return cards.size();
    }
    public String toString()
    {
        String temp = "";
        temp += name + ": " + cards.size() + "\n";
        for (int k = 0; k < cards.size(); k++)
        {
            Card c = cards.get(k);
            temp += c.toString();
            temp += "\n";
        }
        return temp;
    }
    public void sendCard(int index,CardList destination)
    {
        Card temp = cards.get(index);
        cards.remove(index);
        destination.add(temp);
    }
    public void flushTo(CardList destination)
    {
        while (cards.size() != 0)
        {
            Card c = cards.get(0);
            cards.remove(0);
            destination.add(c);
        }
    }
}

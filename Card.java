public class Card
{
    String suit;
    int value;
    String faceValue;
    int deckPosition;
    public Card(int index)
    {
        //index is a number 0-51
        deckPosition = index;
        this.value = index%13 + 1;
        switch (value)
        {
            case 1:
                value = 14; //aces are high
                faceValue = "ace";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                faceValue = ""+value;
                break;
            case 11:
                faceValue = "jack";
                break;
            case 12:
                faceValue = "queen";
                break;
            case 13:
                faceValue = "king";
                break;
        }
        if (index <= 12)
        {
            suit = "clubs";
        }
        else if (index <= 25)
        {
            suit = "spades";
        }
        else if (index <= 38)
        {
            suit = "hearts";
        }
        else if (index <= 51)
        {
            suit = "diamonds";
        }
    }
    public String getSuit()
    {
        return suit;
    }
    public int getValue()
    {
        return value;
    }
    public String getFaceValue()
    {
        return faceValue;
    }
    public int getDeckPosition()
    {
        return deckPosition;
    }
    public String toString()
    {
        return faceValue + " of " + suit;
    }
}

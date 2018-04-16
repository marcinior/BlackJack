package blackjack;
        
public class Card {
    public final static int kier=1,karo=2,trefl=3,pik=4;
    public final static int walet=11,dama=12,krol=13,as=14;
    private final int suit;
    private final int value;
    
    public Card(int value,int suit)
    {
        this.suit=suit;
        this.value=value;   
    }
            
    public int getValue()
    {
        return value;   
    }
    public int getSuit()
    {
        return suit;
    }
}

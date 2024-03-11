package mahat_2023_summer_a.ex10;

public class Card
{
    private char color;
    private int digit;
    public Card(char c, int d)
    {
        this.color = c;
        this.digit = d;
    }
    public int compareTo(Card other){
        if(this.digit>other.digit){
            return -1;
        } else if (this.digit<other.digit) {
            return 1;
        }
        int c1=0 , c2=0;
        char[] colors={'r','g','b','y'};
        for(int i=0;i<colors.length;i++){
            if(this.color==colors[i])
                c1=i;
            if(other.color==colors[i])
                c2=i;
        }
        if(c2==c1)
            return 0;

        return c1>c2 ? -1 : 1;

    }
}

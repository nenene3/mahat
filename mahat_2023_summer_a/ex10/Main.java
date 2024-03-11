package mahat_2023_summer_a.ex10;

public class Main {
    public static void main(String[] args) {

        Deck deck = create();
        game(deck);
    }
    public static void game(Deck d){
        Deck p2=new Deck();
        Deck p1=new Deck();
        boolean won=false;
        while(!won){
            Card card1 = d.drawCard();
            Card card2 = d.drawCard();
            if(card1==null || card2==null)
                break;
            if(card1.compareTo(card2)==-1){
                p1.addCard(card2);
                p1.addCard(card1);
            } else {
                p2.addCard(card2);
                p2.addCard(card1);
            }

            char[] colors={'r','g','b','y'};
            for(int i=0;i<4;i++){
                if(p1.isFull(colors[i])){
                    System.out.println("player 1 won");
                    won=true;
                    break;

                }
                if(p2.isFull(colors[i])){
                    System.out.println("player 2 won");
                    won=true;
                    break;
                }
            }
        }
        if(!won){
            System.out.println("tie");
        }

    }
    public static Deck create(){
        Deck deck = new Deck();

        char[] colors = {'y', 'b', 'g', 'r'}; // Using 'A' as the fourth color

        for (int digit = 1; digit <= 9; digit++) {
            for (char color : colors) {
                Card card = new Card(color, digit);
                deck.addCard(card);
            }
        }
        return deck;
    }
}

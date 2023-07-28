package Building;

public class Main_Game {
    public static void main(String[] args) {
        Character person1= new Character("Valquiria",1200,100,4);
        Character person2= new Character("Minipeka",1000,999,5);
        Deck deck1=new Deck(8,3,"Exotic",13);

        Arena arena=new Arena();
        Arena arena1=new Arena(1,33);
        Arena arena2=new Arena(5,21,8);
    }
}

package Building;

public class Deck {
    private int number_of_cards;
    private int Average_Elixir;
    private String Letter_quality;
    private int Card_level;

    public Deck(int number_of_cards, int average_Elixir, String letter_quality, int card_level) {
        this.number_of_cards = number_of_cards;
        Average_Elixir = average_Elixir;
        Letter_quality = letter_quality;
        Card_level = card_level;
    }

    public int getNumber_of_cards() {
        return number_of_cards;
    }

    public void setNumber_of_cards(int number_of_cards) {
        this.number_of_cards = number_of_cards;
    }

    public int getAverage_Elixir() {
        return Average_Elixir;
    }

    public void setAverage_Elixir(int average_Elixir) {
        Average_Elixir = average_Elixir;
    }

    public String getLetter_quality() {
        return Letter_quality;
    }

    public void setLetter_quality(String letter_quality) {
        Letter_quality = letter_quality;
    }

    public int getCard_level() {
        return Card_level;
    }

    public void setCard_level(int card_level) {
        Card_level = card_level;
    }
}

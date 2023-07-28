package Building;

public class Character {
    private String name_Character;
    private int life;
    private int damage;
    private int cost_of_the_elixir;

    public Character(String name_Character, int life, int damage, int cost_of_the_elixir) {
        this.name_Character = name_Character;
        this.life = life;
        this.damage = damage;
        this.cost_of_the_elixir = cost_of_the_elixir;
    }

    public String getName_Character() {
        return name_Character;
    }

    public void setName_Character(String name_Character) {
        this.name_Character = name_Character;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCost_of_the_elixir() {
        return cost_of_the_elixir;
    }

    public void setCost_of_the_elixir(int cost_of_the_elixir) {
        this.cost_of_the_elixir = cost_of_the_elixir;
    }
    public void move(){

    }
}

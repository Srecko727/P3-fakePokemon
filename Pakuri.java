public class Pakuri         //this class is the background to the project
{
    private String species;
    private int attack, defense, speed;
    public Pakuri(String species)
    {
        this.species = species;
        attack = (species.length() * 7) + 9;
        defense = (species.length() * 5) + 17;
        speed = (species.length() * 6) + 13;
    }
    public String getSpecies()
    {
        return species;
    }
    public int getAttack()
    {
        return attack;
    }
    public int getDefense()
    {
        return defense;
    }
    public int getSpeed()
    {
        return speed;
    }
    public void setAttack(int newAttack)
    {
        this.attack = newAttack;
    }
    public void evolve()
    {
        this.attack = attack * 2;
        this.defense = defense * 4;
        this.speed = speed * 3;
    }

}

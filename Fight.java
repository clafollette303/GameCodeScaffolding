import java.util.ArrayList;

public class Fight extends Room
{
    private int NUM_ENEMIES;

    public Fight(String name, String description, ArrayList<Character> characters, int NUM_NPCS, int NUM_ENEMIES)
    {
        super(name, description, characters, NUM_NPCS);
        this.NUM_ENEMIES = NUM_ENEMIES;
    }

    public int getNUM_ENEMIES()
    {
        return NUM_ENEMIES;
    }

    public void setNUM_ENEMIES(int NUM_ENEMIES)
    {
        this.NUM_ENEMIES = NUM_ENEMIES;
    }

    public void enemyAttack()
    {
        //enemy will attack the player for a certain amount of damage
    }

    public void playerAttack(Weapon weapon)
    {
        //player will attack enemy for a certain amount of damage based on the weapon they are using
    }
}

public class Enemy extends Character
{
    private double damage;
    private double attackSpeed;
    private double speed;
    private int level;


    public Enemy(String name, String description, double maxHealth, double currentHealth, double damage, double attackSpeed, double speed, int level)
    {
        super(name, description, maxHealth, currentHealth);
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.speed = speed;
        this.level = level;
    }

    public double getDamage()
    {
        return damage;
    }

    public void setDamage(double damage)
    {
        this.damage = damage;
    }

    public double getAttackSpeed()
    {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed)
    {
        this.attackSpeed = attackSpeed;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }
}

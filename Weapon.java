public class Weapon extends Item
{
    private double damage;
    private double attackSpeed;

    public Weapon(String name, String description, double value, double damage, double attackSpeed)
    {
        super(name, description, value);
        this.damage = damage;
        this.attackSpeed = attackSpeed;
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
}

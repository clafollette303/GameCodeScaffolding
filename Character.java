public class Character
{
    protected String name;
    protected String description;
    protected double maxHealth;
    protected double currentHealth;

    public Character(String name, String description, double maxHealth, double currentHealth)
    {
        this.name = name;
        this.description = description;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getMaxHealth()
    {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth)
    {
        this.maxHealth = maxHealth;
    }

    public double getCurrentHealth()
    {
        return currentHealth;
    }

    public void setCurrentHealth(double currentHealth)
    {
        this.currentHealth = currentHealth;
    }
}

import java.util.ArrayList;

public class Player extends Character
{
    private ArrayList<Item> inventory;
    private int inventoryCapacity;
    private int karma;
    private Weapon currentWeapon;



    public Player(String name, String description, double maxHealth, double currentHealth, int inventoryCapacity, int karma, Weapon weapon)
    {
        super(name, description, maxHealth, currentHealth);
        this.inventory = inventory;
        this.inventoryCapacity = inventoryCapacity;
        this.karma = karma;
        inventory = new ArrayList<Item>();
    }

    public void addToInventory(Item item)
    {
        //adds an item to inventory array list
    }

    public ArrayList<Item> getInventory()
    {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory)
    {
        this.inventory = inventory;
    }

    public int getInventoryCapacity()
    {
        return inventoryCapacity;
    }

    public void setInventoryCapacity(int inventoryCapacity)
    {
        this.inventoryCapacity = inventoryCapacity;
    }

    public int getKarma()
    {
        return karma;
    }

    public void setKarma(int karma)
    {
        this.karma = karma;
    }

    public Weapon getCurrentWeapon()
    {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon)
    {
        this.currentWeapon = currentWeapon;
    }
}

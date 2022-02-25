import java.util.ArrayList;

public class Room
{
    protected String name;
    protected String description;
    protected ArrayList<Character> characters;
    protected int NUM_NPCS;

    public Room(String name, String description, int NUM_NPCS)
    {
        this.name = name;
        this.description = description;
        this.characters = characters;
        this.NUM_NPCS = NUM_NPCS;
        characters = new ArrayList<Character>();
    }

    public void addCharacter(Character c)
    {
        //adds character to array list of characters
    }

    public void removeCharacter()
    {
        //removes character from array list if NPC leaves or enemy is killed by player
    }

    public void endRoom()
    {
        //used to continue to next section if player leaves area or ends a fight
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

    public ArrayList<Character> getCharacters()
    {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters)
    {
        this.characters = characters;
    }

    public int getNUM_NPCS()
    {
        return NUM_NPCS;
    }

    public void setNUM_NPCS(int NUM_NPCS)
    {
        this.NUM_NPCS = NUM_NPCS;
    }
}

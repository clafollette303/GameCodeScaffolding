import java.util.ArrayList;

public class Room
{
    protected String name;
    protected String description;
    protected ArrayList<Character> characters = new ArrayList<Character>();
    protected int NUM_NPCS;

    public Room(String name, String description, ArrayList<Character> characters, int NUM_NPCS)
    {
        this.name = name;
        this.description = description;
        this.characters = characters;
        this.NUM_NPCS = NUM_NPCS;
    }

    public void addCharacter()
    {

    }

    public void removeCharacter()
    {

    }

    public void endRoom()
    {

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

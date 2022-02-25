public class Tool extends Item
{
    private boolean isUsed;

    public Tool(String name, String description, double value, boolean isUsed)
    {
        super(name, description, value);
        this.isUsed = isUsed;
    }

    public boolean isUsed(boolean use)
    {
        return false;
    }

}

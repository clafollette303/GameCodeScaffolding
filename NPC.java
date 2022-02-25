public class NPC extends Character
{
    private String[] dialogue;
    private boolean isCompanion;

    public NPC(String name, String description, double maxHealth, double currentHealth, boolean isCompanion)
    {
        super(name, description, maxHealth, currentHealth);
        this.isCompanion = isCompanion;
    }

    public String showDialogue(int index)
    {
        return "";
    }

    public boolean isCompanion()
    {
        return false;
    }

    public void setCompanion(boolean companion)
    {
        isCompanion = companion;
    }


}

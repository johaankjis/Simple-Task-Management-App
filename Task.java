public class Task 
{
    private String description;
    private boolean completed;

    public Task(String temp_description, boolean temp_completed) 
    {
        description = temp_description;
        completed = temp_completed;
    }

    public String getDescription() 
    {
        return description;
    }

    public boolean isCompleted() 
    {
        return completed;
    }

    public void setCompleted(boolean completed) 
    {
        this.completed = completed;
    }
}


public class Agent
{
    private String firstName;
    private String lastName;
    
    public Agent(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String toString ()
    {
        return String.format ("My name is %s, %s %s", lastName, firstName, lastName);
    }
}

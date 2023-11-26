
public class PersonalInformation
{
    private String firstName;
    private String lastName;
    private String id;

    public PersonalInformation (String firstName, String lastName, String id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getIdentificationNumber()
    {
        return id;
    }

    @Override
    public String toString()
    {
        return this.lastName + ", " + this.firstName + " (" + this.id + ")";
    }
}


package Entities.Request;

public class UserRequest {

    private String name;
    private String job;

    public String getName () { return name; }
    public UserRequest setName (String name)
    {
        this.name = name;
        return this;
    }

    public String getJob () {return job; }

    public UserRequest setJob (String job)
    {
        this.job = job;
        return this;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", job = "+job+"]";
    }

}

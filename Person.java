public class Person
{
    public String lastName;
    public String firstName;
    public int birthYear;
    public int age;

    public Person(String ln, String fn, int a)
    {
        lastName = ln;
        firstName = fn;
        birthYear = a;
    }


    public void computeAge(int year)
    {
        age = year - birthYear;
    }

    public void display()
    {
        System.out.println(firstName + " " + lastName + " (" + age + " ans)");
    }
}

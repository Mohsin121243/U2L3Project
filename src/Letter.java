public class Letter
{
    /** Prints out a complete letter by printing the greeting,
     Followed by the special message, followed by the closing */

    public void writeLetter(String name)
    {
        greeting();
        System.out.print(name);
        specialMessage();
        closing();
        System.out.println(name);
    }

    public void greeting()
    {
        System.out.println("Hello, ");
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn’t you say?");
    }

    public void closing()
    {
        System.out.print("From: ");

    }
    public String fromname(String name)
    {
      System.out.println(name);
    }
}

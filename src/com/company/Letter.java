/**
 * Created by davidfry on 4/7/15.
 */

package com.company;

public class Letter
{
    String toPerson;
    String name;
    String greeting;
    String closing;

    // Constructor
    public Letter()
    {
        this.toPerson = "";
        this.name = "";
        this.greeting = "";
        this.closing = "";
    }

    public Letter(String toPerson, String yourName)
    {
        this.toPerson = toPerson;
        this.name = yourName;
    }

    public Letter(String toPerson, String yourName, String greeting, String closing)
    {
        this.toPerson = toPerson;
        this.name = yourName;
        this.greeting = greeting;
        this.closing = closing;
    }

    // Getters
    public String getToPerson()
    {
        return this.toPerson;
    }

    public String getName()
    {
        return name;
    }

    public String getGreeting()
    {
        return this.greeting;
    }

    public String getClosing()
    {
        return this.closing;
    }

    //Setters
    public void setToPerson(String p)
    {
        this.toPerson = p;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setGreeting(String g)
    {
        this.greeting = g;
    }

    public void setClosing(String c)
    {
        this.closing = c;
    }



    public String displayLetter()
    {
        return this.greeting + " " + this.toPerson + " " + this.name + " " + this.closing;
    }


}

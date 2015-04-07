/**
 * Created by davidfry on 4/7/15.
 */

package com.company;

import java.util.*;

public class ThankYouBDLetter extends Letter
{

    int age;
    private List items;


    public ThankYouBDLetter(String greeting, String toPerson, String name, String closing, int age)
    {
        this.greeting = greeting;
        this.toPerson = toPerson;
        this.name = name;
        this.closing = closing;
        this.age = age;
        this.items = new ArrayList<String>();
        this.items.add("Football");
    }

    public ThankYouBDLetter(String greeting, String toPerson, String name, String closing, int age, List items)
    {
        this.greeting = greeting;
        this.toPerson = toPerson;
        this.name = name;
        this.closing = closing;
        this.age = age;
        this.items = items;
    }

    public int getAge()
    {
        return this.age;
    }

    public List getItems()
    {
        return this.items;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setItems(List items)
    {
        this.items = items;
    }


    public void printMessage()
    {
        System.out.println(this.greeting + " " + this.toPerson + ",");
        System.out.printf("\t Thank you for the " + this.formatItems() + ". ");

        if(this.items.size() == 1)
        {
            System.out.print("I really like it.\n");
        }
        else
        {
            System.out.printf("I really like them.\n");
        }

        System.out.println("I can't believe I'm already " + this.age + " years old, but it doesn't feel that much different than being " + (this.age - 1) + "." );
        System.out.println("Thank you again for the " + this.formatItems() + ".");
        System.out.printf("\n");
        System.out.println(this.closing + ",");
        System.out.printf("\n");
        System.out.println(this.name);
    }

    private String formatItems()
    {
        String listString = "";

        if (this.items.size() == 1)
        {
            return (String)this.items.get(0);
        }

        else if (this.items.size() > 1)
        {
            for (int i = 0; i < this.items.size(); i++)
            {
                if (i == this.items.size() - 1)
                {
                    listString += "and " + this.items.get(i);
                }
                else
                {
                    listString += this.items.get(i)+ "," + " ";
                }
            }

            return listString;
        }
        else
            return "No items in the list";
    }

}

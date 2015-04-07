package com.company;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner nameInput = new Scanner(System.in);
        Scanner ageInput = new Scanner(System.in);
        Scanner personInput = new Scanner(System.in);
        Scanner responseInput = new Scanner(System.in);
        Scanner totalPresentsInput = new Scanner(System.in);
        Scanner presentNameInput = new Scanner(System.in);

        String name;
        String person;
        int age;
        int totalPresents;
        int counter = 1;
        String presentName;
        String response;

        List presentList = new ArrayList<String>();



        System.out.println("What is your name?");
        name = nameInput.next();
        System.out.println("How old are you?");
        age = ageInput.nextInt();
        System.out.println("Did you get any presents (yes/no)");
        response = responseInput.next();
        System.out.println("Who gave you the presents?");
        person = personInput.next();
        System.out.println("How many presents did you get?");
        totalPresents = totalPresentsInput.nextInt();

        if (response.equals("yes"))
        {
            while (counter <= totalPresents)
            {
                System.out.println("Present " + counter + " :");
                presentName = presentNameInput.next();
                presentList.add(presentName);
                counter++;
            }

            ThankYouBDLetter thankYouLetter = new ThankYouBDLetter("Dear", person, name, "Love", age, presentList);

            thankYouLetter.printMessage();
        }
        else
        {
            System.out.println("You did not get an presents? Then why are you writing a thank you letter?");
        }


    }


}

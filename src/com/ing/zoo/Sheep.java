package com.ing.zoo;

import java.util.Random;

public class Sheep {
    public String name;
    public String helloText;
    public String eatText;

    public String trick;

    public Sheep()
    {
    }

    public void sayHello()
    {
        helloText = "beeeeeh";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch grasssszzz";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "back flip";
        }
        else
        {
            trick = "front flip";
        }
        System.out.println(trick);
    }
}

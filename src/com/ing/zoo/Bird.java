package com.ing.zoo;

public class Bird {
    public String name;
    public String helloText;
    public String eatText;

    public Bird()
    {
    }

    public void sayHello()
    {
        helloText = "woosh";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch seed";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom nice worm";
        System.out.println(eatText);
    }
}

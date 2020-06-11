package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test

    public void contructorTest(){
        //Given

        String first = "Bobbina";
        String last = "Jones";
        int energy = 50;

        //When
        Human test = new Human(first, last);
        String actualFirst = test.getFirstName();
        String actualLast = test.getLastName();
        int actualEnergy = test.getEnergy();

        //Then
        Assert.assertEquals(first, actualFirst);
        Assert.assertEquals(last, actualLast);
        Assert.assertEquals(energy, actualEnergy);
    }

    @Test

    public void eatTest(){
        //Given
        Fruit apple = new Fruit("apple", 10);
        Human testHuman = new Human("Barney", "Boi");
        int expectedEnergy = 60;
        
        //When
        testHuman.eat(apple);
        int actualEnergy = testHuman.getEnergy();


        //Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test

    public void workTest(){
        Human testHuman = new Human ("Bob", "The Builder");
        int expectedEnergy = 30;

        testHuman.work(2);

        int actualEnergy = testHuman.getEnergy();

        Assert.assertEquals(expectedEnergy, actualEnergy);


    }

    @Test

    public void energyMaxTest(){
        Human testHuman = new Human("Bob", "Bobby");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Banana", 20);
        Human.maxEnergy = 100;

        testHuman.eat(testFruit1);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);

        int actualEnergy = testHuman.getEnergy();

        Assert.assertEquals(100, actualEnergy);


    }

    @Test 

    public void energyMinTest(){
        Human testHuman = new Human("Bob", "Bobby");

        testHuman.work(6);

        int actualEnergy = testHuman.getEnergy();

        Assert.assertEquals(50, actualEnergy);
        
    }

    @Test
    public void maxEnergyChangeTest(){
        Human h1 = new Human("Sapphire", "Burch");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Banana", 20);
        
        
        Human.maxEnergy = 150;
        
        
        h1.eat(testFruit1);
        h1.eat(testFruit2);
        h1.eat(testFruit3);

       int actualEnergy = h1.getEnergy();
        
        Assert.assertEquals(110, actualEnergy);



    }
    
}
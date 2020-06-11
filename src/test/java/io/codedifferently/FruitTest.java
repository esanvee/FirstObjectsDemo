package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class FruitTest {

    @Test
    public void constructerTest(){
        //Given
        String testType = "apple";
        int testEnergy = 20;


        //When
        Fruit testFruit = new Fruit(testType, testEnergy);
        String actualType = testFruit.getType();//testType should be in the type field in fruit
        int actualEnergy = testFruit.getEnergy();

        //Then
        Assert.assertEquals(testType, actualType);
        Assert.assertEquals(testEnergy, actualEnergy);
    }
    
}
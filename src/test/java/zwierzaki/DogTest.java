package zwierzaki;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testFoodKind() {
        //given
        Dog dog = new Dog();
        //when
        List<FoodKind> foodKinds = dog.foodKind();
        //then
        assertTrue(foodKinds.contains(FoodKind.MIĘSO));
        assertTrue(foodKinds.contains(FoodKind.MYSZY));
    }

}
package zwierzaki;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void testFoodKind() {
        //given
        Bird bird = new Bird();
        //when
        List<FoodKind> foodKinds = bird.foodKind();
        //then
        assertTrue(foodKinds.contains(FoodKind.ZBOŻE));
        assertTrue(foodKinds.contains(FoodKind.MYSZY));
    }
}
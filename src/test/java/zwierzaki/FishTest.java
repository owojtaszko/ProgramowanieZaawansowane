package zwierzaki;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FishTest {
    @Test
    public void testFoodKind() {
        //given
        Fish fish = new Fish();
        //when
        List<FoodKind> foodKinds = fish.foodKind();
        //then
        assertTrue(foodKinds.contains(FoodKind.KARMA));
        assertTrue(foodKinds.contains(FoodKind.TRAWA));
    }

}
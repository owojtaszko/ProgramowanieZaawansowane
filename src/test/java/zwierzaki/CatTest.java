package zwierzaki;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void testFoodKind() {
        //given
        Cat cat = new Cat();
        //when
        List<FoodKind> foodKinds = cat.foodKind();
        //then
        assertTrue(foodKinds.contains(FoodKind.MLEKO));
        assertTrue(foodKinds.contains(FoodKind.MYSZY));
    }

}
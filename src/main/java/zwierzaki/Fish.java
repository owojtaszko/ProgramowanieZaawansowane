package zwierzaki;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Fish implements Pet {
    private final List<FoodKind> mouseFood = Arrays.asList(FoodKind.KARMA, FoodKind.TRAWA);

    @Override
    public List<FoodKind> foodKind() {
        return mouseFood;
    }

    @Override
    public void doSound() {

    }

    @Override
    public void doIntroduce() {

    }

    @Override
    public void doFeed(Food food) {

    }

    @Override
    public void entertainMe() {

    }
}
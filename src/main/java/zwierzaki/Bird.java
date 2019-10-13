package zwierzaki;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;


@Getter
@Setter
public class Bird implements Pet {
    private final List<FoodKind> birdFood = Arrays.asList(FoodKind.ZBOŻE, FoodKind.MYSZY);

    @Override
    public List<FoodKind> foodKind() {

        return birdFood;
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
package zwierzaki;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Cat implements Pet {
    private final List<FoodKind> catFood = Arrays.asList(FoodKind.MLEKO, FoodKind.MYSZY);

    @Override
    public List<FoodKind> foodKind() {
        return catFood;
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
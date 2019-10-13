package zwierzaki;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Dog implements Pet {
    private final List<FoodKind> dogFood = Arrays.asList(FoodKind.MYSZY, FoodKind.MIĘSO);

    @Override
    public List<FoodKind> foodKind() {
        return dogFood;
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

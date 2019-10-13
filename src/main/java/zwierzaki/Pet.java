package zwierzaki;

import java.util.List;

public interface Pet {

    List<FoodKind> foodKind();
    void doSound();
    void doIntroduce();
    void doFeed(Food food);
    void entertainMe();
}

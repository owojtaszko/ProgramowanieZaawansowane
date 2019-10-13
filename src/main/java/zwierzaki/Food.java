package zwierzaki;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Food {

    private String foodDescription;
    private int foodAmount;
    private FoodKind foodKind;


}

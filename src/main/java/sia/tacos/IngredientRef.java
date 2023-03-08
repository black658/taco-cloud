package sia.tacos;


import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class IngredientRef {

    private final String ingredient;

}

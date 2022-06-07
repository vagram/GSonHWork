package Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Human {
    private String name;
    private String gender;
    private int age;
    private double weight;
    private double height;
    private List<Pet> pets;
}

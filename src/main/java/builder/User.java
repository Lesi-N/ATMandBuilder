package builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder @ToString @Getter
public class User {
    private String name;
    private int age;
    private String gender;
    private int weight;
    private int height;
    private String race;
    @Singular
    private List<String> occupations;
}

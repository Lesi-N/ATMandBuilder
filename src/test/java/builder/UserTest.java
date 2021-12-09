package builder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void builder() {
        User user1 = User.builder().name("Darya").race("Caucasian").occupation("CompSci").build();
        User user2 = User.builder().name("Khrystyna").age(18).height(175).gender("F").build();
        User user3 = User.builder().build();

        assertEquals(user1.getName(), "Darya");
        List<String> oc1 = Arrays.asList("CompSci");
        assertEquals(user1.getOccupations(), oc1);
        assertEquals(user1.getAge(),0);
        assertEquals(user1.getWeight(), 0);
        assertNotNull(user1.getRace());

        assertEquals(user2.getHeight(), 175);
        assertNotNull(user2.getGender());
        List<String> oc2 = new ArrayList<>();
        assertEquals(user2.getOccupations(), oc2);

        assertNull(user3.getName());
        assertNull(user3.getRace());
        assertNull(user3.getGender());

        assertEquals(user1.toString(), "User(name=Darya, age=0, gender=null, weight=0, height=0, race=Caucasian, occupations=[CompSci])");

    }
}
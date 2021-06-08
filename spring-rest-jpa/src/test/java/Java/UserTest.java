package Java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest {


    @Test

    public void this_method_implements_some_cool_users()
    {
        User User1 = new User("Hannes", "lenz.glhf@web.de", "p@ssw0rd007");
        User User2 = new User("Felix", "flexi@web.de", "flexer21");

        assertEquals("Hannes",User1.getName());
        assertEquals("flexi@web.de",User2.getEmail());
        assertEquals("flexer21", User2.getPassword());

    }
}
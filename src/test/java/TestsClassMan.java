import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsClassMan {

    @Test
    public void testClassConstructor() {
        Man man = new Man("Ivan", "Ivanov", 22, true);
        Assert.assertNotNull(man);
    }

    @Test (groups = "Getter")
    public void testGetFirstName() {
        Man man = new Man("Ivan", "Ivanov", 22, true);
        Assert.assertEquals(man.firstName, "Ivan");
    }

    @Test (groups = "Setter")
    public void testSetFirstName() {
        Man man = new Man("Ivan", "Ivanov", 22, true);
        man.setFirstName("NewIvan");
        Assert.assertEquals(man.getFirstName(), "NewIvan");
    }

    @Test (groups = "Getter")
    public void testGetLastName(){
        Man man = new Man("Ivan", "Ivanov", 22, true);
        Assert.assertEquals(man.lastNAme, "Ivanov");
    }

    @Test (groups = "Setter")
    public void testSetLastName() {
        Man man = new Man("Ivan", "Ivanov", 22, true);
        man.setLastNAme("Petrov");
        Assert.assertEquals(man.lastNAme, "Petrov");
    }

    @Test
    public void testIsRetriedTrue() {
        Man man = new Man("Ivan", "Ivanov", 66, true);
        Assert.assertTrue(man.isRetired());
    }

    @Test
    public void testIsRetriedFalse() {
        Man man = new Man("Ivan", "Ivanov", 22, true);
        Assert.assertFalse(man.isRetired());
    }
}

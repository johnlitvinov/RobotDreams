import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsClassWoman {

    @Test
    public void testClassConstructor() {
        Woman woman = new Woman("Anna", "Ivanova", 61, true,"Petrova");
        Assert.assertNotNull(woman);
    }

    @Test (groups = "Getter")
    public void testGetFirstName() {
        Woman woman = new Woman("Anna", "Ivanova", 61, true,"Petrova");
        Assert.assertEquals(woman.getFirstName(), "Anna");
    }

    @Test (groups = "Setter")
    public void testSetFirstName() {
        Woman woman = new Woman("Anna", "Ivanova", 61, true,"Petrova");
        woman.setFirstName("NewAnna");
        Assert.assertEquals(woman.getFirstName(), "NewAnna");
    }

    @Test (groups = "Getter")
    public void testGetLastName(){
        Woman woman = new Woman("Anna", "Ivanova", 61, true,"Petrova");
        Assert.assertEquals(woman.getLastNAme(), "Ivanova");
    }

    @Test (groups = "Setter")
    public void testSetLastName() {
        Woman woman = new Woman("Anna", "Ivanova", 61, true,"Petrova");
        woman.setLastNAme("Petrova");
        Assert.assertEquals(woman.getLastNAme(), "Petrova");
    }

    @Test
    public void testIsRetriedTrue() {
        Woman woman = new Woman("Anna", "Ivanova", 61, true,"Petrova");
        Assert.assertTrue(woman.isRetired());
    }
    @Test
    public void testIsRetriedFalse() {
        Woman woman = new Woman("Anna", "Ivanova", 59, true,"Petrova");
        Assert.assertFalse(woman.isRetired());
    }

    @Test (groups = "Getter")
    public void testGetMaidenName(){
        Woman woman = new Woman("Anna", "Ivanova", 61, true,"Petrova");
        Assert.assertEquals(woman.getMaidemName(), "Petrova");
    }
}

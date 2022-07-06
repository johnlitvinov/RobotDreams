import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsClassMan {

    @Test(dataProvider = "Constructor Method test data", dataProviderClass = ManClassDataProvider.class)
    public void testClassConstructor(Man man) {
        Assert.assertNotNull(man);
    }

    @Test (groups = "Getter", dataProvider = "Getter First Name test data", dataProviderClass = ManClassDataProvider.class)
    public void testGetFirstName(Man man, String firstName) {
        Assert.assertEquals(man.firstName, firstName);
    }

    @Test (groups = "Setter",dataProvider = "Method test data to check SETTER's", dataProviderClass = ManClassDataProvider.class)
    public void testSetFirstName(Man man,String firstName) {
        man.setFirstName(firstName);
        Assert.assertEquals(man.getFirstName(), firstName);
    }

    @Test (groups = "Getter",dataProvider = "Getter Last Name test data", dataProviderClass = ManClassDataProvider.class)
    public void testGetLastName(Man man,String lastName){
        Assert.assertEquals(man.getLastNAme(), lastName);
    }

    @Test (groups = "Setter",dataProvider = "Method test data to check SETTER's", dataProviderClass = ManClassDataProvider.class)
    public void testSetLastName(Man man, String lastName) {
        man.setLastNAme(lastName);
        Assert.assertEquals(man.getLastNAme(), lastName);
    }

    @Test(dataProvider = "IsRetried test data", dataProviderClass = ManClassDataProvider.class)
    public void testIsRetried(Man man, boolean isRetried) {
        Assert.assertEquals(man.isRetired(),isRetried);
    }
}//end test class

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsClassWoman {

    @Test (dataProvider = "Constructor Method test data", dataProviderClass = WomanClassDataProvider.class)
    public void testClassConstructor(Woman woman) {
        Assert.assertNotNull(woman);
    }

    @Test (groups = "Getter",dataProvider = "Getter First Name test data", dataProviderClass = WomanClassDataProvider.class)
    public void testGetFirstName(Woman woman,String firstName) {
        Assert.assertEquals(woman.getFirstName(), firstName);
    }

    @Test (groups = "Setter",dataProvider = "Method test data to check SETTER's", dataProviderClass = WomanClassDataProvider.class)
    public void testSetFirstName(Woman woman,String firstName) {
        woman.setFirstName(firstName);
        Assert.assertEquals(woman.getFirstName(), firstName);
    }

    @Test (groups = "Getter",dataProvider = "Getter Last Name test data", dataProviderClass = WomanClassDataProvider.class)
    public void testGetLastName(Woman woman,String lastName){
        Assert.assertEquals(woman.getLastNAme(), lastName);
    }

    @Test (groups = "Setter",dataProvider = "Method test data to check SETTER's", dataProviderClass = WomanClassDataProvider.class)
    public void testSetLastName(Woman woman,String lastName) {
        woman.setLastNAme(lastName);
        Assert.assertEquals(woman.getLastNAme(), lastName);
    }

    @Test (dataProvider = "IsRetried test data", dataProviderClass = WomanClassDataProvider.class)
    public void testIsRetriedTrue(Woman woman,boolean isRetried) {
        Assert.assertEquals(woman.isRetired(),isRetried);
    }

    @Test (groups = "Getter",dataProvider = "Getter Maiden Name test data", dataProviderClass = WomanClassDataProvider.class)
    public void testGetMaidenName(Woman woman,String maidenName){
        Assert.assertEquals(woman.getMaidemName(), maidenName);
    }
}//end test class

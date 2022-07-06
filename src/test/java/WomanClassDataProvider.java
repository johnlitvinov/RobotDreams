import org.testng.annotations.DataProvider;

public class WomanClassDataProvider {
    @DataProvider(name = "Constructor Method test data")
    public static Object [] [] getTestDataConstructor() {
        return new Object [] [] {
                {new Woman("Anna", "Ivanova", 59, true,"Zel")},
                {new Woman("Ann", "Ivanovich", 60, true,"Kim")},
                {new Woman("Gala", "Klimovich", 61, true,"Chi")}
        };
    }

    @DataProvider(name = "Getter First Name test data")
    public static Object [] [] getTestDataFirstName() {
        return new Object [] [] {
                {new Woman("Anna", "Ivanova", 59, true,"Zel"),"Anna"},
                {new Woman("Ann", "Ivanovich", 60, true,"Kim"),"Ann"},
                {new Woman("Gala", "Klimovich", 61, true,"Chi"),"Gala"}
        };
    }

    @DataProvider(name = "Getter Last Name test data")
    public static Object [] [] getTestDataLastName() {
        return new Object [] [] {
                {new Woman("Anna", "Ivanova", 59, true,"Zel"),"Ivanova"},
                {new Woman("Ann", "Ivanovich", 60, true,"Kim"),"Ivanovich"},
                {new Woman("Gala", "Klimovich", 61, true,"Chi"),"Klimovich"}
        };
    }

    @DataProvider(name = "Method test data to check SETTER's")
    public static Object [] [] setTestDataFirstName() {
        return new Object [] [] {
                {new Woman("Anna", "Ivanova", 59, true,"Zel"),"Kate"},
                {new Woman("Ann", "Ivanovich", 60, true,"Kim"),"Ilona"},
                {new Woman("Gala", "Klimovich", 61, true,"Chi"),"Dina"}
        };
    }

    @DataProvider(name = "IsRetried test data")
    public static Object [] [] IsRetried() {
        return new Object [] [] {
                {new Woman("Anna", "Ivanova", 59, true,"Zel"),false},
                {new Woman("Ann", "Ivanovich", 60, true,"Kim"),true},
                {new Woman("Gala", "Klimovich", 61, true,"Chi"),true}
        };
    }

    @DataProvider(name = "Getter Maiden Name test data")
    public static Object [] [] getTestDataMaidenName() {
        return new Object [] [] {
                {new Woman("Anna", "Ivanova", 59, true,"Zel"),"Zel"},
                {new Woman("Ann", "Ivanovich", 60, true,"Kim"),"Kim"},
                {new Woman("Gala", "Klimovich", 61, true,"Chi"),"Chi"}
        };
    }
}//end class

import org.testng.annotations.DataProvider;

public class ManClassDataProvider {
    @DataProvider(name = "Constructor Method test data")
    public static Object [] [] getTestDataConstructor() {
        return new Object [] [] {
                {new Man("Ivan",  "Chic", 22, true)},
                {new Man("Petr", "Lit", 33, false)},
                {new Man("Vasyl", "Com", 60, true)}
        };
    }

    @DataProvider(name = "Getter First Name test data")
    public static Object [] [] getTestDataFirstName() {
        return new Object [] [] {
                {new Man("Ivan",  "Chic", 22, true),"Ivan"},
                {new Man("Petr", "Lit", 33, false),"Petr"},
                {new Man("Vasyl", "Com", 60, true),"Vasyl"}
        };
    }

    @DataProvider(name = "Getter Last Name test data")
    public static Object [] [] getTestDataLastName() {
        return new Object [] [] {
                {new Man("Milan",  "LITVIN", 40, true), "LITVIN"},
                {new Man("Andriy", "Vil", 50, false),"Vil" },
                {new Man("Viktor", "Kim", 60, true),"Kim"}
        };
    }

    @DataProvider(name = "Method test data to check SETTER's")
    public static Object [] [] setTestDataFirstName() {
        return new Object [] [] {
                {new Man("Ivan",  "Chic", 22, true),"Stive"},
                {new Man("Petr", "Lit", 33, false),"Petr"},
                {new Man("Vasyl", "Com", 60, true),"David"}
        };
    }

    @DataProvider(name = "IsRetried test data")
    public static Object [] [] IsRetried() {
        return new Object [] [] {
                {new Man("Milan",  "LITVIN",64,true ) ,false},
                {new Man("Andriy", "Vil", 65,false),true},
                {new Man("Viktor", "Kim",66,true ),true }
        };
    }
}//end class

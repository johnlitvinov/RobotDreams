import org.testng.annotations.AfterSuite;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseTest {
    String dbAddressDB = "jdbc:postgresql://localhost:5432/students";
    String dbUser = "postgres";
    String dbPassword = "221289";

    private static final Logger log = LogManager.getLogger(BaseTest.class);

    protected Connection getConnection() throws SQLException {
        return DBConnection.getInstance(dbAddressDB,dbUser,dbPassword).getConnection();
    }

    @AfterSuite
    public void tearDown() {
        try {
            DBConnection.closeConnection();
        } catch (SQLException e) {
            log.error("Failed to close connection {}", e.getMessage());
        }
    }
} //end class

import org.testng.annotations.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBTest extends BaseTest{
    private PreparedStatement preparedStatement;
    private String sqlPattern;
    private ResultSet rs;
    private static final Logger log = LogManager.getLogger(DBTest.class);

    @Test
    public void testCreateDB() throws SQLException {
        sqlPattern = "CREATE DATABASE students";
        preparedStatement = getConnection().prepareStatement(sqlPattern);
        try {
            preparedStatement.executeUpdate();
            log.info("DataBase 'students' has been created successfully...");
        } catch (SQLException e) {
            log.warn("DataBase 'students' already exist...");
            System.out.println(e.getMessage());
        }
    }


    @Test (priority = 1)
    public void testCreateTable() throws SQLException {
        sqlPattern = "CREATE TABLE IF NOT EXISTS students" +
                "(id serial PRIMARY KEY," +
                "first_name VARCHAR ( 50 ) NOT NULL," +
                "last_name  VARCHAR ( 50 ) NOT NULL)";
        preparedStatement = getConnection().prepareStatement(sqlPattern);
        try {
            preparedStatement.executeUpdate();
            log.info("Table 'students' has been created successfully...");
        } catch (SQLException e) {
            log.error("Table 'students' has not been created...");
            e.printStackTrace();
        }
    }

    @Test (priority = 2)
    public void testInsertDataIntoTable() throws SQLException {
        sqlPattern = "INSERT INTO students VALUES (1,'Ivan', 'Litvinau')";
        preparedStatement = getConnection().prepareStatement(sqlPattern);
        try {
            preparedStatement.executeUpdate();
            log.info("Student has been added successfully...");
        } catch (SQLException e) {
            log.error("Student has not been added...");
            e.printStackTrace();
        }


        sqlPattern = "SELECT count(*) FROM students";
        preparedStatement = getConnection().prepareStatement(sqlPattern);
        rs = preparedStatement.executeQuery();
        rs.next();

        while (rs.next()) {
            System.out.printf("Student is : %d %s %s  \n",
                    rs.getInt("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"));
        }
    }

    @Test (priority = 3)
    public void testSelectDataFromTable() throws SQLException {
        sqlPattern = "SELECT * FROM students";
        preparedStatement = getConnection().prepareStatement(sqlPattern);
        rs = preparedStatement.executeQuery();

        while (rs.next()) {
            System.out.printf("Student is : %d %s %s  \n",
                    rs.getInt("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"));
        }
    }

    @Test (priority = 4)
    public void testUpdateDataIntoTable() throws SQLException {
        sqlPattern = "UPDATE students SET first_name = 'NewName' WHERE id = 1";
        preparedStatement = getConnection().prepareStatement(sqlPattern);
        try {
            preparedStatement.executeUpdate();
            log.info("First student has been changed his First_Name successfully...");
        } catch (SQLException e) {
            log.error("First student  has not been changed his First_Name...");
            e.printStackTrace();
        }

        sqlPattern = "SELECT * FROM students";
        preparedStatement = getConnection().prepareStatement(sqlPattern);
        rs = preparedStatement.executeQuery();
        while (rs.next()) {
            System.out.printf("Student is : %d %s %s  \n", rs.getInt("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"));
        }
    }

    @Test (priority = 5)
    public void testDeleteRecordIntoTable() throws SQLException {
        sqlPattern = "DELETE FROM students WHERE id = 1";
        preparedStatement = getConnection().prepareStatement(sqlPattern);

        try {
            preparedStatement.executeUpdate();
            System.out.println("Deleted from the table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 6)
    public void testDropTable() throws SQLException {
        sqlPattern = "DROP TABLE IF EXISTS students";
        preparedStatement = getConnection().prepareStatement(sqlPattern);

        try {
            preparedStatement.executeUpdate();
            System.out.println("TABLE dropped");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
} // end class

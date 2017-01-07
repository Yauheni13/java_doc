import org.testng.annotations.Test;

import java.sql.*;

public class DataBase {

    @Test
    public void dataBaseAddressBook() {
        Connection conn = null;
        String url = "jdbc:mariadb://localhost:3306/";
        String database = "addressbook";
        String username = "admin";
        String pass = "secret";
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url + database, username, pass);
            System.out.println("Connected to the database");
            Statement stat = conn.createStatement();
            String query = "select * from group_list";
            ResultSet result = stat.executeQuery(query);
            while (result.next()){
                String name = result.getString("group_name");
                String footer = result.getString("group_footer");
                String header = result.getString("group_header");
                System.out.println(name + "  " + footer + "  " + header);
            }
            query = "delete from group_list where group_name = 'test1'";
            stat.executeUpdate(query);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
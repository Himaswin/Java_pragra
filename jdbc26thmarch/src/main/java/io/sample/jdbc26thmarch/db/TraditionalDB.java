package io.sample.jdbc26thmarch.db;

import java.sql.*;

public class TraditionalDB {
    public void setUpDbConnection() throws SQLException {

        try(Connection connection = DriverManager.getConnection("jdbc:h2:./appdb", "sa", "")){
            if(connection != null){
                System.out.println("connected to db");
                
                String sql = "SELECT * FROM TEST";
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery();
                while(resultSet.next()){
                    System.out.println(resultSet.getString(2));
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

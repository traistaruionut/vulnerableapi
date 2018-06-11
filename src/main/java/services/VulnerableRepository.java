package services;

import entities.User;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class VulnerableRepository {
    Connection connection;

    String findAllUsers = "select * from user";

    public VulnerableRepository() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://172.18.0.2:3306/db_example", "springuser", "pass");
            System.out.println("HERE");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User findUser(){
        User someUser = new User();
        someUser.setName("something");
        return someUser;
    }

    public List<User> findAll() {
        Statement stmt = null;
        List<User> usersList = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(findAllUsers);
            while(rs.next()){
                User user = new User();
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                usersList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return usersList;
    }
}

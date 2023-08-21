package io.thenewpadawan.example.jsfvetsandpets.repository.impl;

import java.sql.*;

import io.thenewpadawan.example.jsfvetsandpets.entity.PetEntity;
import io.thenewpadawan.example.jsfvetsandpets.repository.PetRepository;

public class PetRepositoryImpl implements PetRepository {

    @Override
    public boolean save(PetEntity entity) {
        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null;
        PreparedStatement preparedStetement = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            preparedStetement = connection.prepareStatement(
                    "INSERT INTO pet (name,breed,old,domestic) VALUES(?,?,?,?)");
            preparedStetement.setString(1, entity.getName());
            preparedStetement.setString(2, entity.getBreed());
            preparedStetement.setDate(3, new Date(2010, 10, 20));
            preparedStetement.setBoolean(4, entity.getDomestic());
            //while (resultSet.next()) {}
            int rowAffected = preparedStetement.executeUpdate();
            return rowAffected == 1;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            try {
//                resultSet.close();
//            } catch (Exception ignored) {}
//            try {
//                statement.close();
//            } catch (Exception ignored) {}
            try {
                preparedStetement.close();
            } catch (Exception ignored) {}
            try {
                connection.close();
            } catch (Exception ignored) {}
        }
        return false;

        // mydb is database
        // mydbuser is name of database
        // mydbuser is password of database

        /*int code;
        String title;
        while (resultSet.next()) {
            code = resultSet.getInt("code");
            title = resultSet.getString("title").trim();
            System.out.println("Code : " + code
                    + " Title : " + title);
        }*/
    }
}

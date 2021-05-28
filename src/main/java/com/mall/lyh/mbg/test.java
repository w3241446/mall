package com.mall.lyh.mbg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
    private static final String URL = "jdbc:mysql://localhost:3306/mall?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
    private static final String NAME = "root";
    private static final String PASSWORD = "123456";

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);
        java.sql.Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from pms_brand");
        System.out.println("resultSet:" + resultSet.toString());
    }

}

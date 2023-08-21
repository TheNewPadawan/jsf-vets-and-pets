package io.thenewpadawan.example.jsfvetsandpets.repository;

public interface GenericRepository<ENTITY> {
    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final String DB_URL = "jdbc:mysql://localhost:3306/pets_and_vets";
    final String DB_USERNAME = "app_pets_and_vets";
    final String DB_PASSWORD = "app_pets_and_vets";
    
    boolean save(ENTITY entity);
}

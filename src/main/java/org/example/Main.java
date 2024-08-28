package org.example;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector connector = new DatabaseConnector();
        connector.selectAllBooks();
        connector.selectAllSales(); // Added additional method to test out getting all sales :)
    }
}
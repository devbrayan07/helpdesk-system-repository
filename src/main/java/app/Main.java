package app;

import database.ConnectionFactory;

import java.sql.Connection;

public class Main {

    static void main() {

        try ( Connection connection = ConnectionFactory.getConnection()) {
            System.out.println("Conexão com MySQL realizada com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao conectar com o banco de dados.");

            e.printStackTrace();
        }
    }
}

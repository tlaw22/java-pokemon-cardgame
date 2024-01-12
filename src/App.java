import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/pokemon_data?";
        try {
            // Establish the connection object
            Connection connection = DriverManager.getConnection(url, "root", "#######");
            // Create a statement object to execute the SQL statement.
            Statement statement = connection.createStatement();
            // Execute the SQL statement to send to the server.
            ResultSet pokeData = statement.executeQuery("SELECT * FROM pokemon_tbl");
            // Process the result set.
            int total = 0;
            while (pokeData.next()) {
                System.out.print(pokeData.getString("name"));
                System.out.print(" has ");
                System.out.print(pokeData.getString("HP"));
                System.out.println(" HIT POINTS");
                // total += resultsSet.getInt("HP");

            }
            System.out.println(total);

            Map<Integer, Pokemon> pokemonMap = new HashMap<>();
            while (pokeData.next()) {
                int id = pokeData.getInt("id");
                String name = pokeData.getString("name");
                String type1 = pokeData.getString("type1");
                String type2 = pokeData.getString("type2");
                int total2 = pokeData.getInt("total");
                int hp = pokeData.getInt("hp");
                int attack = pokeData.getInt("attack");
                int defense = pokeData.getInt("defense");
                int spAttack = pokeData.getInt("sp_attack");
                int spDefense = pokeData.getInt("sp_defense");
                int speed = pokeData.getInt("speed");
                int generation = pokeData.getInt("generation");
                boolean legendary = pokeData.getBoolean("legendary");

                Pokemon pokemon = new Pokemon(id, name, type1, type2, total, hp, attack, defense, spAttack, spDefense,
                        speed, generation, legendary);
                pokemonMap.put(id, pokemon);
            }
            System.out.println("===========================");
            // implement a stream to filter the data

            String printPoke = "Heliolisk";
            Pokemon pokemon2 = pokemonMap.values().stream()
                    .filter(p -> p.getName().equals(printPoke))
                    .findFirst()
                    .orElse(null);
            if (pokemon2 != null) {
                int speed = pokemon2.getSpeed();
                System.out.println("The speed of " + printPoke + " is: " + speed);
            } else {
                System.out.println("Pokemon not found: " + printPoke);
            }

            pokeData.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Unable to connect to the database");
            e.printStackTrace();
        }
    }
}

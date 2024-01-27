package sena;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Sergej Chumakov on 26.01.2024
 */
public class Main {
    public static void main(String[] args) {

        try {
            ClassLoader classLoader = Main.class.getClassLoader();
            String path = classLoader.getResource("test.txt").getPath();
            List<String> sqlRequests = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);

            Dao dao = new Dao();

            for (String request: sqlRequests) {
                System.out.println("Request: " + request);
                List<String> responses = dao.sqlRequest(request);
                System.out.println("Response:");
                for (String response: responses) {
                    System.out.println(response);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

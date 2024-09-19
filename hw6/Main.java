import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        cutGmails();
    }
    @SneakyThrows
    public static void cutGmails(){
        Path sourcePath = Paths.get("emails.txt");
        Path targetPath = Paths.get("res.txt");

        try (
                BufferedReader reader = Files.newBufferedReader(sourcePath);
                BufferedWriter writer = Files.newBufferedWriter(targetPath);
        ){
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("@gmail.com")){
//                    String[] split = line.split("\t\t\t");
                    String[] split = line.split("\\s+");
                    writer.write(split[split.length-1]);
                    writer.newLine();
                }
            }
        }
    }
}

package StringBuilderEStringBuffer.BufferedWriterEBufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEBufferedReader {

    public static void bufferedWriter(String[] array){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Escrevendo no arquivo.");
            writer.write("\nAqui é outra linha.");

            for (String name : array) {
                writer.write("\n" + name);
            }
            writer.close();

            System.out.println("Arquivo criado com Sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

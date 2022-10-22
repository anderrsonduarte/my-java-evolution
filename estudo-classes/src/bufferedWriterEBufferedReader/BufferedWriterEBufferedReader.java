package StringBuilderEStringBuffer.bufferedWriterEBufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEBufferedReader {
    //Classe para Escrita de arquivos
    public static void bufferedWriter(String[] array){
try {                                   //Chamando Classe e como Paramentro FileWriter para criar o arquivo .txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Escrevendo no arquivo.");
            writer.write("\nAqui é outra linha.");
            //Percorrendo o array com a variável name para fazer o print dos conteúdos do array
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

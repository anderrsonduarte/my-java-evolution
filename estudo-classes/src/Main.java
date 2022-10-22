package StringBuilderEStringBuffer;

import StringBuilderEStringBuffer.bufferedWriterEBufferedReader.BufferedWriterEBufferedReader;
import StringBuilderEStringBuffer.fila.FilaQueue;

public class Main {

    public static void main(String[] args){
        //Métodos para junção de Grande quantidade de Strings
        StringBuilderEStringBuffer.StringBufferEStringBuilder.stringBuffer(new String[]{"A", "B", "C", "D", "E"});

        StringBuilderEStringBuffer.StringBufferEStringBuilder.stringBuilder(new String[]{"A", "B", "C", "D", "E"});
        //Método para criação e escrita em um arquivo.
        BufferedWriterEBufferedReader.bufferedWriter(new String[]{"John", "Carl", "Jerry"});
        //Método para criação Fila com a Classe Queue.
        FilaQueue.queue(new String[]{"HRV", "Golf", "Polo", "Camaro", "Tiggo 3x"});
    }
}

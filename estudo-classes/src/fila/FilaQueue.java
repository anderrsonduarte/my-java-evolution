package StringBuilderEStringBuffer.fila;

//Classe para criação de Fila

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {

    public static void queue(String[] array){

        System.out.println("Fila de carros: " + Arrays.toString(array));

        Queue<String> carros = new LinkedList<>();

        for(String carro : array){
            carros.add(carro);
        }
        System.out.println("Imprimindo abaixo topo da fila utilizando o método 'peek' mas não remove da fila");
        System.out.println("Topo da fila: " + carros.peek());
        System.out.println(carros);
        System.out.println("Imprimindo abaixo topo da fila utilizando o método 'poll' e depois remove o elemento da fila");
        System.out.println("Topo da fila: " + carros.poll());
        System.out.println(carros);

        System.out.println(carros.isEmpty()?"Fila vazia":"Fila com elementos");

    }
}

package StringBuilderEStringBuffer;

public class StringBufferEStringBuilder {

    public static void stringBuffer(String[] array){

            String alfabeto = "";
            //Classe para fazer a junção de uma grande quantidade de Strings
            //OBS: Thread Safy
            StringBuffer sb = new StringBuffer();
            for (String letra : array){
                sb.append(letra);
            }
            alfabeto = sb.toString();

            System.out.println("String Buffer: " + alfabeto);

        }
    public static void stringBuilder(String[] array){

        String alfabeto = "";
        //Classe para fazer a junção de uma grande quantidade de Strings
        StringBuilder sb_ = new StringBuilder();
        for (String letra : array){
            sb_.append(letra);
        }
        alfabeto = sb_.toString();

        System.out.println("String Builder: " + alfabeto);
    }

        //String[] letras = {"A", "B", "C", "D", "E"};
}

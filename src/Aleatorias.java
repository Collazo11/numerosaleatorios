import java.util.ArrayList;
import java.util.List;

public class Aleatorias {
    //lista de 50 numeros aleatorios entre 0 y 100
       public static void main(String[] args){
           List <Integer> lista = new ArrayList<>();
           for(int i = 0; i < 50; i++){
               lista.add((int) (Math.random()* 100));
           }
           System.out.println(lista);
       }

}

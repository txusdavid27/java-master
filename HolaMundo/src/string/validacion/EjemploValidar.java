package string.validacion;

import java.util.function.BinaryOperator;

public class EjemploValidar {
    public static void main(String[] args) {
        String curso=null;

        boolean esNulo = curso == null;

        System.out.println("ES NULO: "+esNulo);

        if(esNulo){
            curso="Estructuras de Datos";
        }
        boolean esVacio = curso.length() == 0;
        boolean esVacio2 = curso.isEmpty();
        boolean enBlanco = curso.isBlank();
        if(!esVacio && !esVacio2 && !enBlanco){
            System.out.println("Bienvenido al curso ".concat(" desde cero!") + (curso));
            System.out.println(curso.toUpperCase());
        }

        System.out.println("enBlanco = " + enBlanco);

    }
}

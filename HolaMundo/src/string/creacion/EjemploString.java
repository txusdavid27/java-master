package string.creacion;

public class EjemploString {
    public static void main(String[] args) {
        String curso="Programacion JAVA";
        String curso2= new String("Programacion JAVA");

        boolean iguales = curso2==curso; //FAlse
        System.out.println(iguales);

        iguales = curso2.equals(curso); //TRue
        System.out.println(iguales);

        String curso3= new String("Programacion Java");
        iguales = curso3.equalsIgnoreCase(curso);//True.
        System.out.println(iguales);

        String curso4="Programacion JAVA";
        iguales = curso4 == curso;//True.
        System.out.println(iguales);
        //ES TRue porque JAVA Optimiza en caso de que ya exista
        // UN objeto de otra referencia con el mismo valor.
        //entonces es como en C++ que puede apuntar a uno mismo.

    }
}

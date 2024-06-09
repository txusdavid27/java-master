package string.inmutabilidad;

public class EjemploInmutable {
    public static void main(String[] args) {
        String curso="Programacion 1";
        String profe="Jesu";

        String resultado= curso.concat(profe);
        System.out.println(resultado);
        System.out.println(curso==resultado);

        String resultado2 = curso.transform((c) -> {
            return c + " con "+profe;
        });
        System.out.println(curso);
        System.out.println(resultado2);
    }
}

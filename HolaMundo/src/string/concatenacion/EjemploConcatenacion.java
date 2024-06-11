package string.concatenacion;

public class EjemploConcatenacion {
    public static void main(String[] args) {
        String curso="Profe";
        String profe="Jesu";

        String detalle= curso+" con el Profe "+profe;
        System.out.println(detalle);

        String detalle2 = curso.concat(profe);
        System.out.println(detalle2);

    }
}

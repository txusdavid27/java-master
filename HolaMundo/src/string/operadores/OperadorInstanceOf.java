package string.operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        Object texto="Golazo";
        Boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String "+b1);


        Number num=1;
        Boolean b2 = num instanceof Integer;
        System.out.println("Num es del tipo Integer "+b2);


    }
}

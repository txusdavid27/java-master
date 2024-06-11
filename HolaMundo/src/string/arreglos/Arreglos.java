package string.arreglos;

public class Arreglos {
    public static void main(String[] args) {
        String trabaLenguas = "trabalenguas";
        System.out.println("trabaLenguas.toCharArray() = " + trabaLenguas.toCharArray());
        char[] arreglo = trabaLenguas.toCharArray();
        int large = arreglo.length;
        System.out.println("large = " + large);
        for(int i=0; i<large; i++){
            System.out.print("arreglo = " + arreglo[i]);
        }
    }
}

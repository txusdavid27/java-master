package string.operadores;

import javax.swing.*;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        Object texto="Golazo";
        Boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String "+b1);


        Number num=1;
        Boolean b2 = num instanceof Integer;
        System.out.println("Num es del tipo Integer "+b2);


        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        String numero2Str = JOptionPane.showInputDialog(null, "Ingrese otro número entero");

//        El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
//                Podría ser utilizando operador ternario.


//        // Crear la ventana
//        JFrame frame = new JFrame("Mi Primera Ventana Swing");
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Crear un panel
//        JPanel panel = new JPanel();
//
//        // Crear un botón
//        JButton button = new JButton("Haz clic aquí");
//
//        // Agregar un evento al botón
//        button.addActionListener(e -> {
//            // Mostrar un mensaje al hacer clic
//            JOptionPane.showMessageDialog(frame, "¡Hola, mundo!");
//            System.out.println("Botón presionado");
//        });
//
//        // Agregar el botón al panel
//        panel.add(button);
//
//        // Agregar el panel a la ventana
//        frame.add(panel);
//
//        // Hacer la ventana visible
//        frame.setVisible(true);
    }





}

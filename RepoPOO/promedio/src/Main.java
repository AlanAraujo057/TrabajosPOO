import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero: "));
        Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
        Double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el tercer numero: "));

        System.out.println((num1 + num2 + num3) / 3);
    }
}

import javax.swing.JOptionPane;

public class area {
    public static void main(String[] args) {
        areacuadrilatero c1;
        float lado1, lado2;
        
        lado1 =  Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
        lado2 =  Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));
        
        if (lado1 == lado2){ //(cuadrado)
            c1 = new areacuadrilatero(lado1);
        }
        else{
            c1 = new areacuadrilatero(lado1, lado2);  
        }
        
        System.out.println("El perimetro es: " + c1.getPerimetro());
        System.out.println("El area es: " + c1.getArea());
    }
}

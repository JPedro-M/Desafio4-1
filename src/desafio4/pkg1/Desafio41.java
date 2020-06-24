package desafio4.pkg1;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class Desafio41 {
    public static void main(String[] args) {
        double P, E, M;
        
        P = Double.parseDouble(JOptionPane.showInputDialog("Qual o peso dos peixes em quilos?"));
        
         if (P > 50){
             E = P - 50;
             M = 4.00*E;
         }else{
             E = 0;
             M = 0;
         }
         JOptionPane.showMessageDialog(null, "O peso dos peixes é: "+P+"\nO exesso é: "+E+"\nA multa é: "+M);
    }
}



import java.util.ArrayList;
import javax.swing.JOptionPane; 
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c1 = new Carro(
        4, "elétrico", "automático", "verde", "gol", 1994, new Motor("fire", 8, 1300)
        );
        
        Moto m1 = new Moto(
        "Mecânica", "corrente", "branca", "fazer", 2009, new Motor ("Fast", 1, 250)
        );
        
        Onibus o1 = new Onibus ("Scanea", "dif4894984654684", 2, "branco" );
        
        ArrayList<Veiculo> frota = new ArrayList<Veiculo>();
        
        frota.add (m1);
        frota.add(c1);
        
        frota.add( new Carro (
        4, "elétrico", "automático", "Preto e Branco", "Creta", 2025, new Motor("Zero", 16, 465)
        ));
        
        for(Veiculo v: frota){
            JOptionPane.showMessageDialog(null, v.getModelo());
            if (v instanceof Carro){
                JOptionPane.showMessageDialog(null, "Carro");
            }else{
                JOptionPane.showMessageDialog(null, "Moto");
            }
            if (v instanceof Onibus){
              JOptionPane.showMessageDialog(null, "Onibus");  
            }
            else{
                JOptionPane.showMessageDialog(null, "Onibus");
            }
        }
        
//        JOptionPane.showMessageDialog(null, m1.getMotor().getCilindrada());
    }
    
}

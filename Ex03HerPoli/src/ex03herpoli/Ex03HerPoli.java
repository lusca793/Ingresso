package ex03herpoli;

import javax.swing.JOptionPane;

public class Ex03HerPoli {

    public static void main(String[] args) {
        
        int operacao;        
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para comprar Ingresso Normal" + "\nDigite 2 para comprar Ingresso VIP"));
        
        switch(operacao){
            case 1:
                Normal nor = new Normal();
                nor.imprimeValor();
                break;
            case 2:
                Vip vip = new Vip();
                vip.vip();
                int op;
                op = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para reservar no Camarote Inferior\nDigite 2 para reservar no Camarote Superior"));
                        switch(op){
                            case 1:
                                CamaroteInferior inf = new CamaroteInferior();
                                inf.imprimeValor();
                                break;
                            case 2:
                                CamaroteSuperior sup = new CamaroteSuperior();
                                sup.vip();
                                sup.imprimeValor();
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Digite um numero válido");
                                vip.imprimeValor();
                                break;
                        }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digite um numero válido");
                System.exit(0);
                break;
    
    
        }
    }
    
}

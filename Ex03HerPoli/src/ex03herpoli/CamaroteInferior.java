package ex03herpoli;

public class CamaroteInferior extends Vip{
    
    public String parte = "Inferior";
    
    @Override
    public void imprimeValor(){
        System.out.println("~~~~NOTINHA~~~~:"
                + "\n\nIngresso VIP..................R$"+this.vip()
                + "\nCamarote "+this.parte+"..........R$0.0"
                + "\nTOTAL ..........................R$"+this.valor
        );
    }
    
}

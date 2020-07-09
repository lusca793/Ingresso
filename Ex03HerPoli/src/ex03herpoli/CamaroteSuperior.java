package ex03herpoli;

public class CamaroteSuperior extends Vip{
    
    public String parte = "Superior";
    public double total;
    
    @Override
    public double vip(){
        this.valor = this.valor + 50;
        return this.valor;
    } 
    
    
    
    @Override
    public void imprimeValor(){
        System.out.println("~~~~NOTINHA~~~~:"
                + "\n\nIngresso VIP....................R$"+this.valor
                + "\nCamarote "+this.parte+"...............R$50.00"
                + "\nTOTAL ..........................R$"+this.vip()
        );
    }
    
}

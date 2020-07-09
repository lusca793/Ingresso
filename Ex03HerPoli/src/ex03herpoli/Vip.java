package ex03herpoli;

public class Vip extends Ingresso {
    
    public double vip;
    
    public double vip(){
        this.valor = this.valor + 50;
        return this.valor;
    }
    
    
    @Override
    public void imprimeValor(){
        System.out.println("~~~~NOTINHA~~~~:"
                + "\n\nVIP..................R$"+this.valor);
    }
}

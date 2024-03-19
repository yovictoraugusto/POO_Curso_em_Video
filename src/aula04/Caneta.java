package aula04;

public class Caneta{
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;


    public Caneta(){
        this.tampar();
        this.cor = "Azul";
    }

    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public boolean getTampada(){
        return this.tampada;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ponta: "+this.getPonta());
    }
}
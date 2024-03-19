package aula011;

public class Bolsista extends Aluno{
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsaa...");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("É bolsista!");
    }
}

package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo; //cc ou cp
    private String dono;
    private float saldo;
    private boolean status;

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String tipo, float saldo){
        this.setStatus(true);
        this.setTipo(tipo);
        if(tipo == "cc"){
            this.setSaldo(saldo + 50);
        } else if (tipo == "cp") {
            this.setSaldo(saldo + 150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if(getSaldo() == 0){
            System.out.println("Conta fechada");
            setStatus(false);
        } else if (getSaldo()<0) {
            System.out.println("Conta não pode ser fechada pois está negativada");
        } else{
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
        }
    }

    public void depositar(float deposito){
        if(isStatus() == true){
            setSaldo(getSaldo()+deposito);
            System.out.println("Depósito realizado");
        }else{
            System.out.println("Conta fechada, não é possível realizar depósito");
        }
    }

    public void pagarMensal(){
        if(isStatus() == true){
            if(getTipo() == "cc"){
                System.out.println("Valor de R$ 12,00 pago");
                setSaldo(getSaldo() - 12);
            }else{
                System.out.println("Valor de R$ 20,00 pago");
                setSaldo(getSaldo() - 20);
            }
            System.out.println("Conta paga");
        }
        else{
            System.out.println("Conta fechada, não é possível realizar pagamento");
        }

    }

    public void sacar(float saque){
        if(isStatus() == true){
            if(getSaldo() >= saque){
                System.out.println("Valor sacado");
                setSaldo(getSaldo()-saque);
            }else{
                System.out.println("Valor não pode ser sacado devido saldo insuficiente");
            }
        }else{
            System.out.println("Conta fechada, não é possível realizar saque");
        }
    }

    public void estadoAtual(){
        System.out.println("-------------------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.isStatus());
        System.out.println("-------------------------------------------");
    }
}

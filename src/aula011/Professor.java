package aula011;

public class Professor extends Pessoa {
    private float salario;
    private String especialidade;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void recebeAumento(float aumento){
        setSalario(getSalario()*aumento);
    }
}

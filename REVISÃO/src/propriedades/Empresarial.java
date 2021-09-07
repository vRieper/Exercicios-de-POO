package propriedades;

public class Empresarial extends Conta {

    private Double limiteE;

    public Empresarial() {
        super();
    }

    public Empresarial(Integer numero, String dono, Double saldo, Double limiteE) {
        super(numero, dono, saldo);
        this.limiteE = limiteE;
    }

    public Double getLimiteE() {
        return limiteE;
    }

    public void setLimiteE(Double loanLimit) {
        this.limiteE = limiteE;
    }

    public void loan(double quantia) {
        if (quantia <= limiteE) {
            saldo += quantia - 10.0;
        }
    }

    @Override
    public void saque(double quantia) {
        super.saque(quantia);
        saldo -= 2.0;
    }
}
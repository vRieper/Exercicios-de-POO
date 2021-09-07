package propriedades;

public class Poupanca extends Conta {

    private Double taxaJuro;

    public Poupanca() {
        super();
    }

    public Poupanca(Integer numero, String dono, Double saldo, Double taxaJuro) {
        super(numero, dono, saldo);
        this.taxaJuro = taxaJuro;
    }

    public Double getTaxaJuro() {
        return taxaJuro;
    }

    public void setTaxaJuro(Double taxaJuro) {
        this.taxaJuro = taxaJuro;
    }

    public void atualizacaoSaldo() {
        saldo += saldo * taxaJuro;
    }

    @Override
    public final void saque(double quantia) {
        saldo -= quantia;
    }
}
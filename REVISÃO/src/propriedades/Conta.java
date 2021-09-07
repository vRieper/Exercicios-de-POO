package propriedades;

public abstract class Conta {

    private Integer numero;
    private String dono;
    protected Double saldo;

    public Conta() {
    }

    public Conta(Integer numero, String dono, Double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque(double Valor) {
        saldo -= Valor + 5.0;
    }

    public void deposito(double Valor) {
        saldo += Valor;
    }
}
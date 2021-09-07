package aplicativo;

import java.util.ArrayList;
import java.util.List;

import propriedades.Conta;
import propriedades.Empresarial;
import propriedades.Poupanca;

public class Programa {

    public static void main(String[] args) {

        List<Conta> lista = new ArrayList<>();

        lista.add(new Poupanca(01, "Pedro", 500.00, 0.01));
        lista.add(new Empresarial(02, "Lucas", 1000.0, 400.0));
        lista.add(new Poupanca(03, "Giovanni", 300.0, 0.01));
        lista.add(new Empresarial(04, "Amanda", 500.0, 500.0));

        double soma = 0.0;
        for (Conta acc : lista) {
            soma += acc.getSaldo();
        }

        System.out.printf("Saldo: %.2f%n", soma);
        System.out.println();

        for (Conta acc : lista) {
            acc.deposito(10.0);
        }
        for (Conta acc : lista) {
            System.out.printf("Saldo Atual %d: R$ %.2f%n", acc.getNumero(), acc.getSaldo());
        }
    }
}
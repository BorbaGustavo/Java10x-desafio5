package com.banco;

import com.banco.modelos.ContaCorrente;
import com.banco.modelos.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        // Criando uma conta corrente com saldo inicial de 1000
        ContaCorrente contaCorrente = new ContaCorrente(100);
        contaCorrente.ConbsultarSaldo();
        contaCorrente.Depositar(10);
        contaCorrente.ConbsultarSaldo();


        System.out.println("---------------------------------");
        ContaPoupanca contaPoupanca = new ContaPoupanca(100);
        contaPoupanca.ConbsultarSaldo();
        contaPoupanca.Depositar(10);
        contaPoupanca.ConbsultarSaldo();

    }
}

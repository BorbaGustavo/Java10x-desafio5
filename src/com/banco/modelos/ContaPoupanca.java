package com.banco.modelos;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void ConbsultarSaldo() {
        System.out.println("Seu saldo é: " + this.saldo);
    }
    @Override
    public void Depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

}

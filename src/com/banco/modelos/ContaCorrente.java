package com.banco.modelos;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void ConbsultarSaldo() {
        System.out.println("Seu saldo é: " + this.saldo);
    }

    @Override
    public void Depositar(double valor) {
        if(valor > 0) {
        this.saldo += valor - 0.01;
            System.out.println("Depósito de " + valor + " realizado com sucesso, foi retirado 1% de taxa.");
        }
        else {
            System.out.println("Valor inválido para depósito.");
        }
    }
}

package com.banco.modelos;
import com.banco.infefaces.Conta;

public abstract class ContaBancaria  implements Conta {
    // Atributos
    protected double saldo;


    // Construtor
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }


}

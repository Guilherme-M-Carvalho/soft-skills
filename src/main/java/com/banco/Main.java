package com.banco;

public class Main {
    public static void main(String[] args) {
        Cliente cl = new Cliente();
        cl.setNome("Guilherme");
        Conta cc = new ContaCorrente(cl);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(cl);
        cc.transferir(50.32, poupanca);

        cc.imprimirEstrato();
        poupanca.imprimirEstrato();
    }
}

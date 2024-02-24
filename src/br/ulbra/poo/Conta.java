package br.ulbra.poo;

import javax.swing.JOptionPane;

public class Conta {

    private int numConta;
    private String agencia;
    private double saldo;
    private String banco;

    public Conta() {
        this.saldo = 50;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void creditar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
             JOptionPane.showMessageDialog(null,"Creditado com sucesso!");
        } else {
            System.out.println("Apenas valores positivos!");
        }
    }

    public void debitar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            System.out.println("O valor foi sacado com sucesso!");
        } else {
            System.out.println("Impossivel sacar, saldo insuficiente!");
        }
    }

    public String imprimirSaldo() {
        return "O seu saldo atual é de R$ "+this.saldo;
    }
}

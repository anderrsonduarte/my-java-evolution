package com.dygital.controlefinanceiro;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ContaCorrente {
    private Integer numeroConta;
    private Integer numeroAgencia;
    private String nomeCliente;
    private LocalDate dataNascimento;
    private Double saldo = 0.0;

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "Conta Bancária[";
        s += " nomeCliente:" + nomeCliente;
        s += " | numeroConta:" + numeroConta;
        s += " | numeroAgencia:" + numeroAgencia;
        s += " | dataNascimento:" + dataNascimento;
        s += " | saldo:" + saldo;
        s += "]";
        return s;
    }

    public void depositar(Double valor){
        if(valor == 0){
            System.out.println("O valor de depósito deve ser superior a zero.");
        }else{
            setSaldo(getSaldo() + valor);
        }
    }

    public void sacar(Double valor){
        if(valor > getSaldo()) {
            System.out.println("Saldo insuficiente para esta transação.");
        }else{
            setSaldo(getSaldo() - valor);
        }
    }

    void transferir(ContaCorrente conta, ContaCorrente destino){}

    boolean cancelar(ContaCorrente conta, String justificativa){
        return false;
    }

    Double consultarSaldo(){
        return getSaldo();
    }

    List consultarExtrato(Date dataInicial, Date dataFinal){
        return null;
    }
}

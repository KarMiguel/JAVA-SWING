/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class VendaVeiculo {

    private static ArrayList<VendaVeiculo> listVendas = new ArrayList<>();

    private String idVenda;
    private String nomeComprador;
    private String cpfComprador;
    private Double valorPagamento;
    private Veiculo veiculo;
    private String formaPagamento;

    public static void addVenda(VendaVeiculo vv) {
        listVendas.add(vv);
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public static boolean verificarCpf(String cpf) {
        String apenasNumeros = cpf.replaceAll("[^0-9]", "");

        return apenasNumeros.length() == 11;
    }

    public static void removeVenda(VendaVeiculo vv) {
        listVendas.remove(vv);
    }

    public String gerarIdVenda() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String idVenda = "";

        for (int i = 0; i < 15; i++) {
            int index = (int) (Math.random() * caracteres.length());
            idVenda = idVenda + caracteres.charAt(index);
        }

        return idVenda;
    }

    public void cadastrarVenda(String nome, String cpf, Double valor, String formaPagamento, Veiculo v) {
        this.idVenda = gerarIdVenda();
        this.nomeComprador = nome;
        this.cpfComprador = cpf;
        this.valorPagamento = valor;
        this.formaPagamento = formaPagamento;
        this.veiculo = v;

    }

    public static void listarVendas() {
        for (VendaVeiculo v : listVendas) {
            System.out.println(v);
        }
    }

    public static ArrayList<VendaVeiculo> getListVendas() {
        return listVendas;
    }

    public String getIdVenda() {
        return idVenda;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprado(String nomeCompradot) {
        this.nomeComprador = nomeCompradot;
    }

    public String getCpfComprador() {
        return cpfComprador;
    }

    public void setCpfComprador(String cpfComprador) {
        this.cpfComprador = cpfComprador;
    }

    public Double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(Double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    @Override
    public String toString() {
        return "VendaVeiculo{"
                + "idVenda=" + idVenda
                + ", nomeComprador=" + nomeComprador
                + ", cpfComprador=" + cpfComprador
                + ", valorPagamento=" + valorPagamento
                + ", FormaPgamento = " + formaPagamento
                + ", \nveiculo=" + veiculo
                + '}';
    }

}

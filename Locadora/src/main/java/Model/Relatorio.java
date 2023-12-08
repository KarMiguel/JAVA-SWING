/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import  Model.*;

/**
 *
 * @author carlo
 */
public class Relatorio {

    public static double valorTotalVendas() {
        double valor = 0;
        for (VendaVeiculo v : VendaVeiculo.getListVendas()) {
            valor += v.getValorPagamento();
        }
        return valor;
    }

    public static double valorTotalVendasMotos() {
        double valor = 0;
        for (VendaVeiculo v : VendaVeiculo.getListVendas()) {
            if (v.getVeiculo().getTipo().toString().equals("MOTO")) {
                valor += v.getValorPagamento();
            }
        }
        return valor;
    }

    public static double valorTotalVendasCarro() {
        double valor = 0;
        for (VendaVeiculo v : VendaVeiculo.getListVendas()) {
            if (v.getVeiculo().getTipo().toString().equals("CARRO")) {
                valor += v.getValorPagamento();
            }
        }
        return valor;
    }

   public static double valorTotalEstoque() {
       double total =0;
        for (Veiculo v : Veiculo.getList()) {
           total += v.getValor();
               
            }
        return total;
    }


    public static int qtdTotalVendas() {

        return VendaVeiculo.getListVendas().size();
    }

    public static int qtdTotalMotosVendidas() {
        int qtd = 0;

        for (VendaVeiculo v : VendaVeiculo.getListVendas()) {
            if (v.getVeiculo().getTipo().toString().equals("MOTO")) {
                qtd++;
            }
        }
        return qtd;
    }

    public static int qtdTotalCarroVendidos() {
        int qtd = 0;

        for (VendaVeiculo v : VendaVeiculo.getListVendas()) {
            if (v.getVeiculo().getTipo().toString().equals("CARRO")) {
                qtd++;
            }
        }
        return qtd;
    }

    public static String formaPagamentoMaisUtilizada() {

        String pagamentoMaisUtilizado = null;
        int maxContagem = 0;

        if (VendaVeiculo.getListVendas().isEmpty()) {
            return null;
        }

        for (int i = 0; i < VendaVeiculo.getListVendas().size(); i++) {
            String formaPagamentoAtual = VendaVeiculo.getListVendas().get(i).getFormaPagamento();
            int contagemAtual = 1;
            for (int j = i + 1; j < VendaVeiculo.getListVendas().size(); j++) {
                if (formaPagamentoAtual.equals(VendaVeiculo.getListVendas().get(j).getFormaPagamento())) {
                    contagemAtual++;
                }
            }
            if (contagemAtual > maxContagem) {
                maxContagem = contagemAtual;
                pagamentoMaisUtilizado = formaPagamentoAtual;
            }
        }

        return pagamentoMaisUtilizado;
    }

}

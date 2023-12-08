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
public class Veiculo {

    private static ArrayList<Veiculo> list = new ArrayList<>();
   
    private int codigo;
    private String tipo;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    public Veiculo() {

    }

    public static int gerarCodigo() {
        int ultimaPosicao = getList().size() - 1;
        int proximo;
        if (ultimaPosicao == -1) {
            proximo = 1000;
        } else {
            proximo = list.get(ultimaPosicao).getCodigo() + 1;
        }
        return proximo;

    }

    public void cadastrarVeiculo(String tipo, String marca, String modelo, int ano, double valor) {
        setCodigo(gerarCodigo());
        setTipo(tipo);
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setValor(valor);
    }

    public void atualizarVeiculo(String tipo, String marca, String modelo, int ano, double valor) {
        setTipo(tipo);
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setValor(valor);
    }

    public static void addVeiculo(Veiculo veiculo) {
        list.add(veiculo);
    }

    public static void removerVeiculoEstoque(Veiculo v) {
        list.remove(v);
    }

    public static void removerVeiculo(int codigo) {
        list.remove(codigo);
    }

    public static Veiculo buscarVeiculo(int codigo) {
        Veiculo veiculo = null;

        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getCodigo() == codigo) {
                veiculo = Veiculo.getList().get(i);
                
                break;
            }
        }
        return veiculo;
    }

    public static void listarVeiculos(String tipo) {
        tipo.toUpperCase();
        for (Veiculo v : list) {
            if (v.getTipo().equals(tipo)) {
                System.out.println(v);
            } else if (!"CARRO".equals(tipo) && !"MOTO".equals(tipo)) {
                System.out.println(v);
            }
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static ArrayList<Veiculo> getList() {
        return list;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo
                + " - Tipo: " + tipo
                + " - Marca: " + marca
                + " - Modelo: " + modelo
                + " - Ano: " + ano
                + " - Valor: R$ " + String.format("%.2f", valor);
    }

}

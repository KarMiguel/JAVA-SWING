package Questao1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carlo
 */
public class Contatos {

    private static ArrayList<Contatos> lista = new ArrayList<>();

    private int id;
    private String nome;
    private String email;
    private String telefone;

    public Contatos() {

    }

    public static boolean validarFormatoTelefone(String telefone) {
        String regexTelefone = "^\\(\\d{2}\\) \\d{5}-\\d{4}$";
        Pattern pattern = Pattern.compile(regexTelefone);
        Matcher matcher = pattern.matcher(telefone);
        return matcher.matches();
    }

    public static boolean validarFormatoEmail(String email) {
        String regexEmail = "^[A-Za-z0-9._%+-]+@[gmail|hotmail|aluno.ifnmg|yahoo]+\\.[A-Z|a-z]{2,}$";
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
}


    public static void addContatos(Contatos c) {
        getLista().add(c);
    }

    public static void removerContatos(Contatos c) {
        getLista().remove(c);
    }

    public static void removerContatosTable(int linha) {
        getLista().remove(linha);
    }

    public void cadastrar(String nome, String email, String telefone) {
        this.id = gerarId();
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void editar(String nome, String email, String telefone) {
        this.id = gerarId();
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public static int gerarId() {
        int ultimaPosicao = getLista().size() - 1;
        int proximo;
        if (ultimaPosicao == -1) {
            proximo = 1000;
        } else {
            proximo = lista.get(ultimaPosicao).getId() + 1;
        }
        return proximo;

    }

    public static Contatos buscar(int codigo) {
        Contatos contato = null;

        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getId() == codigo) {
                contato = Contatos.getLista().get(i);
                break;
            }
        }
        return contato;
    }

    public static ArrayList<Contatos> getLista() {
        return lista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

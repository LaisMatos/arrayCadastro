package br.senai.sp.jandira.cadastro;

public class Cadastro {
	
	//sobrecarga = estruturas com nomes iguais e parametros diferentes
	
	//atributos
	private String nome;
	private String email;
	private String telefone;
	private String cidade;
	
	//Construtor
	public Cadastro(String nome, String email, String telefone,String cidade) {
		super(); //qual a função?
		this.nome=nome;
		this.email= email;
		this.telefone= telefone;
		this.cidade= cidade;
	}
	
	//Construtor vazio 
	public Cadastro() {
		
	}
	
	//métodos getters e setters 
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
	
	
}

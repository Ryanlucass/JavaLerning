/**
 * Summary description for Pessoa.
 */
public class Pessoa
{
	private String nome;
	private String endereco;

	public Pessoa(String nome, String e)
	{
		this.nome = nome;
		this.endereco = e;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getEndereco()
	{
		return this.endereco;
	}

	public Pessoa copia() 
	{
		Pessoa p = new Pessoa(this.nome, this.endereco);
		return p;
	}



	public String toString() 
	{
		return "Nome = " + nome + " e = " + endereco;
	}
}

public class Teste2
{
	public static void main(String args[]) 
	{
		Pessoa p, pShallow, pDeep;
		

		
		p = new Pessoa("Jamilina", "rua tal");
		
		pShallow = p.copia();
		
		System.out.println("\nPessoa Original: \n" + p);
		System.out.println("\nPessoa Clonada com Shallow: \n" 
					+ pShallow);
	
		System.out.println("\nMudando dados do Clone Shallow: \n");
//		pShallow.getEndereco().setNumero(333);
		pShallow.setNome("Estelille");

		
		System.out.println("\nPessoa Original: \n" + p);
		System.out.println("\nPessoa Clonada com Shallow: \n" 
			+ pShallow);
		
	}
}

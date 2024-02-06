package principio.responsabilidade;

public class PrincipioResponsabilidade {

	public static void main(String[] args) {
		
		 ContaBancaria bancaria = new ContaBancaria();
			bancaria.setDescricao("Conta bancária do Kennedy");
			
			System.out.println(bancaria);
			
			bancaria.soma100Reais();
			System.out.println(bancaria);
			
			bancaria.depositoDinheiro(500);
			System.out.println(bancaria);
			
			bancaria.diminui100Reais();
			System.out.println(bancaria);
			
			bancaria.sacarDinheiro(600);
			System.out.println(bancaria);
			
			bancaria.depositoDinheiro(50);
			System.out.println(bancaria);
	}

}

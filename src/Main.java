
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente carlos = new Cliente();
		carlos.setNome("Carlos Bóbio");
		
		Cliente elaine = new Cliente();
		elaine.setNome("Elaine Bóbio");
		
		
		Conta cc = new ContaCorrente(carlos);
		cc.depositar(100);
		
		Conta cc2 = new ContaCorrente(elaine);
		cc.depositar(200);
		
		Conta poupanca = new ContaPoupanca(carlos);
		
		Conta poupanca2 = new ContaPoupanca(elaine);
		
		cc.transferir(100, poupanca);
		cc2.transferir(200, poupanca2);
		
		cc.imprimirExtrato();
		cc2.imprimirExtrato();
		poupanca.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}

}

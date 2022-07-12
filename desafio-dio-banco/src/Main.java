
public class Main {

	public static void main(String[] args) {
		Cliente igor = new Cliente();
		igor.setNome("Igor");
		
		Cliente cartao = new Cliente();
		cartao.setCartao("Debito");
		
		Conta cc = new ContaCorrente(igor);
		cc.depositar(100);
		
		Cliente cartao2 = new Cliente();
		cartao2.setCartao("Credito");		
		
		Conta poupanca = new ContaPoupanca(cartao2);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}

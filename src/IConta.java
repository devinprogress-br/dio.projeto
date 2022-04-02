
public interface IConta {

	void sacar(doble valor);

	void depositar(doble valor);
		
	void transferir(doble valor, IConta contaDestino);
	
	void imprimirExtrato();
}

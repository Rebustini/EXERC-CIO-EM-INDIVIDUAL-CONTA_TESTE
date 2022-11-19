import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Conta {
	
	private boolean clienteEspecial;
	private Double saldoAtual;

	public boolean isClienteEspecial() {
	return clienteEspecial;
	}

	public Double getSaldoAtual() {
	return saldoAtual;
	}

	public void clienteEspecial() {
	this.clienteEspecial = true;
	}

	public void clienteComum() {
	this.clienteEspecial = false;
	}
	public void setSaldoAtual(Double saldoAtual) {
	this.saldoAtual = saldoAtual;
	}

	//Método responsável por liberar ou não o saque
	public boolean sacar(Double valorDoSaque) throws Exception {

	//Se o saldo for ficar negativo
	if(this.saldoAtual < valorDoSaque)
	{

	//E o cliente for especial
	if(isClienteEspecial())
	{

	//Libera o saque e atualiza o saldo
	this.atualizarSaldo(valorDoSaque);
	return true;

	//Se o cliente for comum
	} else {
	//Não libera o saque e retorna uma mensagem na Exception
	throw new Exception("Saldo Insuficiente");
	}

	//Se o saldo for ficar positivo

	} else {
	//Libera o saque e atualiza o saldo
	this.atualizarSaldo(valorDoSaque);
	return true;
	}

	}

	private void atualizarSaldo(Double valorDoSaque) {
	this.saldoAtual -= valorDoSaque;
	}

	@Given("^um cliente especial com saldo atual de -(\\d+) reais$")
	public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		arg1 = -200;
	    throw new PendingException();
	}

	@When("^for solicitado um saque no valor de (\\d+) reais$")
	public void for_solicitado_um_saque_no_valor_de_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		arg1 = 100;
	    throw new PendingException();
	}

	@Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Given("^um cliente comum com saldo atual de -(\\d+) reais$")
	public void um_cliente_comum_com_saldo_atual_de_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^solicitar um saque de (\\d+) reais$")
	public void solicitar_um_saque_de_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_Saldo_Insuficiente() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}

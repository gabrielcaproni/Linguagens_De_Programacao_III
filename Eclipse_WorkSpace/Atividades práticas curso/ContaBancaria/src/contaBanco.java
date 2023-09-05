
public class contaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public contaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public float getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void estadoAtual() {
		System.out.println("_____________________________________");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(tipo == "CC") {
			setSaldo(50);
		}else 
			if(tipo == "CP") {
				setSaldo(150);
			}
		System.out.println("Conta aberta com sucesso.");
	}
	
	public void fecharConta() {
		if(saldo > 0) {
			System.out.println("Não foi possivel fechar a conta, pois possui dinheiro.");
		}else
			if(saldo < 0) {
				System.out.println("Não foi possível fechar a conta, pois o saldo esta negativo.");
			}else {
				setStatus(false);
			}
		System.out.println("Conta fechada com sucesso!");
	}
	
	public void depositar(float v) {
		if(getStatus()) {
			setSaldo(getSaldo() + v);
			System.out.println("Depósito efetuado na conta de " + this.getDono());
		}else
			System.out.println("Impossivel depositar, conta fechada");
	}
	
	public void sacar(float v) {
		if(getStatus()) {
			if(getSaldo() >= v) {
				setSaldo(getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}
		}else {
			System.out.println("Impossivel sacar");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		
		if(getTipo() == "CC") {
			v = 12;
		}else
			if(getTipo() == "CP") {
				v = 20;
			}
		
		if(getStatus()) {
			if(saldo > v) {
				setSaldo(getSaldo() - v);
			}else
				System.out.println("Saldo insuficiente");
		}else {
			System.out.println("Impossivel pagar");
		}
		
	}
}

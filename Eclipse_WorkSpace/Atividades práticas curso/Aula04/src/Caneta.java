
public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;
	
	public Caneta(String m, String c, float p) {
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.Tampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void Tampar() {
		this.tampada = true;
	}
	
	public void Destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
	
}

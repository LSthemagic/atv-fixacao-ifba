package entities;

public class Brinquedo {
	protected double velocidade, aceleracao;
	
	public Brinquedo() {}
	
	public void mover() {
		System.out.println("Brinquedo se movendo...");
	}
	
	public void velocidade(int vel) {
		this.velocidade += vel;
	}
	
	public void velocidade(double vel) {
		this.velocidade += vel;
	}
	
	public void velocidade(int vel, double acel) {
		this.velocidade += vel * acel;
	}
	
	
}

import entities.Navio;
import entities.Caminhao;
import entities.Helicoptero;
import entities.Brinquedo;
import entities.ControleRemoto;

public class Main {
	public static void main(String[] args) {
        ControleRemoto cr = new ControleRemoto(new Brinquedo());
        cr.mover();
        cr = new ControleRemoto(new Navio());
		cr.mover();
        cr = new ControleRemoto(new Caminhao());
        cr.mover();
        cr = new ControleRemoto(new Helicoptero());
        cr.mover();
	}
}

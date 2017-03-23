
public class Jogo {

	int[][] tabuleiro = new int[2][9];

	public static void main(String[] args) {
		
		iniciaJogo();
	}
	
	public void iniciaJogo() {
		Peca vermelho1 = new Peca(1, 10, 0, 7);
		Peca vermelho2 = new Peca(2, 10, 0, 6);
		Peca vermelho3 = new Peca(3, 10, 0, 5);
		Peca preto1 = new Peca(1, 20, 0, 1);
		Peca preto2 = new Peca(2, 20, 0, 2);
		Peca preto3 = new Peca(3, 20, 0, 3);
	}

}

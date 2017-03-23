
public class Peca {
	
	int id;
	int jogador;
	int x;
	int y;
	
	public Peca(int id, int jogador, int x, int y) {
		this.id = id;
		this.jogador = jogador;
		this.x = x;
		this.y = y;
	}
	
	public boolean move(int jogador, int id, int xdestino, int ydestino) {
		this.x = xdestino;
		this.y = ydestino;
		
		return true;
	}
	
	public boolean validarInbounds(int xdestino, int ydestino) {
		if(xdestino>1 || ydestino>8) {
			return false;
		} else {
			return true;
		}
	}

}

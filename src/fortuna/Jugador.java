package fortuna;

public class Jugador {
	private int id_jugador;
	private int banca;
	private int dinero;
	public int getId_jugador() {
		return id_jugador;
	}
	public void setId_jugador(int id_jugador) {
		this.id_jugador = id_jugador;
	}
	public int getBanca() {
		return banca;
	}
	public void setBanca(int banca) {
		this.banca = banca;
	}
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	public Jugador() {
		
	}
	public void mostrarInfoJ() {
		System.out.println("Jugador: "+id_jugador+"\n Dinero: "+dinero+"€"+"\n Dinero acumulado: "+banca+"€");
	}
	
}

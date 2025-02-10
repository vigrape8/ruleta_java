package fortuna;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <paneles2> panel=new ArrayList<>();
		ArrayList <Jugador>jugadores=new ArrayList<>();
		//guardamos los jugadores y creamos los paneles
		crearJ(jugadores);
		crearPanel(panel);
		for (paneles2 pan : panel) {
			pan.mostrarPanel();
		}
		boolean run=true;
		do {
			for (int i = 0; i < 5; i++) {
				
			}
		}while(run!=true);
	}
	public static void crearJ(ArrayList <Jugador> jugador) {
		int njugador=3;
		for (int i = 0; i < njugador; i++) {
			Jugador jug=new Jugador();
			jug.setId_jugador(i+1);
			jug.setBanca(0);
			jug.setDinero(0);
			jugador.add(jug);
			
		}
	}
	public static void crearPanel(ArrayList <paneles2> panel) {
		int npaneles=5;
		for (int i = 0; i < npaneles; i++) {
			paneles2 pan=new paneles2();
			pan.setID(i);
			pan.crearPanel();
			panel.add(pan);
		}
	}
}

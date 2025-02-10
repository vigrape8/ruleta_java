package fortuna;

import java.util.ArrayList;

public class main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ruleta rule=new Ruleta();
		Jugador jug=new Jugador();
		Paneles pan=new Paneles();
		ArrayList <Paneles> panel=new ArrayList<>();
		ArrayList <Jugador>jugadores=new ArrayList<>();
		boolean run=true;
		crearPanel(panel);
		for (Paneles panel1 : panel) {
			panel1.mostrarPanel();
		}
		crearJ(jugadores);
		for (Jugador jugador : jugadores) {
			jugador.mostrarInfoJ();
		}
		
		
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
	public static void crearPanel(ArrayList <Paneles> panel) {
		int npaneles=5;
		for (int i = 0; i < npaneles; i++) {
			Paneles pan=new Paneles();
			pan.setID(i);
			pan.crearPanel();
			panel.add(pan);
		}
	}
	
}

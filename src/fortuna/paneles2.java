package fortuna;

import java.util.Scanner;

public class paneles2 {
	Scanner sc = new Scanner(System.in);
	private int ID;
	private String frase;
	private String pista;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getPista() {
		return pista;
	}

	public void setPista(String pista) {
		this.pista = pista;
	}

	public paneles2() {

	}
	public void crearPanel() {
		System.out.println("Introduce una frase para el panel: ");
		frase = sc.nextLine();
		System.out.println("Introduce la pista del panel");
		pista = sc.nextLine();
	}
	public void mostrarPanel() {
		Scanner sc = new Scanner(System.in);
		System.out.println(ID);
		System.out.println(frase);
		System.out.println(pista);
	}
}

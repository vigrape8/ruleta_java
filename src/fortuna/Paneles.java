package fortuna;


import java.util.Scanner;

public class Paneles {
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

	public Paneles() {

	}

	public void crearPanel() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase para el panel: ");

		frase = sc.nextLine();

		// reemplaza la cadena por *
		//String frasetacha = frase.replaceAll(".", "*");
		String frasetacha="";
		for (int j = 0; j < frase.length(); j++) {
			if(frase.charAt(j)==' ') {
				frasetacha+=' ';
			}
			else {
				frasetacha+='*';
			}
		}
			// Sacamos si hay letras dentro de la frase
			char letra = sc.next().charAt(0);
			String resultado = "";

			for (int i = 0; i < frase.length(); i++) {

				if (frase.charAt(i) == letra) {
					resultado += letra;
					// frasetacha = frasetacha.substring(0,i) + letra +
					// frasetacha.substring(i+1,frase.length());
					// frasetacha=frasetacha.replace(frasetacha.charAt(i), letra);
				} else {
					resultado += frasetacha.charAt(i);
				}
				
			}
			System.out.println(resultado);
	
		sc.nextLine();
		System.out.println("Introduce una pista para este panel: ");
		pista = sc.nextLine();
	}


	public void comprobar(char letra) {
		// comprueba si la las letras introducidas estan dentro de la cadena
		String frasetapada = frase;
		for (int i = 0; i < frasetapada.length(); i++) {
			if (frasetapada.charAt(i) == letra) {
				letra = frasetapada.charAt(i);

			}
		}
	}

	public void mostrarPanel() {
		Scanner sc = new Scanner(System.in);
		System.out.println(ID);
		System.out.println(frase);
		System.out.println(pista);
	}
}

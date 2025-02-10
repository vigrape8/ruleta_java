package fortuna;

import java.util.Iterator;
import java.util.Random;

public class Ruleta {
	 private int[] casillas=new int[7];

	public int[] getCasillas() {
		return casillas;
	}

	public void setCasillas(int[] casillas) {
		this.casillas = casillas;
	}
	 public Ruleta() {
		 
	 }
	 public void mostrarRule() {
		 System.out.println("          +#########++\r\n"
			  		+ "       ##      #      +#+\r\n"
			  		+ "     #+        #         +#\r\n"
			  		+ "   #+     0    #    25   +# ++\r\n"
			  		+ "  ###          #      +#     +\r\n"
			  		+ " #    +#+      #    +#       ++\r\n"
			  		+ "+#       +#+-#+--#+#          #\r\n"
			  		+ "++    QB   ++------#    50    #\r\n"
			  		+ "#          #+------++         #\r\n"
			  		+ "++     +###+#-----+#++++++++++#\r\n"
			  		+ " ###+         ###+#           +\r\n"
			  		+ " +#          #+    #+   75   #\r\n"
			  		+ "  +#  150   +#      ++      #\r\n"
			  		+ "    #+      #        +#   +#\r\n"
			  		+ "     +#+   +#   100    ###\r\n"
			  		+ "        +#+#        ++#+\r\n"
			  		+ "             ++++++");
	 }
	 public void casillas() {
	 casillas[0]=0;
     casillas[1]=25;
     casillas[2]=50;
     casillas[3]=75;
     casillas[4]=100;
     casillas[5]=150;
     casillas[6]=1;
     boolean run =true;
     int ale;
     int resultado=-1;

     do {
         Random rd = new Random();
         ale=rd.nextInt(0,7);

         for (int i = 0; i < casillas.length; i++) {

             if (ale==i) {

                 if (ale==6) {
                     String numCadena="Quiebra";
                     System.out.println(numCadena);
                     resultado=-1;
                     run=false;
                 }else {
                     resultado=casillas[i];
                     System.out.println(resultado);
                     run=false;
                 }
                 System.out.println(resultado);
             }
         }
     }while(run!=false);}
}

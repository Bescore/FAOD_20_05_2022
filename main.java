
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Cr�ez des objets ville (Marseille, Nice), affectez leurs propri�t�s, et utilisez la 
		m�thode d�affichage*/
		ville paris =new ville();
		 ville marseille = new ville("marseille","bouche du rh�ne");
		 ville nice = new ville("nice", "Alpes maritime");
		 System.out.println(paris);
		 
		 paris.setNom("lyon");
		 paris.setDepartement("Rh�ne");
		 System.out.println(paris);

	}

}

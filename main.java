
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Créez des objets ville (Marseille, Nice), affectez leurs propriétés, et utilisez la 
		méthode d’affichage*/
		ville paris =new ville();
		 ville marseille = new ville("marseille","bouche du rhône");
		 ville nice = new ville("nice", "Alpes maritime");
		 System.out.println(paris);
		 
		 paris.setNom("lyon");
		 paris.setDepartement("Rhône");
		 System.out.println(paris);

	}

}

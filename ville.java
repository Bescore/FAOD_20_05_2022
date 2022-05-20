
public class ville {
private String nom;
private String departement;
@Override
public String toString() {
	return "la ville " +nom+ " est dans le departement "+departement+" ";
}


public ville() {

	this.nom = "paris";
	this.departement = "île de france";
}

public ville(String nom, String departement) {

	this.nom = nom;
	this.departement = departement;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getDepartement() {
	return departement;
}


public void setDepartement(String departement) {
	this.departement = departement;
}



}

package item;

import annot.Item;
import annot.TypeItem;

@Item(nom = "Epee", type = TypeItem.Arme)
public class Epee {
	
	int force;
	String def = "Coup d'�p�e";
	public Epee(){
		
		this.force = 15;
	}
	
	public int getForce() {
		return force;
	}	
}

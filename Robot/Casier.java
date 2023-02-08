package tp5robot;

import java.util.HashMap;

public class Casier {
public int nbcases;
HashMap<Objet, Integer> element = new HashMap<Objet, Integer>();
public Casier(int n) {
	nbcases=n;
}
public void Sesir(Objet e,int i) {
	element.put(e, i);
}
@Override
public String toString() {
	return "Casier [element=" + element + "]";
}


}

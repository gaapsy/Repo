package abr;
public class ABR extends java.lang.Object {
	private int valeur;
	private ABR gauche, droit;
	
	public ABR(){
		valeur=0;
	}
	public ABR(int x){
		this.valeur=x;
	}
	protected int getValeur(){
		return(valeur);
	}

	protected ABR (int x, ABR g, ABR d){
		valeur=x;
		gauche=g;
		droit=d;
	}
	public boolean isempty(){
		return (valeur==0);
	}
	
	public void insert(int x){
		ABR g;
		ABR d;
		if (this.getValeur()!=x) {
			g=this.gauche;
			d=this.droit;
			g.insert(x);
			d.insert(x);
		}
		valeur=x;
	}
	public int nbElement(){
		ABR g;
		int i=0;
		if (this.isempty()){
		return 0;	
		}
		else {
			g=this.gauche;
			g.nbElement();
			i++;
		}
		return i;
		
	}
	
}
	
	
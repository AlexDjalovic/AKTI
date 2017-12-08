package AKTI;

public abstract class Akt implements Cloneable{

	protected String naziv;
	protected static int agid=0;
	protected int id=++agid;
	private boolean original=true;
	
	
	public abstract String naziv() ;
    
	
	public Akt clone() throws CloneNotSupportedException{
		if(!original)throw new CloneNotSupportedException();//ako nije orginal ne moze da se kopira
		Akt a=(Akt) super.clone();
			 a.original=false;
		
		return a;
	}
	public String toString(){
		return naziv()+"/"+id+"/"+(original?" original":" duplikat");

}}

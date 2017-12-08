package AKTI;

public class VlasnickiList extends Akt{

	private Osoba vlasnik;
	private boolean vazeci=true;
	
	public VlasnickiList(Osoba vlas) {
		vlasnik=vlas;
	}

	@Override
	public String naziv() {
		return " VLASNICKI LIST ";
	}

	public Osoba getVlasnik(){
		return vlasnik;
	}
	public boolean daLiVazi(){
		return vazeci;
	}
	public void postajeNeVazeci(){
		vazeci=false;
	}

	public VlasnickiList clone() throws CloneNotSupportedException{
		if(!vazeci)throw new CloneNotSupportedException();//ne vazeci list ne moze da se kopira
		return (VlasnickiList) super.clone();
	}
	public String toString(){
		return super.toString()+" "+daLiVazi();
	}
}

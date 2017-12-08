package AKTI;

import java.util.ArrayList;
import java.util.List;

public class Sud {

	private String naziv;
	List<Akt>akti;
	private int brstvorenihAkata=0;
	
	public Sud(String ime){
		naziv=ime;
		akti=new ArrayList<Akt>();
	}
	public int getBrPotvrda(){
		return brstvorenihAkata;
	}
	public int idkpugovor(Osoba kupac,Osoba prodavac) {
		KupoprodajniUgovor kkk=new KupoprodajniUgovor(kupac, prodavac);
		akti.add(kkk);brstvorenihAkata++;
		return kkk.id;
	}
	public KupoprodajniUgovor pravljenjeDuplikataUgovoraZadate(Osoba o,int broj) throws GnemaPravo{
		KupoprodajniUgovor ugovor=null;
	for(int i=0;i<akti.size();i++){
		if(akti.get(i).id==broj&&akti.get(i)instanceof KupoprodajniUgovor&&akti.get(i)!=null){
			 ugovor=(KupoprodajniUgovor) akti.get(i);
			 if(o!=ugovor.getKupac()&&o!=ugovor.getProdavac())throw new GnemaPravo();
		}
			
		}//kraj for petlje
	try {
		return (KupoprodajniUgovor) ugovor.clone();
	} catch (CloneNotSupportedException e) {
		return null;
	}
	}
	
	public int prikaziBrojNovoKreiranogVlasnickogList(Osoba vlasnik){
		VlasnickiList vl=new VlasnickiList(vlasnik);
		akti.add(vl); brstvorenihAkata++;
		return vl.id;
	}
	public VlasnickiList pravljenjeDuplikataVlasnickogListaZa(Osoba o,int broj) throws GnemaPravo{
		VlasnickiList lista=null;
		for(int i=0;i<akti.size();i++){
			if(akti.get(i)instanceof VlasnickiList&&akti.get(i)!=null&&akti.get(i).id==broj){
				lista= (VlasnickiList) akti.get(i);
				if(o!=lista.getVlasnik())throw new GnemaPravo();
			}
		}
		try {
			return (VlasnickiList)lista.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
		
	}
}

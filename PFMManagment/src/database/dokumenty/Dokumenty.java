package database.dokumenty;

public class Dokumenty {
	
	private Long ID;
	
	private int numerDokumentu;
	private int ilosc;
	
	private String typDokumentu;
	private String opis;
	private String index;
	private String jednostkaMagazynowa;
	private String data;
	private String okresKsiêgowania;
	
	private Float cena;
	private Float wartosc;
	
	public Dokumenty(Long iD, int numerDokumentu, int ilosc, String typDokumentu, String opis, String index,
			String jednostkaMagazynowa, String data, String okresKsiêgowania, Float cena, Float wartosc) {
		super();
		ID = iD;
		this.numerDokumentu = numerDokumentu;
		this.ilosc = ilosc;
		this.typDokumentu = typDokumentu;
		this.opis = opis;
		this.index = index;
		this.jednostkaMagazynowa = jednostkaMagazynowa;
		this.data = data;
		this.okresKsiêgowania = okresKsiêgowania;
		this.cena = cena;
		this.wartosc = wartosc;
	}
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public int getNumerDokumentu() {
		return numerDokumentu;
	}
	public void setNumerDokumentu(int numerDokumentu) {
		this.numerDokumentu = numerDokumentu;
	}
	public int getIlosc() {
		return ilosc;
	}
	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
	public String getTypDokumentu() {
		return typDokumentu;
	}
	public void setTypDokumentu(String typDokumentu) {
		this.typDokumentu = typDokumentu;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getJednostkaMagazynowa() {
		return jednostkaMagazynowa;
	}
	public void setJednostkaMagazynowa(String jednostkaMagazynowa) {
		this.jednostkaMagazynowa = jednostkaMagazynowa;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getOkresKsiêgowania() {
		return okresKsiêgowania;
	}
	public void setOkresKsiêgowania(String okresKsiêgowania) {
		this.okresKsiêgowania = okresKsiêgowania;
	}
	public Float getCena() {
		return cena;
	}
	public void setCena(Float cena) {
		this.cena = cena;
	}
	public Float getWartosc() {
		return wartosc;
	}
	public void setWartosc(Float wartosc) {
		this.wartosc = wartosc;
	}
	
	
	
	
	
	

}

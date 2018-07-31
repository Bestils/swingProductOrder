package produkty;

public class Produkty {
	
	private Long ID;
	
	private String index;
	private String opis;
	private String grupa;
	private String jednostkaMagazynowa;
	
	private float Cena;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getGrupa() {
		return grupa;
	}

	public void setGrupa(String grupa) {
		this.grupa = grupa;
	}

	public String getJednostkaMagazynowa() {
		return jednostkaMagazynowa;
	}

	public void setJednostkaMagazynowa(String jednostkaMagazynowa) {
		this.jednostkaMagazynowa = jednostkaMagazynowa;
	}

	public float getCena() {
		return Cena;
	}

	public void setCena(float cena) {
		Cena = cena;
	}

	public Produkty(Long id2,String index2,  String opis, String grupa, String jednostkaMagazynowa, float cena2) {
		super();
		ID = id2;
		this.index = index2;
		this.opis = opis;
		this.grupa = grupa;
		this.jednostkaMagazynowa = jednostkaMagazynowa;
		Cena = cena2;
	}

	@Override
	public String toString() {
		return "Produkty [ID=" + ID + ", index=" + index + ", opis=" + opis + ", grupa=" + grupa
				+ ", jednostkaMagazynowa=" + jednostkaMagazynowa + ", Cena=" + Cena + "]";
	}
	

	
	
}

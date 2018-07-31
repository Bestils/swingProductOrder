package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import produkty.Produkty;

public class GetProdukty {
	Connection connection;
	Statement statement;
	public List<Produkty> listofProducts(){
		  List<Produkty> produkty = new LinkedList<Produkty>();
		try
		{
			this.statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select  * from Produkty");
		
			while(rs.next()) {
			Long id = rs.getLong("id");
			String Index =rs.getString("Indeks");
			String Opis =rs.getString("Opis");
			String Grupa =rs.getString("Grupa");
			float Cena =rs.getFloat("Cena");
			String jednostkaMagazynowa=rs.getString("jednostka");
			
			
			produkty.add(new Produkty(id,Index,Opis,Grupa,jednostkaMagazynowa,Cena));		
		
		
			}
			return produkty;}
		catch(Exception e) {
			System.out.println("error" + e.getMessage());
		}
		return produkty;}
}

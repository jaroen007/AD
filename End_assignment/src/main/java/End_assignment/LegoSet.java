package End_assignment;

import java.util.HashMap;

public class LegoSet implements Comparable<LegoSet>{
	
	//All the fields that a LegoSet has.
	private String Item_Number;
	private String Name;
	private String Year;
	private String Theme;
	private String Subtheme;
	private String Pieces;
	private String Minifigures;
	private String Image_URL;
	private String GBP_MSRP;
	private String USD_MSRP;
	private String CAD_MSRP;
	private String EUR_MSRP;
	private String Packaging;
	private String Availability;
	
	//You can change what this item compares on by changing this variable.
	private String CompareOn;
	
	public LegoSet(String Item_Number, String Name, String Year, String Theme, String Subtheme, String Pieces, String Minifigures, String Image_URL, String GBP_MSRP, String USD_MSRP, String CAD_MSRP, String EUR_MSRP, String Packaging, String Availability) {
		
		this.Item_Number = Item_Number.replace("\"", "");
		this.Name = Name;
		this.Year = Year;
		this.Theme = Theme;
		this.Subtheme = Subtheme;
		this.Pieces = Pieces;
		this.Minifigures = Minifigures;
		this.Image_URL = Image_URL;
		this.GBP_MSRP = GBP_MSRP;
		this.USD_MSRP = USD_MSRP;
		this.CAD_MSRP = CAD_MSRP;
		this.EUR_MSRP = EUR_MSRP;
		this.Packaging = Packaging;
		this.Availability = Availability;
		
		this.CompareOn = this.Item_Number;
	}
	
	@Override
	public String toString() {
	
		return "ITEMID: "+ Item_Number + " Contains[" +
       Name + "," +
       Year + "," +
       Theme + "," +
       Subtheme + "," +
       Pieces + "," +
       Minifigures + "," +
       Image_URL + "," +
       GBP_MSRP + "," +
       USD_MSRP + "," +
       CAD_MSRP + "," +
       EUR_MSRP + "," +
       Packaging + "," +
       Availability + "]";
	
	}
	
	public int compareTo(LegoSet givenLego) {
		
		int CompareFirst = 0;
		int CompareSecond = 0;
		boolean CompareAsInt = true;
		
		try{
			CompareFirst = Integer.parseInt(CompareOn);
		}catch (NumberFormatException e) {
			CompareAsInt = false;
		}

		try{
			CompareSecond = Integer.parseInt(givenLego.CompareOn);
		}catch (NumberFormatException e) {
			CompareAsInt = false;
		}
		
		if(CompareAsInt) {
		 if( CompareFirst - CompareSecond == 0) {
			 return Name.compareTo(givenLego.Name);
		 }else {
			 return CompareFirst - CompareSecond;
		 }
		}
		
		return CompareOn.compareTo(givenLego.CompareOn);
	}

	
	
	

}

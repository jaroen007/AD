package End_assignment;

public class LegoSet implements Comparable<LegoSet>{
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
	
	
	public LegoSet(String Item_Number, String Name, String Year, String Theme, String Subtheme, String Pieces, String Minifigures, String Image_URL, String GBP_MSRP, String USD_MSRP, String CAD_MSRP, String EUR_MSRP, String Packaging, String Availability) {
		this.Item_Number = Item_Number ;
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
		int CompareFirst = Integer.parseInt(Item_Number);
		int CompareSecond = Integer.parseInt(givenLego.Item_Number);
		
		return CompareFirst - CompareSecond;
	
	}
	
	

	public int compaareTo(LegoSet givenLego) {
		try{
			
			//try to compare both and return the difference.
			//If you can compare both there both intergers and we want to return the difference.
			int CompareFirst = Integer.parseInt(Item_Number);
			int CompareSecond = Integer.parseInt(givenLego.Item_Number);
			
			return CompareFirst - CompareSecond;
		}
		catch(NumberFormatException e){
			
			//try to compare the first, if that causes no exception the first an Integer but the second a string
			try {
				int CompareFirst = Integer.parseInt(Item_Number);
				return 1; //If this is the case return 1 to signal any int is higher then any string
			}finally{
				//if the try fails the first one is a String and second an Integer
				return -1;//If this is the case return -1 to signal any int is higher then any string
			}

		}
		finally {
			return Item_Number.compareTo(givenLego.Item_Number);
		}
	}
	
	

}

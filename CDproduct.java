public class CDproduct extends Product{
	
	int numOfTracks;
	
	public CDproduct(String name, Integer price, int numOfTracks){
		super(name, price);
		this.numOfTracks = numOfTracks;
	}
}

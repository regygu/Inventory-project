public class BookProduct extends Product{
	
	public int pageSize;
	
	public BookProduct(String name, Integer price, int pageSize){
		super(name, price);
		this.pageSize = pageSize;
	}
}

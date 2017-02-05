
public class Main {
	
	public static void main(String[] args){
		
		StorageManager storeManager = new StorageManager();
		StoreCapable storeCapable = new PersistentStore();
		storeManager.addStorage(storeCapable);
		storeManager.addCDProduct("Mc Hammmer: Too Legit to Quit", 1999, 14);
		storeManager.addBookProduct("Java for Dummies", 4999, 666);
		System.out.println(storeManager.listProducts());
		System.out.println(storeManager.getTotalProductPrice());
		
	}

}

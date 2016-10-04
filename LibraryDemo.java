package in.ac.kletech.library;

public class LibraryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books impu=new Books(1,2409);
		Books rhl=new Books(5,74236);
		
		System.out.println("no of books"+impu.getInoofbooks());
		impu.choosebook(1);
		System.out.println("book no"+impu.getIbookno());
		impu.selectbook(2409);
		
		System.out.println("no of books"+rhl.getInoofbooks());
		rhl.choosebook(5);
		System.out.println("book no"+rhl.getIbookno());
		rhl.selectbook(74236);
	}

}

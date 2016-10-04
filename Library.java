package in.ac.kletech.library;

interface Library {
	final String slibname="CENTRAL LIBRARY";
	final String slibplace="KALABURAGI";
final Books impu=new Books();
final Books rhl=new Books();

}

class Books implements Library{
	String stitle;
	String sauthor;
	int inoofbooks;
	int ibookno;
	String sname;
	String splace;
	
	Books(){}
	
	public Books(int inoofbooks, int ibookno) {
		super();
		this.inoofbooks = inoofbooks;
		this.ibookno = ibookno;
	}



	public int getInoofbooks(){
		return inoofbooks;
	}


	public int getIbookno() {
		return ibookno;
	}


	void choosebook(int inoofbooks){
		if(inoofbooks>4)
			System.out.println("take less books,maximum 3");
		else 
			System.out.println("books taken are"+inoofbooks);
	}
	
	void selectbook(int ibookno){
		if(ibookno==2409)
		{
			stitle="DATA STRUCTURES";
			sauthor="PADMAREDDY";
			System.out.println("title is"+stitle);
			System.out.println("author is"+sauthor);
		}	
		else if(ibookno==1313)
		{
			stitle="INTODUCTION TO JAVA";
			sauthor="CARL STEIN";
			System.out.println("title is"+stitle);
			System.out.println("author is"+sauthor);
		}
		else
			System.out.println("book is not available");
	}
}

/*class Librarycard implements Library{
	String sname;
	int icardno;
	
	public Librarycard(String sname, int icardno) {
		super();
		this.sname = sname;
		this.icardno = icardno;
	}

	public String getSname() {
		return sname;
	}

	public int getIcardno() {
		return icardno;
	}
	
	
}*/











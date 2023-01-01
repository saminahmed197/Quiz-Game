package Login;

public class User {
	private String name;
	private int mark;

  
	public User(String Name, int mark) {
		 super();
	 		this.name = Name;
	 		this.mark = mark;// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	
	public void setMark(int mark) {
		this.mark = mark;
	}
	public User maxMark(User st[],int size) {
		int maxIndex=0;
		int maxMark= st[0].getMark();
		
		for(int i= 0; i<size; i++) {
			if(maxMark< st[i].getMark()) {
				maxMark = st[i].getMark();
				maxIndex= i;
			}
		}
		return st[maxIndex];
		
		
	}
	public String toString() {
		return name+"  got "+mark;
		
	}
	
	

}

package Learning.OOP.Encapsulation;

class ProductInfo{
	private int pid;
	private String pname;
	private String pimg;
	

	//setter and getter.
	public void setpid(int id) {
		this.pid=id;
	}
	public int getPid() {
		return this.pid;
	}
	public void setpname(String pname) {
		this.pname=pname;
	}
	public void getname(String pname) {
			this.pname=pname;
	}
	public void setpimg(String pimg) {
			this.pimg=pimg;
	}
	public void getpimg(String pimg) {
			this.pimg=pimg;
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductInfo p1 = new ProductInfo();
		p1.setpid(101);
		int id = p1.getPid();
		System.out.println(id);
	}

}

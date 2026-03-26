package anudip;
import java.io.Serializable;

class BeanClass implements Serializable {

	private int Rollno;
	private String name;
	BeanClass()
	{

	}
	public int Rollno() {
		return Rollno;
	}
	public void setRollno(int Rollno) {
		this.Rollno = Rollno;
	}

	public String name() {
		return name;

	}
	public void setname(String name) {
		this.name = name;

	}
	public static void main(String[] args) {
		// getter setter method


	}

}

public class JavaBean {

	public static void main(String[] args) {
		BeanClass obj= new BeanClass();
		obj.setRollno(101);
		obj.setname("Mayuri");
		

	}


}

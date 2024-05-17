package DSA;

import java.util.ArrayList;

class employee1
{
	int id;
	String name;
	public employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "employee1 [id=" + id + ", name=" + name + "]";
	}
	
}
public class ex11_tryempdata {
	public static void main(String args[])
	{
		employee e1=new employee(12,"ranjan");
		employee e2=new employee(45,"pari");
		employee e3=new employee(29,"rakesh");
		employee e4=new employee(88,"ronit");
		employee e5=new employee(28,"himanshu");
		
		ArrayList<employee> emp=new ArrayList<employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		System.out.println(emp);
		
		emp.stream().filter(m->m.getId()>30).forEach(k->System.out.println(k));
		
	}
}

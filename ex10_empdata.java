package DSA;


import java.util.Arrays;
import java.util.List;

class employee
{
	int id;
	String name;
	public employee(int id, String name) {
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
		return "employee [id=" + id + ", name=" + name + "]";
	}
	
}
public class ex10_empdata {
	public static void main(String args[])
	{
		employee e1=new employee(12,"ranjeet");
		employee e2=new employee(75,"munna");
		employee e3=new employee(62,"chanan");
		employee e4=new employee(12,"abhiram");
		
		//ArrayList<employee> emp=new ArrayList<employee>();
		//emp.add(e1);
		
		List<employee> emp=Arrays.asList(e1,e1,e3,e4);
		
		//System.out.println(emp);
		
		emp.stream().filter(m->m.getId()>30).forEach(k->System.out.println(k));//lambda expression(pipeline->terminal)
	}
}

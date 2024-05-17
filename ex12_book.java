package DSA;


import java.util.Arrays;
import java.util.List;

class book
{
	int id;
	String name;
	String bname;
	public book(int id, String name, String bname) {
		super();
		this.id = id;
		this.name = name;
		this.bname = bname;
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
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", bname=" + bname + "]";
	}
	
}
public class ex12_book {
	public static void main(String args[])
	{
		book b1=new book(12,"rakesh","john walker");
		book b2=new book(31,"mukesh","rock");
		book b3=new book(56,"mala","shailey");
		book b4=new book(41,"ajeet","jaitley");
		book b5=new book(78,"vikash","max");
		book b6=new book(82,"dinesh","leee");
		List<book> books=Arrays.asList(b1,b2,b3,b4,b5,b6);
		
		//System.out.println(books);
		//for(Object ab:books) //old traditonal style
		//System.out.println(ab);
//		books.stream().forEach(p->System.out.println(p)); //lambda expression
//		books.stream().forEach(System.out::println);
//		books.stream().limit(3).forEach(System.out::println);
//		books.stream().skip(3).forEach(System.out::println);
//		long count=books.stream().count();
//		System.out.println(count);
//		books.stream().skip(3).limit(2).forEach(System.out::println);
//		books.stream().map(x->x.getName()).forEach(System.out::println);
//		books.stream().map(x->x.getName()+" "+x.getBname()).forEach(System.out::println);
//		books.stream().filter(x->x.getName().equals("rakesh")).forEach(System.out::println);
//		books.stream().filter(x->x.getId()>=50).forEach(System.out::println);
//		books.parallelStream().forEach(System.out::println); // this will random display as fast (multi threaded)
//		List<Integer> in=Arrays.asList(90,-90,43,12,3,4,45,-3,21);
//		in.stream().sorted().forEach(System.out::println);
	}
}

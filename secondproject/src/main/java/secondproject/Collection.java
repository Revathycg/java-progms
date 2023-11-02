package secondproject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Collection {

	public static void main(String[] args) {
		ArrayList<String> Fruits=new ArrayList();
		Fruits.add("mango");
		Fruits.add("apple");
		Fruits.add("pineapple");
		System.out.println(Fruits);
		Fruits.add(1,"pears");
		System.out.println(Fruits);
		ArrayList<String> veg=new ArrayList();
		veg.add("carrot");
		veg.add("cabbage");
		veg.add("tomato");
		veg.add("beans");
		veg.add("beetroot")	;
		Fruits.addAll(veg);
		System.out.println(Fruits);//change occurs
		System.out.println(Fruits.get(2));
		System.out.println(Fruits.set(5,"beetroot"));
		System.out.println(Fruits);
		System.out.println(Fruits.remove(3));
		System.out.println(Fruits);
		System.out.println(Fruits.isEmpty());
		System.out.println(Fruits.indexOf("carrot"));
		for(String f:Fruits) {
			System.out.println(f);}
		Collections.sort(Fruits);
		System.out.println(Fruits);
		Iterator<String> itr=Fruits.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			System.out.println(itr.hasNext());
		}
		}
		

	}



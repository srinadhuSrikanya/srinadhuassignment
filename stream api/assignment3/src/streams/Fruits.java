package streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fruits {
	String name;
	String color;
    static int calories;
    static int price;
 public  void Fruit(String name,String color,Integer calories,Integer price) {
		this.name=name;
		this.color=color;
		this.calories=calories;
		this.price=price;
		}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public String getcolor() {
	return color;
}
public void setcolor(String color) {
	this.color=color;
}
public int getcalories() {
	return calories;
}
public void setcalories(int calories) {
	this.calories=calories;
}
public static int getprice() {
	try {
		return price;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		return calories;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return calories;
}
public void setprice(int price) {
	this.price=price;
}
@SuppressWarnings("static-access")
@Override
public String toString() {
	return this.name+ " " + this.color+ " " +this.calories+ " " + this.price;
}
	

}

/*I will learn how to iterate over list set and map using java for each method

WORK AND CHECK WHAT IS RIGHT VS WRONG HERE

It can be written in two useful ways and one is using functional interface as a method and another one is using as simple loop*/

public interface Iterable<T> {
  default void forEach(consumer <super T> action) {
    for(T t: this){
      action:accept(t);
    }
  }
}

for(data_type item : collection)

/*Use this because it has several advantages of other than java suchas forEach method and
Here is a sample program to show how to use the forEach() statement to iterate over every element of a List, Set, Map or Stream in Java.*/

public class function{
  public static void main(String[]args) {
    List<String> cList = new ArrayList<String>();
    cList.add("My");
    cList.add("Mother");
    cList.add("is");
    cList.add("My");
    cList.add("Favourite");

    //Now i have to iterate using lambda experssion
    System.out.println("passing by lambda expression");
    cList.forEach(cName -> System.out.print(cName);

    //Replacing lamda expression with method reference
    System.out.print("passing by method reference")
      cList.forEach(cName);

    //I will apply stream class, which operates on stream and allows other stream methods such as stream and filter etc
    cList.stream().forEach(System.out.println)

      //Using stream Api and filter

      cList.stream().filter()(/*Lambda expression here*/ cname -> cname.startsWith("S")).forEach(System.out::println);

    //I can use it with parllel stream but the order will not be gurannted

    cList.parllelStream().forEach(cName -> System.out.println(cName);
  
  }

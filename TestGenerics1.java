import java.util.*;

public class TestGenerics1{
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<String>();
        list.add("ram");
        list.add("Siya");
        list.add("Shweta");

        String s= list.get(1);
        System.out.println("element is :"+s);
        Iterator<String> itr=list.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
    }
}
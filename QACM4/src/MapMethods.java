import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethods {

	public static void main(String[] args) {
HashMap<Integer, String> hm = new HashMap<>();
hm.put(101, "manju");
hm.put(105, "sindhu");
hm.put(102, "anju");
hm.put(103, "sanju");
hm.put(104, "ranju");
hm.put(106, "manju");
System.out.println(hm.size());
System.out.println(hm);
boolean key = hm.containsKey(102);
System.out.println(key);
boolean value = hm.containsValue("manju");
System.out.println(value);
String remove = hm.remove(106);
System.out.println(remove);
System.out.println(hm);
String getkey = hm.get(105);
System.out.println(getkey);
boolean empty = hm.isEmpty();
System.out.println(empty);
Collection<String> values = hm.values();
System.out.println(values);
Set<Integer> keysets = hm.keySet();
System.out.println(keysets);
Set<Entry<Integer, String>> entryset = hm.entrySet();
System.out.println(entryset);

HashMap<Integer, String> hm1 = new HashMap<>();
hm1.putAll(hm);
System.out.println(hm1);
System.out.println(hm1.size());


	}

}

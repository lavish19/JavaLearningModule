import java.util.*;
public class HashMapLoopExample {
	public static void main(String[] args) {
	HashMap<String,String> hashMap=new HashMap<String,String>();
	hashMap.put("key1","value1");
	hashMap.put("key2","value2");
	System.out.println("looping or traversing/iterating through hashmap using keyset iterator");
	Set<String> keySet=hashMap.keySet();
	Iterator<String> keySetIterator=keySet.iterator();
	while(keySetIterator.hasNext()) {
		String key=keySetIterator.next();
		System.out.println("key: "+key+" "+hashMap.get(key));
	}

}}

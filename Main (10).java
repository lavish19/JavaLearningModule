import java.util.*;

class Main{
    public static void main(String[] args){
        HashMap<String,String> hashMap=new HashMap<String,String>();
        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        System.out.println("looping or iterating/traversing HashMap using advance foreach loops");
        for(String key:hashMap.keySet()){
            System.out.println("key: " + key + "value: " + hashMap.get(key));
        }
        
    }
}
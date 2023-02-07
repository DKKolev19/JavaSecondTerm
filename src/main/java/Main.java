import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> hashMap = new HashMap<>();
        hashMap.put("123",new HashMap<>());
        hashMap.get("123").put("Ivan",20);
        hashMap.put("456",new HashMap<>());
        hashMap.get("456").put("Gosho",30);

        for(String key : hashMap.keySet()) {
          //  String mainKey = key;
          //  Map<String,Integer> innerMap = hashMap.get(key);
            for(String innerKey : hashMap.keySet()){
             //   String currentInnerKey = innerKey;
                System.out.println(key + " --- " + innerKey + " ---- " + hashMap.get(key).get(innerKey));
            }
        }

        for(Map<String, Integer> value: hashMap.values()){
            for(String key: value.keySet()){
                System.out.println(key + " --- " + value.get(key));
            }
        }

        for(Map.Entry<String, Map<String, Integer>> mapEntry: hashMap.entrySet()){
            String key= mapEntry.getKey();
            Map<String, Integer> innerMap = mapEntry.getValue();
            for(String innerKey: innerMap.keySet()){
                System.out.println(key + " --- " + innerKey + " --- " + innerMap.get(innerKey));
            }
        }
       // hashMap.remove("431432432");
       // hashMap.clear();

       // for(String key: hashMap.keySet()){
          //  System.out.println(key + " ------ " + hashMap.get(key));
       // hashMap.put("54353353","Ivan");
       // hashMap.put("54353353","Ivail");
       // hashMap.put("5435353","Gosho");
      //  hashMap.put("543533653","Petar");
       // hashMap.put("54353393","Denis");
      //  hashMap.remove("54353353");
       // for(String key: hashMap.keySet()){
        //    System.out.println(key + " ------ " + hashMap.get(key));

    }
}
import java.util.HashMap;

public class HashMapBasics {

    public static void FindNonRepeatedElements(int arr[]) {
        // HashSet<Integer> h1 = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        // if (h1.contains(arr[i])) {
        // h1.remove(arr[i]);
        // } else {
        // h1.add(arr[i]);
        // }
        // }

        // System.out.println(h1);

        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            h1.put(arr[i], h1.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (h1.get(arr[i]) == 1) {
                System.out.println(arr[i]);
            }
        }
        // for(Map.Entry<Integer,Integer> a : h1.entrySet()){
        //    if(a.getValue() <= 1){
        //     System.out.println(a.getKey() +" "+a.getValue());
        //    }
        // }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 1, 3, 1 };
        FindNonRepeatedElements(arr);
    }
}

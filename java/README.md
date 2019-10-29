# java
Java syntax and semantics.


* [dump](#dump)
* [data-structures](#data-structures)
  + [array](#array)
  + [hashmap](#hashmap)
  + [linked-list](#linked-list)
  + [String](#string)
  + [Trie](#trie)

<small><i><a href='http://ecotrust-canada.github.io/markdown-toc/'>Table of contents generated with markdown-toc</a></i></small>


## dump
- Popular ascii refrences : 'a' = 97 | 'z' = 122 | 'A' = 65 | 'Z' = 90 | '0' = 48 | '9' = 57.
- .Equals() compares objects | .compareTo finds lexicographic difference | == checks memory address
- Neat one-liner condition statement int result = a > b ? x : y;
- Override is prioritizing local methods over parent methods
- Overload is methods with same names different parameters
- Strings are immutable. i.e. In "wewr" the first 'w' can't be changedto 'K'
- int randomWithRange = (int)(MATH.random()(max - min + 1)) + min
- int is a primitive. Integer is a class. int range [-2^31 : 2^31-1]

## data-structures
### array
```java
String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
String[] copy = a.clone(); //copies a


ArrayList<String> store = Arrays.asList(a); //convert array to arraylist
Arrays.sort(a); //sort by ascii
Arrays.toString(a); // prints all elements in array

Arrays.fill(a,0); //fill a with 0s
Arrays.stream(a).max().getAsInt(); //find max of INT[]

```

### arraylist
```Java
List<Integer> store = new ArrayList<>();
store.add(1);
store.addAll(1,2,3); //add multiple elements

int[] ints = {1,2,2,3};
store = Arrays.asList(ints); //convert array to arraylist

store = new ArrayList<>(List.of(1,2,3,4)); //one line init


```


### hashmap
``` java
HashMap<String, Integer> map = new HashMap<>();  
map.put("vishal", 10);
map.put("sachin", 30);
map.put("vaibhav", 20);
map.isEmpty()); //checks if empty


//add new keys or increment existing values
if(!map.containsKey(key)) {
 p.put(key,1);
}
else {
 p.put(key, map.getKey()+1);
}


//update value given key
    map.put(key, map.get(key) + 1);


    //If you're only interested in the keys, you can iterate through the keySet() of the map:
    Map<String, Object> map = ...;
for (String key : map.keySet()) {
// ...
    }


    //If you only need the values, use values():
    for (Object value : map.values()) {
  // ...
    }


    //Finally, if you want both the key and value, use entrySet():
    for (Map.Entry<String, Object> entry : map.entrySet()) {
  String key = entry.getKey();
  Object value = entry.getValue();
  // ...
    }

```

### linked-list
```Java
LinkedList<String> linkedList = new LinkedList<>();

//4 WAYS LOOP THRU A LIST
for (int i = 0; i < linkedList.size(); i++)
 System.out.println(linkedList.get(i));

for (String temp : linkedList)
 System.out.println(temp);

Iterator<String> iterator = linkedList.iterator();
while (iterator.hasNext())
   System.out.println(iterator.next());

int i = 0;
while (i < linkedList.size()) {
   System.out.println(linkedList.get(i));
   i++;
}

```

### String
```Java
String s = " This is My string";

int n = 787;  
s = Integer.toString(n); //converts int to string
n = (int) Integer.valueOf(s); //converts string to int

s.trim(); //remove leading and trailing spaces
s.indexOf("i"); //returns starting index of first occrence of substring input
s.lastIndexOf("i"); //returns starting index of last occrence of substring input

char[] c = s.toCharArray(); //convert to char array
String s2 = new String(c); //convert char array to String
s.charAt(5); //char at pos 5. 's'

```

### Trie
```java
public class Trie{
        private class TrieNode{
            Map<Character,TrieNode> children;
            boolean isEnd;

            public TrieNode() {
                children = new HashMap<>();
                isEnd = false;
            }
        }

        public final TrieNode root;

        public Trie(){
            root = new TrieNode();
        }

        public void insert(String s){
            TrieNode current = root;
            for(int i = 0; i < s.length(); i++) {
                char letter = s.charAt(i);
                TrieNode node = root.children.get(letter);
                if (node == null)
                    node.children.put(letter, node);
                current = node;
            }
            current.isEnd = true;
        }

        public boolean isMember(String s){
            TrieNode current = root;
            for(int i = 0; i < s.length(); i++) {
                char letter = s.charAt(i);
                TrieNode node = root.children.get(letter);
                if (node == null)
                    return false;
                current = node;
            }
            return current.isEnd;
        }


    }
```

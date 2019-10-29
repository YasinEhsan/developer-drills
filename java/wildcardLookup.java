public class Problem{
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

        public boolean isMemberWildcard(String s){
            /*PLAN
                - create arrays for current node and future nodes
                - loop thru each charater in s and makes ure current node arr not empty
                - if letter is wildcard then we have to search all child trienodes
                - if not then we have to down the tree
                - splice the word next is empty and curr = next
                - start with general does it exist w/ wildcard case
             */

//            TrieNode current = root;
//            for(int i = 0; i < s.length(); i++){
//                char letter = s.charAt(i);
//                TrieNode node = root.children.get(letter);
//                if(node == null)
//                    return false;
//                current = node;
//            }
//            return current.isEnd;

            List<TrieNode> current = new ArrayList<>(List.of(root)), next = new ArrayList<>();

            while (s.length() > 0 && current.size() > 0){
                char letter = s.charAt(0);
                if(letter == '.')
                    next.addAll(root.children.values());
                else
                    next.add(root.children.get(letter));
                s = s.substring(1);
                current = next;
                next = new ArrayList<>();
            }

            for(TrieNode t: current){
                if(t.isEnd)
                    return true;
            }
            return false;
        }


    }

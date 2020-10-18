public class Palindrome {

//    static CharacterComparator offbyone = new OffByOne();

    public Deque<Character> wordToDeque(String word){
        LinkedListDeque d = new LinkedListDeque(word.charAt(0));
        for(int i = 1; i < word.length(); i++){
            char character = word.charAt(i);
            d.addLast(character);
        }
        return d;

    }

    public boolean isPalindrome(String word){
        Deque d = wordToDeque(word);
        String actual = "";
        for (int i = 0; i < word.length(); i++) {
            actual += d.removeLast();
        }
        if(word.equals(actual)){
            return true;
        }
        else {
            return false;
        }

    }
    public boolean isPalindrome(String word, CharacterComparator cc){
        if((word.length() == 0) || (word.length() == 1)){
            return true;
        }
        Deque deck = wordToDeque(word);
        int i = 0;
        while(i < deck.size() - 1) {
            Character p = (Character) deck.removeFirst();
            Character j = (Character) deck.removeLast();
            if(cc.equalChars(p, j) == true){
                i += 2;
            }
            else{
                return false;
            }
        }
        return true;
    }


    public Deque<Character> reverse(String word){
        LinkedListDeque d = new LinkedListDeque(word.charAt(0));
        for(int i = 1; i < word.length(); i++){
            char character = word.charAt(i);
            d.addFirst(character);
        }
        return d;

    }

}
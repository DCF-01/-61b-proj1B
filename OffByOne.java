public class OffByOne implements CharacterComparator{
    public boolean equalChars(char a, char b){
        if(Math.abs(a - b) == 1){
            return true;
        }
        return Math.abs(b - a) == 1;
    }
}

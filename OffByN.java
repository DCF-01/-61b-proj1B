public class OffByN implements CharacterComparator {

    private int offBy;

    public OffByN(int n){
        offBy = n;
    }

    public boolean equalChars(char x, char y){
        return checkFirst((int) x, (int) y, offBy);
    }

    private static boolean checkFirst(int x, int y, int offBy){
        return (Math.abs(x - y) == offBy);
    }
}



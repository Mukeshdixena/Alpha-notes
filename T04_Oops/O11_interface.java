package T04_Oops;

public class O11_interface {
    public static void main(String[] args) {
        rook r = new rook();
        r.moves();
    }
}


interface ChessPlayer {
    void moves();
}

class Queen_1 implements ChessPlayer{
    
    public void moves() {
        System.out.println("up, down, left, right, digonal multistep");
        
    }
}
class rook implements ChessPlayer{
    
    public void moves() {
        System.out.println("up, down, left, right multistep");
        
    }
}
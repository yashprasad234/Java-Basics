public class InterfaceInJava {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
    }
}

interface ChessPiece {
    void move();
}

class Queen implements ChessPiece {
    public void move() {
        System.out.println("up, down, left, right and diagonally (in any direction)");
    }
}

class Rook implements ChessPiece {
    public void move() {
        System.out.println("up, down, left, right");
    }
}

class Bishop implements ChessPiece {
    public void move() {
        System.out.println("diagonally (in any direction)");
    }
}

class Knight implements ChessPiece {
    public void move() {
        System.out.println("two places in any direction and one place perpendicular to that direction (like an L)");
    }
}

class Pawn implements ChessPiece {
    public void move() {
        System.out.println("up one places and diagonally upwards one place when capturing");
    }
}

class King implements ChessPiece {
    public void move() {
        System.out.println("up, down, left, right and diagonally (in any direction) one place");
    }
}
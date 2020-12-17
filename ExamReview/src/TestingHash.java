import java.util.Arrays;

public class TestingHash {

    public static void main(String[] args) {
        Hashing hash = new Hashing();

        hash.insert(10, 200);
        hash.insert(2, 4567);
        hash.insert(6, 1000);
        hash.insert(19, 42);
        hash.insert(20, 15);
        hash.insert(0, 2);
        hash.insert(17, 59);
        hash.insert(1, 67);
        hash.insert(21, 9999999);

        hash.displayHashTable();

        // When there are two items at the same index, its called a "collision"
        // There are multiple ways to deal with collisions.



    }



}

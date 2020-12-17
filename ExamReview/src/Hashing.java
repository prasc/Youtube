public class Hashing {
    private int size = 20;          // max size of the hash table
    private int[] hashTable;        // hashTable is just an array of items

    public Hashing() {
        hashTable = new int[20];
    }

    public void insert(int key, int item) {
        // key = will be used to make a secret index
        // item = the value we want to store
        int placement = hash(key);

        hashTable[placement] = item;
    }

    public int hash(int key) {
        // taking the key, and returning a secret spot to store the item
        return key % size;
    }

    public void displayHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(hashTable[i] + " ");
        }
    }

}


/*


{
{4}
{10}
{3 -> 13 -> 56 }
{5 -> 10 -> 1000 -> 0}
{}



}


 */
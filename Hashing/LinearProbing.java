package hashing;


public class LinearProbing {
	
	static class HashTable {
        private final int size;
        private final int[] keys;
        private final String[] values;

        public HashTable(int size) {
            this.size = size;
            this.keys = new int[size];
            this.values = new String[size];
            for (int i = 0; i < size; i++) {
                keys[i] = -1; 
            }
        }

        private int hashFunction(int key) {
            return key % size;
        }

        public void add(int key, String value) {
            int index = hashFunction(key);
            while (keys[index] != -1 && keys[index] != key) {
                index = (index + 1) % size; 
            }
            keys[index] = key;
            values[index] = value;
        }

        public String get(int key) {
            int index = hashFunction(key);
            int startIndex = index;
            while (keys[index] != -1) {
                if (keys[index] == key) {
                    return values[index];
                }
                index = (index + 1) % size;
                if (index == startIndex) {
                    break; 
                }
            }
            return null;
        }

        public void printTable() {
            for (int i = 0; i < size; i++) {
                System.out.print("Index " + i + ": ");
                if (keys[i] == -1) {
                    System.out.println("Empty");
                } else {
                    System.out.println("Key " + keys[i] + " -> Value " + values[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
    	HashTable hashTable = new HashTable(5);
        hashTable.add(1, "Apple");
        hashTable.add(2, "Orange");
        hashTable.add(3, "Pineapple");
        hashTable.add(4, "Watermelon");
        hashTable.add(5, "Banana");
        
        System.out.println("Hash table Entries:");
        
        hashTable.printTable();
    }


}

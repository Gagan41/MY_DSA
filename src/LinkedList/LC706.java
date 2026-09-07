package LinkedList;

public class LC706 {
    class MyHashMap {

        // Number of buckets
        private static final int SIZE = 1009;

        // Node for storing key-value pairs
        private class Node {
            int key;
            int value;
            Node next;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private Node[] buckets;

        public MyHashMap() {
            buckets = new Node[SIZE];
        }

        // Hash function
        private int hash(int key) {
            return key % SIZE;
        }

        public void put(int key, int value) {
            int index = hash(key);

            // If bucket is empty, insert directly
            if (buckets[index] == null) {
                buckets[index] = new Node(key, value);
                return;
            }

            Node current = buckets[index];

            while (true) {

                // Key already exists -> update value
                if (current.key == key) {
                    current.value = value;
                    return;
                }

                // Reach the end -> add new node
                if (current.next == null) {
                    break;
                }

                current = current.next;
            }

            current.next = new Node(key, value);
        }

        public int get(int key) {
            int index = hash(key);

            Node current = buckets[index];

            while (current != null) {
                if (current.key == key) {
                    return current.value;
                }

                current = current.next;
            }

            return -1;
        }

        public void remove(int key) {
            int index = hash(key);

            Node current = buckets[index];
            Node previous = null;

            while (current != null) {

                if (current.key == key) {

                    // Removing the first node
                    if (previous == null) {
                        buckets[index] = current.next;
                    }
                    // Removing a node in the middle/end
                    else {
                        previous.next = current.next;
                    }

                    return;
                }

                previous = current;
                current = current.next;
            }
        }
    }

}

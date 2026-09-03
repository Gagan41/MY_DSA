package LinkedList;

public class LC705 {
    class MyHashSet {
        private static class Node {
            int key;
            Node next;

            Node(int key) {
                this.key = key;
            }
        }

        private static final int BUCKET_COUNT = 769; // A prime number reduces hash collisions
        private Node[] buckets;

        public MyHashSet() {
            buckets = new Node[BUCKET_COUNT];
        }

        private int hash(int key) {
            return key % BUCKET_COUNT;
        }

        public void add(int key) {
            int idx = hash(key);
            Node curr = buckets[idx];

            // Check if key already exists
            while (curr != null) {
                if (curr.key == key) {
                    return; // Key already present
                }
                curr = curr.next;
            }

            // Insert new node at the head of the chain
            Node newNode = new Node(key);
            newNode.next = buckets[idx];
            buckets[idx] = newNode;
        }

        public void remove(int key) {
            int idx = hash(key);
            Node curr = buckets[idx];
            Node prev = null;

            while (curr != null) {
                if (curr.key == key) {
                    if (prev == null) {
                        buckets[idx] = curr.next;
                    } else {
                        prev.next = curr.next;
                    }
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
        }

        public boolean contains(int key) {
            int idx = hash(key);
            Node curr = buckets[idx];

            while (curr != null) {
                if (curr.key == key) {
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }
    }
}

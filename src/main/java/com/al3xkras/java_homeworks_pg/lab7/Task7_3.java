package com.al3xkras.java_homeworks_pg.lab7;

import com.al3xkras.java_homeworks_pg.lab5.Task5_4;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task7_3 {
    public static void main(String[] args) {
        BinarySearchTree<String> bst = new BinarySearchTree<>();

        int count = 100;
        String notPresent = "abc";

        for (int i = 0; i < count; i++) {
            int stringSize = ThreadLocalRandom.current().nextInt(1,11);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < stringSize; j++) {
                char toAdd = (char)ThreadLocalRandom.current().nextInt(32,127);
                sb.append(toAdd);
            }
            String toAdd = sb.toString();
            if (toAdd.equals(notPresent))
                continue;
            bst.insert(toAdd);
        }

        List<String> values = bst.valuesSorted();
        bst.printValuesOrdered();

        for (int i = 0; i < values.size(); i+=count/5) {
            if (!bst.contains(values.get(i)))
                throw new IllegalStateException(""+i);
        }
        if (bst.contains(notPresent))
            throw new IllegalStateException();
    }
    static class BinaryNode<R extends Comparable<R>>{
        protected BinaryNode<R> parent;
        protected BinaryNode<R> left;
        protected BinaryNode<R> right;
        private R value;

        public BinaryNode(BinaryNode<R> parent, R value) {
            this.parent = parent;
            this.value = value;
        }

        public R getValue() {
            return value;
        }
        public void setValue(R value) {
            this.value = value;
        }
    }

    static class BinarySearchTree<R extends Comparable<R>>{
        private BinaryNode<R> head;

        public void insert(R value){
            insert(value,false);
        }

        public boolean insert(R value, boolean checkIfPresent){
            if (head==null){
                if (checkIfPresent)
                    return false;
                head = new BinaryNode<>(null,value);
                return true;
            }
            BinaryNode<R> iter = head;
            while (true){
                int compare = value.compareTo(iter.value);
                if (compare==0)
                    return true;
                if (compare<0){
                    if (iter.left==null){
                        if (checkIfPresent)
                            return false;
                        iter.left = new BinaryNode<>(iter,value);
                        break;
                    }
                    iter = iter.left;
                    continue;
                }
                if (iter.right==null){
                    if (checkIfPresent)
                        return false;
                    iter.right = new BinaryNode<>(iter,value);
                    break;
                }
                iter = iter.right;
            }
            return true;
        }

        public boolean contains(R r){
            return insert(r,true);
        }

        public List<R> valuesSorted(){
            return valuesSorted(head);
        }

        public List<R> valuesSorted(BinaryNode<R> node){
            List<R> values = new LinkedList<>();
            if (node.left!=null){
                values.addAll(valuesSorted(node.left));
            }
            if (node.value!=null){
                values.add(node.value);
            }
            if (node.right!=null){
                values.addAll(valuesSorted(node.right));
            }
            return values;
        }

        public void printValuesOrdered(){
            valuesSorted().forEach(System.out::println);
        }
    }
}

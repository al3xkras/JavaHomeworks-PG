package com.al3xkras.java_homeworks_pg.Lab5;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task5_4 {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int n = 100;
        int notPresent = 5;
        for (int i = 0; i < n; i++) {
            int toAdd=ThreadLocalRandom.current().nextInt(0,1001);
            if (toAdd!=notPresent)
                bst.insert(toAdd);
        }
        List<Integer> values = bst.valuesSorted();
        bst.printValuesOrdered();

        for (int i = 0; i < values.size(); i+=n/5) {
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

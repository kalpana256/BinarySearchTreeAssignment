package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(60);
        tree.insert(20);
        tree.insert(70);
        tree.insert(30);
        tree.insert(63);
        tree.insert(52);
        tree.inOrder(tree.getRoot());
        tree.insert(45);
        tree.inOrder(tree.getRoot());
        System.out.println(tree.search(30));
        System.out.println(tree.search(62));
        // and perform insert, search, traversal, delete
    }
}

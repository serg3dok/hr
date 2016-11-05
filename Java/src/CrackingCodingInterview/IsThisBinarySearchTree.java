package CrackingCodingInterview;

import CrackingCodingInterview.Node;

/**
 * Created by Sergey on 11/4/2016.
 */
public class IsThisBinarySearchTree {

    public static class Node {
        int data;
        Node left;
        Node right;


    }


    public CrackingCodingInterview.Node current;


    public static void main(String[] args) {


        Node current = new Node();

        Node root = current;
        current.data = 3;

        //current = current.left(new Node());
        //current.data = 5;






        if (checkBST(root)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean checkBST(Node root) {

        return false;
    }

    public static Node buildTree (int data, Node side) {

        return side;
    }


}

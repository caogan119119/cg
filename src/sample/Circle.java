package sample;

import java.util.Arrays;

public class Circle {
    private static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    public static int checkCircleSize(Node node){
        Node p1 = node;
        Node p2 = node;
        while(p2 !=null && p2.next !=null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                return  checkCircleSize2(p2);
            }
        }
        return 0;
    }

    public static int checkCircleSize2(Node node){
        Node p1 = node;
        Node p2 = node;
        int n =0;
        while(p2 !=null && p2.next !=null){
            p1 = p1.next;
            p2 = p2.next.next;
            n++;
            if(p1 == p2){
                return n;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        Node node1 = new Node(5);
        Node node2 = new Node(3);
        Node node3 = new Node(7);
        Node node4 = new Node(2);
        Node node5 = new Node(6);
//        Node node6 = new Node(8);
//        Node node7 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node4;
  //      node5.next = node6;
//        node6.next = node7;
//        node7.next = node4;
        System.out.println(checkCircleSize(node1));


    }
}

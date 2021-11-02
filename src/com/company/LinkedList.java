package com.company;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item) {
        var node = new Node(item);

        if (first == null)
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item) {
        var node = new Node(item);

        //check if the first node has anything
        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void deleteFirst() {
        if (first == null) return;

        if (first == last) {
            first = null;
            last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size++;

    }

    public void deleteLast() {

        int secondLastIndex = size - 2;
        int count = 0;
        var item = first;

        while (item != null) {
            if (count == secondLastIndex) {
                item.next = null;
                last = null;
                last = item;
            }
            item = item.next;
            count++;
        }
        size--;
    }

    public boolean contains(int item) {
        var current = first;
        if (first == null) return false;

        while (current != null) {
            if (current.data == item) {
                return true;
            }
            current = current.next;
        }
        return false;

    }

    public int indexOf(int item) {

        int index = 0;

        var current = first;
        while (current != null) {
            if (current.data == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public int getMedianItem() {
        int count = 0;
        int median = 0;

        if (first == null) return -1;
        median = size / 2;

        var start = first;

        while (start != null) {
            if (median == count) {
                return start.data;
            }
            start = start.next;
            count++;
        }

        return -1;

    }

    public void addMiddle(int item) {
        var node = new Node(item);

        if (first == null)
            first = last = node;
        else {

            int count = 0;
            int median = 0;

            median = size / 2;

            var positionNode = first;

            while (positionNode != null) {
                var previousNode = positionNode;
                if (median == count) {
 
                    var dataprevious = previousNode.next;
                    previousNode.next = node;
                    node.next = dataprevious;
                    positionNode = node;
                }

                positionNode = positionNode.next;
                count++;
            }

        }

    }

    public int length() {
        return size;
    }

    public int getItemAtIndex(int index) {
        int count = 0;

        var current = first;

        while (current != null) {
            if (count == index)
                return current.data;

            current = current.next;
            count++;

        }
        return -1;

    }


    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

}

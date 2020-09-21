package com.company;

public class PersonLinkedList {
    private Node start = null;
    private Node finish = null;
    private int size = 0;

    public void add(Person person) {
        Node node = new Node(person);
        if (start == null) {
            start = node;
            finish = node;
            size++;
        } else {
            finish.getPrev().setNext(null);
            finish.setPerson(null);
            finish = finish.getPrev();
            size++;
        }

    }

    public void remove(int index) {
        if (index > 0 && index < size) {
            if (index == size - 1) {
                remove();
                return;
            }
            if (index == 0) {
                start.getNext().setPrev(null);
                start = start.getNext();
                size--;
                return;
            }
            Node node = getNodeByIndex(index);
            if(node!=null){
                node.getPrev().setNext(node.getNext());
                node.getNext().setPrev(node.getPrev());
                node.setPrev(null);
                node.setNext(null);
                node.setPerson(null);
            }
        }
    }

    private void remove() {

    }

    private Node getNodeByIndex(int index) {
        int i = 0;
        Node currentNode = start;
        while (currentNode != null || i != index) {
            if (i == index) {
                return currentNode;
            }
            i++;
            currentNode = currentNode.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        Node currentNode = start;
        String resString = "";
        while (currentNode != null) {
            resString += currentNode.getPerson().toString() + '\n';
            currentNode = currentNode.getNext();

        }
        return resString;
    }
}

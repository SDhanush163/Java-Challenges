package com.AdvancedTopicsChallenges.C48_DataStructuresWithAbstraction;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {
            root = newItem;
            return true;
        }
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) { // Item is greater than current, move to next if possible
                if (currentItem.next() != null)
                    currentItem = currentItem.next();
                else {
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) { // Item is smaller than current, move to previous if possible
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    newItem.setNext(root).setPrevious(newItem);
                    root = newItem;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item == null)
            return false;
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                if (currentItem == root) root = currentItem.next();
                else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) currentItem.next().setPrevious(currentItem.previous());
                    }
                return true;
            }
            if (comparison < 0) currentItem = currentItem.next();
            else return false;
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) System.out.println("The list is empty");
        else
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
    }
}

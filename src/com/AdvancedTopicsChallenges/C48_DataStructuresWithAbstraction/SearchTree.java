package com.AdvancedTopicsChallenges.C48_DataStructuresWithAbstraction;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {// Item is greater than current, move to next if possible
                if (currentItem.next() != null) currentItem = currentItem.next();
                else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) { // Item is smaller than current, move to previous if possible
                if (currentItem.previous() != null) currentItem = currentItem.previous();
                else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else return false;
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item == null) {
            return false;
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }


    private void performRemoval(ListItem item, ListItem parent) {
        // remove item from the tree
        if (item.next() == null) // no right tree, so make parent point to left tree (which may be null)
            if (parent.next() == item) parent.setNext(item.previous()); // item is right child of its parent
            else if (parent.previous() == item) parent.setPrevious(item.previous()); // item is left child of its parent
            else this.root = item.previous(); // parent must be item, which means we were looking at the root of the tree
        else if (item.previous() == null) // no left tree, so make parent point to right tree (which may be null)
            if (parent.next() == item) parent.setNext(item.next()); // item is right child of its parent
            else if (parent.previous() == item) parent.setPrevious(item.next()); // item is left child of its parent
            else this.root = item.next(); // again, we are deleting the root
        else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {

        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}

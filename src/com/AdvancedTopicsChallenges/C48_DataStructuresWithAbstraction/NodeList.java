package com.AdvancedTopicsChallenges.C48_DataStructuresWithAbstraction;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void  traverse(ListItem root);

}

package com.AdvancedTopicsChallenges.C49_StoringWithInterfaces;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> fields);
}

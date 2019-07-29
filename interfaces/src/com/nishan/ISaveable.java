package com.nishan;

import java.util.List;

public interface ISaveable {
    List<String> write();  //public is not need to write cause it is public in default for interface
    void read(List<String> savedValue);//public is not need to write cause it is public in default for interface
}

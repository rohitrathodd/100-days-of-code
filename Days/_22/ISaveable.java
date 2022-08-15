package _22;

import java.util.List;

public interface ISaveable {
    List<String> write();
    // we can use
    // List write(); also


    void read(List<String> savedValues);
    // void read(List savedValues);
    // both are correct

    // List is more generic and more abstract
    // it provide more flexibility to user to
    // use type as he wants.



}

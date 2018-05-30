package C$$GenericsandCollections.B$$UsingListsANDSetsANDMapsandQueues.UsingtheListInterface;

import java.util.ArrayList;
import java.util.List;

public class WorkingwithListMethodsTable {
    /*
Method                           Description
void add(E element)              Adds element to end
void add(int index, E element)   Adds element at index and moves the rest toward
                                    the end
E get(int index)                    Returns element at index
int indexOf(Object o)               Returns first matching index or -1 if not found
int lastIndexOf(Object o)            Returns last matching index or -1 if not found
void remove(int index)                 Removes element at index and moves the rest
void remove(Object o                                   toward the front
E set(int index, E e)                   Replaces element at index and returns original*/
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SD");
// [SD]
        list.add(0, "NY");
// [NY,SD]
        list.set(1, "FL");
// [NY,FL]
        list.remove("NY");
// [FL]
        list.remove(0);
// []
    }
}

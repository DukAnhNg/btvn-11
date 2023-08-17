package service;

import java.util.ArrayList;

public interface IServiceLibrary<T> {
    void insert(T t, ArrayList<T> list);
    void delete(T t,ArrayList<T> list);
}

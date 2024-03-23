package com.xie.d10_generics_interface;

import java.util.ArrayList;

// 泛型介面
public interface Data<T> {
    void add(T t);
    ArrayList<T> getByName(String name);
}

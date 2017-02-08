package com.example.cs.myapplication.model;

import java.io.Serializable;

/**
 * Created by pc on 2017/2/8.
 */

public class ItemModel implements Serializable {

    public static final int CHAT_A = 1001;
    public static final int CHAT_B = 1002;
    public int type;
    public Object object;

    public ItemModel(int type, Object object) {
        this.type = type;
        this.object = object;
    }
}
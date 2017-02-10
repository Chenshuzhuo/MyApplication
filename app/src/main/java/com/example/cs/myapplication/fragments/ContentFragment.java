package com.example.cs.myapplication.fragments;

/**
 * Created by pc on 2017/2/10.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cs.myapplication.R;

public class ContentFragment extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.content_fragment, container, false);
    }

}

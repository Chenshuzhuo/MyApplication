package com.example.cs.myapplication.activity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.cs.myapplication.R;
import com.example.cs.myapplication.activity.ChatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pc on 2017/2/6.
 */

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;

    List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

//        listView = new ListView(this);
//        ListView listView2 = new ListView(this);
        listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(new SimpleAdapter(this,getData(),R.layout.chat_list,

                new String[]{"name","desc","img"},

                new int[]{R.id.name,R.id.desc,R.id.img}));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override

            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,

                                    long arg3) {

                // TODO Auto-generated method stub

                Map<String, Object> map = new HashMap<String, Object>();
                map=list.get(arg2);


                    //新建一个Intent
                    Intent intent = new Intent();
                    //制定intent要启动的类
                    intent.setClass(com.example.cs.myapplication.activity.ListViewActivity.this, ChatActivity.class);
                    //启动一个新的Activity
                    startActivity(intent);
                    //关闭当前的

                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);


            }
        });
    }


    private List<Map<String, Object>> getData(){

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("name", "腾讯新闻");

        map.put("desc", "群名称是一直在被屏蔽吗");

        map.put("img", R.drawable.news);

        list.add(map);



        map = new HashMap<String, Object>();

        map.put("name", "G2");

        map.put("desc", "google 2");

        map.put("img", R.drawable.ic_launcher);

        list.add(map);



        map = new HashMap<String, Object>();

        map.put("name", "G3");

        map.put("desc", "google 3");

        map.put("img", R.drawable.ic_launcher);

        list.add(map);

        map = new HashMap<String, Object>();

        map.put("name", "G3");

        map.put("desc", "google 3");

        map.put("img", R.drawable.ic_launcher);

        list.add(map);
        map = new HashMap<String, Object>();

        map.put("name", "G3");

        map.put("desc", "google 3");

        map.put("img", R.drawable.ic_launcher);

        list.add(map);
        map = new HashMap<String, Object>();

        map.put("name", "G3");

        map.put("desc", "google 3");

        map.put("img", R.drawable.ic_launcher);

        list.add(map);


        map.put("name", "G1");

        map.put("desc", "google 1");

        map.put("img", R.drawable.ic_launcher);

        list.add(map);



        map = new HashMap<String, Object>();

        map.put("name", "G2");

        map.put("desc", "google 2");

        map.put("img", R.drawable.ic_launcher);

        list.add(map);



        map = new HashMap<String, Object>();

        map.put("name", "G3");

        map.put("desc", "google 3");

        map.put("img", R.drawable.ic_launcher);

        list.add(map);

        map = new HashMap<String, Object>();

        map.put("name", "G3");

        map.put("desc", "google 3");

        map.put("img", R.drawable.ic_launcher);

        list.add(map);
        map = new HashMap<String, Object>();

        map.put("name", "G3");

        map.put("desc", "google 3");

        map.put("img", R.drawable.ic_launcher);

        list.add(map);
        map = new HashMap<String, Object>();

        map.put("name", "G3");

        map.put("desc", "google 3");

        map.put("img", R.drawable.ic_launcher);

        list.add(map);
        return list;

    }

    public void ClickHandler(View T) {
        Button lButton=(Button)findViewById(R.id.switchButtonL);
        Button rButton=(Button)findViewById(R.id.switchButtonR);
        switch (T.getId()) {

            case R.id.switchButtonL:

                lButton.setTextColor(0xff0099cc);
                rButton.setTextColor(0xffffffff);
                lButton.setBackgroundResource(R.drawable.switch_button);
                rButton.setBackgroundResource(R.drawable.switch_button_b);
                listView = (ListView) findViewById(R.id.list);


                listView.setAdapter(new SimpleAdapter(this,getData(),R.layout.chat_list,

                        new String[]{"name","desc","img"},

                        new int[]{R.id.name,R.id.desc,R.id.img}));

                break;
            case R.id.switchButtonR:

                lButton.setTextColor(0xffffffff);
                rButton.setTextColor(0xff0099cc);
                lButton.setBackgroundResource(R.drawable.switch_button_b);
                rButton.setBackgroundResource(R.drawable.switch_button);

                listView.setAdapter(new SimpleAdapter(this,getData(),R.layout.tel_list,

                        new String[]{"name","desc","img"},

                        new int[]{R.id.name,R.id.desc,R.id.img}));
                break;



        }






    }


}

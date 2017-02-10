package com.example.cs.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.cs.myapplication.R;

/**
 * Created by pc on 2017/2/8.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


    }

    public void ClickHandler(View T) {
        switch (T.getId()) {

            case R.id.button2:
                //新建一个Intent
                Intent intent = new Intent();
                //制定intent要启动的类
                intent.setClass(MainActivity.this, ListViewActivity.class);
                //启动一个新的Activity
                startActivity(intent);
                //关闭当前的
                MainActivity.this.finish();
                break;

            case R.id.forgetPassword:

                new AlertDialog.Builder(this)
                        .setTitle("提示")
                        .setMessage("忘记密码。。。").show();
                break;

            case R.id.register:
                new AlertDialog.Builder(this)
                        .setTitle("提示")
                        .setMessage("注册").show();
                break;

            case R.id.agreement:
                new AlertDialog.Builder(this)
                        .setTitle("提示")
                        .setMessage("服务条款").show();


        }
    }
}

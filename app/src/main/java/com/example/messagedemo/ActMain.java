package com.example.messagedemo;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActMain extends AppCompatActivity {


    private View.OnClickListener btnNew_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(ActMain.this);
            builder.setTitle("儲存訊息成功");
            builder.setMessage("儲存資料成功!");
            builder.setPositiveButton("OK",null);

            Dialog message = builder.create();
            message.show();

        }
    };
    private View.OnClickListener btnSend_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


        }
    };
    private View.OnClickListener btnReceive_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {


        }
    };
    private View.OnClickListener btnList_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity_Demo", "Main的onStart()事件被觸發");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity_Demo", "Main的onStop()事件被觸發");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity_Demo", "Main的onPause()事件被觸發");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity_Demo", "Main的onResume()事件被觸發");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity_Demo", "Main的onRestart()事件被觸發");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity_Demo", "Main的onDestroy()事件被觸發");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        Log.i("Activity_Demo", "Main的onCreate()事件被觸發");
        InitialComponent();

    }

    private void InitialComponent() {
        btnNew=findViewById(R.id.btnNew);
        btnNew.setOnClickListener(btnNew_click);
        btnSend=findViewById(R.id.btnSend);
        btnSend.setOnClickListener(btnSend_click);
        btnReceive=findViewById(R.id.btnReceive);
        btnReceive.setOnClickListener(btnReceive_click);
        btnList=findViewById(R.id.btnList);
        btnList.setOnClickListener(btnList_click);
        lblTitle=findViewById(R.id.lblTitle);



    }
    Button btnNew;
    Button btnSend;
    Button btnReceive;
    Button btnList;
    TextView lblTitle;


}

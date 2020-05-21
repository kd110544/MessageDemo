package com.example.messagedemo;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ActMain extends AppCompatActivity {

    String[] user = {"Jack","Gary","Mary","Horry","Carrie","Jassie","kitty"};


    private View.OnClickListener btnNew_click = new View.OnClickListener() {
        private DialogInterface.OnClickListener btnOK_click = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                lblTitle.setText("Hello");
            }
        };

        @Override
        public void onClick(View v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(ActMain.this);
            builder.setTitle("儲存訊息成功");
            builder.setMessage("儲存資料成功!");
            builder.setPositiveButton("OK",btnOK_click);

            Dialog message = builder.create();
            message.show();

        }
    };
    private View.OnClickListener btnToast_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast message = Toast.makeText(
                    ActMain.this,
                    "偵測到 Wifi 訊號",
                    Toast.LENGTH_LONG );
            message.show();


        }
    };
    private View.OnClickListener btnSnackBar_click =new View.OnClickListener() {


        @Override
        public void onClick(View v) {
            Snackbar message = Snackbar.make(
                    v,
                    "偵測到 Wifi 訊號",
                    Snackbar.LENGTH_LONG );
            message.setAction("OK", btnSnackAction_click);
            message.setActionTextColor(Color.YELLOW);
            message.show();


        }
    };
    private DialogInterface.OnClickListener btnList_click2 = new DialogInterface.OnClickListener(){
                    @Override
            public void onClick(DialogInterface dialog, int which) {
                lblTitle.setText(user[which]);
            }
        };

    private View.OnClickListener btnList_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(ActMain.this);
            builder.setTitle("請選擇聯絡人");
            builder.setItems(user,btnList_click2);

            Dialog message = builder.create();
            message.show();

        }
    };
    private View.OnClickListener btnSnackAction_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            return;
        }
    };

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
        btnToast=findViewById(R.id.btnToast);
        btnToast.setOnClickListener(btnToast_click);
        btnSnackBar =findViewById(R.id.btnSnackBar);
        btnSnackBar.setOnClickListener(btnSnackBar_click);
        btnList=findViewById(R.id.btnList);
        btnList.setOnClickListener(btnList_click);
        lblTitle=findViewById(R.id.lblTitle);



    }
    Button btnNew;
    Button btnToast;
    Button btnSnackBar;
    Button btnList;
    TextView lblTitle;


}

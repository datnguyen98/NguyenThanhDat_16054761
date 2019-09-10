package com.example.student.ntd_cau1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText tk,mk;
    Button btnDN;
    CheckBox checkbox;
    AlertDialog.Builder ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tk=(EditText)findViewById(R.id.tk);
        mk=(EditText)findViewById(R.id.mk);
        btnDN=(Button)findViewById(R.id.btnDN);
        checkbox=(CheckBox)findViewById(R.id.checkbox);

        //onClick Dang Nhap CAU1
        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(checkbox.isChecked()){
                    showDialog();
                }
                else {
                    showNotDialog();
                }

            }

        });
    }
    public void showDialog (){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Thong bao");
        alert.setMessage("Chao mung ban dang nhap he thong, thong tin cua ban da duoc luu");
        alert.show();
    }
    public void showNotDialog (){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Thong bao");
        alert.setMessage("Chao mung ban dang nhap he thong, thong tin cua ban khong duoc luu");
        alert.show();
    }
}

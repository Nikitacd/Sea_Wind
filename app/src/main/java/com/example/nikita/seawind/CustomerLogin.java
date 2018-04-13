package com.example.nikita.seawind;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CustomerLogin extends AppCompatActivity {
    EditText editText;
    Button startbutton;
    EditText customername;
    String table_number="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);

        editText=(EditText)findViewById(R.id.tablenumberselect);
        startbutton=(Button)findViewById(R.id.startButton);
        customername=(EditText)findViewById(R.id.editTextCustomerName);
        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(customername.getText().toString().isEmpty()) {
                    Toast.makeText(CustomerLogin.this,"Please enter your name...",Toast.LENGTH_SHORT).show();
                }

                else {
                    table_number=editText.getText().toString();
                    Intent intent=new Intent(getApplicationContext(),Temp.class);
                    intent.putExtra("table",table_number);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
    Dialog dialog;

    public void tablenumber(View view) {
       final CharSequence[]table={"Table1","Table2","Table3","Table4","Table5","Table6","Table7","Table8","Table9","Table10"};
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        dialog=new Dialog(this);
        builder.setTitle("Select Table Number");
        builder.setSingleChoiceItems(table, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                editText.setText(""+table[which]);
                dialog.dismiss();
            }
        });
        dialog=builder.create();
        dialog.show();

    }
}


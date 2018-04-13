package com.example.nikita.seawind;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
//    private FirebaseAuth mAuth;
//    String username,password;

    Button customer,staff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customer= (Button) findViewById(R.id.customer_button);
        staff= (Button) findViewById(R.id.staff_button);



//        mAuth = FirebaseAuth.getInstance();
//
//        username="seawind123@gmail.com";
//        password="seawind";
//
//        mAuth.signInWithEmailAndPassword(username,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//
//                if(task.isSuccessful())
//                {
//
//                }
//                else
//                {
//                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
//                    finish();
//                }
//            }
//        });

    }


    public void customerLogin(View view)
    {
        startActivity(new Intent(this,CustomerLogin.class));
        finish();
    }
    public void staffLogin(View view)
    {
        startActivity(new Intent(getApplicationContext(),StaffLogin.class));
        finish();
    }
}

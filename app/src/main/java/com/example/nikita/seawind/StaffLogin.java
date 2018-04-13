package com.example.nikita.seawind;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class StaffLogin extends AppCompatActivity {
    Button loginstaff;
    private FirebaseAuth mAuth;
    private FirebaseAuth mAuth1;
    String username,password;
    String musername,mpassword;
    EditText email123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_login);
        loginstaff = (Button) findViewById(R.id.StartButtonStaff);
        email123 = (EditText)findViewById(R.id.editTextStaffLoginUserName);

        mAuth = FirebaseAuth.getInstance();

        username="seawind123@gmail.com";
        password="seawind";
         musername = "niki.dharurkar@gmail.com";
         mpassword = "nikita";








    }
    

    public void loginstaff(View view) {
        String user = email123.getText().toString();
        //Toast.makeText(this,username,Toast.LENGTH_LONG).show();
        if(user.equals(username)) {

            //Toast.makeText(this,user,Toast.LENGTH_LONG).show();
            mAuth.signInWithEmailAndPassword(username, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if (task.isSuccessful()) {
                        String em = mAuth.getCurrentUser().getEmail();
                        Toast.makeText(getApplicationContext(), em, Toast.LENGTH_SHORT).show();


                        startActivity(new Intent(getApplicationContext(), customer_menu.class));
                        Toast.makeText(getApplicationContext(), "succesful cook", Toast.LENGTH_SHORT).show();

                        //finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                        //finish();
                    }
                }
            });
        }
        else if(user.equals(musername))
        {
            mAuth.signInWithEmailAndPassword(musername, mpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if (task.isSuccessful()) {
                        String em = mAuth.getCurrentUser().getEmail();
                        Toast.makeText(getApplicationContext(), em, Toast.LENGTH_SHORT).show();


                        Toast.makeText(getApplicationContext(),"succesful manager",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),Manager.class));
                    //finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                        //finish();
                    }
                }
            });

        }

    }

}

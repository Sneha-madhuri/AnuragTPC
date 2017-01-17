package com.example.sneha.anuragtpc;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TenthActivity extends AppCompatActivity {

    private EditText mloginEmailField;
    private EditText mloginPasswordField;
    private Button mloginbtn;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);


        mAuth=FirebaseAuth.getInstance();
        mDatabase= FirebaseDatabase.getInstance().getReference().child("Users");
        mloginEmailField=(EditText)findViewById(R.id.loginEmailField);
        mloginPasswordField=(EditText)findViewById(R.id.loginPasswordField);
        mloginbtn=(Button)findViewById(R.id.loginbtn);

        mloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkLogin();
            }


        });
    }

    private void checkLogin() {
        String email=mloginEmailField.getText().toString().trim();
        String password=mloginPasswordField.getText().toString().trim();

        if(!TextUtils.isEmpty(email)&&!TextUtils.isEmpty(password)){
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if(task.isSuccessful()){

                        checkUserExist();
                    }
                    else {
                        Toast.makeText(TenthActivity.this,"Error Login",Toast.LENGTH_LONG).show();
                    }

                }

            });

        }

    }

     private void checkUserExist() {

        final String user_id=mAuth.getCurrentUser().getUid();

        mDatabase.addValueEventListener(new ValueEventListener() {
           @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

             if(dataSnapshot.hasChild(user_id)){

            Intent mainIntent=new Intent(TenthActivity.this,Discussion.class);
            mainIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(mainIntent);

             }
             else {
             Toast.makeText(TenthActivity.this,"You need to have an account to login.",Toast.LENGTH_LONG).show();
             }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

           }
        });
    }
}

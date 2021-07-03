package com.example.appsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    import com.google.firebase.auth.FirebaseAuth;

    public class MainActivity extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }


        public void logout(View view) {

            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(),HomeActivity.class));
            finish();
        }
}
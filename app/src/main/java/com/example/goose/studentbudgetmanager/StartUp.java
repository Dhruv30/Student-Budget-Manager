package com.example.goose.studentbudgetmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class StartUp extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);

    }
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }


}

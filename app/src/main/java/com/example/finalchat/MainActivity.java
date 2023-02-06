package com.example.finalchat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.finalchat.fragment.PeopleFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.mainactivity_framelayout,new PeopleFragment()).commit();
    }
}
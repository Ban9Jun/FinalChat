package com.example.finalchat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.finalchat.fragment.HomeFragment;
import com.example.finalchat.fragment.PeopleFragment;
import com.example.finalchat.fragment.PostFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnv_main = findViewById(R.id.mainactivity_bottomnavigationview);

        getSupportFragmentManager().beginTransaction().add(R.id.mainactivity_framelayout, new PeopleFragment()).commit();

        // 네비게이션 화면 전환
        bnv_main.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_account:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainactivity_framelayout, new HomeFragment()).commit();
                        break;

                    case R.id.action_people:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainactivity_framelayout, new PeopleFragment()).commit();
                        break;

                    case R.id.action_chat:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainactivity_framelayout, new PostFragment()).commit();
                }
            }
        });
    }
}

/*
프래그먼트들의 부모 액티비티라 보면됨
프래그먼트의 이동만 관할
 */
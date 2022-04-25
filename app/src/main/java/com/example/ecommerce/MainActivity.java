package com.example.ecommerce;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
        bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigation =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId())
                    {
                        case R.id.home:
                            Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.search:
                            Toast.makeText(MainActivity.this, "search", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.cart:
                            Toast.makeText(MainActivity.this, "cart", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.profile:
                            Toast.makeText(MainActivity.this, "profile", Toast.LENGTH_SHORT).show();
                            break;

                    }

                    return true;
                }
            };
}
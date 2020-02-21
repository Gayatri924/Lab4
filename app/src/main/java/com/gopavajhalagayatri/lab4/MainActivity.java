package com.gopavajhalagayatri.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int[] pages = {R.layout.page1, R.layout.page2, R.layout.page3, R.layout.page4, R.layout.page5, R.layout.page6, R.layout.page7};
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
    }

    public void nextPage(View view) {
        setContentView(pages[count]);
        count += 1;
        if(count > 6) count = 0;
    }
}

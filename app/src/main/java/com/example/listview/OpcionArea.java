package com.example.listview;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class OpcionArea extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operacion_area);
        // getActionBar().setDisplayHomeAsUpEnabled(true);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

    }

    // And override this method
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }*/
}

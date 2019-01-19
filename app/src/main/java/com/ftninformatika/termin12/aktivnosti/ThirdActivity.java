package com.ftninformatika.termin12.aktivnosti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.ftninformatika.termin12.R;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getBaseContext(), "onStart trece aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("TrecaAktivnost", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getBaseContext(), "onRestart trece aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("DrugaAktivnost", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(), "onResume trece aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("TrecaAktivnost", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getBaseContext(), "onPause trece aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("TrecaAktivnost", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getBaseContext(), "onStop trece aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("TrecaAktivnost", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getBaseContext(), "onDestroy trece aktivnosti", Toast.LENGTH_SHORT).show();
        Log.i("TrecaAktivnost", "onDestroy");
    }

}

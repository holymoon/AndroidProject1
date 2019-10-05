package com.example.androidproject1;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyTag","in onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyTag","in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MyTag","in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyTag","in onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyTag","in onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyTag","in onDestroy");
    }
}

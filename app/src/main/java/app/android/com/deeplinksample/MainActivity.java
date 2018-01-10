package app.android.com.deeplinksample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.fotoapparat.Fotoapparat;
import io.fotoapparat.view.CameraView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("new intent","new intent");
    }

    @Override
    protected void onStart() {
        super.onStart();
    }



    @Override
    protected void onStop() {
        super.onStop();
    }
}

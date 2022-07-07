package com.thenewboston.multivideo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView view = (VideoView) findViewById(R.id.video);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.j;
        view.setVideoURI(Uri.parse(path));
        view.start();
    }
}

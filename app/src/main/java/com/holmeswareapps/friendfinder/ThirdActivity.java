package com.holmeswareapps.friendfinder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
            //Toast.makeText(this, "SavedInstanceState is NULL", Toast.LENGTH_SHORT).show();
        } else {
            //Toast.makeText(this, "SavedInstanceState not NULL", Toast.LENGTH_SHORT).show();
        }
    }

}

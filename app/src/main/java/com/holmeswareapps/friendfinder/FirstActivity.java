package com.holmeswareapps.friendfinder;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends Activity {

    private boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        Context c = getApplicationContext();
        boolean hasCamera = checkCameraHardware(c);
        String s;
        if (hasCamera) {
            s = "This device has a camera";
        } else {
            s = "This device DOES NOT have a camera";
        }

        TextView tv = (TextView)findViewById(R.id.hasCamera);
        tv.setText(s);
        Toast.makeText(c, s, Toast.LENGTH_SHORT).show();
    }
}

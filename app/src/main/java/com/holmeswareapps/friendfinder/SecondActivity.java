package com.holmeswareapps.friendfinder;

import android.app.Activity;
import android.hardware.camera2.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {

    private static String TAG = "My SecondActivity";
    private CameraManager camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        TextView tv = (TextView)findViewById(R.id.view_text);
        tv.setText("not yet set");
        camera = (CameraManager)getSystemService(CAMERA_SERVICE);
        String list[];

        try {
            list = camera.getCameraIdList();
            String text = "";
            for (int i=0; i<list.length; i++) {
                text += "Camera #" + (i + 1) + " = " + list[i] + "=> ";
                //CameraCharacteristics cc = camera.getCameraCharacteristics(list[i]);
                //text += cc.getKeys().toString();
            }
            tv.setText(text);
        } catch (Exception ex) {
            tv.setText("Exception Caught: " + ex.getMessage());
        }
        /*
        camera.openCamera("0", new CameraDevice.StateCallback() {
            @Override
            public void onOpened(CameraDevice camera) {

            }

            @Override
            public void onDisconnected(CameraDevice camera) {

            }

            @Override
            public void onError(CameraDevice camera, int error) {

            }
        }, null);*/
    }

    /** A safe way to get an instance of the Camera object. */
    /*public static Camera getCameraInstance(){
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
            Log.d(TAG, "Got camera instance");
        }
        catch (Exception e){
            Log.d(TAG, "Failed to get camera instance - " + e.getMessage());
        }
        return c; // returns null if camera is unavailable
    }*/

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //c.release();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //c.release();
    }


}

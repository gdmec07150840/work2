package cn.edu.gdmec.x07150840.work2;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("work1","我启动了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("work2","我要出现了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("work2","onDestroy已启动");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("work2","onRestart已启动");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("work2","onPause已启动");
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.d("work2","onCreate已启动");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("work1","卧槽，有人");
    }
}

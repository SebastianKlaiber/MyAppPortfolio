package de.k11dev.skipjip.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_media_streamer).setOnClickListener(this);
        findViewById(R.id.btn_super_duo1).setOnClickListener(this);
        findViewById(R.id.btn_super_duo2).setOnClickListener(this);
        findViewById(R.id.btn_ant_terminator).setOnClickListener(this);
        findViewById(R.id.btn_materialize).setOnClickListener(this);
        findViewById(R.id.btn_capstone).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_media_streamer:
                DisplayText(getString(R.string.toast_media_streamer));
                break;
            case R.id.btn_super_duo1:
                DisplayText(getString(R.string.toast_super_duo1));
                break;
            case R.id.btn_super_duo2:
                DisplayText(getString(R.string.toast_super_duo2));
                break;
            case R.id.btn_ant_terminator:
                DisplayText(getString(R.string.toast_ant_terminator));
                break;
            case R.id.btn_materialize:
                DisplayText(getString(R.string.toast_materialize));
                break;
            case R.id.btn_capstone:
                DisplayText(getString(R.string.toast_capstone));
                break;
        }
    }

    void DisplayText(String s){
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
}

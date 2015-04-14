package com.example.jeremy.comp7481_final_q1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout)findViewById(R.id.layout1);

        ButtonWithTooltip b1 = new ButtonWithTooltip(this);
        b1.setText("Button with Tooltip");
        layout.addView(b1);

        ButtonWithTooltip b2 = new ButtonWithTooltip(this);
        b2.setText("These buttons");
        layout.addView(b2);

        ButtonWithTooltip b3 = new ButtonWithTooltip(this);
        b3.setText("will show a tooltip");
        layout.addView(b3);

        ButtonWithTooltip b4 = new ButtonWithTooltip(this);
        b4.setText("if you long-press them");
        layout.addView(b4);
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
}

package com.example.srivatsan.material;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Transition;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Chal1Page2 extends ActionBarActivity {
    private Toolbar toolbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_chal1_page2);
        toolbar1 = (Toolbar) findViewById(R.id.math_app_bar);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView but_playnow = (TextView) findViewById(R.id.but_playnow_1);
        TextView but_chal = (TextView) findViewById(R.id.but_chal_1);
        TextView but_prac = (TextView) findViewById(R.id.but_practice_1);

        if(android.os.Build.VERSION.SDK_INT<=19) {
            final Resources reso = this.getResources();

            but_playnow.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View arg0, MotionEvent arg1) {
                    switch (arg1.getActionMasked()) {
                        case MotionEvent.ACTION_DOWN: {
                            TextView tv = (TextView) findViewById(arg0.getId());
                            tv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.roundrect_chal1_hover));
                            tv.setPadding(20, 10, 20, 10);
                            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                            params.setMargins(0, 100, 0, 20);
                            tv.setTextSize(20);
                            return true;

                        }
                        case MotionEvent.ACTION_UP:
                            // TODO Auto-generated method stub
                        {
                            TextView tv = (TextView) findViewById(arg0.getId());
                            tv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.roundrect_chal1));

                            tv.setPadding(20, 10, 20, 10);
                            tv.setTextSize(20);

                            Intent intent = new Intent(getApplicationContext(), Chal1Page3.class);

                            startActivity(intent);

                            return true;
                        }
                    }
                    return false;
                }
            });

            but_chal.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View arg0, MotionEvent arg1) {
                    switch (arg1.getActionMasked()) {
                        case MotionEvent.ACTION_DOWN: {
                            TextView tv = (TextView) findViewById(arg0.getId());
                            tv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.roundrect_chal1_hover));
                            tv.setPadding(20, 10, 20, 10);
                            return true;

                        }
                        case MotionEvent.ACTION_UP:
                            // TODO Auto-generated method stub
                        {
                            TextView tv = (TextView) findViewById(arg0.getId());
                            tv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.roundrect_chal1));

                            tv.setPadding(20, 10, 20, 10);

                            return true;
                        }
                    }
                    return false;
                }
            });

            but_prac.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View arg0, MotionEvent arg1) {
                    switch (arg1.getActionMasked()) {
                        case MotionEvent.ACTION_DOWN: {
                            TextView tv = (TextView) findViewById(arg0.getId());
                            tv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.roundrect_chal1_prac));
                            tv.setPadding(20, 10, 20, 10);
                            return true;

                        }
                        case MotionEvent.ACTION_UP:
                            // TODO Auto-generated method stub
                        {
                            TextView tv = (TextView) findViewById(arg0.getId());
                            tv.setBackground((GradientDrawable) reso.getDrawable(R.drawable.roundrect_chal1_prac));

                            tv.setPadding(20, 10, 20, 10);

                            Intent intent = new Intent(getApplicationContext(), Chal1Page3.class);
                            startActivity(intent);

                            return true;
                        }
                    }
                    return false;
                }
            });
        }
        else{
            but_playnow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), Chal1Page3.class);
                    startActivity(intent);
                }
            });
            but_prac.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), Chal1Page3.class);
                    startActivity(intent);
                }
            });


        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chal1_page2, menu);
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
        if(id==R.id.home){
            NavUtils.navigateUpFromSameTask(this);

        }

        return super.onOptionsItemSelected(item);
    }
}

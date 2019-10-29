package com.wireless.nur137.fragmentexample;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void selectFrag(View view) {
        Fragment fr = null;

        if(view == findViewById(R.id.button2)) {
            fr = new FragmentTwo();

            this.context=context;
            //refresh the activity
            ((Activity)context).finish();
            context.startActivity(((Activity)context).getIntent());

        }else if(view == findViewById(R.id.button1)){

            this.context=context;
            //refresh the activity
            ((Activity)context).finish();
            context.startActivity(((Activity)context).getIntent());



            fr = new FragmentOne();
        }else{

            this.context=context;
            //refresh the activity
            ((Activity)context).finish();
            context.startActivity(((Activity)context).getIntent());

        }



        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        FragmentTransaction replace = fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();

    }

}

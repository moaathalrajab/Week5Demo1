package com.example.moaathalrajab.week4demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final static String LOG_TAG= MainActivity.class.getName().toString();

    String[] mClasses;
    List<String> lstClasses;
    TextView mTv;
    LinearLayout mLinearLayout;
    Button mBtn;
    ListView mLv;
    MyAdapter adapter;
    String str="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mClasses=getResources().getStringArray(R.array.fsc_bcs_classes);
        lstClasses=new ArrayList<String>(Arrays.asList(mClasses));
        mTv=(TextView)findViewById(R.id.tv1);
        mLinearLayout=(LinearLayout)findViewById(R.id.main_layout_id);

            mBtn = new Button(this);
            mLv=new ListView(this);
        adapter=new MyAdapter(this,-1, mClasses );

            mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    lstClasses.remove(i);
                    adapter.notifyDataSetChanged();
                    mLv.invalidateViews();
                }
            });

            mLv.setAdapter(adapter);
            mLinearLayout.addView(mLv);





    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_TAG, "THis activity is in onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_TAG, "THis activity is in onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG, "THis activity is in onDestroy");

    }





    public void ckange_name(View view) {
        mTv.setText(getString(R.string.text_id));
    }


}

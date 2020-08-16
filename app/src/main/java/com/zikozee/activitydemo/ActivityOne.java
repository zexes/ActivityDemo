package com.zikozee.activitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class ActivityOne extends AppCompatActivity implements AdapterView.OnItemClickListener {
//LIFECYCLE
    String TAG = "ActivityOne";
//    TextView mTextView;

    ListView mListView;
    ArrayAdapter<String> mAdapter;// its a generic so it can take in any object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_one);//ONE ACTIVITY HAS A LAYOUT IT DISPLAYS
        setContentView(R.layout.activity_one_listview);
        Log.i(TAG, "---onCreate--");

//        mTextView = findViewById(R.id.my_text_view);// getting the id of layout
        mListView = findViewById(R.id.listView);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        mAdapter.add("Amazon");
        mAdapter.add("FlipKart");
        mAdapter.add("Snapdeal");
        mAdapter.add("Myntra");
        mAdapter.add("eBay");

        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(this);//delegating the clicking event to the current class
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "---onStart--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "---onRestart--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "---onResume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "---onPause--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "---onDestroy--");
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        final String item = mAdapter.getItem(i);
        Toast.makeText(this, "You selected: " + item, Toast.LENGTH_LONG).show();
    }

    /*public void clickHandler(View view){
        Date date = new Date();
        mTextView.setText("Today is: " + date.toString());
        Toast.makeText(this, "You Clicked Button", Toast.LENGTH_LONG).show();
    }*/
}
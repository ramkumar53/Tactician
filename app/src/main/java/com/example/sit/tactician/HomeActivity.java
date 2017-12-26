package com.example.sit.tactician;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
public class HomeActivity extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] values = new String[] { "Chairman-Shri.A.M.Kandaswami", "CEO-Smt.Savitha Mohanraj","Principal-Dr.R.Radhakrishnan","Chiefguest-Mr.Srinivas Pasupulati","HoDCSE-Prof.P.N.Renjith","HoDEEE-Prof.Paul Joshua","HoDECE-Dr.K.Pandiarajan","HoDMECH-Dr.T.Sivakumar","HoDCIVIL-Prof.Aravinthkumar","HoDS&H-Prof.V.Mohanasundaram","HoDMBA-Prof.S.Arunkumar","Placement-Mr.Thivyaprakash"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        Intent intent =new Intent(HomeActivity.this,MainActivity.class);
        String item = (String) getListAdapter().getItem(position);

        startActivity(intent);

    }
}
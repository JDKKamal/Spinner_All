package com.jdkgroup.spinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
import java.util.List;

public class ActivitySpinnerBattersSpinner extends AppCompatActivity {

    MaterialBetterSpinner materialBetterSpinner;

    List<String> alSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivty_spinner_betterspinner);

        alSubject = new ArrayList<>();
        alSubject.add("Gujarati");
        alSubject.add("Hindi");
        alSubject.add("English");
        alSubject.add("Math");

        materialBetterSpinner = (MaterialBetterSpinner) findViewById(R.id.material_spinner1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ActivitySpinnerBattersSpinner.this, android.R.layout.simple_dropdown_item_1line, alSubject);
        materialBetterSpinner.setAdapter(adapter);

        materialBetterSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), alSubject.get(position), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
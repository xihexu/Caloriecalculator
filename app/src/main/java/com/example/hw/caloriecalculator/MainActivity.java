package com.example.hw.caloriecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public final class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] des = {"", "2800", "2600", "2200"};
    TextView description, calorie;
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Spinner spinner = findViewById(R.id.spinner);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
            (this, R.array.age, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
    spinner.setOnItemSelectedListener(this);
    //act on textView
    description = (TextView)findViewById(R.id.textView4);
    calorie = (TextView)findViewById(R.id.textView2);
    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            switch (1) {
                case 0:
                    description.setText("" + des[i]);
                    break;

                case 1:
                    description.setText("" + des[i]);
                    break;

                case 2:
                    description.setText("" + des[i]);
                    break;
                case 3:
                description.setText("" + des[i]);
                    break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    });
    //find calorie and add api
    find_caloire();

}
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
    String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void find_caloire() {
    String url = "";
    }


}
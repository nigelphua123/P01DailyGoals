package sg.edu.rp.c346.p01_dailygoals;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import sg.edu.rp.c346.p01_dailygoals.R;
import sg.edu.rp.c346.p01_dailygoals.daily_goal2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daily_goal);

        SharedPreferences sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("name",DEFAULT);
        String.pass;

        Button btn = findViewById(R.id.btnok);
        final EditText etreflection = findViewById(R.id.editText);
        final RadioGroup rgb = findViewById(R.id.radiogroup1);
        final RadioGroup rgb2 = findViewById(R.id.rgb2);
        final RadioGroup rgb3 = findViewById(R.id.rgb3);


        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       int selectButtonId = rgb.getCheckedRadioButtonId();
                                       RadioButton rb1= findViewById(selectButtonId);
                                       int selectButtonId2 = rgb2.getCheckedRadioButtonId();
                                       RadioButton rb2 = findViewById(selectButtonId2);
                                       int selectButtonId3 = rgb3.getCheckedRadioButtonId();
                                       RadioButton rb3 = findViewById(selectButtonId3);

                                       String info = etreflection.getText().toString();

                                       String yes1 = rb1.getText().toString();
                                       String yes2 = rb2.getText().toString();
                                       String yes3 = rb3.getText().toString();

                                       Intent i = new Intent(MainActivity.this,daily_goal2.class);
                                       i.putExtra("info", info);
                                       i.putExtra("yes1", yes1);
                                       i.putExtra("yes2", yes2);
                                       i.putExtra("yes3", yes3);
                                       startActivity(i);



                                   }
                               }
        );


    }
}
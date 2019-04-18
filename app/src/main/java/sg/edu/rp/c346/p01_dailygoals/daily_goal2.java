package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import sg.edu.rp.c346.p01_dailygoals.MainActivity;
import sg.edu.rp.c346.p01_dailygoals.R;

public class daily_goal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_goal2);


        Button btn = findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(daily_goal2.this,MainActivity.class);
                startActivity(j);
            }
        });
        Intent i= getIntent();
        String info = i.getStringExtra("info");
        String yes1 = i.getStringExtra("yes1");
        String yes2 = i.getStringExtra("yes2");
        String yes3 = i.getStringExtra("yes3");

        TextView tv1,tv2,tv3,tv4;
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv1.setText("read up on material before class: " + yes1);
        tv2.setText("arrive on time so as not to miss important part of the lesson: " + yes2);
        tv3.setText("attempt the problem myself: " + yes3);
        tv4.setText("Reflection: " + info);


    }
}


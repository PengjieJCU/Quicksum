package au.edu.jcu.cp3406.quicksum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
        public void buttonClicked (View view) {
            Button button = (Button) view;

            int number = Integer.parseInt(button.getText().toString());
            sum += number;

            TextView textView = findViewById(R.id.sum);
            String result = "" + sum;
            textView.setText(result);
        }
        public void pressClear (View view){
            TextView clearText = findViewById(R.id.sum);
            String blank = "0";
            clearText.setText(blank);

            sum = 0;
        }
    }
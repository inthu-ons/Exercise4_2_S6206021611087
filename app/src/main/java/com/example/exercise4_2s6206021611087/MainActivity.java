/* 6206021611087
    อินธุอร สนธิสุวรรณ
 */

package com.example.exercise4_2s6206021611087;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView numberText;
    private Button btnCU,btnCD,btnReset;

    final String message = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCU = (Button) findViewById(R.id.btnCU);
        btnCD = (Button) findViewById(R.id.btnCD);
        btnReset = (Button) findViewById(R.id.btnReset);
        numberText = (TextView) findViewById(R.id.numberText);

        btnCU.setOnClickListener(this);
        btnCD.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        int num = Integer.parseInt(numberText.getText().toString());
        if (v.getId() == R.id.btnCU){
            num++;
            if(num % 5 == 0){
                Toast.makeText(this,"หาร 5 ลงตัว", Toast.LENGTH_SHORT).show();
            }
            numberText.setText(Integer.toString(num));
        }
        else if (v.getId() == R.id.btnCD){
            num--;
            if(num % 5 == 0){
                Toast.makeText(this,"หาร 5 ลงตัว", Toast.LENGTH_SHORT).show();
            }
            numberText.setText(Integer.toString(num));
        }
        else if (v.getId() == R.id.btnReset){
            numberText.setText(message);

        }
    }
}
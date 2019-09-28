package ru.mirea.cherednichenko.clickbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivityTwo extends AppCompatActivity {

    ConstraintLayout CL;
    TextView tvOut;
    LinearLayout LL2;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        // find
        CL= (ConstraintLayout) findViewById(R.id.CL);
        tvOut=(TextView) findViewById(R.id.tvOut);
        LL2=(LinearLayout) findViewById(R.id.LL2);
        btnOk=(Button) findViewById(R.id.btnOk);
        btnCancel=(Button) findViewById(R.id.btnCancel);

        View.OnClickListener oklBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText(" АРРРРРРРРРРРРР");
            }
        };

        View.OnClickListener ok1BtnClose = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("НЕ РЫЧИ!!!!");
            }
        };

        btnOk.setOnClickListener(oklBtnOk);
        btnCancel.setOnClickListener(ok1BtnClose);
    }
}

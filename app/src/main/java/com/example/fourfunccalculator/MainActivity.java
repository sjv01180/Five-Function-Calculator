package com.example.fourfunccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Calculator calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = new Calculator();
        updateView();
    }

    /**
     * Updates calculator display
     */
    private void updateView() {
        TextView display = findViewById(R.id.display);
        display.setText(calc.getDisplay());
    }

    public void calcClick(View view) {
        switch (view.getId()) {
            case (R.id.btn_zero):
                calc.keyPress('0');
                break;
            case (R.id.btn_one):
                calc.keyPress('1');
                break;
            case (R.id.btn_two):
                calc.keyPress('2');
                break;
            case (R.id.btn_three):
                calc.keyPress('3');
                break;
            case (R.id.btn_four):
                calc.keyPress('4');
                break;
            case (R.id.btn_five):
                calc.keyPress('5');
                break;
            case (R.id.btn_six):
                calc.keyPress('6');
                break;
            case (R.id.btn_seven):
                calc.keyPress('7');
                break;
            case (R.id.btn_eight):
                calc.keyPress('8');
                break;
            case (R.id.btn_nine):
                calc.keyPress('9');
                break;
            case (R.id.btn_add):
                calc.keyPress('+');
                break;
            case (R.id.btn_sub):
                calc.keyPress('-');
                break;
            case (R.id.btn_multi):
                calc.keyPress('*');
                break;
            case (R.id.btn_div):
                calc.keyPress('/');
                break;
            case (R.id.btn_eql):
                calc.keyPress('=');
                break;
            case (R.id.btn_mod):
                calc.keyPress('%');
                break;
            case (R.id.btn_clr):
                calc.clear();
                break;
            case (R.id.btn_AC):
                calc.allClear();
                break;
            case (R.id.btn_decimal):
                calc.keyPress('.');
                break;
            default:
                throw new RuntimeException("unknown id error");
        }

        updateView();
    }
}

package guess.fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random r = new Random();
    int n = r.nextInt(10)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void number(View view) {
        EditText ednumber = (EditText) findViewById(R.id.ed_number);
        float number = Float.parseFloat(ednumber.getText().toString());

        if (number < n) {
            new AlertDialog.Builder(this)
                    .setMessage("大一點")
                    .setPositiveButton("OK", null)
                    .show();
        } else if (number > n) {
            new AlertDialog.Builder(this)
                    .setMessage("小一點")
                    .setPositiveButton("OK", null)
                    .show();
        } else if (number == n) {
            new AlertDialog.Builder(this)
                    .setMessage("答對了")
                    .setPositiveButton("OK", null)
                    .show();
        }
    }
    }

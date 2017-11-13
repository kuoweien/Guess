package guess.fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random r = new Random();
    int n = r.nextInt(100)+1;
    int min = 1;
    int max = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void number(View view) {
        EditText ednumber = (EditText) findViewById(R.id.ed_number);
        int number = Integer.parseInt(ednumber.getText().toString());

        if (number < n) {
           min = number;
            Toast.makeText(this, "請輸入"+min+"~"+max, Toast.LENGTH_LONG).show();
        } else if (number > n) {
           max = number;
            Toast.makeText(this, "請輸入"+min+"~"+max, Toast.LENGTH_LONG).show();
        } else if (number == n) {
            new AlertDialog.Builder(this)
                    .setMessage("答對了")
                    .setPositiveButton("OK", null)
                    .show();

        }
    }
    }

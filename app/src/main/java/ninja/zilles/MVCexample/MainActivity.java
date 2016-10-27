package ninja.zilles.MVCexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RandomStringGenerator randomStringGenerator = new RandomStringGenerator("");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RandomStringTextView randomStringTextView =
                (RandomStringTextView)findViewById(R.id.stringTextView);
        randomStringGenerator.addObserver(randomStringTextView);
        RandomStringLengthTextView randomStringLengthTextView =
                (RandomStringLengthTextView)findViewById(R.id.lengthTextView);
        randomStringGenerator.addObserver(randomStringLengthTextView);
    }

    public void addLetter(View view) {
        randomStringGenerator.addLetter();
//        ToastMe();
    }
    public void addNumber(View view) {
        randomStringGenerator.addNumber();
//        ToastMe();

    }
    public void clear(View view) {
        randomStringGenerator.clear();
//        ToastMe();
    }

    public void ToastMe() {
        String text = "String is: " + randomStringGenerator.getString();
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}

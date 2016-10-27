package ninja.zilles.MVCexample;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zilles on 10/27/16.
 */

public class RandomStringLengthTextView extends TextView implements Observer {
    public RandomStringLengthTextView(Context context) {
        super(context);
    }

    public RandomStringLengthTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RandomStringLengthTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void update(Observable observable, Object data) {
//        Toast.makeText(getContext(), "YAY", Toast.LENGTH_SHORT).show();
        if (observable instanceof RandomStringGenerator) {
            int length = ((RandomStringGenerator)observable).getString().length();
            this.setText(Integer.toString(length));
        }
    }
}

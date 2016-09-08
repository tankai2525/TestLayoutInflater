package kai.tan.com.testlayoutinflater;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LayoutInflater mLayoutInflate;
    private LinearLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main = (LinearLayout)findViewById(R.id.main);
        mLayoutInflate = LayoutInflater.from(this);
        View button = mLayoutInflate.inflate(R.layout.button, null);
        main.addView(button);
    }
}

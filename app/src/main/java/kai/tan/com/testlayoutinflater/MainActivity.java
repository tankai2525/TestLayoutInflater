package kai.tan.com.testlayoutinflater;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private LayoutInflater mLayoutInflate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

                setContentView(R.layout.activity_main);
        mLayoutInflate = LayoutInflater.from(this);
        View view = mLayoutInflate.inflate(R.layout.activity_main, null);
        setContentView(view);
    }
}

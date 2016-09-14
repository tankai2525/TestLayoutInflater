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
        main = (LinearLayout) findViewById(R.id.main);
        mLayoutInflate = LayoutInflater.from(this);

        //1 加载button布局 root=null
        //                View button = mLayoutInflate.inflate(R.layout.button, null);
        //                main.addView(button);

        //2 加载button布局 root=main attachToRoot=true
        //        View button = mLayoutInflate.inflate(R.layout.button, main, true);//会添加到root中

        //3 加载button布局 root=main attachToRoot=false
        View button = mLayoutInflate.inflate(R.layout.button, main, false);//会把root产生的layoutparams设置给button
        main.addView(button);//当button被添加后layoutparams会起作用

    }
}

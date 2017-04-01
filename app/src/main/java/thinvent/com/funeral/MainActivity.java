package thinvent.com.funeral;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button scanButton=null;

    private TextView resultShowView=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scanButton=(Button)findViewById(R.id.scanButton);
        resultShowView=(TextView)findViewById(R.id.resultShow);


    }

}

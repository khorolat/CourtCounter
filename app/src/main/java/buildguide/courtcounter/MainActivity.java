package buildguide.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    int nCounter = 0;
    Button bt2;
    TextView tx;
    Button bt1;
    TextView tx2;
    Button buttonReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt2 = (Button) findViewById(R.id.bt2);
        tx = (TextView) findViewById(R.id.tx);
        buttonReset = (Button) findViewById(R.id.buttonReset);

        bt1 = (Button) findViewById(R.id.bt1);
        tx2 = (TextView) findViewById(R.id.tx2);
        buttonReset = (Button) findViewById(R.id.buttonReset);


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter++;
                tx.setText(Integer.toString(mCounter));
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nCounter++;
                tx2.setText(Integer.toString(nCounter));
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter=0;
                nCounter=0;
                tx.setText(String.valueOf(0));
                tx2.setText(String.valueOf(0));
            }
        });
    }
}

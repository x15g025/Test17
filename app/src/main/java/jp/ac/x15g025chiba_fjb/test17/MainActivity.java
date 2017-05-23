package jp.ac.x15g025chiba_fjb.test17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout output = (LinearLayout) findViewById(R.id.output);

        LinearLayout layout;
        layout = (LinearLayout)getLayoutInflater().inflate(R.layout.layout1, null);   //レイアウトをその場で生成
        output.addView(layout);                                                         //Viewの追加

        layout = (LinearLayout)getLayoutInflater().inflate(R.layout.layout1, null);   //レイアウトをその場で生成
        output.addView(layout);

        output.removeAllViews();
    }
}

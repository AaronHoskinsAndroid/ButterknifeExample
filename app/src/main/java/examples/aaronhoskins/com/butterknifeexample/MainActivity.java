package examples.aaronhoskins.com.butterknifeexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvDisplayOne)
    TextView tvDisplayOne;
    @BindView(R.id.tvDisplayTwo)
    TextView tvDisplayTwo;
    @BindColor(R.color.colorPurple)
    int colorPurple;
    @BindColor(R.color.colorRed)
    int colorRed;
    @BindString(R.string.app_name)
    String appName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tvDisplayOne.setTextColor(colorPurple);
        tvDisplayTwo.setTextColor(colorRed);
        tvDisplayOne.setText(appName);
        tvDisplayTwo.setText("Display Two");
    }
}

package sdacademy.pl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String LINE_1_CONTENT = "SDA jest fajne.";
    private static final String LINE_2_CONTENT = "SDA jest jeszcze fajniejsze.";

    @BindView(R.id.line1)
    protected TextView line1;

    @BindView(R.id.line2)
    protected TextView line2;

    @BindView(R.id.actionButton)
    protected Button clickButton;

    @BindView(R.id.actionButton2)
    protected Button clickButton2;

    @BindView(R.id.actionButton3)
    protected Button clickButton3;

    @OnClick({R.id.actionButton, R.id.actionButton2, R.id.actionButton3})
    protected void onButtonsCLick(View v) {
        if (v instanceof Button) {
            Button rzutowany = (Button) v;
            if (rzutowany == clickButton) {
                line1.setText(LINE_1_CONTENT);
            } else if (rzutowany == clickButton2) {
                line2.setText(LINE_2_CONTENT);
            } else {
                line1.setText("");
                line2.setText("");
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
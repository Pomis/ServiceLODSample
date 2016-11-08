package pomis.app.servicelodsample;

import android.content.Intent;
import android.support.annotation.FloatRange;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView2)
    TextView tvKek;
    @BindView(R.id.button)
    Button bKek;
    @BindView(R.id.editText)
    EditText etkek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Log.d("kek", "SERVICE STARTED");
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    @OnTextChanged(R.id.editText)
    void changeText(){
        Log.d("kek", "et changed");
        tvKek.setText(etkek.getText().toString());
        setOnButtonKekChanged(R.id.button);
    }


    public double arcsin(@FloatRange(from = -2.0, to = 1.0) float sinValue){
        return sinValue+1;
    }

    public void setOnButtonKekChanged(@IdRes int buttonID) {

    }

}

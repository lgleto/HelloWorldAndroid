package ipca.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonEnglish;
    Button buttonPortuguese;
    TextView textViewTranslation;

    String dataToTranslate = ""; // model

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textViewTranslation=(TextView)findViewById(R.id.textViewTranslation);
        textViewTranslation.setText(dataToTranslate);

        buttonEnglish = (Button)findViewById(R.id.buttonEnglish);
        buttonEnglish.setOnClickListener(this);
        buttonPortuguese = (Button)findViewById(R.id.buttonPortuguese);
        buttonPortuguese.setOnClickListener(this);

        updateView();
    }

    void updateView(){
        textViewTranslation.setText(dataToTranslate);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.buttonPortuguese:
                dataToTranslate = "Olá Mundo!";
                break;
            case R.id.buttonEnglish:
                dataToTranslate = "Hello World!";
                break;
        }
        updateView();
    }
}

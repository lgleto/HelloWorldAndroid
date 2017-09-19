package ipca.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonTranslate;
    TextView textViewTranslation;
    LinearLayout linearLayout;

    String dataToTranslate = "Hello World"; // model

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        linearLayout=new LinearLayout(this);
        buttonHello=new Button(this);
        textView = new TextView(this);

        buttonHello.setText("Hello");


        linearLayout.addView(buttonHello);
        linearLayout.addView(textView);

        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello World!");
            }
        });

        setContentView(linearLayout);
        */
        setContentView(R.layout.activity_main);

        textViewTranslation=(TextView)findViewById(R.id.textViewTranslation);
        textViewTranslation.setText(dataToTranslate);

        buttonTranslate = (Button)findViewById(R.id.buttonTranslate);
        buttonTranslate.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View view) {
        dataToTranslate="Olá Mundo!";
        textViewTranslation.setText(dataToTranslate);
    }
}

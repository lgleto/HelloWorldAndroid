package ipca.example.helloworld;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonEnglish;
    Button buttonPortuguese;
    Button buttonShare;
    TextView textViewTranslation;

    String dataToTranslate = ""; // model

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        dataToTranslate = "Hello " + getIntent().getStringExtra("name");

        textViewTranslation=(TextView)findViewById(R.id.textViewTranslation);
        textViewTranslation.setText(dataToTranslate);

        buttonEnglish = (Button)findViewById(R.id.buttonEnglish);
        buttonEnglish.setOnClickListener(this);
        buttonPortuguese = (Button)findViewById(R.id.buttonPortuguese);
        buttonPortuguese.setOnClickListener(this);
        buttonShare = (Button)findViewById(R.id.buttonShare);
        buttonShare.setOnClickListener(this);


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
            case R.id.buttonShare:
                Intent shareIntent;
                shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Prova Oral Podcast");
                shareIntent.putExtra(Intent.EXTRA_TEXT,
                                "https://play.google.com/store/apps/details?id=osga.util.ProvaOral");
                startActivity(Intent.createChooser(shareIntent, "Partilhar"));

                break;
        }
        updateView();
    }
}

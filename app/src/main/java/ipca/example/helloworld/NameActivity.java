package ipca.example.helloworld;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by lourenco on 19/09/17.
 */

public class NameActivity extends AppCompatActivity {

    Button buttonGo;
    Context context;
    EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_activity);
        context=this;

        editText=(EditText)findViewById(R.id.editText);


        buttonGo=(Button)findViewById(R.id.buttonGo);
        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context, MainActivity.class);
                intent.putExtra("name",editText.getText().toString());
                startActivity(intent);


            }
        });

    }
}

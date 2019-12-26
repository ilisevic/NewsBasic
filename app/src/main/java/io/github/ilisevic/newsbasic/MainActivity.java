package io.github.ilisevic.newsbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
LinearLayout linearLayout;
WebView webView;
TableRow tableRow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linearlayout);

tableRow=findViewById(R.id.tablerow1);

////

        tableRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("pass_URL","http://mtel.ba");
                startActivity(i);

            }
        });


        //////




        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "xyz", Toast.LENGTH_SHORT).show();






                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("pass_URL","http://politika.rs");
                startActivity(i);

                //TODO uraditi webview u novoj aktivnosti
            }
        });



    }
}

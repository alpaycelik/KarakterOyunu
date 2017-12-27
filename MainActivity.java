package celik.alpay.karakteroyunu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,EditText.OnEditorActionListener{
    TextView tv;
    TextView tvKarakterOzellikleri;
    Button bSaldir;
    Button bYemek;
    Button bUyu;
    int sayac = 0;
    int x = 100;
    Karakter k;
    EditText isim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.messages);
        tvKarakterOzellikleri = (TextView) findViewById(R.id.stats);
        bSaldir = (Button) findViewById(R.id.saldir);
        bYemek = (Button) findViewById(R.id.yemek);
        bUyu = (Button) findViewById(R.id.uyu);
        bSaldir.setOnClickListener(this);
        bYemek.setOnClickListener(this);
        bUyu.setOnClickListener(this);


        k = new Karakter();
        k.haraketSayisi = 10;
        k.kilo = 10;
        k.saldiriGucu = 100;
        tvKarakterOzellikleri.setText(k.toString());
        tv.setText("Oyuna hoşgeldiniz, lütfen bir eylem seçin.");
        isim = (EditText) findViewById(R.id.editText3);
        isim.setOnEditorActionListener(this);
        Log.d("mesaj", "create");
        x = 1000;
    }
    @Override
    public boolean onEditorAction(TextView tv2, int x, KeyEvent ke){
       tv.setText("Karakterin ismi: " + isim.getText() + " olarak atandı");
       k.isim = isim.getText().toString();
       isim.setVisibility(View.INVISIBLE);
       tvKarakterOzellikleri.setText(k.toString());
       tvKarakterOzellikleri.setVisibility(View.VISIBLE);
       return true;
    }

    @Override
    public void onClick(View v){
        if (v.getId() == bSaldir.getId()) {
            tv.setText(k.savas());
        }
        else if(v.getId() == bUyu.getId()) {
            tv.setText(k.uyumak());
        }
        else if(v.getId() == bYemek.getId()) {
            tv.setText(k.yemek());
        }
        tvKarakterOzellikleri.setText(k.toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mesaj", "start");
        x = 1002;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mesaj", "stop");
        x = 1003;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mesaj", "destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("mesaj", "pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("mesaj", "resume");
    }
}

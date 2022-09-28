package br.ulbra.visualizacaoimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgFoto;
    Button btnFoto1, btnFoto2, btnFoto3;
    TextView txtInformacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFoto = (ImageView) findViewById(R.id.imgFoto);

        btnFoto1 = (Button) findViewById(R.id.btnFoto1);
        btnFoto2 = (Button) findViewById(R.id.btnFoto2);
        txtInformacao = (TextView) findViewById(R.id.txtInformacao);
        btnFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imgFoto.setImageResource(R.drawable.tenthousanddragonwallpaper);
                txtInformacao.setText("ten Thousand Dragon");
            } });
        btnFoto2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                imgFoto.setImageResource(R.drawable.eva_wallpaper);
                txtInformacao.setText("Evangelion");
            } });


        btnFoto3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                imgFoto.setImageResource(R.drawable.armoredcorewallpaper);
                txtInformacao.setText("Armored Core");
        } });

    }
}
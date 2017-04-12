package br.cesed.layoutsemandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FrameLayout extends Activity implements View.OnClickListener {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        ImageView imagem = (ImageView) findViewById(R.id.imagem);
        imagem.setOnClickListener(this);

        texto = (TextView) findViewById(R.id.texto);
        texto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imagem:
                texto.setVisibility(View.VISIBLE);
                break;
            case R.id.texto:
                texto.setVisibility(View.GONE);
                break;
        }
    }
}

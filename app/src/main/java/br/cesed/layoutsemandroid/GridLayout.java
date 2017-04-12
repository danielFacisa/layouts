package br.cesed.layoutsemandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class GridLayout extends Activity implements View.OnClickListener {

    private android.widget.GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        gridLayout = (android.widget.GridLayout) findViewById(R.id.gridLayout);
        gridLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.gridLayout:
                Toast.makeText(this, "Grade: " + gridLayout.getRowCount() + "," + gridLayout.getColumnCount(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

package com.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonSpotify = (Button) findViewById(R.id.button_spotify);
        buttonSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage((Button) v);
            }
        });

        final Button buttonScores = (Button) findViewById(R.id.button_scores);
        buttonScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage((Button) v);
            }
        });

        final Button buttonLibrary = (Button) findViewById(R.id.button_library);
        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage((Button) v);
            }
        });

        final Button buttonBuild = (Button) findViewById(R.id.button_build);
        buttonBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage((Button) v);
            }
        });

        final Button buttonXyz = (Button) findViewById(R.id.button_xyz);
        buttonXyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage((Button) v);
            }
        });

        final Button buttonCapstone = (Button) findViewById(R.id.button_capstone);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage((Button) v);
            }
        });
    }

    private void showMessage(Button button) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(MainActivity.this,
                getString(R.string.this_button_will_launch, button.getText()),
                Toast.LENGTH_LONG);
        toast.show();
    }

}

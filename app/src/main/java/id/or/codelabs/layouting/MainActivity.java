package id.or.codelabs.layouting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLinear;
    private Button btnRelative;
    private Button btnFrame;
    private Button btnTable;
    private Button btnAbsolute;
    private Button btnCoordinator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinear = (Button)findViewById(R.id.btn_linear);
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LinearLayoutExample.class);
                startActivity(intent);
            }
        });

        btnRelative = (Button)findViewById(R.id.btn_relative);
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelativeLayoutExample.class);
                startActivity(intent);
            }
        });

        btnFrame = (Button)findViewById(R.id.btn_frame);
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrameLayoutExample.class);
                startActivity(intent);
            }
        });

        btnTable = (Button)findViewById(R.id.btn_table);
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TableLayoutExample.class);
                startActivity(intent);
            }
        });

        btnAbsolute = (Button)findViewById(R.id.btn_absolute);
        btnAbsolute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AbsoluteLayoutExample.class);
                startActivity(intent);
            }
        });

        btnCoordinator = (Button)findViewById(R.id.btn_coordinator);
        btnCoordinator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CoordinatorLayoutExample.class);
                startActivity(intent);
            }
        });
    }
}

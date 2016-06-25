package id.or.codelabs.layouting;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CoordinatorLayoutExample extends AppCompatActivity {

    private FloatingActionButton fabDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinator_layout_example);

        getSupportActionBar().setTitle("Coordinator Layout With Snackbar");

        fabDone = (FloatingActionButton)findViewById(R.id.fab_done);

        fabDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello, this is snackbar", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}

package id.or.codelabs.layouting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by FitriFebriana on 6/20/2016.
 */
public class RelativeLayoutExample extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout_example);

        getSupportActionBar().setTitle("Relative Layout Example");
    }
}

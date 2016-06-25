package id.or.codelabs.layouting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TableLayoutExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout_example);

        getSupportActionBar().setTitle("Table Layout Example");
    }
}

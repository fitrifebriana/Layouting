package id.or.codelabs.layouting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AbsoluteLayoutExample extends AppCompatActivity {

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.absolute_layout_example);

        getSupportActionBar().setTitle("Absolute Layout Example");

        btnLogin = (Button)findViewById(R.id.btn_login_absolute);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Login button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

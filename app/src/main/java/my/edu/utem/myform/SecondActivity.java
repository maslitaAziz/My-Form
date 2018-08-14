package my.edu.utem.myform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView nameTextView, emailTextView, phoneTextView, cellTextView, mesejTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nameTextView = findViewById(R.id.second_nameTextView);
        emailTextView = findViewById(R.id.second_emailTextView);
        phoneTextView = findViewById(R.id.main_phoneEditText);
        cellTextView = findViewById(R.id.main_cellEditText);
        mesejTextView = findViewById(R.id.main_messageEditText);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");
        String cell = intent.getStringExtra("cell");
        String message = intent.getStringExtra("message");

        nameTextView.setText(name);
        emailTextView.setText(email);
        phoneTextView.setText(phone);
        cellTextView.setText(cell);
        mesejTextView.setText(message);
    }
}

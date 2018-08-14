package my.edu.utem.myform;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, emailEditText, phoneEditText, cellEditText, messageEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.main_nameEditText);
        emailEditText = findViewById(R.id.main_emailEditText);
        phoneEditText = findViewById(R.id.main_phoneEditText);
        cellEditText = findViewById(R.id.main_cellEditText);
        messageEditText = findViewById(R.id.main_messageEditText);

    }

    public void editPressed(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("name", nameEditText.getText().toString()); //key - blh jadi apa shj value - ambil dpd mana
        intent.putExtra("email", emailEditText.getText().toString());
        intent.putExtra("phone", phoneEditText.getText().toString());
        intent.putExtra("cell", cellEditText.getText().toString());
        intent.putExtra("message", messageEditText.getText().toString());
        startActivity(intent);//create the activity
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.menu_about_us:
                Intent intent = new Intent(MainActivity.this, Web_Activity.class);
                startActivity(intent);
                break;
            case R.id.menu_contact_us:
                Toast.makeText(MainActivity.this, "Universiti Teknikal Malaysia Melaka", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_share:
                AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(MainActivity.this);
                myAlertBuilder.setTitle("Are you sure?");
                myAlertBuilder.setMessage("Are you sure you want to share this app?");
                myAlertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                myAlertBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                myAlertBuilder.show();
                break;
            case R.id.menu_exit:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

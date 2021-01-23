package ir.ac.shirazu.cse.shimadollahi.homegym;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterInGymActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_in_gym);
    }
    private void goToPayActivity(){
        Intent intent=new Intent(RegisterInGymActivity.this, PayActivity.class);
        startActivity(intent);

    }

}
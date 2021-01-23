package ir.ac.shirazu.cse.shimadollahi.homegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
    }
    private void goToRegisterInGymActivity(){
        Intent intent=new Intent(PayActivity.this, GymActivity.class);
        startActivity(intent);

    }
}
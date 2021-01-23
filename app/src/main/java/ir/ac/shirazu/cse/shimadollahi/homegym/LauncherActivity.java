package ir.ac.shirazu.cse.shimadollahi.homegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        changeActivity();

    }

    private void goToRegisterActivity() {
        Intent intent=new Intent(LauncherActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
    private void goToGymActivity() {
        Intent intent=new Intent(LauncherActivity.this, GymActivity.class);
        startActivity(intent);
    }
    private void changeActivity(){
        //if not registered -->
        goToRegisterActivity();
        //else --> goToGymActivity()
    }
}
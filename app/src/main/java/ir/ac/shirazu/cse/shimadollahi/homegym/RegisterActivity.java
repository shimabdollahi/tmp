package ir.ac.shirazu.cse.shimadollahi.homegym;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {
    private Person person;
//    private BodyFragment2 body_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        this.person=new Person(DB.getNewPersonId());
        BodyFragment bodyFragment=new BodyFragment();
        bodyFragment.setRegisterActivity(this);
        getSupportFragmentManager().beginTransaction().add(R.id.bodyFragment,bodyFragment).commit();

    }

    private void goToRegisterInGymActivity(){
        Intent intent=new Intent(RegisterActivity.this, RegisterInGymActivity.class);
        startActivity(intent);

    }
    public Person getPerson() {
        return person;
    }
  /*  public void registerBtn(View view){
        //if view id is the id of register button :
        Person person=createPerson();
        //add body to person
        person.addBody();
        this.person=person;
        DB.addPerson(person);
    } */
}
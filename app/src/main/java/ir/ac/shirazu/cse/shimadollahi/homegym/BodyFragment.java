package ir.ac.shirazu.cse.shimadollahi.homegym;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class BodyFragment extends Fragment {

    private RadioGroup gender,activityLevel;
    private EditText age,height,weight;
    private RegisterActivity registerActivity;
    private Button nextBtn;
    public BodyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_body, container, false);

        gender=(RadioGroup) view.findViewById(R.id.radioGroupGender);
        //male=(RadioButton) view.findViewById(R.id.radioButtonMale);
        age=(EditText) view.findViewById(R.id.editTextNumberAge);
        height=(EditText) view.findViewById(R.id.editTextNumberHeight);
        weight=(EditText) view.findViewById(R.id.editTextNumberWeight);
        activityLevel=(RadioGroup) view.findViewById(R.id.RadioGroupActivityLevel);
        nextBtn=(Button) view.findViewById(R.id.buttonNext);
        nextBtn.setEnabled(true);


        age.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //check to be legal age
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Body body=createBody(gender,activityLevel,age,height,weight);
                registerActivity.getPerson().addBody(body);
                DB.addBody(body, registerActivity.getPerson().getId());
                //saveInfo(view);
                return;
            }
        });
        return view;
    }
    private Body createBody(RadioGroup gender,RadioGroup activityLevel, EditText age, EditText height, EditText weight){
        Sex sex=Sex.FEMALE;
        ActivityLevel activity_level=ActivityLevel.INACTIVE;
        if(gender.getCheckedRadioButtonId() == R.id.radioButtonMale){
            sex=Sex.MALE;
        }
        if(activityLevel.getCheckedRadioButtonId() == R.id.radioButtonLightlyActive){
            activity_level=ActivityLevel.LIGHTLYACTIVE;
        }
        if(activityLevel.getCheckedRadioButtonId() == R.id.radioButtonMediumActive){
            activity_level=ActivityLevel.MEDIUMACTIVE;
        }
        if(activityLevel.getCheckedRadioButtonId()== R.id.radioButtonHighlyActive){
            activity_level=ActivityLevel.HIGHLYACTIVE;
        }
        if(activityLevel.getCheckedRadioButtonId()== R.id.radioButtonExtremelyActive){
            activity_level=ActivityLevel.EXTREMELYACTIVE;
        }
        Body body=new Body();
     //   System.out.print("ageeeeeeeeee"+age.getText().toString().trim()+"ageeeeeeeeeeeeee\n\n\n");
        Integer agee=Integer.parseInt(age.getText().toString().trim());
        Integer heightt=Integer.valueOf(height.getText().toString().trim());
        Integer weightt=Integer.valueOf(weight.getText().toString().trim());
     //   System.out.print(agee);
     //   System.out.print(heightt);
     //   System.out.print(weightt);
        body.setSex(sex);
        body.setAge(agee);
        body.setHeight(heightt);
        body.setWeight(weightt);
        body.setActivityLevel(activity_level);
        return body;
    }
    public RegisterActivity getRegisterActivity() {
        return registerActivity;
    }

    public void setRegisterActivity(RegisterActivity activity) {
        this.registerActivity = activity;
    }
 /*   public void saveInfo(View view){
        Body body=createBody(gender,activityLevel,age,height,weight);
        registerActivity.getPerson().addBody(body);
        DB.addBody(body, registerActivity.getPerson().getId());

    }*/


}
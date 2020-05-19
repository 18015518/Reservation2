package sg.edu.rp.c346.id18015518.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    ToggleButton smoking;
    Button confirm;
    EditText name;
    EditText mobile;
    EditText size;
    Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        smoking = findViewById(R.id.toggleSmoking);
        confirm = findViewById(R.id.buttonConfirm);
        name = findViewById(R.id.editName);
        mobile = findViewById(R.id.editMobile);
        size = findViewById(R.id.editSize);
        reset = findViewById(R.id.buttonReset);

        dp.init(2020, 6, 1, null);
        tp.setCurrentHour(19);
        tp.setCurrentMinute(30);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), (CharSequence) name , Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), (CharSequence) mobile , Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), (CharSequence) size , Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), (CharSequence) dp , Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), (CharSequence) tp , Toast.LENGTH_SHORT).show();

                if(smoking.isChecked()) {
                    Toast.makeText(getApplicationContext(), (CharSequence) smoking , Toast.LENGTH_SHORT).show();

                    reset.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            name.setText("");
                            mobile.setText("");
                            size.setText("");
                            smoking.setChecked(false);

                        }

            });
        };;
    }
});}}

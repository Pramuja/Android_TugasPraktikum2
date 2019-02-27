package id.sch.smktelkom_mlg.www.konvertersuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText editCelcius, editReamur, editKelvin, editFarenheit;
    Button btnKonvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCelcius = (EditText)findViewById(R.id.editCelcius);
        editFarenheit = (EditText)findViewById(R.id.editFarenheit);
        editKelvin = (EditText)findViewById(R.id.editKelvin);
        editReamur = (EditText)findViewById(R.id.editReamur);
        btnKonvert = (Button)findViewById(R.id.btnKonvert);
    }
    public void konversisuhu(View view) {
        try{
            int nCelcius = Integer.parseInt(editCelcius.getText().toString());
            double nKelvin = nCelcius + 273;
            double nFarenheit = nCelcius * 1.8 + 32;
            double nReamur = nCelcius * 0.8;

            editKelvin.setText(String.valueOf(nKelvin));
            editFarenheit.setText(String.valueOf(nFarenheit));
            editReamur.setText(String.valueOf(nReamur));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void keluar (View view){
        System.exit(0);
    }
}

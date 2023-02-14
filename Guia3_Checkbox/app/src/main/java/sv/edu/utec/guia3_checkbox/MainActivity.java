package sv.edu.utec.guia3_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private CheckBox check1, check2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        check1=findViewById(R.id.check1);
        check2=findViewById(R.id.check2);
    }

    //Este método se ejecutará cuando se presione el botón
    public void operar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        String resu="";
        if (check1.isChecked()==true){
            int suma=nro1+nro2;
            resu="La suma es: " + suma;
        }
        if (check2.isChecked()==true){
            int resta=nro1-nro2;
            resu=resu + " La resta es: "+resta;
        }
        tv1.setText(resu);
    }
}
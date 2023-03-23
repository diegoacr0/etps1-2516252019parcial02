package sv.edu.utec.diegoceron2516252019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivityPerfil extends AppCompatActivity {
    TextView nom,cargop,companiap;
    ImageView imgp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_perfil);

        nom=findViewById(R.id.tvNombreperfil);
        nom.setText(getIntent().getExtras().getString("nombre"));

        cargop=findViewById(R.id.tvCargoperfil);
        cargop.setText(getIntent().getExtras().getString("cargo"));

        companiap=findViewById(R.id.tvCompaniaPerfil);
        companiap.setText(getIntent().getExtras().getString("compania"));

        imgp=findViewById(R.id.imvPerfil);
        imgp.setImageResource(getIntent().getExtras().getInt("imagen"));
    }
}
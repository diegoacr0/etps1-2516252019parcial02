package sv.edu.utec.diegoceron2516252019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView lista;
List<String> nombre;
List<String> cargo;
List<String> compania;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=findViewById(R.id.lsvPersonas);

        nombre=new ArrayList<String>();
        nombre.add("Alexander Pierrot");
        nombre.add("Carlos Lopez");
        nombre.add("Sara Bonz");
        nombre.add("Liliana Clarence");
        nombre.add("Benito Peralta");
        nombre.add("Juan Jaramillo");
        nombre.add("Christian Steps");
        nombre.add("Alexa Giraldo");
        nombre.add("Linda Murillo");
        nombre.add("Lizeth Astrada");
        nombre.add("Diego Ceron");

        cargo=new ArrayList<String>();
        cargo.add("CEO");
        cargo.add("Asistente");
        cargo.add("Directora de Marketing");
        cargo.add("Diseñadora de Producto");
        cargo.add("Supervisor de Ventas");
        cargo.add("CEO");
        cargo.add("CTO");
        cargo.add("Lead Programmer");
        cargo.add("Directora de Marketing");
        cargo.add("CEO");
        cargo.add("2516252019");

        compania=new ArrayList<String>();
        compania.add("Insures S.O");
        compania.add("Hospital Blue");
        compania.add("Electrical Parts ltd");
        compania.add("Creativa App");
        compania.add("Neumáticos Press");
        compania.add("Banco Nacional");
        compania.add("Cooperativa Verde");
        compania.add("Frutisofy");
        compania.add("Seguros Boli");
        compania.add("Concesionario Motolox");
        compania.add("UTEC");

        int [] pictures={
                R.drawable.lead_photo_1,
                R.drawable.lead_photo_2,
                R.drawable.lead_photo_3,
                R.drawable.lead_photo_4,
                R.drawable.lead_photo_5,
                R.drawable.lead_photo_6,
                R.drawable.lead_photo_7,
                R.drawable.lead_photo_8,
                R.drawable.lead_photo_9,
                R.drawable.lead_photo_10,
                R.drawable.diego2516252019
        };

        Adaptador adaptador = new Adaptador(this,R.layout.persona,nombre,cargo,compania,pictures);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Selecciono "+nombre.get(position),Toast.LENGTH_SHORT).show();
                Intent intento= new Intent(getApplicationContext(),MainActivityPerfil.class);

                intento.putExtra("nombre", nombre.get(position));
                intento.putExtra("cargo", cargo.get(position));
                intento.putExtra("compania", compania.get(position));
                intento.putExtra("imagen", pictures[position]);
                startActivity(intento);
            }
        });
    }
}
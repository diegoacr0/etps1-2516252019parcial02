package sv.edu.utec.diegoceron2516252019;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {
    Context contexto;
    int layout;
    List<String> nombre;
    List<String> cargo;
    List<String> compania;
    int[] imagenes;

    public Adaptador(Context contexto, int layout, List<String> nombre, List<String> cargo, List<String> compania, int[] imagenes) {
        this.contexto = contexto;
        this.layout = layout;
        this.nombre = nombre;
        this.cargo = cargo;
        this.compania = compania;
        this.imagenes = imagenes;
    }

    @Override
    public int getCount() {
        return nombre.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v =convertView;
        LayoutInflater layoutInflater= LayoutInflater.from(contexto);
        v=layoutInflater.inflate(R.layout.persona,null);
        TextView txtNombre=v.findViewById(R.id.tvNombre);
        txtNombre.setText(nombre.get(position));

        TextView txtCargo=v.findViewById(R.id.tvCargo);
        txtCargo.setText(cargo.get(position));

        TextView txtCompania=v.findViewById(R.id.tvCompania);
        txtCompania.setText(compania.get(position));

        ImageView img=v.findViewById(R.id.imvAvatar);
        img.setImageResource(imagenes[position]);
        return v;
    }
}

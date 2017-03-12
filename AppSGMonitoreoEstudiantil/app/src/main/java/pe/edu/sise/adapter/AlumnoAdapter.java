package pe.edu.sise.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pe.edu.sise.model.Alumno;
import pe.edu.sise.appsgmonitoreoestudiantil.R;

public class AlumnoAdapter extends RecyclerView.Adapter<AlumnoAdapter.ViewHolder> {

    private List<Alumno> alumnoList;
    private FragmentManager fragmentManager;

    private int colRed;
    private int colGreen;
    private int colyellow;

    public AlumnoAdapter(List<Alumno> alumnoList, FragmentManager fragmentManager) {
        this.alumnoList = alumnoList;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_alumno_recycler_view, parent, false);
        colRed = view.getResources().getColor(android.R.color.holo_red_dark);
        colGreen = view.getResources().getColor(android.R.color.holo_green_dark);
        colyellow = view.getResources().getColor(android.R.color.holo_blue_light);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Alumno alumno = this.alumnoList.get(position);

        holder.alum_row_tvi_alum.setText(alumno.getNombres() + " " + alumno.getApellidos());
        holder.alum_row_tvi_grado.setText(String.valueOf(alumno.getCodGrado()));
        holder.alum_row_tvi_periodo.setText(String.valueOf(alumno.getCodPeriodo()));
        holder.alum_row_tvi_valoracion.setText(String.valueOf(alumno.getCodGrado()));


        int val = alumno.getCodGrado();
        if (val > 4) {
//            holder.alum_row_tvi_valoracion.setTextColor(colGreen);
            holder.alum_row_tvi_valoracion.setBackgroundColor(colGreen);
        } else if (val > 2 && val <= 4) {
//            holder.alum_row_tvi_valoracion.setTextColor(colyellow);
            holder.alum_row_tvi_valoracion.setBackgroundColor(colyellow);
        } else if (val <= 2) {
//            holder.alum_row_tvi_valoracion.setTextColor(colRed);
            holder.alum_row_tvi_valoracion.setBackgroundColor(colRed);
        }


//            holder.alum_row_tvi_cant_act.setText("");
    }

    @Override
    public int getItemCount() {
        return this.alumnoList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView alum_row_imgv_foto;
        public TextView alum_row_tvi_alum;
        public TextView alum_row_tvi_grado;
        public TextView alum_row_tvi_periodo;
        public TextView alum_row_tvi_valoracion;
        public TextView alum_row_tvi_cant_act;

        public ViewHolder(View view) {
            super(view);

            alum_row_imgv_foto = (ImageView) view.findViewById(R.id.alum_row_imgv_foto);
            alum_row_tvi_alum = (TextView) view.findViewById(R.id.alum_row_tvi_alum);
            alum_row_tvi_grado = (TextView) view.findViewById(R.id.alum_row_tvi_grado);
            alum_row_tvi_periodo = (TextView) view.findViewById(R.id.alum_row_tvi_periodo);
            alum_row_tvi_valoracion = (TextView) view.findViewById(R.id.alum_row_tvi_valoracion);
            alum_row_tvi_cant_act = (TextView) view.findViewById(R.id.alum_row_tvi_cant_act);
        }
    }
}
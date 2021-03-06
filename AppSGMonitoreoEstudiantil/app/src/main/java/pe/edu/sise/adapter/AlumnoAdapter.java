package pe.edu.sise.adapter;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pe.edu.sise.appsgmonitoreoestudiantil.DetalleAlumnoActivity;
import pe.edu.sise.model.Alumno;
import pe.edu.sise.model.AlumnoTest;
import pe.edu.sise.appsgmonitoreoestudiantil.R;
import pe.edu.sise.utils.Attributes;

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
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Alumno alumno = this.alumnoList.get(position);

        holder.alum_row_tvi_alum.setText(alumno.getNomCompleto());
        holder.alum_row_tvi_grado.setText(String.valueOf(alumno.getCodGracdo()));
        holder.alum_row_tvi_seccion.setText(String.valueOf(alumno.getCodSeccion()));
        holder.alum_row_tvi_periodo.setText(String.valueOf(alumno.getPeriodo()));
        holder.alum_row_tvi_valoracion.setText(String.valueOf(alumno.getPromedioTotal()));
        holder.alum_row_tvi_cant_act.setText(String.valueOf(alumno.getCantAct()));
        // alumno.setId(position);
        //alumno.setTrimestre(1);
        holder.alum_row_cvi_selec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintt = new Intent(view.getContext(), DetalleAlumnoActivity.class);
                mintt.putExtra(Attributes.KEY_NOMBRE, alumno.getNombres());
                mintt.putExtra(Attributes.KEY_IDALUMNO, alumno.getId());
                mintt.putExtra(Attributes.KEY_PROMEDIO, alumno.getTrimestre());
                mintt.putExtra(Attributes.ACT_GPO_ACADEMICO, String.valueOf(alumno.getCodGracdo()) + alumno.getCodSeccion() + String.valueOf(alumno.getAnio()));
                view.getContext().startActivity(mintt);
            }
        });

        int val = alumno.getPromedioTotal();
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
        public TextView alum_row_tvi_seccion;
        public TextView alum_row_tvi_periodo;
        public TextView alum_row_tvi_valoracion;
        public TextView alum_row_tvi_cant_act;
        public CardView alum_row_cvi_selec;

        public ViewHolder(View view) {
            super(view);

            alum_row_imgv_foto = (ImageView) view.findViewById(R.id.alum_row_imgv_foto);
            alum_row_tvi_alum = (TextView) view.findViewById(R.id.alum_row_tvi_alum);
            alum_row_tvi_grado = (TextView) view.findViewById(R.id.alum_row_tvi_grado);
            alum_row_tvi_seccion = (TextView) view.findViewById(R.id.alum_row_tvi_seccion);
            alum_row_tvi_periodo = (TextView) view.findViewById(R.id.alum_row_tvi_periodo);
            alum_row_tvi_valoracion = (TextView) view.findViewById(R.id.alum_row_tvi_valoracion);
            alum_row_tvi_cant_act = (TextView) view.findViewById(R.id.alum_row_tvi_cant_act);
            alum_row_cvi_selec = (CardView) view.findViewById(R.id.alum_row_cvi_selec);
        }
    }
}

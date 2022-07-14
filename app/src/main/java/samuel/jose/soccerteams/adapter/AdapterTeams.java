package samuel.jose.soccerteams.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import samuel.jose.soccerteams.R;
import samuel.jose.soccerteams.model.SoccerTeam;

public class AdapterTeams extends RecyclerView.Adapter<AdapterTeams.MyViewHolder> {

    private List<SoccerTeam> listTeams;

    public AdapterTeams(List<SoccerTeam> list) {
        this.listTeams = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, city, state;
        ImageView img;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.textViewName);
            city = view.findViewById(R.id.textViewCity);
            state = view.findViewById(R.id.textViewState);
            img = view.findViewById(R.id.imageViewHero);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list_teams, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SoccerTeam obj = listTeams.get(position);
        holder.name.setText(obj.getName());
        holder.city.setText(obj.getCity());
        holder.state.setText(obj.getState());
        holder.img.setImageResource(obj.getImg());
    }

    @Override
    public int getItemCount() {
        return listTeams.size();
    }
}

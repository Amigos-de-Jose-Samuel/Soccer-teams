package samuel.jose.soccerteams.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import samuel.jose.soccerteams.DetailActivity;
import samuel.jose.soccerteams.R;
import samuel.jose.soccerteams.RecyclerItemClickListener;
import samuel.jose.soccerteams.adapter.AdapterTeams;
import samuel.jose.soccerteams.model.SoccerTeam;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewTeams;
    private List<SoccerTeam> listTeams = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = this;

        recyclerViewTeams = findViewById(R.id.recyclerViewTeams);

        this.createTeam();
        AdapterTeams adapter = new AdapterTeams(listTeams);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewTeams.setLayoutManager(layoutManager);
        recyclerViewTeams.setHasFixedSize(true);
        recyclerViewTeams.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerViewTeams.setAdapter(adapter);
        recyclerViewTeams.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerViewTeams,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                SoccerTeam obj = listTeams.get(position);

                                Intent it = new Intent(context, DetailActivity.class);
                                //it.putExtra("team", (Serializable) listTeams.get(position));
                                it.putExtra("nome", obj.getName());
                                it.putExtra("image", obj.getImg());
                                it.putExtra("cidade", obj.getCity());
                                it.putExtra("historia", obj.getHistory());
                                it.putExtra("estado", obj.getState());
                                startActivity(it);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );
    }

    public void createTeam() {
        SoccerTeam obj = new SoccerTeam("PSG", "Paris", "??le-de-France", "O PSG venceu sete vezes o campeonato franc??s (1985???86, 1993???94, 2012???13, 2013???14, 2014???15, 2015???16, 2017???18) e 12 vezes a Ta??a de Fran??a. Internacionalmente, o PSG conquistou uma Ta??a dos Clubes Vencedores de Ta??as em 1995-96. Como principal rival, o Paris Saint-Germain tem o Olympique de Marseille.", R.drawable.psg);
        listTeams.add(obj);
        obj = new SoccerTeam("Atl??tico Paranaense", "Curitiba", "Paran??", "Ta??a Campeonato Brasileiro 1 t??tulo 2001.\n" +
                "Ta??a Campeonato Brasileiro - S??rie B 1 t??tulo 1995.\n" +
                "Ta??a Supercampeonato Paranaense 1 t??tulo 2002.\n" +
                "Ta??a Campeonato Paranaense 21 t??tulos 1925, 1929, 1930, 1934, 1936, 1940, 1943 1945, 1949, 1958, 1970, 1982, 1983, 1985 1988, 1990, 1998, 2000, 2001, 2005 e 2009.", R.drawable.cap);
        listTeams.add(obj);
        obj = new SoccerTeam("Paran?? Clube", "Curitiba", "Paran??", "O Paran?? Clube nasceu da fus??o do Colorado Esporte Clube e do Esporte Clube Pinheiros em 1989 e o resultado dela foi o sucesso do clube que nos primeiros dez anos de vida, pois venceu seis vezes o Campeonato Paranaense de Futebol.", R.drawable.parana);
        listTeams.add(obj);
        obj = new SoccerTeam("Coritiba F.C.", "Curitiba", "Paran??", "Foi o primeiro clube do futebol paranaense a conquistar o Campeonato Brasileiro, em 1985, quebrando a hegemonia de equipes de S??o Paulo, Rio de Janeiro, Rio Grande do Sul e Minas Gerais que perdurava desde 1960. Al??m desse t??tulo, o Coritiba soma 39 campeonatos paranaenses, sendo o atual recordista de ta??as na hist??ria da principal competi????o estadual e o detentor de um hexacampeonato no estado, sequ??ncia de 1971 at?? 1976, vice-campe??o em 1977, seria campe??o de novo em 1978 e 1979, conquistando tamb??m nesse per??odo de nove anos o Torneio do Povo de 1973, um total de nove t??tulos. Possui tamb??m 2 vice-campeonatos na Copa do Brasil, em 2011 e 2012, al??m de 2 Campeonatos Brasileiros da s??rie B, conquistados em 2007 e 2010.", R.drawable.coritiba);
        listTeams.add(obj);
    }
}
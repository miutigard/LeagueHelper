package no.mobilprog.hiof.leaguehelper.championscreen


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.hiof.leaguehelper.ChampionAdapter
import no.mobilprog.hiof.leaguehelper.model.Champion
import no.mobilprog.hiof.leaguehelper.R

class ChampionFragment : Fragment() {
    private val championList : List<Champion> = Champion.getChampion()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_champions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val championRecyclerView = view.findViewById<RecyclerView>(R.id.championRecyclerView)

        championRecyclerView.adapter = ChampionAdapter(championList) {
            // Gets the position of the item that's clicked
            val position = championRecyclerView.getChildAdapterPosition(it)

            // Gets the movie based on which item got clicked
            val clickedChampion = championList[position]

            // Creates a toast with the movie that got clicked
            Toast.makeText(view.context, clickedChampion.name + " clicked", Toast.LENGTH_SHORT).show()
        }

        // Sets the layoutmanager we want to use
        championRecyclerView.layoutManager = GridLayoutManager(context, 3)
    }
}

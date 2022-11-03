package no.mobilprog.hiof.leaguehelper

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.hiof.leaguehelper.model.Champion

class ChampionAdapter(private val items: List<Champion>, private val clickListener: View.OnClickListener) : RecyclerView.Adapter<ChampionAdapter.ChampionViewHolder>() {

    // Called when there's a need for a new ViewHolder (a new item in the list/grid)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChampionViewHolder {
        // Log so we can see when the onCreateViewHolder method is called
        Log.d("ChampionAdapter", "Creating View")

        // Inflates the movie_list_item.xml to a view for us
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.champion_list_item, parent, false)

        // Create the viewholder with the corresponding view (list item)
        return ChampionViewHolder(itemView)
    }

    // Called when data is bound to a specific ViewHolder (and item in the list/grid)
    override fun onBindViewHolder(holder: ChampionViewHolder, position: Int) {
        val currentChampion = items[position]

        holder.bind(currentChampion, clickListener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ChampionViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Gets a reference to all the specific views we are going to use or fill with data
        private val championIconImageView : ImageView = view.findViewById(R.id.championIconImageView)
        private val championNameTextView : TextView = view.findViewById(R.id.championNameTextView)

        fun bind(item: Champion, clickListener: View.OnClickListener) {
            // Fills the views with the given data
            championIconImageView.setImageResource(item.iconUrl)
            championNameTextView.text = item.name

            // Sets the onClickListener
            itemView.setOnClickListener(clickListener)
        }
    }
}
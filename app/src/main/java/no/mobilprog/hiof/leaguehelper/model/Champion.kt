package no.mobilprog.hiof.leaguehelper.model

import no.mobilprog.hiof.leaguehelper.R


data class Champion(val uid : Int, var name : String, var winrate : Double, var iconUrl : Int) {

    companion object {
        fun getChampion() : List<Champion> {
            return listOf(
                Champion(0, "Ahri", 50.0, R.drawable.ahri),
                Champion(1, "Aphelios", 50.0, R.drawable.aphelios),
                Champion(2, "Bard", 50.0, R.drawable.bard),
                Champion(3, "Braum", 50.0, R.drawable.braum),
                Champion(4, "Draven", 50.0, R.drawable.draven),
                Champion(5, "Gnar", 50.0, R.drawable.gnar),
                Champion(6, "Graves", 50.0, R.drawable.graves),
                Champion(7, "Jinx", 50.0, R.drawable.jinx),
                Champion(8, "Lucian", 50.0, R.drawable.lucian),
                Champion(9, "Olaf", 50.0, R.drawable.olaf),
                Champion(10, "Rakan", 50.0, R.drawable.rakan),
                Champion(11, "Sett", 50.0, R.drawable.sett),
                Champion(12, "Sona", 50.0, R.drawable.sona),
                Champion(13, "Syndra", 50.0, R.drawable.syndra),
                Champion(14, "Thresh", 50.0, R.drawable.thresh),
                Champion(15, "Vex", 50.0, R.drawable.vex),
                Champion(16, "Xayah", 50.0, R.drawable.xayah),
                Champion(17, "Yuumi", 50.0, R.drawable.yuumi),
            )
        }
    }

}
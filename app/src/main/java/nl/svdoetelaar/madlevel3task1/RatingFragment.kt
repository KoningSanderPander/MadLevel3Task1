package nl.svdoetelaar.madlevel3task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.rating_fragment.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class RatingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.rating_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnToSummary).setOnClickListener {
            findNavController().navigate(R.id.action_ratingFragment_to_startFragment)
        }

        showRandomAssessableGame()
    }

    private fun showRandomAssessableGame() {
        val randomGame = listOf(
            "Horizon zero dawn",
            "Minecraft dungeons",
            "Bleeding edge",
            "Half-Life: Alyx",
            "Doom Eternal",
            "Call of Duty: Warzone",
            "HALO: Combat Evolved Anniversary",
            "Temtem",
            "Monster Hunter World: Iceborn"
        ).random()

        tvNameGame.text = randomGame
    }
}
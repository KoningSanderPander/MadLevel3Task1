package nl.svdoetelaar.madlevel3task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_summary.*
import kotlinx.android.synthetic.main.rating_fragment.*

const val ARG_GAME_NAME = "arg_game_name"
const val ARG_GAME_RATING = "arg_game_rating"

class SummaryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_summary, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvSummary.text = String.format(
            "You rated %s with %.1f stars! Thanks?",
            arguments?.getString(ARG_GAME_NAME),
            arguments?.getFloat(ARG_GAME_RATING)
        )

        btnStartOver.setOnClickListener {
            findNavController()
                .navigate(R.id.action_SummaryFragment_to_StartFragment)
        }
    }

}

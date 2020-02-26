package org.d3ifcool.praassessment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_menu.*

/**
 * A simple [Fragment] subclass.
 */
class Menu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: MenuFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_menu, container, false)
        binding.persegi.setOnClickListener{ v : View -> v.findNavController().navigate(MenuFragmentDirections).actionMenuFragmentToPanjangPersegiFragment()}
        binding.persegi.setOnClickListener{ v : View -> v.findNavController().navigate(MenuFragmentDirections).actionMenuFragmentToSegitigaFragment()}
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)

        setHasOptionsMenu(true)

    }

}

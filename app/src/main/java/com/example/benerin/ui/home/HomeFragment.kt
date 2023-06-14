package com.example.benerin.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.benerin.R
import com.example.benerin.adapter.BengkelAdapter
import com.example.benerin.data.Bengkel
import com.example.benerin.databinding.FragmentHomeBinding
import com.example.benerin.ui.dashboard.DashboardFragment

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.rvBengkel.layoutManager = LinearLayoutManager(activity)
        homeViewModel.getDataBengkel()
        homeViewModel.dataBengkel.observe(viewLifecycleOwner){
            setBengkelData(it)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setBengkelData(listBengkel : List<Bengkel>){
        binding.rvBengkel.adapter = BengkelAdapter(listBengkel)
    }
}
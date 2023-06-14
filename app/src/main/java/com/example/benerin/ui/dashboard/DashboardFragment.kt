package com.example.benerin.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.benerin.adapter.BengkelAdapter
import com.example.benerin.adapter.ServiceAdapter
import com.example.benerin.data.Bengkel
import com.example.benerin.data.ServiceKendaraan
import com.example.benerin.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.rvBengkel.layoutManager = LinearLayoutManager(activity)
        dashboardViewModel.getDataBengkel()
        dashboardViewModel.dataService.observe(viewLifecycleOwner){
            setBengkelData(it)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setBengkelData(listService : List<ServiceKendaraan>){
        binding.rvBengkel.adapter = ServiceAdapter(listService)
    }
}
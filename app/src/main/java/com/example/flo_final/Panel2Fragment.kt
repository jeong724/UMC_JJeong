package com.example.flo_final

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.flo_final.databinding.FragmentPanel2Binding

class Panel2Fragment : Fragment() {

    lateinit var binding: FragmentPanel2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentPanel2Binding.inflate(inflater, container, false)
        return binding.root
    }
}
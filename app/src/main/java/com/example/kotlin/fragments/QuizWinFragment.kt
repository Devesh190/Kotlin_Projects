package com.example.kotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.kotlin.R
import com.example.kotlin.databinding.FragmentHomeBinding
import com.example.kotlin.databinding.FragmentQuizWinBinding

class QuizWinFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentQuizWinBinding>(inflater,R.layout.fragment_quiz_win,container,false)
        binding.mbRetake.setOnClickListener {
            it.findNavController().navigate(R.id.action_quizWinFragment_to_quizFragment)
        }
        return binding.root
    }

}
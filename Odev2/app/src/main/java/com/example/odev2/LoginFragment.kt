package com.example.odev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.odev2.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var fragmentLoginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentLoginBinding = FragmentLoginBinding.inflate(layoutInflater)
        return fragmentLoginBinding.root
    }

    /**
     * forwardButton LoginFragment'dan MainFragment'a geçiş sağlanıyor.
     * backQueue.clear() gerideki sırayı temizliyor.
     * @param view
     * @param savedInstanceState
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentLoginBinding.apply {
            forwardButton.setOnClickListener {
                findNavController().apply {
                    navigate(R.id.action_login_graph_to_main_graph)
                    backQueue.clear()
                }
            }
        }
    }
}

package com.gmail.alinkahomyak

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class ContactListFragment : Fragment(R.layout.contact_list_fragment) {
    companion object {
        private const val TEST_NAME = "Maxim"
        private const val TEST_NUMBER = "79991900233"

        fun newInstance() = ContactListFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.contacts)
        view.findViewById<TextView>(R.id.listTextViewContact).text = TEST_NAME
        view.findViewById<TextView>(R.id.listTextViewNumber).text = TEST_NUMBER
        view.findViewById<View>(R.id.contact).setOnClickListener {
            (requireActivity() as? PersonClickedListener)?.onItemClick(1)
        }
    }
}
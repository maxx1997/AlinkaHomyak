package com.gmail.alinkahomyak

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class ContactDetailFragment : Fragment(R.layout.contact_detail_fragment) {
    companion object {
        private const val TEST_NAME = "Maxim"
        private const val TEST_NUMBER = "79991900233"
        private const val TEST_NUMBER2 = "79603601514"
        private const val TEST_EMAIL1 = "Alinkahomyak@gmail.com"
        private const val TEST_EMAIL2 = "Alinkahomyak2@gmail.com"
        private const val TEST_DESC = "На данный момент находится на 39 месте по популярности в мире." +
                " Ресурс был создан с целью общения выпускников вузов в России"

        private const val PERSON_ID = "PERSON_ID"

        fun newInstance(personId: Int) = ContactDetailFragment().apply {
            arguments = bundleOf(PERSON_ID to personId)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.details)
        view.findViewById<TextView>(R.id.tvName).text = TEST_NAME
        view.findViewById<TextView>(R.id.tvNumber).text = TEST_NUMBER
        view.findViewById<TextView>(R.id.tvNumber2).text = TEST_NUMBER2
        view.findViewById<TextView>(R.id.email).text = TEST_EMAIL1
        view.findViewById<TextView>(R.id.email2).text = TEST_EMAIL2
        view.findViewById<TextView>(R.id.tvDescription).text = TEST_DESC
        val personId =  requireArguments().getInt(PERSON_ID)
    }
}
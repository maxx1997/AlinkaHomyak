package com.gmail.alinkahomyak

import android.os.Bundle
import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class ContactListFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val contactListFragment = inflater.inflate(R.layout.contact_list_fragment, container, false)
        val bundle = Bundle()
        bundle.putInt("idContact",id)
        ContactDetailFragment().arguments
        Log.i(bundle.toString(), "priv")
        return contactListFragment


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.contacts)





        view.setOnClickListener {
            fragmentManager!!.beginTransaction()
                    .addToBackStack(null)
                    .replace(R.id.fragmentContainer, ContactDetailFragment())
                    .commit()
        }
    }
}

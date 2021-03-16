package com.gmail.alinkahomyak
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class ContactDetailFragment: Fragment() {
    fun newInstance(id: Int) =  ContactDetailFragment().apply {
        val bundle = Bundle()
        arguments = bundle
        bundle.getInt("idContact", id)
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        newInstance(id)
        return    inflater.inflate(R.layout.contact_detail_fragment, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.details)

    }


}





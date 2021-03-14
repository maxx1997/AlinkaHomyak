package com.gmail.alinkahomyak
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class ContactDetailFragment: Fragment() {
    companion object{
        fun getFragID(args:Bundle?):ContactDetailFragment{
            val contactDetailFragment = ContactDetailFragment()
            contactDetailFragment.arguments = args
            return contactDetailFragment
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.contact_detail_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.details)

    }

}





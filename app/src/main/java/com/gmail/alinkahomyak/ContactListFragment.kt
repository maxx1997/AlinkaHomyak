package com.gmail.alinkahomyak
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class ContactListFragment: Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.contact_list_fragment, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.contacts)



        view.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("idContact" , R.id.Contact1)
            ContactDetailFragment.getFragID(args = Bundle())
            Log.i(bundle.toString(),"передали")
            fragmentManager?.
        beginTransaction()
                ?.addToBackStack(null)
                ?.replace(R.id.fragmentContainer, ContactDetailFragment())
                ?.commit()
        }
    }
}

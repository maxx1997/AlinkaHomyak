package com.gmail.alinkahomyak
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class ContactListFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val listFragment = inflater.inflate(R.layout.contact_list_fragment,container,false);
        (activity as AppCompatActivity).supportActionBar?.title = "Список контактов"
        return listFragment;

    }

}
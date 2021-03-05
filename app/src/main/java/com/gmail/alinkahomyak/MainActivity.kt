package com.gmail.alinkahomyak

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), PersonClickedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            addFragmentList()
        }
    }

    private fun addFragmentList() {
        val contactListFragment = ContactListFragment.newInstance()
        supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, contactListFragment)
                .commit()
    }

    override fun onItemClick(personId: Int) {
        val contactDetailFragment = ContactDetailFragment.newInstance(personId)
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainer, contactDetailFragment)
                .addToBackStack(ContactDetailFragment::class.java.simpleName)
                .commit()
    }
}
package com.gmail.alinkahomyak
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val toolbar = findViewById<View>(R.id.activityToolbar) as Toolbar
        setSupportActionBar(toolbar)

        if (savedInstanceState == null) {
            val contactListFragment = ContactListFragment()
            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction
                    .add(R.id.dataContainer, contactListFragment)
            fragmentTransaction
                    .commit()
        }


    }

        fun onclickListFragment(view: View) {
            val contactDetailFragment = ContactDetailFragment()
            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
                    .addToBackStack(null)
            fragmentTransaction
                    .replace(R.id.dataContainer, contactDetailFragment)
            fragmentTransaction
                    .commit()
        }
    }



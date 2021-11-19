package com.juandomingo.mypharmamemory.ui.view

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.juandomingo.mypharmamemory.R
import com.juandomingo.mypharmamemory.databinding.ActivityAppHomeBinding


class AppHomeActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityAppHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.fragment_app_home) // -> fragment.xml o activity.xml ??
        binding = ActivityAppHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //val toolbarAppHome: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar_app_home)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)

        setSupportActionBar(findViewById(R.id.toolbar_app_home))
        val toogle = ActionBarDrawerToggle(this, drawerLayout ,R.string.open,R.string.close)
        toogle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

    }
}
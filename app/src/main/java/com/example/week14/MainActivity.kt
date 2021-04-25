package com.example.week14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var toogle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom()

        toogle = ActionBarDrawerToggle(this,drawerlayout,R.string.Open,R.string.close)
        drawerlayout.addDrawerListener(toogle)
        toogle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        layoutview.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.id_pw-> Toast.makeText(this,"Pesan Web Terklik",Toast.LENGTH_SHORT).show()
                R.id.id_grup-> Toast.makeText(this,"Group Terklik",Toast.LENGTH_SHORT).show()
                R.id.id_setelan-> Toast.makeText(this,"Setelan Terklik",Toast.LENGTH_SHORT).show()
                R.id.id_bagikan-> Toast.makeText(this,"Bagikan Terklik",Toast.LENGTH_SHORT).show()

                R.id.favorite-> Toast.makeText(this,"Favorite Terklik",Toast.LENGTH_SHORT).show()
                R.id.id_bantuan-> Toast.makeText(this,"Bantuan Dan Saran Terklik", Toast.LENGTH_SHORT).show()
            }
            true
        }

    }
    private fun bottom(){
        btm_nav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.id_chat ->setfragment(Fragment_chat())
                R.id.id_grup -> setfragment(Fragment_grup())
            }
            true

        }
    }
    private fun setfragment(fragment : Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame,fragment)
            .commit()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toogle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
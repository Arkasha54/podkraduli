package com.example.menudaimne

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.menudaimne.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        supportActionBar?.title = "Main menu"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //if (item.itemId == android.R.id.home) finish()
        when (item.itemId){
            android.R.id.home -> finish()
            R.id.mkef -> {
                showToast(1, "КЭФТЭМЕЕЕЕ")
            }
            R.id.mpodkrad -> {
                showToast(1, "ЖИЕС МАГА ЧО ЗА ПОДКРАДУЛИ")
            }
            R.id.mbarhat -> {
                showToast(2, "БАРХАТНЫЕ ТЯГИ")
            }
            R.id.mmay -> {
                showToast(2, "Мяу")
            }
        }
        return true
    }
    fun showToast(id: Int, text: String){
        var toast: Toast
        var image: Image

        when(id){
            1 -> {Toast.makeText(this, text, Toast.LENGTH_SHORT).show()}
            2 -> {
                toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER, 0, 30)
                toast.show()
            }

        }
    }
}
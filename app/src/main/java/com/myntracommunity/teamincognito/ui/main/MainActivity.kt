//Jai Siya Ram
package com.myntracommunity.teamincognito.ui.main



import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.myntracommunity.teamincognito.R


class MainActivity : AppCompatActivity() {




    private val navListener =

            BottomNavigationView.OnNavigationItemSelectedListener { item: MenuItem ->
                var selectedFragment: Fragment? = null
                when (item.itemId) {
                    R.id.nav_home -> selectedFragment = HomeFragment()
                    R.id.nav_features -> selectedFragment = FeaturesFragment()

                    R.id.nav_profile -> selectedFragment = ProfileFragment()
                    R.id.nav_feed -> selectedFragment = PostFragment()
                    R.id.nav_product -> selectedFragment = CategoriesFragment()
                }



                supportFragmentManager.beginTransaction().replace(
                        R.id.fragment_container,
                        selectedFragment!!
                ).commit()
                true
            }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      



    /*

        //button to next activity
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

 */


            val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
            bottomNav.setOnNavigationItemSelectedListener(navListener)
            val pref = getPreferences(MODE_PRIVATE)
        }




override fun onOptionsItemSelected(item: MenuItem): Boolean {
    when (item.itemId) {
        R.id.nav_search -> {
            return true
        }
        R.id.nav_wishlist -> {
            return true
        }
        R.id.nav_cart -> {
            return true
        }
    }
    return super.onOptionsItemSelected(item)
}

override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    val inflater = menuInflater
    if (menu != null)
        inflater.inflate(R.menu.menu_home, menu)
    return true
}
}

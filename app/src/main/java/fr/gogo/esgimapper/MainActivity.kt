package fr.gogo.esgimapper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.FrameLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import fr.gogo.esgimapper.R.id.btnSearch1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = this.findViewById<Button>(R.id.btnSearch1)

        /*btn.setOnClickListener{
            val intent = Intent(this,ResultActivity::class.java)
            startActivity(intent)
        }*/

        btn.setOnClickListener {
            Log.d("Test","Benji")
            val intent = Intent(this,ResultActivity::class.java)
            startActivity(intent)
        }

        var sheet = this.findViewById<FrameLayout>(R.id.sheet)

       /* BottomSheetBehavior.from(sheet).apply {
        peekHeight=300
        this.state=BottomSheetBehavior.STATE_EXPANDED
        }*/
}


}
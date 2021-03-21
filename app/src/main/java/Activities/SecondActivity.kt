package Activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.secondactivity.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondactivity)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("User_Message")
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()

        tvUserMessage.text = msg
    }
}

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.Email
import com.example.gmail.R
import com.example.gmail.adapters.EmailAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var emailAdapter: EmailAdapter
    private lateinit var emailList: ArrayList<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Dữ liệu mẫu
        emailList = ArrayList()
        emailList.add(Email("Alice", "Meeting Reminder", "Don't forget our meeting tomorrow at 10 AM."))
        emailList.add(Email("Bob", "Project Update", "The project is on track for completion."))
        emailList.add(Email("Charlie", "Weekly Report", "Please find attached the weekly report."))

        emailAdapter = EmailAdapter(emailList)
        recyclerView.adapter = emailAdapter
    }
}

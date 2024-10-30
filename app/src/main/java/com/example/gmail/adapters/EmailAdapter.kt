package com.example.gmail.adapters  // Thay đổi tên package theo tên của bạn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.Email
import com.example.gmail.R

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewSender: TextView = itemView.findViewById(R.id.textViewSender)
        val textViewSubject: TextView = itemView.findViewById(R.id.textViewSubject)
        val textViewSnippet: TextView = itemView.findViewById(R.id.textViewSnippet)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.textViewSender.text = email.sender
        holder.textViewSubject.text = email.subject
        holder.textViewSnippet.text = email.snippet
    }

    override fun getItemCount() = emailList.size
}

package com.example.newsapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.LoginActivity
import com.example.newsapp.R
import com.example.newsapp.firebase.User

class ContactsAdapter(val context: Context,val  userList: ArrayList<User>):RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val view: View =LayoutInflater.from(context).inflate(R.layout.users_contacts,parent,false)
        return  ContactsViewHolder(view)

    }



    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val currentUser=userList[position]
        holder.textName.text=currentUser.name

        holder.textName.setOnClickListener {
            //launch  the chats activity to send messages to the selected user


        }


    }

    override fun getItemCount(): Int {
        return  userList.size
    }


    class ContactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        //map the container in  the user contacts
        var textName=itemView.findViewById<Button>(R.id.textContact)


    }


}
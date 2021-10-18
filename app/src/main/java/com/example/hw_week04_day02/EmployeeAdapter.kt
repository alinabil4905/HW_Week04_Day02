package com.example.hw_week04_day02

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter (val employees:List<CardDataModle>): RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item_layout_view=
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)


        Log.d("EmployeeAdapter","onCreateViewHolder()Called")
        return ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("EmployeeAdapter","onBindViewHolder()Called position : $position")
        holder.fullName.text=employees[position].fullName

        holder.img.setImageResource(employees[position].img)

    }

    override fun getItemCount(): Int {
        return employees.size
    }


}
class ViewHolder(view: View): RecyclerView.ViewHolder(view){
    val fullName: TextView =view.findViewById(R.id.fullname)
    val img: ImageView =view.findViewById(R.id.emp_img)
}

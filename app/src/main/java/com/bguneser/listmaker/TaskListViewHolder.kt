package com.bguneser.listmaker

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

    var taskTextView = itemView?.findViewById<TextView>(R.id.taskview_task) as TextView
}
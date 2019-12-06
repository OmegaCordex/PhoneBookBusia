package com.example.phonebook.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.phonebook.AnimationUtil
import com.example.phonebook.R

class RecAdapterCU(val array: Array<String>) : RecyclerView.Adapter<RecAdapterCU.ViewHolder>() {

    var previousPosition: Int = 0

    private var mListener: OnItemClickListener? = null

    interface OnItemClickListener {

        fun onItemClick(v: View, position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {

        mListener = listener

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.cu_card, parent, false)

        return ViewHolder(view, mListener)

    }

    override fun getItemCount(): Int {

        return array.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tvCU.text = array[position]


        if (position > previousPosition) {

            AnimationUtil.animate(holder, true)


        } else {

            AnimationUtil.animate(holder, false)

        }

        previousPosition = position

    }

    class ViewHolder(itemView: View, listener: OnItemClickListener?) : RecyclerView.ViewHolder(itemView) {

        init {
            itemView.setOnClickListener {

                if (listener!=null){

                    val position = adapterPosition

                    if (position!= RecyclerView.NO_POSITION){

                        listener.onItemClick(itemView, position)

                    }

                }
            }
        }

        val tvCU = itemView.findViewById<TextView>(R.id.textViewCU)


    }


}
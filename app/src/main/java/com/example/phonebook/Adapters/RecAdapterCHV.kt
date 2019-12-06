package com.example.phonebook.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.phonebook.AnimationUtil
import com.example.phonebook.R

class RecAdapterCHV(var arrayName: Array<String>, var arrayNum: Array<String>) :
    RecyclerView.Adapter<RecAdapterCHV.ViewHolder>() {

    var previousPosition: Int = 0

    private var mListener: OnItemClickListener? = null

    interface OnItemClickListener {

        fun onItemClick(view: View, position: Int)

    }

    fun setOnItemClickListener(listener: OnItemClickListener) {

        mListener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.chv_card, parent, false)

        return ViewHolder(view, mListener)

    }

    override fun getItemCount(): Int {

        return arrayName.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tvCHVname.text = arrayName[position]
        holder.tvCHVnum.text = arrayNum[position]


        if (position > previousPosition) {

            AnimationUtil.animate(holder, true)


        } else {

            AnimationUtil.animate(holder, false)

        }

        previousPosition = position

    }

    class ViewHolder(itemView: View, listener: OnItemClickListener?) :
        RecyclerView.ViewHolder(itemView) {

        var tvCHVname = itemView.findViewById<TextView>(R.id.textCHVname)
        var tvCHVnum = itemView.findViewById<TextView>(R.id.textCHVphone)

        init {

            itemView.setOnClickListener {

                if (listener != null) {

                    val position = adapterPosition

                    if (position != RecyclerView.NO_POSITION) {

                        listener.onItemClick(itemView, position)

                    }

                }

            }


        }

    }
}
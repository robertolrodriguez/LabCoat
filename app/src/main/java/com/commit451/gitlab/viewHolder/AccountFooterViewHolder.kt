package com.commit451.gitlab.viewHolder

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import com.commit451.gitlab.R

/**
 * Shows the "add account" button
 */
class AccountFooterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    companion object {

        fun inflate(parent: ViewGroup): AccountFooterViewHolder {
            val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.footer_account, parent, false)
            return AccountFooterViewHolder(view)
        }
    }

    init {
        ButterKnife.bind(this, view)
    }
}

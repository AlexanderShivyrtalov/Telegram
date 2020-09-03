package com.example.telegram.ui.message_recycler_view.view_holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram.database.CURRENT_UID
import com.example.telegram.ui.message_recycler_view.views.MessageView
import com.example.telegram.utilits.asTime
import com.example.telegram.utilits.downloadAndSetImage
import kotlinx.android.synthetic.main.message_item_image.view.*

class HolderImageMessage(view: View) : RecyclerView.ViewHolder(view), MessageHolder {
    //Message image:
    private val blockReceivedImageMessage: ConstraintLayout = view.block_received_image_message
    private val blockUserImageMessage: ConstraintLayout = view.block_user_image_message
    private val chatUserImage: ImageView = view.chat_user_image
    private val chatReceivedImage: ImageView = view.chat_received_image
    private val chatUserImageMessageTime: TextView = view.chat_user_image_message_time
    private val chatReceivedImageMessageTime: TextView = view.chat_received_image_message_time


    override fun drawMessage(view: MessageView) {
        if (view.from == CURRENT_UID) {
            blockUserImageMessage.visibility = View.VISIBLE
            blockReceivedImageMessage.visibility = View.GONE
            chatUserImage.downloadAndSetImage(view.fileUrl)
            chatUserImageMessageTime.text =
                view.timeStamp.asTime()
        } else {
            blockUserImageMessage.visibility = View.GONE
            blockReceivedImageMessage.visibility = View.VISIBLE
            chatReceivedImage.downloadAndSetImage(view.fileUrl)
            chatReceivedImageMessageTime.text =
                view.timeStamp.asTime()
        }
    }

    override fun onAttach(view: MessageView) {

    }

    override fun onDetach() {

    }
}
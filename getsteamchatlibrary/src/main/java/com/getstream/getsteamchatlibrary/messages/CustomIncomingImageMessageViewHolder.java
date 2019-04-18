package com.getstream.getsteamchatlibrary.messages;

import android.view.View;

import com.getstream.getsteamchatlibrary.Message;
import com.getstream.getsteamchatlibrary.R;
import com.stfalcon.chatkit.messages.MessageHolders;

/*
 * Created by troy379 on 05.04.17.
 */
public class CustomIncomingImageMessageViewHolder
        extends MessageHolders.IncomingImageMessageViewHolder<Message> {

    private View onlineIndicator;

    public CustomIncomingImageMessageViewHolder(View itemView, Object payload) {
        super(itemView, payload);
        onlineIndicator = itemView.findViewById(R.id.onlineIndicator);
    }

    @Override
    public void onBind(Message message) {
        super.onBind(message);

        boolean isOnline = message.getUser().isOnline();
        if (isOnline) {
            onlineIndicator.setBackgroundResource(R.drawable.shape_bubble_online);
        } else {
            onlineIndicator.setBackgroundResource(R.drawable.shape_bubble_offline);
        }
    }
}
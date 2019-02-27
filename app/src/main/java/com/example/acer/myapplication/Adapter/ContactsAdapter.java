package com.example.acer.myapplication.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.acer.myapplication.Modals.Contact;
import com.example.acer.myapplication.R;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder >{

    public List<Contact>mContact;

    public ContactsAdapter(List<Contact> mContact) {
        this.mContact = mContact;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // menghubungkan item contact.xml ke adapter
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.activity_contact, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsAdapter.ViewHolder viewHolder, int i) {
        // menghubungkan / mensetting nilai masing-masing item
        Contact itemContact = mContact.get(i);
        TextView textView = viewHolder.nameTextView;
        textView.setText(itemContact.getmNama());

        Button buttonContact = viewHolder.messageButton;
        buttonContact.setText(itemContact.getmOnline()? "Message" : "Offline");
        buttonContact.setEnabled(itemContact.getmOnline());


    }

    @Override
    public int getItemCount() {

        return mContact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nameTextView;
        public Button messageButton;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            nameTextView = itemView.findViewById(R.id.contact_name);
            messageButton = itemView.findViewById(R.id.message_button);
        }
    }
}
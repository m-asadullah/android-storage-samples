package com.opentry.android_storage_samples.sharingshortcuts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.opentry.android_storage_samples.R;

/**
 * The dialog for selecting a contact to share the text with. This dialog is shown when the user
 * taps on this sample's icon rather than any of the Direct Share contacts.
 */
public class SelectContactActivity extends Activity {

    /**
     * The action string for Intents.
     */
    public static final String ACTION_SELECT_CONTACT =
            "com.opentry.android_storage_samples.intent.action.SELECT_CONTACT";
    private final RecyclerView.Adapter mContactAdapter =
            new RecyclerView.Adapter<ContactViewHolder>() {

                @NonNull
                @Override
                public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                            int viewType) {
                    TextView textView = (TextView) LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.item_contact, parent, false);
                    return new ContactViewHolder(textView);
                }

                @Override
                public void onBindViewHolder(@NonNull ContactViewHolder holder, final int position) {
                    Contact contact = Contact.CONTACTS[position];
                    ContactViewBinder.bind(contact, (TextView) holder.itemView);
                    holder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent data = new Intent();
                            data.putExtra(Contact.ID, position);
                            setResult(RESULT_OK, data);
                            finish();
                        }
                    });
                }

                @Override
                public int getItemCount() {
                    return Contact.CONTACTS.length;
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_contact);
        Intent intent = getIntent();
        if (!ACTION_SELECT_CONTACT.equals(intent.getAction())) {
            finish();
            return;
        }
        // Set up the list of contacts
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(mContactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private static class ContactViewHolder extends RecyclerView.ViewHolder {

        ContactViewHolder(@NonNull TextView textView) {
            super(textView);
        }
    }
}

package com.example.tigerconfessions;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText confessionEditText;
    private ImageButton confessionPostButton;
    private LinearLayout confessionList;
    private DatabaseReference mDatabase;
    private int numPosts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.confessionEditText = findViewById(R.id.confession_edit_text);
        this.confessionPostButton = findViewById(R.id.confession_post_button);
        this.confessionList = findViewById(R.id.confession_list);
        this.mDatabase = FirebaseDatabase.getInstance().getReference();
        this.numPosts = 0;
    }

    public void postConfession(View view) {
        // Input validation check that the view is of the type we want.
        if (!(view instanceof ImageButton)) {
            return;
        }

        String confessionText = confessionEditText.getText().toString();
        confessionEditText.setText("");

        TextView newConfession = createNewConfession(confessionText);

        confessionList.addView(newConfession);

        // Database Code
        // Use the numPosts as the identifying index in the database
        mDatabase.child("posts").child(String.valueOf(numPosts)).setValue(confessionText);
        // Increment numPosts so we have a unique identifier for each post
        numPosts++;
    }

    private TextView createNewConfession(String confessionText) {
        if (confessionText == null) {
            throw new NullPointerException("Confession should not be null!");
        }

        TextView confessionTextView = new TextView(this);
        confessionTextView.setText(confessionText);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(10,10,10,10);
        confessionTextView.setLayoutParams(params);

        confessionTextView.setPadding(10, 10, 10, 10);
        confessionTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);
        confessionTextView.setBackground(getResources().getDrawable(R.drawable.rectangle));

        confessionTextView.setClickable(true);
        confessionTextView.setOnClickListener(new ConfessionsOnClickListener());

        return confessionTextView;
    }

    private class ConfessionsOnClickListener implements OnClickListener {

        private AlertDialog.Builder builder;
        private String confessionText;

        @Override
        public void onClick(View view) {
            if (!(view instanceof TextView)) {
                return;
            }
            TextView confessionTextView = (TextView) view;
            confessionText = confessionTextView.getText().toString();

            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

            builder.setMessage(confessionText).setTitle(getResources().getString(R.string.confession_header));


            builder.setPositiveButton(getResources().getString(R.string.share_confession), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
                    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, getResources().getString(R.string.subject_here));
                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, confessionText);
                    startActivity(Intent.createChooser(sharingIntent,  getResources().getString(R.string.share_using)));
                }
            });

            builder.setNegativeButton(getResources().getString(R.string.share_using), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    dialog.dismiss();
                }
            });

            AlertDialog dialog = builder.create();

            dialog.show();
        }
    }
}

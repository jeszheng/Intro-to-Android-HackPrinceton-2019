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

public class MainActivity extends AppCompatActivity {

    private EditText confessionEditText;
    private ImageButton confessionPostButton;
    private LinearLayout confessionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.confessionEditText = findViewById(R.id.confession_edit_text);
        this.confessionPostButton = findViewById(R.id.confession_post_button);
        this.confessionList = findViewById(R.id.confession_list);
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

            builder.setMessage(confessionText) .setTitle("Confession");


            builder.setPositiveButton("Share Confession", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
                    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, confessionText);
                    startActivity(Intent.createChooser(sharingIntent, "Share Using"));
                }
            });

            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
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

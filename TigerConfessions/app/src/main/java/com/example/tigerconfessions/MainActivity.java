package com.example.tigerconfessions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

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

        return confessionTextView;
    }
}

package com.elena.kurganova.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FieldCompletionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes_layout);
    }

    public void saveClicked(View view) {
        String note = ((EditText) findViewById(R.id.message)).getText().toString();
        if (note.equals("")) {
        }
        else {
            Intent intent = new Intent();
            intent.putExtra(IntentConstants.INTENT_MESSAGE_FIELD, note);
            setResult(IntentConstants.INTENT_RESULT_CODE, intent);
            finish();

    }
}
}
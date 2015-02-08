package explicit.intent.android.vogella.com.explicitintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("value");

        EditText editText = (EditText) findViewById(R.id.returnValue);
        editText.setText(value);
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        EditText editText = (EditText) findViewById(R.id.returnValue);
        String value = editText.getText().toString();
        intent.putExtra("returnkey",value);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}

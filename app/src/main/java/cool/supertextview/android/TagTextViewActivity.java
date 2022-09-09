
package cool.supertextview.android;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TagTextViewActivity extends AppCompatActivity {

    private TextView mTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_text_view);
        mTitleTextView = findViewById(R.id.tv_title);
        View markerView = LayoutInflater.from(this).inflate(R.layout.item_marker_fore_title, null);
        SpannableStringBuilder builder = new SpannableStringBuilder();
        final String REPLACE_TEXT = "A";
        builder.append(REPLACE_TEXT);
        builder.setSpan(new MarkerViewSpan(markerView), 0, REPLACE_TEXT.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        String oriText = "你好,我在北京";
        builder.append(oriText);
        mTitleTextView.setText(builder);
    }
}
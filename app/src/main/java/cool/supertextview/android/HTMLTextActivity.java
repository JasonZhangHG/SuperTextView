package cool.supertextview.android;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HTMLTextActivity extends AppCompatActivity {

    private TextView mHtmlTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmltext);
        mHtmlTextView = findViewById(R.id.html_text);
        String str1 = "<font color='#FFF258'><b>" + "程序猿" + "</b> </font>";
        String str2 = "<font color='#03DAC5'><b>" + "北京" + "</b> </font>";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            mHtmlTextView.setText(Html.fromHtml(ResourceUtil.getString(R.string.html_message, str1, str2), Html.FROM_HTML_MODE_LEGACY));
        } else {
            mHtmlTextView.setText(Html.fromHtml(ResourceUtil.getString(R.string.html_message, str1, str2)));
        }
    }
}
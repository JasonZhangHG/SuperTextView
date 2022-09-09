
package cool.supertextview.android;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageTextViewActivity extends AppCompatActivity {

    private TextView mTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_text_view);
        mTitleTextView = findViewById(R.id.tv_title);


        String texValue01 = " 你好 ";
        String texValue02 = " 我在北京 ";

        String allTexValue = "A" + texValue01 + "B" + texValue02 + "C";

        int tex01ValueIndex = allTexValue.indexOf(texValue01);
        int tex01ValueEndIndex = tex01ValueIndex + texValue01.length();

        int tex02ValueIndex = allTexValue.indexOf(texValue02);
        int tex02ValueEndIndex = tex02ValueIndex + texValue02.length();

        SpannableString spannableString = new SpannableString(allTexValue);
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(ResourceUtil.getColor(R.color.red_common_pure));
        spannableString.setSpan(colorSpan, tex01ValueIndex, tex01ValueEndIndex, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);

        ForegroundColorSpan colorSpan2 = new ForegroundColorSpan(ResourceUtil.getColor(R.color.teal_200));
        spannableString.setSpan(colorSpan2, tex02ValueIndex, tex02ValueEndIndex, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);

        ImageSpan imgSpan = new ImageSpan(this, R.drawable.e_1);
        spannableString.setSpan(imgSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ImageSpan imgSpan2 = new ImageSpan(this, R.drawable.e_2);
        spannableString.setSpan(imgSpan2, tex01ValueEndIndex, tex01ValueEndIndex + 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ImageSpan imgSpan3 = new ImageSpan(this, R.drawable.e_3);
        spannableString.setSpan(imgSpan3, tex02ValueEndIndex, tex02ValueEndIndex + 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        mTitleTextView.setText(spannableString);
    }
}
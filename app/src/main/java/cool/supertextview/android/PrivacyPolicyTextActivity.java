package cool.supertextview.android;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class PrivacyPolicyTextActivity extends AppCompatActivity {

    private TextView mPrivacyPolicyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
        mPrivacyPolicyView = findViewById(R.id.privacyPolicy);
        initPrivacyPolicy();
    }

    private void initPrivacyPolicy() {
        String contentString = getString(R.string.login_des_privacy_desc, getString(R.string.terms_of_service_desc), getString(R.string.privacy_policy_desc));
        String termsOfService = getString(R.string.terms_of_service_desc);
        SpannableString spannableString = new SpannableString(contentString);
        int termsOfIndex = contentString.indexOf(termsOfService);
        ClickableSpan termsOfClick = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(PrivacyPolicyTextActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.baidu.com/");
                intent.putExtra("title", termsOfService);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(ResourceUtil.getColor(R.color.red_common_pure));
                ds.setUnderlineText(true);
            }
        };
        spannableString.setSpan(termsOfClick, termsOfIndex, termsOfIndex + termsOfService.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        String privacyPolicy = ResourceUtil.getString(R.string.privacy_policy_desc);
        int privacyIndex = contentString.indexOf(privacyPolicy);
        ClickableSpan privacyClick = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(PrivacyPolicyTextActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.baidu.com/");
                intent.putExtra("title", privacyPolicy);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(ResourceUtil.getColor(R.color.red_common_pure));
                ds.setUnderlineText(true);
            }
        };
        spannableString.setSpan(privacyClick, privacyIndex, privacyIndex + privacyPolicy.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(ContextCompat.getColor(this, R.color.red_common_pure));
        spannableString.setSpan(colorSpan, termsOfIndex, termsOfIndex + termsOfService.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        ForegroundColorSpan colorSpan2 = new ForegroundColorSpan(ContextCompat.getColor(this, R.color.red_common_pure));
        spannableString.setSpan(colorSpan2, privacyIndex, privacyIndex + privacyPolicy.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        mPrivacyPolicyView.setText(spannableString);
        mPrivacyPolicyView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
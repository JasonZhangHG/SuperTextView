
package cool.supertextview.android;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TagListTextViewActivity extends AppCompatActivity {

    private TextView mTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_list_text_view);
        mTitleTextView = findViewById(R.id.tv_title);
        View markerView = LayoutInflater.from(this).inflate(R.layout.item_marker_fore_list, null);
        RecyclerView recyclerView = markerView.findViewById(R.id.rlv_tag_list);
        TagAdapter tagAdapter = new TagAdapter();
        List<String> iconList = new ArrayList<>();

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        iconList.add("e_1");
        iconList.add("e_2");
        iconList.add("e_3");
        iconList.add("e_4");
        iconList.add("e_5");

        tagAdapter.setDataSilently(iconList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(tagAdapter);
        SpannableStringBuilder builder = new SpannableStringBuilder();
        final String REPLACE_TEXT = "A";
        builder.append(REPLACE_TEXT);
        builder.setSpan(new MarkerViewSpan(markerView), 0, REPLACE_TEXT.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        String oriText = "你好,我在北京~~~~~~~~~~~~";
        builder.append(oriText);
        mTitleTextView.setText(builder);
    }
}
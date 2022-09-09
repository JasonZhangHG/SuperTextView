package cool.supertextview.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MarkerViewSpan extends ReplacementSpan {

    protected View view;

    public MarkerViewSpan(View view) {
        super();
        this.view = view;
        this.view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    @Override
    public int getSize(@NonNull Paint paint, CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {

        int widthSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int heightSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        view.measure(widthSpec, heightSpec);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());

        if (fm != null) {
            int height = view.getMeasuredHeight();
            fm.ascent = fm.top = -height / 2;
            fm.descent = fm.bottom = height / 2;
        }
        return view.getRight();
    }

    @Override
    public void draw(@NonNull Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, @NonNull Paint paint) {
        int transY = top + (bottom - top - view.getMeasuredHeight()) / 2;
        canvas.save();
        canvas.translate(x, transY);
        view.draw(canvas);
        canvas.restore();
    }
}
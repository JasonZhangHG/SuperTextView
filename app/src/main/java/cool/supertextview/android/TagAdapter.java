package cool.supertextview.android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;
import cool.supertextview.android.base.BaseRVAdapter;
import cool.supertextview.android.base.IViewHolder;

public class TagAdapter extends BaseRVAdapter<String, TagAdapter.Holder> {

    @Override
    protected Holder doCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tag_adapter, viewGroup, false));
    }

    @Override
    protected void bindItemData(Holder viewHolder, String icon, int position) {
        viewHolder.bindView(icon, position);
    }

    public class Holder extends RecyclerView.ViewHolder implements IViewHolder<String> {

        ImageView mTagView;
        Context mContext;

        public Holder(View itemView) {
            super(itemView);
            mTagView = itemView.findViewById(R.id.iv_vip_tag);
            mContext = itemView.getContext();
        }

        @Override
        public void bindView(String icon, int position) {
            mTagView.setBackground(ResourceUtil.getDrawable(mContext.getResources().getIdentifier(icon, "drawable", "cool.supertextview.android")));
        }
    }
}


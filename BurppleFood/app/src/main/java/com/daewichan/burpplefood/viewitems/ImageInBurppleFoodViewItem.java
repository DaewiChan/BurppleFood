package com.daewichan.burpplefood.viewitems;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.daewichan.burpplefood.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by daewichan on 1/8/18.
 */

public class ImageInBurppleFoodViewItem extends FrameLayout {
    @BindView(R.id.iv_title_feature)
    ImageView ivTitleFeature;
    @BindView(R.id.tv_title_feature)
    TextView tvTitleFeature;
    @BindView(R.id.tv_subtitle_tasty_walk)
    TextView tvSubtitleTastyWalk;

    public ImageInBurppleFoodViewItem(@NonNull Context context) {
        super(context);
    }

    public ImageInBurppleFoodViewItem(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageInBurppleFoodViewItem(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}

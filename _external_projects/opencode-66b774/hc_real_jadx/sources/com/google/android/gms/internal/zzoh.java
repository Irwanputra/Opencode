package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Iterator;
import java.util.List;
import p131.p161.p162.p193.p203.BinderC2454;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzoh extends RelativeLayout {
    private static final float[] zzbto = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzbtp;

    public zzoh(Context context, zzog zzogVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        if (zzogVar == null) {
            throw new NullPointerException("null reference");
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zzbto, null, null));
        shapeDrawable.getPaint().setColor(zzogVar.getBackgroundColor());
        setLayoutParams(layoutParams);
        zzbs.zzek().setBackground(this, shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzogVar.getText())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzogVar.getText());
            textView.setTextColor(zzogVar.getTextColor());
            textView.setTextSize(zzogVar.getTextSize());
            zzkb.zzia();
            int zzc = zzajr.zzc(context, 4);
            zzkb.zzia();
            textView.setPadding(zzc, 0, zzajr.zzc(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzoi> zzjn = zzogVar.zzjn();
        if (zzjn != null && zzjn.size() > 1) {
            this.zzbtp = new AnimationDrawable();
            Iterator<zzoi> it = zzjn.iterator();
            while (it.hasNext()) {
                try {
                    this.zzbtp.addFrame((Drawable) BinderC2454.m4502(it.next().zzjr()), zzogVar.zzjo());
                } catch (Exception e) {
                    zzakb.zzb("Error while getting drawable.", e);
                }
            }
            zzbs.zzek().setBackground(imageView, this.zzbtp);
        } else if (zzjn.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) BinderC2454.m4502(zzjn.get(0).zzjr()));
            } catch (Exception e2) {
                zzakb.zzb("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzbtp;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}

package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class l61 extends android.widget.RelativeLayout {
    public static final float[] b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    public final android.graphics.drawable.AnimationDrawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l61(android.content.Context context, ads_mobile_sdk.md1 md1Var, android.widget.RelativeLayout.LayoutParams layoutParams) {
        android.graphics.drawable.AnimationDrawable animationDrawable;
        super(context);
        md1Var.getClass();
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(b, null, null));
        shapeDrawable.getPaint().setColor(md1Var.c);
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        java.lang.String str = md1Var.a;
        if (!android.text.TextUtils.isEmpty(str)) {
            android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(android.graphics.Typeface.DEFAULT);
            textView.setText(str);
            textView.setTextColor(md1Var.d);
            textView.setTextSize(md1Var.e);
            textView.setPadding((int) android.util.TypedValue.applyDimension(1, 4.0f, dev.epro.r0.E10717724117948616506.d(context)), 0, (int) android.util.TypedValue.applyDimension(1, 4.0f, dev.epro.r0.E10717724117948616506.d(context)), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        java.util.List list = md1Var.b;
        if (list.size() > 1) {
            this.a = new android.graphics.drawable.AnimationDrawable();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    android.graphics.drawable.Drawable drawable = ((ads_mobile_sdk.wf1) it.next()).a;
                    if (drawable != null && (animationDrawable = this.a) != null) {
                        animationDrawable.addFrame(drawable, (int) dev.epro.r0.E17093345031926825464.e(md1Var.f));
                    }
                } catch (java.lang.Exception e) {
                    e.toString();
                }
            }
            imageView.setBackground(this.a);
        } else if (list.size() == 1) {
            try {
                imageView.setImageDrawable(((ads_mobile_sdk.wf1) list.get(0)).a);
            } catch (java.lang.Exception e2) {
                e2.toString();
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        android.graphics.drawable.AnimationDrawable animationDrawable = this.a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}

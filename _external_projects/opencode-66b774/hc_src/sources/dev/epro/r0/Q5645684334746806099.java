package dev.epro.r0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q5645684334746806099 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ E13336915040001677500 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5645684334746806099(E13336915040001677500 e13336915040001677500, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = e13336915040001677500;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        E13336915040001677500 e13336915040001677500 = this.c;
        ColorStateList colorStateList2 = e13336915040001677500.l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (e13336915040001677500.k != 0 && e13336915040001677500.l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{E7030189496516270437.b(e13336915040001677500.l.getColorForState(iArr3, 0), e13336915040001677500.k), E7030189496516270437.b(e13336915040001677500.l.getColorForState(iArr2, 0), e13336915040001677500.k), e13336915040001677500.k});
        }
        this.a = colorStateList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.graphics.drawable.Drawable, com.google.android.material.focus.FocusRingDrawable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.Drawable$Callback, android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            E13336915040001677500 e13336915040001677500 = this.c;
            ColorDrawable colorDrawable = null;
            FocusRingDrawable focusRingDrawable = null;
            colorDrawable = null;
            if (e13336915040001677500.getText().toString().contentEquals(textView.getText()) && e13336915040001677500.k != 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(e13336915040001677500.k);
                if (this.b != null) {
                    colorDrawable2.setTintList(this.a);
                    ?? rippleDrawable = new RippleDrawable(this.b, colorDrawable2, null);
                    Context context = getContext();
                    ColorDrawable colorDrawable3 = FocusRingDrawable.p;
                    if (S10823041268949770285.W(context.getTheme(), net.zetetic.database.R.attr.focusRingsEnabled, false)) {
                        ?? focusRingDrawable2 = new FocusRingDrawable(context, FocusRingDrawable.p);
                        rippleDrawable.addLayer(focusRingDrawable2);
                        focusRingDrawable2.setCallback(rippleDrawable);
                        focusRingDrawable = focusRingDrawable2;
                    }
                    if (focusRingDrawable != null) {
                        focusRingDrawable.f145o.x = e13336915040001677500.g;
                    }
                    colorDrawable = rippleDrawable;
                } else {
                    colorDrawable = colorDrawable2;
                }
            }
            textView.setBackground(colorDrawable);
        }
        return view2;
    }
}

package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p034.p050.p053.C1232;
import p034.p050.p053.C1252;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatToggleButton extends ToggleButton {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1232 f395;

    public AppCompatToggleButton(Context context) {
        this(context, null);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1252.m2892(this, getContext());
        C1232 c1232 = new C1232(this);
        this.f395 = c1232;
        c1232.m2846(attributeSet, i);
    }
}

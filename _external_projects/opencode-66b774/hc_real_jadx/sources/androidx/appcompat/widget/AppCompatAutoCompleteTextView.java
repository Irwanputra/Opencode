package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p034.p035.p045.InterfaceC1119;
import p034.p050.C1264;
import p034.p050.p053.C1232;
import p034.p050.p053.C1241;
import p034.p050.p053.C1252;
import p034.p050.p053.C1253;
import p034.p050.p053.C1260;
import p034.p050.p055.p056.C1266;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements InterfaceC1119 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final int[] f341 = {R.attr.popupBackground};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1253 f342;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1232 f343;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C1241.m2865(context), attributeSet, i);
        C1252.m2892(this, getContext());
        C1260 m2910 = C1260.m2910(getContext(), attributeSet, f341, i, 0);
        if (m2910.m2915(0)) {
            setDropDownBackgroundDrawable(m2910.m2913(0));
        }
        m2910.f6162.recycle();
        C1253 c1253 = new C1253(this);
        this.f342 = c1253;
        c1253.m2901(attributeSet, i);
        C1232 c1232 = new C1232(this);
        this.f343 = c1232;
        c1232.m2846(attributeSet, i);
        c1232.m2842();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1253 c1253 = this.f342;
        if (c1253 != null) {
            c1253.m2898();
        }
        C1232 c1232 = this.f343;
        if (c1232 != null) {
            c1232.m2842();
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public ColorStateList getSupportBackgroundTintList() {
        C1253 c1253 = this.f342;
        if (c1253 != null) {
            return c1253.m2895();
        }
        return null;
    }

    @Override // p034.p035.p045.InterfaceC1119
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1253 c1253 = this.f342;
        if (c1253 != null) {
            return c1253.m2897();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C2786.m4791(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1253 c1253 = this.f342;
        if (c1253 != null) {
            c1253.m2899();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1253 c1253 = this.f342;
        if (c1253 != null) {
            c1253.m2900(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C2786.m4773(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C1266.m2928(getContext(), i));
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1253 c1253 = this.f342;
        if (c1253 != null) {
            c1253.m2894(colorStateList);
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1253 c1253 = this.f342;
        if (c1253 != null) {
            c1253.m2902(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1232 c1232 = this.f343;
        if (c1232 != null) {
            c1232.m2848(context, i);
        }
    }
}

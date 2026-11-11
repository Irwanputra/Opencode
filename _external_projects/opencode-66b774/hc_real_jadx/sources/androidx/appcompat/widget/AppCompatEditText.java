package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import p034.p035.p045.InterfaceC1119;
import p034.p050.C1264;
import p034.p050.p053.C1232;
import p034.p050.p053.C1241;
import p034.p050.p053.C1252;
import p034.p050.p053.C1253;
import p034.p050.p053.C1261;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatEditText extends EditText implements InterfaceC1119 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1253 f351;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1232 f352;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C1261 f353;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C1241.m2865(context), attributeSet, i);
        C1252.m2892(this, getContext());
        C1253 c1253 = new C1253(this);
        this.f351 = c1253;
        c1253.m2901(attributeSet, i);
        C1232 c1232 = new C1232(this);
        this.f352 = c1232;
        c1232.m2846(attributeSet, i);
        c1232.m2842();
        this.f353 = new C1261(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1253 c1253 = this.f351;
        if (c1253 != null) {
            c1253.m2898();
        }
        C1232 c1232 = this.f352;
        if (c1232 != null) {
            c1232.m2842();
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public ColorStateList getSupportBackgroundTintList() {
        C1253 c1253 = this.f351;
        if (c1253 != null) {
            return c1253.m2895();
        }
        return null;
    }

    @Override // p034.p035.p045.InterfaceC1119
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1253 c1253 = this.f351;
        if (c1253 != null) {
            return c1253.m2897();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1261 c1261;
        return (Build.VERSION.SDK_INT >= 28 || (c1261 = this.f353) == null) ? super.getTextClassifier() : c1261.m2927();
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
        C1253 c1253 = this.f351;
        if (c1253 != null) {
            c1253.m2899();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1253 c1253 = this.f351;
        if (c1253 != null) {
            c1253.m2900(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C2786.m4773(this, callback));
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1253 c1253 = this.f351;
        if (c1253 != null) {
            c1253.m2894(colorStateList);
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1253 c1253 = this.f351;
        if (c1253 != null) {
            c1253.m2902(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1232 c1232 = this.f352;
        if (c1232 != null) {
            c1232.m2848(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1261 c1261;
        if (Build.VERSION.SDK_INT >= 28 || (c1261 = this.f353) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1261.f6165 = textClassifier;
        }
    }
}

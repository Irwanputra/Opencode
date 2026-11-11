package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.Locale;
import p131.p155.p156.p157.C2098;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p164.p165.C2112;
import p131.p161.p162.p163.p185.C2255;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Rect f3535;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f3536;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C2112.m4210(context, attributeSet, i, 0), attributeSet, i);
        this.f3535 = new Rect();
        int[] iArr = C2243.TextInputEditText;
        int i2 = C2350.Widget_Design_TextInputEditText;
        C2255.m4406(context, attributeSet, i, i2);
        C2255.m4404(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        setTextInputLayoutFocusedRectEnabled(obtainStyledAttributes.getBoolean(C2243.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        obtainStyledAttributes.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f3536 || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f3535);
        rect.bottom = this.f3535.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f3536 && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.f3535, point);
            rect.bottom = this.f3535.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.f3598) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f3598 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        boolean z3 = !TextUtils.isEmpty(helperText);
        boolean z4 = !TextUtils.isEmpty(error);
        str = "";
        String charSequence = z2 ? hint.toString() : "";
        StringBuilder m4207 = C2098.m4207(charSequence);
        m4207.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : "");
        StringBuilder m42072 = C2098.m4207(m4207.toString());
        if (z4) {
            helperText = error;
        } else if (!z3) {
            helperText = "";
        }
        m42072.append((Object) helperText);
        String sb = m42072.toString();
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) text);
            sb2.append(TextUtils.isEmpty(sb) ? "" : C2098.m4205(", ", sb));
            str = sb2.toString();
        } else if (!TextUtils.isEmpty(sb)) {
            str = sb;
        }
        accessibilityNodeInfo.setText(str);
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f3536) {
            this.f3535.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(C2324.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f3535, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f3536 = z;
    }
}

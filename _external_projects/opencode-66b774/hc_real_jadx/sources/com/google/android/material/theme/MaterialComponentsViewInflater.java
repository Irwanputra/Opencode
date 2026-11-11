package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;
import p034.p050.p060.C1309;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MaterialComponentsViewInflater extends C1309 {
    @Override // p034.p050.p060.C1309
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AppCompatButton mo1547(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p034.p050.p060.C1309
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AppCompatCheckBox mo1548(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // p034.p050.p060.C1309
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public AppCompatAutoCompleteTextView mo1549(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // p034.p050.p060.C1309
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public AppCompatTextView mo1550(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    @Override // p034.p050.p060.C1309
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public AppCompatRadioButton mo1551(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }
}

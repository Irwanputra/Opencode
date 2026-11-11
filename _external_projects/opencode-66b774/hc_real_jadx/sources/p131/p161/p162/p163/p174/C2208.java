package p131.p161.p162.p163.p174;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p034.p050.p055.p056.C1266;
import p131.p161.p162.p163.C2144;
import p131.p161.p162.p163.C2242;
import p131.p161.p162.p163.p186.C2294;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2208 extends AbstractC2217 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public AnimatorSet f9192;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final TextInputLayout.InterfaceC0477 f9193;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final View.OnFocusChangeListener f9194;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final TextInputLayout.InterfaceC0481 f9195;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final TextWatcher f9196;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public ValueAnimator f9197;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public class ViewOnFocusChangeListenerC2209 implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC2209() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C2208.this.m4309((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z);
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.げつ〴ぬぐ$くし〴〺ぅ, reason: contains not printable characters */
    public class C2210 implements TextInputLayout.InterfaceC0481 {
        public C2210() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        
            if ((r0.getText().length() > 0) != false) goto L11;
         */
        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0481
        /* renamed from: げつ〴ぬぐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo1544(com.google.android.material.textfield.TextInputLayout r5) {
            /*
                r4 = this;
                android.widget.EditText r0 = r5.getEditText()
                boolean r1 = r0.hasFocus()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.text.Editable r1 = r0.getText()
                int r1 = r1.length()
                if (r1 <= 0) goto L18
                r1 = 1
                goto L19
            L18:
                r1 = 0
            L19:
                if (r1 == 0) goto L1c
                goto L1d
            L1c:
                r2 = 0
            L1d:
                r5.setEndIconVisible(r2)
                r5.setEndIconCheckable(r3)
                なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.げつ〴ぬぐ r5 = p131.p161.p162.p163.p174.C2208.this
                android.view.View$OnFocusChangeListener r5 = r5.f9194
                r0.setOnFocusChangeListener(r5)
                なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.げつ〴ぬぐ r5 = p131.p161.p162.p163.p174.C2208.this
                android.text.TextWatcher r5 = r5.f9196
                r0.removeTextChangedListener(r5)
                なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.げつ〴ぬぐ r5 = p131.p161.p162.p163.p174.C2208.this
                android.text.TextWatcher r5 = r5.f9196
                r0.addTextChangedListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p131.p161.p162.p163.p174.C2208.C2210.mo1544(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2211 implements TextWatcher {
        public C2211() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C2208.this.f9207.getSuffixText() != null) {
                return;
            }
            C2208.this.m4309(editable.length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.げつ〴ぬぐ$づざかべべ, reason: contains not printable characters */
    public class ViewOnClickListenerC2212 implements View.OnClickListener {
        public ViewOnClickListenerC2212() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = C2208.this.f9207.getEditText().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.げつ〴ぬぐ$びぐびあび, reason: contains not printable characters */
    public class C2213 implements TextInputLayout.InterfaceC0477 {
        public C2213() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0477
        /* renamed from: げつ〴ぬぐ */
        public void mo1543(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.removeTextChangedListener(C2208.this.f9196);
            if (editText.getOnFocusChangeListener() == C2208.this.f9194) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    public C2208(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f9196 = new C2211();
        this.f9194 = new ViewOnFocusChangeListenerC2209();
        this.f9195 = new C2210();
        this.f9193 = new C2213();
    }

    @Override // p131.p161.p162.p163.p174.AbstractC2217
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo4308(boolean z) {
        if (this.f9207.getSuffixText() == null) {
            return;
        }
        m4309(z);
    }

    @Override // p131.p161.p162.p163.p174.AbstractC2217
    /* renamed from: げつ〴ぬぐ */
    public void mo4303() {
        this.f9207.setEndIconDrawable(C1266.m2928(this.f9205, C2242.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f9207;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C2144.clear_text_end_icon_content_description));
        this.f9207.setEndIconOnClickListener(new ViewOnClickListenerC2212());
        this.f9207.m1523(this.f9195);
        this.f9207.f3543.add(this.f9193);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C2294.f9511);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C2214(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = C2294.f9509;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new C2218(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f9192 = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f9192.addListener(new C2198(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new C2218(this));
        this.f9197 = ofFloat3;
        ofFloat3.addListener(new C2207(this));
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m4309(boolean z) {
        boolean z2 = this.f9207.m1529() == z;
        if (z) {
            this.f9197.cancel();
            this.f9192.start();
            if (z2) {
                this.f9192.end();
                return;
            }
            return;
        }
        this.f9192.cancel();
        this.f9197.start();
        if (z2) {
            this.f9197.end();
        }
    }
}

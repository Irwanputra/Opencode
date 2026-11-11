package p131.p161.p162.p163.p174;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p034.p050.p055.p056.C1266;
import p131.p161.p162.p163.C2144;
import p131.p161.p162.p163.C2242;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2201 extends AbstractC2217 {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final TextInputLayout.InterfaceC0481 f9184;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final TextInputLayout.InterfaceC0477 f9185;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final TextWatcher f9186;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.ぇぬぎばつ$〺つふすそ, reason: contains not printable characters */
    public class C2202 implements TextInputLayout.InterfaceC0481 {
        public C2202() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0481
        /* renamed from: げつ〴ぬぐ */
        public void mo1544(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C2201.this.f9206.setChecked(!C2201.m4307(r4));
            editText.removeTextChangedListener(C2201.this.f9186);
            editText.addTextChangedListener(C2201.this.f9186);
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.ぇぬぎばつ$くし〴〺ぅ, reason: contains not printable characters */
    public class C2203 implements TextInputLayout.InterfaceC0477 {
        public C2203() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0477
        /* renamed from: げつ〴ぬぐ */
        public void mo1543(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.removeTextChangedListener(C2201.this.f9186);
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.ぇぬぎばつ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2204 implements TextWatcher {
        public C2204() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C2201.this.f9206.setChecked(!C2201.m4307(r1));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.ぇぬぎばつ$びぐびあび, reason: contains not printable characters */
    public class ViewOnClickListenerC2205 implements View.OnClickListener {
        public ViewOnClickListenerC2205() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C2201.this.f9207.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(C2201.m4307(C2201.this) ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
        }
    }

    public C2201(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f9186 = new C2204();
        this.f9184 = new C2202();
        this.f9185 = new C2203();
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static boolean m4307(C2201 c2201) {
        EditText editText = c2201.f9207.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // p131.p161.p162.p163.p174.AbstractC2217
    /* renamed from: げつ〴ぬぐ */
    public void mo4303() {
        this.f9207.setEndIconDrawable(C1266.m2928(this.f9205, C2242.design_password_eye));
        TextInputLayout textInputLayout = this.f9207;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C2144.password_toggle_content_description));
        this.f9207.setEndIconOnClickListener(new ViewOnClickListenerC2205());
        this.f9207.m1523(this.f9184);
        this.f9207.f3543.add(this.f9185);
        EditText editText = this.f9207.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

package p131.p161.p162.p163.p174;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p034.p035.p045.p046.C1084;
import p034.p050.p055.p056.C1266;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2144;
import p131.p161.p162.p163.C2242;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.p171.C2156;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2178;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p186.C2294;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2190 extends AbstractC2217 {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final boolean f9156;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.InterfaceC0477 f9157;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final TextInputLayout.InterfaceC0481 f9158;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f9159;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public ValueAnimator f9160;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public ValueAnimator f9161;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final View.OnFocusChangeListener f9162;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public StateListDrawable f9163;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final TextInputLayout.C0480 f9164;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C2163 f9165;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final TextWatcher f9166;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public AccessibilityManager f9167;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f9168;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public long f9169;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.〳ぜぞぜべっ$〺つふすそ, reason: contains not printable characters */
    public class ViewOnFocusChangeListenerC2191 implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC2191() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C2190.this.f9207.setEndIconActivated(z);
            if (z) {
                return;
            }
            C2190.m4300(C2190.this, false);
            C2190.this.f9168 = false;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.〳ぜぞぜべっ$くし〴〺ぅ, reason: contains not printable characters */
    public class C2192 extends TextInputLayout.C0480 {
        public C2192(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: づざかべべ */
        public void mo2530(View view, AccessibilityEvent accessibilityEvent) {
            this.f5594.onPopulateAccessibilityEvent(view, accessibilityEvent);
            C2190 c2190 = C2190.this;
            AutoCompleteTextView m4299 = C2190.m4299(c2190, c2190.f9207.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C2190.this.f9167.isTouchExplorationEnabled()) {
                C2190.m4298(C2190.this, m4299);
            }
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C0480, p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            boolean z;
            super.mo431(view, c1084);
            if (C2190.this.f9207.getEditText().getKeyListener() == null) {
                c1084.f5550.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                z = c1084.f5550.isShowingHintText();
            } else {
                Bundle m2447 = c1084.m2447();
                z = m2447 != null && (m2447.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (z) {
                c1084.m2461(null);
            }
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2193 implements TextWatcher {

        /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.〳ぜぞぜべっ$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public class RunnableC2194 implements Runnable {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public final /* synthetic */ AutoCompleteTextView f9173;

            public RunnableC2194(AutoCompleteTextView autoCompleteTextView) {
                this.f9173 = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f9173.isPopupShowing();
                C2190.m4300(C2190.this, isPopupShowing);
                C2190.this.f9168 = isPopupShowing;
            }
        }

        public C2193() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C2190 c2190 = C2190.this;
            AutoCompleteTextView m4299 = C2190.m4299(c2190, c2190.f9207.getEditText());
            m4299.post(new RunnableC2194(m4299));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.〳ぜぞぜべっ$づざかべべ, reason: contains not printable characters */
    public class C2195 implements TextInputLayout.InterfaceC0477 {
        public C2195() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0477
        /* renamed from: げつ〴ぬぐ */
        public void mo1543(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.removeTextChangedListener(C2190.this.f9166);
            if (autoCompleteTextView.getOnFocusChangeListener() == C2190.this.f9162) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (C2190.f9156) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.〳ぜぞぜべっ$なぎぱいぢぎ, reason: contains not printable characters */
    public class ViewOnClickListenerC2196 implements View.OnClickListener {
        public ViewOnClickListenerC2196() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2190.m4298(C2190.this, (AutoCompleteTextView) C2190.this.f9207.getEditText());
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.〳ぜぞぜべっ$びぐびあび, reason: contains not printable characters */
    public class C2197 implements TextInputLayout.InterfaceC0481 {
        public C2197() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0481
        /* renamed from: げつ〴ぬぐ */
        public void mo1544(TextInputLayout textInputLayout) {
            LayerDrawable layerDrawable;
            Drawable drawable;
            AutoCompleteTextView m4299 = C2190.m4299(C2190.this, textInputLayout.getEditText());
            C2190 c2190 = C2190.this;
            c2190.getClass();
            boolean z = C2190.f9156;
            if (z) {
                int boxBackgroundMode = c2190.f9207.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    drawable = c2190.f9165;
                } else if (boxBackgroundMode == 1) {
                    drawable = c2190.f9163;
                }
                m4299.setDropDownBackgroundDrawable(drawable);
            }
            C2190 c21902 = C2190.this;
            c21902.getClass();
            if (m4299.getKeyListener() == null) {
                int boxBackgroundMode2 = c21902.f9207.getBoxBackgroundMode();
                C2163 boxBackground = c21902.f9207.getBoxBackground();
                int m3728 = C1687.m3728(m4299, C2111.colorControlHighlight);
                int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
                if (boxBackgroundMode2 == 2) {
                    int m37282 = C1687.m3728(m4299, C2111.colorSurface);
                    C2163 c2163 = new C2163(boxBackground.f9045.f9074);
                    int m3695 = C1687.m3695(m3728, m37282, 0.1f);
                    c2163.m4252(new ColorStateList(iArr, new int[]{m3695, 0}));
                    if (z) {
                        c2163.setTint(m37282);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m3695, m37282});
                        C2163 c21632 = new C2163(boxBackground.f9045.f9074);
                        c21632.setTint(-1);
                        layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2163, c21632), boxBackground});
                    } else {
                        layerDrawable = new LayerDrawable(new Drawable[]{c2163, boxBackground});
                    }
                    AtomicInteger atomicInteger = C1096.f5578;
                    if (Build.VERSION.SDK_INT >= 16) {
                        m4299.setBackground(layerDrawable);
                    } else {
                        m4299.setBackgroundDrawable(layerDrawable);
                    }
                } else if (boxBackgroundMode2 == 1) {
                    int boxBackgroundColor = c21902.f9207.getBoxBackgroundColor();
                    int[] iArr2 = {C1687.m3695(m3728, boxBackgroundColor, 0.1f), boxBackgroundColor};
                    if (z) {
                        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, iArr2), boxBackground, boxBackground);
                        AtomicInteger atomicInteger2 = C1096.f5578;
                        if (Build.VERSION.SDK_INT >= 16) {
                            m4299.setBackground(rippleDrawable);
                        } else {
                            m4299.setBackgroundDrawable(rippleDrawable);
                        }
                    } else {
                        C2163 c21633 = new C2163(boxBackground.f9045.f9074);
                        c21633.m4252(new ColorStateList(iArr, iArr2));
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{boxBackground, c21633});
                        int m2513 = C1096.m2513(m4299);
                        int paddingTop = m4299.getPaddingTop();
                        int m2500 = C1096.m2500(m4299);
                        int paddingBottom = m4299.getPaddingBottom();
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 16) {
                            m4299.setBackground(layerDrawable2);
                        } else {
                            m4299.setBackgroundDrawable(layerDrawable2);
                        }
                        if (i >= 17) {
                            m4299.setPaddingRelative(m2513, paddingTop, m2500, paddingBottom);
                        } else {
                            m4299.setPadding(m2513, paddingTop, m2500, paddingBottom);
                        }
                    }
                }
            }
            C2190 c21903 = C2190.this;
            c21903.getClass();
            m4299.setOnTouchListener(new ViewOnTouchListenerC2200(c21903, m4299));
            m4299.setOnFocusChangeListener(c21903.f9162);
            if (z) {
                m4299.setOnDismissListener(new C2222(c21903));
            }
            m4299.setThreshold(0);
            m4299.removeTextChangedListener(C2190.this.f9166);
            m4299.addTextChangedListener(C2190.this.f9166);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C2190.this.f9164);
            textInputLayout.setEndIconVisible(true);
        }
    }

    static {
        f9156 = Build.VERSION.SDK_INT >= 21;
    }

    public C2190(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f9166 = new C2193();
        this.f9162 = new ViewOnFocusChangeListenerC2191();
        this.f9164 = new C2192(this.f9207);
        this.f9158 = new C2197();
        this.f9157 = new C2195();
        this.f9168 = false;
        this.f9159 = false;
        this.f9169 = Long.MAX_VALUE;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static void m4298(C2190 c2190, AutoCompleteTextView autoCompleteTextView) {
        c2190.getClass();
        if (autoCompleteTextView == null) {
            return;
        }
        if (c2190.m4305()) {
            c2190.f9168 = false;
        }
        if (c2190.f9168) {
            c2190.f9168 = false;
            return;
        }
        if (f9156) {
            boolean z = c2190.f9159;
            boolean z2 = !z;
            if (z != z2) {
                c2190.f9159 = z2;
                c2190.f9160.cancel();
                c2190.f9161.start();
            }
        } else {
            c2190.f9159 = !c2190.f9159;
            c2190.f9206.toggle();
        }
        if (!c2190.f9159) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static AutoCompleteTextView m4299(C2190 c2190, EditText editText) {
        c2190.getClass();
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static void m4300(C2190 c2190, boolean z) {
        if (c2190.f9159 != z) {
            c2190.f9159 = z;
            c2190.f9160.cancel();
            c2190.f9161.start();
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C2163 m4301(float f, float f2, float f3, int i) {
        C2180.C2181 c2181 = new C2180.C2181();
        c2181.f9136 = new C2178(f);
        c2181.f9138 = new C2178(f);
        c2181.f9130 = new C2178(f2);
        c2181.f9132 = new C2178(f2);
        C2180 m4291 = c2181.m4291();
        Context context = this.f9205;
        String str = C2163.f9042;
        int m3699 = C1687.m3699(context, C2111.colorSurface, C2163.class.getSimpleName());
        C2163 c2163 = new C2163();
        c2163.f9045.f9067 = new C2156(context);
        c2163.m4269();
        c2163.m4252(ColorStateList.valueOf(m3699));
        C2163.C2164 c2164 = c2163.f9045;
        if (c2164.f9072 != f3) {
            c2164.f9072 = f3;
            c2163.m4269();
        }
        c2163.f9045.f9074 = m4291;
        c2163.invalidateSelf();
        C2163.C2164 c21642 = c2163.f9045;
        if (c21642.f9086 == null) {
            c21642.f9086 = new Rect();
        }
        c2163.f9045.f9086.set(0, i, 0, i);
        c2163.invalidateSelf();
        return c2163;
    }

    @Override // p131.p161.p162.p163.p174.AbstractC2217
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean mo4302(int i) {
        return i != 0;
    }

    @Override // p131.p161.p162.p163.p174.AbstractC2217
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo4303() {
        float dimensionPixelOffset = this.f9205.getResources().getDimensionPixelOffset(C2324.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f9205.getResources().getDimensionPixelOffset(C2324.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f9205.getResources().getDimensionPixelOffset(C2324.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C2163 m4301 = m4301(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C2163 m43012 = m4301(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f9165 = m4301;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f9163 = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, m4301);
        this.f9163.addState(new int[0], m43012);
        this.f9207.setEndIconDrawable(C1266.m2928(this.f9205, f9156 ? C2242.mtrl_dropdown_arrow : C2242.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f9207;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C2144.exposed_dropdown_menu_content_description));
        this.f9207.setEndIconOnClickListener(new ViewOnClickListenerC2196());
        this.f9207.m1523(this.f9158);
        this.f9207.f3543.add(this.f9157);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = C2294.f9509;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new C2221(this));
        this.f9160 = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new C2221(this));
        this.f9161 = ofFloat2;
        ofFloat2.addListener(new C2215(this));
        C1096.m2505(this.f9206, 2);
        this.f9167 = (AccessibilityManager) this.f9205.getSystemService("accessibility");
    }

    @Override // p131.p161.p162.p163.p174.AbstractC2217
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean mo4304() {
        return true;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final boolean m4305() {
        long currentTimeMillis = System.currentTimeMillis() - this.f9169;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}

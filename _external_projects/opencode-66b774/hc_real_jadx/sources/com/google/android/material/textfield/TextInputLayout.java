package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p043.C1067;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p034.p035.p049.C1136;
import p034.p050.p053.C1210;
import p034.p050.p053.C1242;
import p034.p050.p055.p056.C1266;
import p131.p155.p156.p157.C2098;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2144;
import p131.p161.p162.p163.C2248;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2178;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p174.AbstractC2217;
import p131.p161.p162.p163.p174.C2199;
import p131.p161.p162.p163.p174.C2219;
import p131.p161.p162.p163.p185.C2260;
import p131.p161.p162.p163.p186.C2294;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: のかまじえ, reason: contains not printable characters */
    public static final int f3537 = C2350.Widget_Design_TextInputLayout;

    /* renamed from: 〱〴なぱへて, reason: contains not printable characters */
    public boolean f3538;

    /* renamed from: 〱〵つてう, reason: contains not printable characters */
    public boolean f3539;

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public boolean f3540;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public final LinkedHashSet<InterfaceC0481> f3541;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C2219 f3542;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public final LinkedHashSet<InterfaceC0477> f3543;

    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public int f3544;

    /* renamed from: 〺えなひあ, reason: contains not printable characters */
    public boolean f3545;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final FrameLayout f3546;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public int f3547;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public CharSequence f3548;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public CharSequence f3549;

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public ColorStateList f3550;

    /* renamed from: ぁにあがあ, reason: contains not printable characters */
    public final C2260 f3551;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public final RectF f3552;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f3553;

    /* renamed from: いたぷすいだ, reason: contains not printable characters */
    public ValueAnimator f3554;

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public int f3555;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public C2163 f3556;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f3557;

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public Drawable f3558;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public int f3559;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f3560;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public ColorStateList f3561;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final TextView f3562;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public TextView f3563;

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public View.OnLongClickListener f3564;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public int f3565;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public int f3566;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public CharSequence f3567;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public final CheckableImageButton f3568;

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public ColorStateList f3569;

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public Drawable f3570;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public PorterDuff.Mode f3571;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public int f3572;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final LinearLayout f3573;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public View.OnLongClickListener f3574;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public int f3575;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final Rect f3576;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public boolean f3577;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public ColorStateList f3578;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public PorterDuff.Mode f3579;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public ColorStateList f3580;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public ColorStateList f3581;

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public int f3582;

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public ColorStateList f3583;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public C2180 f3584;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public final SparseArray<AbstractC2217> f3585;

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public int f3586;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public final int f3587;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public final CheckableImageButton f3588;

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public int f3589;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final FrameLayout f3590;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public Typeface f3591;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public TextView f3592;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public CharSequence f3593;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public C2163 f3594;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public boolean f3595;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public final Rect f3596;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public EditText f3597;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean f3598;

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public final CheckableImageButton f3599;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public int f3600;

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public int f3601;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f3602;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f3603;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public ColorStateList f3604;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public boolean f3605;

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public int f3606;

    /* renamed from: ひぞ〴つき, reason: contains not printable characters */
    public boolean f3607;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public CharSequence f3608;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final LinearLayout f3609;

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public View.OnLongClickListener f3610;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final TextView f3611;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public int f3612;

    /* renamed from: へ〱そかのず, reason: contains not printable characters */
    public int f3613;

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public int f3614;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f3615;

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public ColorStateList f3616;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f3617;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public Drawable f3618;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final int f3619;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f3620;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0475();

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f3621;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public CharSequence f3622;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0475 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3622 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3621 = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("TextInputLayout.SavedState{");
            m4207.append(Integer.toHexString(System.identityHashCode(this)));
            m4207.append(" error=");
            m4207.append((Object) this.f3622);
            m4207.append("}");
            return m4207.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            TextUtils.writeToParcel(this.f3622, parcel, i);
            parcel.writeInt(this.f3621 ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$〺つふすそ, reason: contains not printable characters */
    public class RunnableC0476 implements Runnable {
        public RunnableC0476() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f3568.performClick();
            TextInputLayout.this.f3568.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$ぁごぐすすぃ, reason: contains not printable characters */
    public interface InterfaceC0477 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo1543(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$くし〴〺ぅ, reason: contains not printable characters */
    public class RunnableC0478 implements Runnable {
        public RunnableC0478() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f3597.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0479 implements TextWatcher {
        public C0479() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.m1518(!r0.f3607, false);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f3617) {
                textInputLayout.m1524(editable.length());
            }
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f3560) {
                textInputLayout2.m1536(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$づざかべべ, reason: contains not printable characters */
    public static class C0480 extends C1102 {

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final TextInputLayout f3626;

        public C0480(TextInputLayout textInputLayout) {
            this.f3626 = textInputLayout;
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
            EditText editText = this.f3626.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f3626.getHint();
            CharSequence helperText = this.f3626.getHelperText();
            CharSequence error = this.f3626.getError();
            int counterMaxLength = this.f3626.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f3626.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
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
                c1084.f5550.setText(text);
            } else if (!TextUtils.isEmpty(sb)) {
                c1084.f5550.setText(sb);
            }
            if (!TextUtils.isEmpty(sb)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    c1084.m2461(sb);
                } else {
                    if (z) {
                        sb = ((Object) text) + ", " + sb;
                    }
                    c1084.f5550.setText(sb);
                }
                boolean z6 = !z;
                if (i >= 26) {
                    c1084.f5550.setShowingHintText(z6);
                } else {
                    c1084.m2463(4, z6);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                c1084.f5550.setMaxTextLength(counterMaxLength);
            }
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                if (i2 >= 21) {
                    c1084.f5550.setError(error);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$なぎぱいぢぎ, reason: contains not printable characters */
    public interface InterfaceC0481 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo1544(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$びぐびあび, reason: contains not printable characters */
    public class C0482 implements ValueAnimator.AnimatorUpdateListener {
        public C0482() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f3551.m4434(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.textInputStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r24, android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private AbstractC2217 getEndIconDelegate() {
        AbstractC2217 abstractC2217 = this.f3585.get(this.f3572);
        return abstractC2217 != null ? abstractC2217 : this.f3585.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f3599.getVisibility() == 0) {
            return this.f3599;
        }
        if (m1542() && m1529()) {
            return this.f3568;
        }
        return null;
    }

    private void setEditText(EditText editText) {
        if (this.f3597 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f3572 != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.f3597 = editText;
        m1539();
        setTextInputAccessibilityDelegate(new C0480(this));
        this.f3551.m4432(this.f3597.getTypeface());
        C2260 c2260 = this.f3551;
        float textSize = this.f3597.getTextSize();
        if (c2260.f9442 != textSize) {
            c2260.f9442 = textSize;
            c2260.m4430();
        }
        int gravity = this.f3597.getGravity();
        this.f3551.m4420((gravity & (-113)) | 48);
        this.f3551.m4424(gravity);
        this.f3597.addTextChangedListener(new C0479());
        if (this.f3616 == null) {
            this.f3616 = this.f3597.getHintTextColors();
        }
        if (this.f3557) {
            if (TextUtils.isEmpty(this.f3608)) {
                CharSequence hint = this.f3597.getHint();
                this.f3549 = hint;
                setHint(hint);
                this.f3597.setHint((CharSequence) null);
            }
            this.f3598 = true;
        }
        if (this.f3592 != null) {
            m1524(this.f3597.getText().length());
        }
        m1538();
        this.f3542.m4311();
        this.f3573.bringToFront();
        this.f3609.bringToFront();
        this.f3590.bringToFront();
        this.f3599.bringToFront();
        Iterator<InterfaceC0481> it = this.f3541.iterator();
        while (it.hasNext()) {
            it.next().mo1544(this);
        }
        m1533();
        m1527();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m1518(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.f3599.setVisibility(z ? 0 : 8);
        this.f3590.setVisibility(z ? 8 : 0);
        m1527();
        if (m1542()) {
            return;
        }
        m1530();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f3608)) {
            return;
        }
        this.f3608 = charSequence;
        this.f3551.m4417(charSequence);
        if (this.f3539) {
            return;
        }
        m1521();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f3560 == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f3563 = appCompatTextView;
            appCompatTextView.setId(C2248.textinput_placeholder);
            C1096.m2477(this.f3563, 1);
            setPlaceholderTextAppearance(this.f3603);
            setPlaceholderTextColor(this.f3581);
            TextView textView = this.f3563;
            if (textView != null) {
                this.f3546.addView(textView);
                this.f3563.setVisibility(0);
            }
        } else {
            TextView textView2 = this.f3563;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.f3563 = null;
        }
        this.f3560 = z;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static void m1510(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m1510((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static void m1511(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        AtomicInteger atomicInteger = C1096.f5578;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        C1096.m2505(checkableImageButton, z2 ? 1 : 2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f3546.addView(view, layoutParams2);
        this.f3546.setLayoutParams(layoutParams);
        m1519();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f3549 == null || (editText = this.f3597) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f3598;
        this.f3598 = false;
        CharSequence hint = editText.getHint();
        this.f3597.setHint(this.f3549);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f3597.setHint(hint);
            this.f3598 = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f3607 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f3607 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3557) {
            this.f3551.m4415(canvas);
        }
        C2163 c2163 = this.f3556;
        if (c2163 != null) {
            Rect bounds = c2163.getBounds();
            bounds.top = bounds.bottom - this.f3612;
            this.f3556.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f3545) {
            return;
        }
        this.f3545 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C2260 c2260 = this.f3551;
        boolean m4419 = c2260 != null ? c2260.m4419(drawableState) | false : false;
        if (this.f3597 != null) {
            m1518(C1096.m2517(this) && isEnabled(), false);
        }
        m1538();
        m1520();
        if (m4419) {
            invalidate();
        }
        this.f3545 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3597;
        if (editText == null) {
            return super.getBaseline();
        }
        return m1515() + getPaddingTop() + editText.getBaseline();
    }

    public C2163 getBoxBackground() {
        int i = this.f3565;
        if (i == 1 || i == 2) {
            return this.f3594;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f3559;
    }

    public int getBoxBackgroundMode() {
        return this.f3565;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f3594.m4240();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f3594.m4268();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f3594.m4250();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f3594.m4267();
    }

    public int getBoxStrokeColor() {
        return this.f3586;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3569;
    }

    public int getBoxStrokeWidth() {
        return this.f3575;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f3566;
    }

    public int getCounterMaxLength() {
        return this.f3553;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f3617 && this.f3620 && (textView = this.f3592) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f3578;
    }

    public ColorStateList getCounterTextColor() {
        return this.f3578;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f3616;
    }

    public EditText getEditText() {
        return this.f3597;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3568.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3568.getDrawable();
    }

    public int getEndIconMode() {
        return this.f3572;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3568;
    }

    public CharSequence getError() {
        C2219 c2219 = this.f3542;
        if (c2219.f9222) {
            return c2219.f9230;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3542.f9228;
    }

    public int getErrorCurrentTextColors() {
        return this.f3542.m4312();
    }

    public Drawable getErrorIconDrawable() {
        return this.f3599.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f3542.m4312();
    }

    public CharSequence getHelperText() {
        C2219 c2219 = this.f3542;
        if (c2219.f9220) {
            return c2219.f9214;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f3542.f9226;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f3557) {
            return this.f3608;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f3551.m4412();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f3551.m4435();
    }

    public ColorStateList getHintTextColor() {
        return this.f3550;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3568.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3568.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3560) {
            return this.f3567;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f3603;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f3581;
    }

    public CharSequence getPrefixText() {
        return this.f3593;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3611.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3611;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3588.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3588.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f3548;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3562.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3562;
    }

    public Typeface getTypeface() {
        return this.f3591;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f3597 != null && this.f3597.getMeasuredHeight() < (max = Math.max(this.f3609.getMeasuredHeight(), this.f3573.getMeasuredHeight()))) {
            this.f3597.setMinimumHeight(max);
            z = true;
        }
        boolean m1530 = m1530();
        if (z || m1530) {
            this.f3597.post(new RunnableC0478());
        }
        if (this.f3563 != null && (editText = this.f3597) != null) {
            this.f3563.setGravity(editText.getGravity());
            this.f3563.setPadding(this.f3597.getCompoundPaddingLeft(), this.f3597.getCompoundPaddingTop(), this.f3597.getCompoundPaddingRight(), this.f3597.getCompoundPaddingBottom());
        }
        m1533();
        m1527();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        setError(savedState.f3622);
        if (savedState.f3621) {
            this.f3568.post(new RunnableC0476());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f3542.m4316()) {
            savedState.f3622 = getError();
        }
        savedState.f3621 = m1542() && this.f3568.isChecked();
        return savedState;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f3559 != i) {
            this.f3559 = i;
            this.f3582 = i;
            this.f3606 = i;
            this.f3589 = i;
            m1522();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C1067.m2405(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f3582 = defaultColor;
        this.f3559 = defaultColor;
        this.f3544 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3606 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f3589 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m1522();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f3565) {
            return;
        }
        this.f3565 = i;
        if (this.f3597 != null) {
            m1539();
        }
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        C2163 c2163 = this.f3594;
        if (c2163 != null && c2163.m4267() == f && this.f3594.m4250() == f2 && this.f3594.m4268() == f4 && this.f3594.m4240() == f3) {
            return;
        }
        C2180 c2180 = this.f3584;
        c2180.getClass();
        C2180.C2181 c2181 = new C2180.C2181(c2180);
        c2181.f9136 = new C2178(f);
        c2181.f9138 = new C2178(f2);
        c2181.f9132 = new C2178(f4);
        c2181.f9130 = new C2178(f3);
        this.f3584 = c2181.m4291();
        m1522();
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.f3586 != i) {
            this.f3586 = i;
            m1520();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f3586 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            m1520();
        } else {
            this.f3614 = colorStateList.getDefaultColor();
            this.f3613 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f3555 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.f3586 = defaultColor;
        m1520();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f3569 != colorStateList) {
            this.f3569 = colorStateList;
            m1520();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f3575 = i;
        m1520();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f3566 = i;
        m1520();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f3617 != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f3592 = appCompatTextView;
                appCompatTextView.setId(C2248.textinput_counter);
                Typeface typeface = this.f3591;
                if (typeface != null) {
                    this.f3592.setTypeface(typeface);
                }
                this.f3592.setMaxLines(1);
                this.f3542.m4315(this.f3592, 2);
                C2786.m4835((ViewGroup.MarginLayoutParams) this.f3592.getLayoutParams(), getResources().getDimensionPixelOffset(C2324.mtrl_textinput_counter_margin_start));
                m1525();
                m1535();
            } else {
                this.f3542.m4319(this.f3592, 2);
                this.f3592 = null;
            }
            this.f3617 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f3553 != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f3553 = i;
            if (this.f3617) {
                m1535();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f3602 != i) {
            this.f3602 = i;
            m1525();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f3580 != colorStateList) {
            this.f3580 = colorStateList;
            m1525();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f3615 != i) {
            this.f3615 = i;
            m1525();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f3578 != colorStateList) {
            this.f3578 = colorStateList;
            m1525();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f3616 = colorStateList;
        this.f3550 = colorStateList;
        if (this.f3597 != null) {
            m1518(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m1510(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f3568.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f3568.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f3568.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C1266.m2928(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f3568.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f3572;
        this.f3572 = i;
        Iterator<InterfaceC0477> it = this.f3543.iterator();
        while (it.hasNext()) {
            it.next().mo1543(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo4302(this.f3565)) {
            getEndIconDelegate().mo4303();
            m1537();
        } else {
            StringBuilder m4207 = C2098.m4207("The current box background mode ");
            m4207.append(this.f3565);
            m4207.append(" is not supported by the end icon mode ");
            m4207.append(i);
            throw new IllegalStateException(m4207.toString());
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f3568;
        View.OnLongClickListener onLongClickListener = this.f3610;
        checkableImageButton.setOnClickListener(onClickListener);
        m1511(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f3610 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f3568;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m1511(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f3604 != colorStateList) {
            this.f3604 = colorStateList;
            this.f3540 = true;
            m1537();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f3571 != mode) {
            this.f3571 = mode;
            this.f3595 = true;
            m1537();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m1529() != z) {
            this.f3568.setVisibility(z ? 0 : 8);
            m1527();
            m1530();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f3542.f9222) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f3542.m4310();
            return;
        }
        C2219 c2219 = this.f3542;
        c2219.m4314();
        c2219.f9230 = charSequence;
        c2219.f9225.setText(charSequence);
        int i = c2219.f9229;
        if (i != 1) {
            c2219.f9212 = 1;
        }
        c2219.m4320(i, c2219.f9212, c2219.m4313(c2219.f9225, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C2219 c2219 = this.f3542;
        c2219.f9228 = charSequence;
        TextView textView = c2219.f9225;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C2219 c2219 = this.f3542;
        if (c2219.f9222 == z) {
            return;
        }
        c2219.m4314();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c2219.f9217);
            c2219.f9225 = appCompatTextView;
            appCompatTextView.setId(C2248.textinput_error);
            if (Build.VERSION.SDK_INT >= 17) {
                c2219.f9225.setTextAlignment(5);
            }
            Typeface typeface = c2219.f9223;
            if (typeface != null) {
                c2219.f9225.setTypeface(typeface);
            }
            int i = c2219.f9215;
            c2219.f9215 = i;
            TextView textView = c2219.f9225;
            if (textView != null) {
                c2219.f9210.m1526(textView, i);
            }
            ColorStateList colorStateList = c2219.f9213;
            c2219.f9213 = colorStateList;
            TextView textView2 = c2219.f9225;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = c2219.f9228;
            c2219.f9228 = charSequence;
            TextView textView3 = c2219.f9225;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            c2219.f9225.setVisibility(4);
            C1096.m2477(c2219.f9225, 1);
            c2219.m4315(c2219.f9225, 0);
        } else {
            c2219.m4310();
            c2219.m4319(c2219.f9225, 0);
            c2219.f9225 = null;
            c2219.f9210.m1538();
            c2219.f9210.m1520();
        }
        c2219.f9222 = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C1266.m2928(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3599.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f3542.f9222);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f3599;
        View.OnLongClickListener onLongClickListener = this.f3564;
        checkableImageButton.setOnClickListener(onClickListener);
        m1511(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f3564 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f3599;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m1511(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f3583 = colorStateList;
        Drawable drawable = this.f3599.getDrawable();
        if (drawable != null) {
            drawable = C2786.m4758(drawable).mutate();
            C2786.m4788(drawable, colorStateList);
        }
        if (this.f3599.getDrawable() != drawable) {
            this.f3599.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3599.getDrawable();
        if (drawable != null) {
            drawable = C2786.m4758(drawable).mutate();
            C2786.m4802(drawable, mode);
        }
        if (this.f3599.getDrawable() != drawable) {
            this.f3599.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C2219 c2219 = this.f3542;
        c2219.f9215 = i;
        TextView textView = c2219.f9225;
        if (textView != null) {
            c2219.f9210.m1526(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C2219 c2219 = this.f3542;
        c2219.f9213 = colorStateList;
        TextView textView = c2219.f9225;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f3542.f9220) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f3542.f9220) {
            setHelperTextEnabled(true);
        }
        C2219 c2219 = this.f3542;
        c2219.m4314();
        c2219.f9214 = charSequence;
        c2219.f9226.setText(charSequence);
        int i = c2219.f9229;
        if (i != 2) {
            c2219.f9212 = 2;
        }
        c2219.m4320(i, c2219.f9212, c2219.m4313(c2219.f9226, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C2219 c2219 = this.f3542;
        c2219.f9219 = colorStateList;
        TextView textView = c2219.f9226;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C2219 c2219 = this.f3542;
        if (c2219.f9220 == z) {
            return;
        }
        c2219.m4314();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c2219.f9217);
            c2219.f9226 = appCompatTextView;
            appCompatTextView.setId(C2248.textinput_helper_text);
            if (Build.VERSION.SDK_INT >= 17) {
                c2219.f9226.setTextAlignment(5);
            }
            Typeface typeface = c2219.f9223;
            if (typeface != null) {
                c2219.f9226.setTypeface(typeface);
            }
            c2219.f9226.setVisibility(4);
            C1096.m2477(c2219.f9226, 1);
            int i = c2219.f9218;
            c2219.f9218 = i;
            TextView textView = c2219.f9226;
            if (textView != null) {
                C2786.m4774(textView, i);
            }
            ColorStateList colorStateList = c2219.f9219;
            c2219.f9219 = colorStateList;
            TextView textView2 = c2219.f9226;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            c2219.m4315(c2219.f9226, 1);
        } else {
            c2219.m4314();
            int i2 = c2219.f9229;
            if (i2 == 2) {
                c2219.f9212 = 0;
            }
            c2219.m4320(i2, c2219.f9212, c2219.m4313(c2219.f9226, null));
            c2219.m4319(c2219.f9226, 1);
            c2219.f9226 = null;
            c2219.f9210.m1538();
            c2219.f9210.m1520();
        }
        c2219.f9220 = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C2219 c2219 = this.f3542;
        c2219.f9218 = i;
        TextView textView = c2219.f9226;
        if (textView != null) {
            C2786.m4774(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f3557) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f3538 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f3557) {
            this.f3557 = z;
            if (z) {
                CharSequence hint = this.f3597.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f3608)) {
                        setHint(hint);
                    }
                    this.f3597.setHint((CharSequence) null);
                }
                this.f3598 = true;
            } else {
                this.f3598 = false;
                if (!TextUtils.isEmpty(this.f3608) && TextUtils.isEmpty(this.f3597.getHint())) {
                    this.f3597.setHint(this.f3608);
                }
                setHintInternal(null);
            }
            if (this.f3597 != null) {
                m1519();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f3551.m4421(i);
        this.f3550 = this.f3551.f9427;
        if (this.f3597 != null) {
            m1518(false, false);
            m1519();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f3550 != colorStateList) {
            if (this.f3616 == null) {
                C2260 c2260 = this.f3551;
                if (c2260.f9427 != colorStateList) {
                    c2260.f9427 = colorStateList;
                    c2260.m4430();
                }
            }
            this.f3550 = colorStateList;
            if (this.f3597 != null) {
                m1518(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3568.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C1266.m2928(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3568.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f3572 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f3604 = colorStateList;
        this.f3540 = true;
        m1537();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f3571 = mode;
        this.f3595 = true;
        m1537();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f3560 && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f3560) {
                setPlaceholderTextEnabled(true);
            }
            this.f3567 = charSequence;
        }
        EditText editText = this.f3597;
        m1536(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f3603 = i;
        TextView textView = this.f3563;
        if (textView != null) {
            C2786.m4774(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f3581 != colorStateList) {
            this.f3581 = colorStateList;
            TextView textView = this.f3563;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f3593 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f3611.setText(charSequence);
        m1531();
    }

    public void setPrefixTextAppearance(int i) {
        C2786.m4774(this.f3611, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3611.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f3588.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f3588.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C1266.m2928(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3588.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m1532();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f3588;
        View.OnLongClickListener onLongClickListener = this.f3574;
        checkableImageButton.setOnClickListener(onClickListener);
        m1511(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f3574 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f3588;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m1511(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f3561 != colorStateList) {
            this.f3561 = colorStateList;
            this.f3605 = true;
            m1532();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f3579 != mode) {
            this.f3579 = mode;
            this.f3577 = true;
            m1532();
        }
    }

    public void setStartIconVisible(boolean z) {
        if ((this.f3588.getVisibility() == 0) != z) {
            this.f3588.setVisibility(z ? 0 : 8);
            m1533();
            m1530();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f3548 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f3562.setText(charSequence);
        m1541();
    }

    public void setSuffixTextAppearance(int i) {
        C2786.m4774(this.f3562, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3562.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0480 c0480) {
        EditText editText = this.f3597;
        if (editText != null) {
            C1096.m2490(editText, c0480);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f3591) {
            this.f3591 = typeface;
            this.f3551.m4432(typeface);
            C2219 c2219 = this.f3542;
            if (typeface != c2219.f9223) {
                c2219.f9223 = typeface;
                TextView textView = c2219.f9225;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = c2219.f9226;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f3592;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final boolean m1512() {
        return this.f3557 && !TextUtils.isEmpty(this.f3608) && (this.f3594 instanceof C2199);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m1513(float f) {
        if (this.f3551.f9412 == f) {
            return;
        }
        if (this.f3554 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3554 = valueAnimator;
            valueAnimator.setInterpolator(C2294.f9507);
            this.f3554.setDuration(167L);
            this.f3554.addUpdateListener(new C0482());
        }
        this.f3554.setFloatValues(this.f3551.f9412, f);
        this.f3554.start();
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final void m1514(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        Drawable mutate = C2786.m4758(drawable).mutate();
        C2786.m4788(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int m1515() {
        float m4412;
        if (!this.f3557) {
            return 0;
        }
        int i = this.f3565;
        if (i == 0 || i == 1) {
            m4412 = this.f3551.m4412();
        } else {
            if (i != 2) {
                return 0;
            }
            m4412 = this.f3551.m4412() / 2.0f;
        }
        return (int) m4412;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int m1516(int i, boolean z) {
        int compoundPaddingRight = i - this.f3597.getCompoundPaddingRight();
        return (this.f3593 == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f3611.getMeasuredWidth() - this.f3611.getPaddingRight());
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final void m1517(boolean z, boolean z2) {
        int defaultColor = this.f3569.getDefaultColor();
        int colorForState = this.f3569.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f3569.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f3547 = colorForState2;
        } else if (z2) {
            this.f3547 = colorForState;
        } else {
            this.f3547 = defaultColor;
        }
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final void m1518(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C2260 c2260;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f3597;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f3597;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean m4316 = this.f3542.m4316();
        ColorStateList colorStateList2 = this.f3616;
        if (colorStateList2 != null) {
            this.f3551.m4418(colorStateList2);
            this.f3551.m4423(this.f3616);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f3616;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f3613) : this.f3613;
            this.f3551.m4418(ColorStateList.valueOf(colorForState));
            this.f3551.m4423(ColorStateList.valueOf(colorForState));
        } else if (m4316) {
            C2260 c22602 = this.f3551;
            TextView textView2 = this.f3542.f9225;
            c22602.m4418(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.f3620 && (textView = this.f3592) != null) {
                c2260 = this.f3551;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.f3550) != null) {
                c2260 = this.f3551;
            }
            c2260.m4418(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || m4316))) {
            if (z2 || this.f3539) {
                ValueAnimator valueAnimator = this.f3554;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f3554.cancel();
                }
                if (z && this.f3538) {
                    m1513(1.0f);
                } else {
                    this.f3551.m4434(1.0f);
                }
                this.f3539 = false;
                if (m1512()) {
                    m1521();
                }
                EditText editText3 = this.f3597;
                m1536(editText3 != null ? editText3.getText().length() : 0);
                m1531();
                m1541();
                return;
            }
            return;
        }
        if (z2 || !this.f3539) {
            ValueAnimator valueAnimator2 = this.f3554;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f3554.cancel();
            }
            if (z && this.f3538) {
                m1513(0.0f);
            } else {
                this.f3551.m4434(0.0f);
            }
            if (m1512() && (!((C2199) this.f3594).f9181.isEmpty()) && m1512()) {
                ((C2199) this.f3594).m4306(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f3539 = true;
            TextView textView3 = this.f3563;
            if (textView3 != null && this.f3560) {
                textView3.setText((CharSequence) null);
                this.f3563.setVisibility(4);
            }
            m1531();
            m1541();
        }
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final void m1519() {
        if (this.f3565 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3546.getLayoutParams();
            int m1515 = m1515();
            if (m1515 != layoutParams.topMargin) {
                layoutParams.topMargin = m1515;
                this.f3546.requestLayout();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* renamed from: ぉひのべい, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1520() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m1520():void");
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final void m1521() {
        float f;
        float m4413;
        float f2;
        if (m1512()) {
            RectF rectF = this.f3552;
            C2260 c2260 = this.f3551;
            int width = this.f3597.getWidth();
            int gravity = this.f3597.getGravity();
            boolean m4422 = c2260.m4422(c2260.f9398);
            c2260.f9403 = m4422;
            if (gravity == 17 || (gravity & 7) == 1) {
                f = width / 2.0f;
                m4413 = c2260.m4413() / 2.0f;
            } else {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? m4422 : !m4422) {
                    f2 = c2260.f9425.left;
                    rectF.left = f2;
                    Rect rect = c2260.f9425;
                    rectF.top = rect.top;
                    rectF.right = (gravity != 17 || (gravity & 7) == 1) ? (width / 2.0f) + (c2260.m4413() / 2.0f) : ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !c2260.f9403 : c2260.f9403) ? rect.right : c2260.m4413() + f2;
                    float m4412 = c2260.m4412() + c2260.f9425.top;
                    rectF.bottom = m4412;
                    float f3 = rectF.left;
                    float f4 = this.f3619;
                    rectF.left = f3 - f4;
                    rectF.top -= f4;
                    rectF.right += f4;
                    rectF.bottom = m4412 + f4;
                    rectF.offset(-getPaddingLeft(), -getPaddingTop());
                    C2199 c2199 = (C2199) this.f3594;
                    c2199.getClass();
                    c2199.m4306(rectF.left, rectF.top, rectF.right, rectF.bottom);
                }
                f = c2260.f9425.right;
                m4413 = c2260.m4413();
            }
            f2 = f - m4413;
            rectF.left = f2;
            Rect rect2 = c2260.f9425;
            rectF.top = rect2.top;
            rectF.right = (gravity != 17 || (gravity & 7) == 1) ? (width / 2.0f) + (c2260.m4413() / 2.0f) : ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !c2260.f9403 : c2260.f9403) ? rect2.right : c2260.m4413() + f2;
            float m44122 = c2260.m4412() + c2260.f9425.top;
            rectF.bottom = m44122;
            float f32 = rectF.left;
            float f42 = this.f3619;
            rectF.left = f32 - f42;
            rectF.top -= f42;
            rectF.right += f42;
            rectF.bottom = m44122 + f42;
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            C2199 c21992 = (C2199) this.f3594;
            c21992.getClass();
            c21992.m4306(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1522() {
        /*
            r6 = this;
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r0 = r6.f3594
            if (r0 != 0) goto L5
            return
        L5:
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.てぜきぽく r1 = r6.f3584
            r0.setShapeAppearanceModel(r1)
            int r0 = r6.f3565
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L21
            int r0 = r6.f3612
            if (r0 <= r2) goto L1c
            int r0 = r6.f3547
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L2e
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r0 = r6.f3594
            int r1 = r6.f3612
            float r1 = (float) r1
            int r5 = r6.f3547
            r0.m4246(r1, r5)
        L2e:
            int r0 = r6.f3559
            int r1 = r6.f3565
            if (r1 != r4) goto L44
            int r0 = p131.p161.p162.p163.C2111.colorSurface
            android.content.Context r1 = r6.getContext()
            int r0 = p034.p095.C1687.m3709(r1, r0, r3)
            int r1 = r6.f3559
            int r0 = p034.p035.p038.C1011.m2352(r1, r0)
        L44:
            r6.f3559 = r0
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r1 = r6.f3594
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.m4252(r0)
            int r0 = r6.f3572
            r1 = 3
            if (r0 != r1) goto L5d
            android.widget.EditText r0 = r6.f3597
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L5d:
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r0 = r6.f3556
            if (r0 != 0) goto L62
            goto L79
        L62:
            int r1 = r6.f3612
            if (r1 <= r2) goto L6b
            int r1 = r6.f3547
            if (r1 == 0) goto L6b
            r3 = 1
        L6b:
            if (r3 == 0) goto L76
            int r1 = r6.f3547
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m4252(r1)
        L76:
            r6.invalidate()
        L79:
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m1522():void");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m1523(InterfaceC0481 interfaceC0481) {
        this.f3541.add(interfaceC0481);
        if (this.f3597 != null) {
            interfaceC0481.mo1544(this);
        }
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void m1524(int i) {
        boolean z = this.f3620;
        int i2 = this.f3553;
        if (i2 == -1) {
            this.f3592.setText(String.valueOf(i));
            this.f3592.setContentDescription(null);
            this.f3620 = false;
        } else {
            this.f3620 = i > i2;
            Context context = getContext();
            this.f3592.setContentDescription(context.getString(this.f3620 ? C2144.character_counter_overflowed_content_description : C2144.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.f3553)));
            if (z != this.f3620) {
                m1525();
            }
            C1136 m2571 = C1136.m2571();
            TextView textView = this.f3592;
            String string = getContext().getString(C2144.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f3553));
            textView.setText(string != null ? m2571.m2573(string, m2571.f5667, true).toString() : null);
        }
        if (this.f3597 == null || z == this.f3620) {
            return;
        }
        m1518(false, false);
        m1520();
        m1538();
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final void m1525() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f3592;
        if (textView != null) {
            m1526(textView, this.f3620 ? this.f3602 : this.f3615);
            if (!this.f3620 && (colorStateList2 = this.f3578) != null) {
                this.f3592.setTextColor(colorStateList2);
            }
            if (!this.f3620 || (colorStateList = this.f3580) == null) {
                return;
            }
            this.f3592.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L11;
     */
    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1526(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            p237.p238.p239.p241.p242.C2786.m4774(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = p131.p161.p162.p163.C2350.TextAppearance_AppCompat_Caption
            p237.p238.p239.p241.p242.C2786.m4774(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = p131.p161.p162.p163.C2224.design_error
            int r4 = p034.p035.p043.C1067.m2405(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m1526(android.widget.TextView, int):void");
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final void m1527() {
        int i;
        if (this.f3597 == null) {
            return;
        }
        if (!m1529()) {
            if (!(this.f3599.getVisibility() == 0)) {
                i = C1096.m2500(this.f3597);
                C1096.m2486(this.f3562, 0, this.f3597.getPaddingTop(), i, this.f3597.getPaddingBottom());
            }
        }
        i = 0;
        C1096.m2486(this.f3562, 0, this.f3597.getPaddingTop(), i, this.f3597.getPaddingBottom());
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1528(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C2786.m4758(drawable).mutate();
            if (z) {
                C2786.m4788(drawable, colorStateList);
            }
            if (z2) {
                C2786.m4802(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean m1529() {
        return this.f3590.getVisibility() == 0 && this.f3568.getVisibility() == 0;
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final boolean m1530() {
        boolean z;
        if (this.f3597 == null) {
            return false;
        }
        boolean z2 = true;
        if (!(getStartIconDrawable() == null && this.f3593 == null) && this.f3573.getMeasuredWidth() > 0) {
            int measuredWidth = this.f3573.getMeasuredWidth() - this.f3597.getPaddingLeft();
            if (this.f3618 == null || this.f3600 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f3618 = colorDrawable;
                this.f3600 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] m4784 = C2786.m4784(this.f3597);
            Drawable drawable = m4784[0];
            Drawable drawable2 = this.f3618;
            if (drawable != drawable2) {
                C2786.m4790(this.f3597, drawable2, m4784[1], m4784[2], m4784[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f3618 != null) {
                Drawable[] m47842 = C2786.m4784(this.f3597);
                C2786.m4790(this.f3597, null, m47842[1], m47842[2], m47842[3]);
                this.f3618 = null;
                z = true;
            }
            z = false;
        }
        if ((this.f3599.getVisibility() == 0 || ((m1542() && m1529()) || this.f3548 != null)) && this.f3609.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f3562.getMeasuredWidth() - this.f3597.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = C2786.m4785((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] m47843 = C2786.m4784(this.f3597);
            Drawable drawable3 = this.f3570;
            if (drawable3 == null || this.f3601 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f3570 = colorDrawable2;
                    this.f3601 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = m47843[2];
                Drawable drawable5 = this.f3570;
                if (drawable4 != drawable5) {
                    this.f3558 = m47843[2];
                    C2786.m4790(this.f3597, m47843[0], m47843[1], drawable5, m47843[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.f3601 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                C2786.m4790(this.f3597, m47843[0], m47843[1], this.f3570, m47843[3]);
            }
        } else {
            if (this.f3570 == null) {
                return z;
            }
            Drawable[] m47844 = C2786.m4784(this.f3597);
            if (m47844[2] == this.f3570) {
                C2786.m4790(this.f3597, m47844[0], m47844[1], this.f3558, m47844[3]);
            } else {
                z2 = z;
            }
            this.f3570 = null;
        }
        return z2;
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public final void m1531() {
        this.f3611.setVisibility((this.f3593 == null || this.f3539) ? 8 : 0);
        m1530();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m1532() {
        m1528(this.f3588, this.f3605, this.f3561, this.f3577, this.f3579);
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final void m1533() {
        if (this.f3597 == null) {
            return;
        }
        C1096.m2486(this.f3611, this.f3588.getVisibility() == 0 ? 0 : C1096.m2513(this.f3597), this.f3597.getCompoundPaddingTop(), 0, this.f3597.getCompoundPaddingBottom());
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final boolean m1534() {
        return this.f3565 == 1 && (Build.VERSION.SDK_INT < 16 || this.f3597.getMinLines() <= 1);
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final void m1535() {
        if (this.f3592 != null) {
            EditText editText = this.f3597;
            m1524(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final void m1536(int i) {
        if (i != 0 || this.f3539) {
            TextView textView = this.f3563;
            if (textView == null || !this.f3560) {
                return;
            }
            textView.setText((CharSequence) null);
            this.f3563.setVisibility(4);
            return;
        }
        TextView textView2 = this.f3563;
        if (textView2 == null || !this.f3560) {
            return;
        }
        textView2.setText(this.f3567);
        this.f3563.setVisibility(0);
        this.f3563.bringToFront();
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m1537() {
        m1528(this.f3568, this.f3540, this.f3604, this.f3595, this.f3571);
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public void m1538() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f3597;
        if (editText == null || this.f3565 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C1210.m2696(background)) {
            background = background.mutate();
        }
        if (this.f3542.m4316()) {
            currentTextColor = this.f3542.m4312();
        } else {
            if (!this.f3620 || (textView = this.f3592) == null) {
                C2786.m4822(background);
                this.f3597.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(C1242.m2866(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1539() {
        /*
            r4 = this;
            int r0 = r4.f3565
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L51
            if (r0 == r2) goto L40
            r3 = 2
            if (r0 != r3) goto L27
            boolean r0 = r4.f3557
            if (r0 == 0) goto L1d
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r0 = r4.f3594
            boolean r0 = r0 instanceof p131.p161.p162.p163.p174.C2199
            if (r0 != 0) goto L1d
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.ぁごぐすすぃ r0 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.ぁごぐすすぃ
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.てぜきぽく r3 = r4.f3584
            r0.<init>(r3)
            goto L24
        L1d:
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r0 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.てぜきぽく r3 = r4.f3584
            r0.<init>(r3)
        L24:
            r4.f3594 = r0
            goto L53
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r4.f3565
            r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L40:
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r0 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.てぜきぽく r1 = r4.f3584
            r0.<init>(r1)
            r4.f3594 = r0
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r0 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ
            r0.<init>()
            r4.f3556 = r0
            goto L55
        L51:
            r4.f3594 = r1
        L53:
            r4.f3556 = r1
        L55:
            android.widget.EditText r0 = r4.f3597
            if (r0 == 0) goto L68
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r1 = r4.f3594
            if (r1 == 0) goto L68
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L68
            int r0 = r4.f3565
            if (r0 == 0) goto L68
            goto L69
        L68:
            r2 = 0
        L69:
            if (r2 == 0) goto L72
            android.widget.EditText r0 = r4.f3597
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r1 = r4.f3594
            p034.p035.p045.C1096.m2484(r0, r1)
        L72:
            r4.m1520()
            int r0 = r4.f3565
            if (r0 == 0) goto L7c
            r4.m1519()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m1539():void");
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final int m1540(int i, boolean z) {
        int compoundPaddingLeft = this.f3597.getCompoundPaddingLeft() + i;
        return (this.f3593 == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f3611.getMeasuredWidth()) + this.f3611.getPaddingLeft();
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final void m1541() {
        int visibility = this.f3562.getVisibility();
        boolean z = (this.f3548 == null || this.f3539) ? false : true;
        this.f3562.setVisibility(z ? 0 : 8);
        if (visibility != this.f3562.getVisibility()) {
            getEndIconDelegate().mo4308(z);
        }
        m1530();
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final boolean m1542() {
        return this.f3572 != 0;
    }
}

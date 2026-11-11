package p131.p161.p162.p163.p174;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import p034.p035.p045.C1096;
import p034.p095.C1687;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.p186.C2294;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2219 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final float f9209;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final TextInputLayout f9210;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Animator f9211;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f9212;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public ColorStateList f9213;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public CharSequence f9214;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f9215;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public LinearLayout f9216;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f9217;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f9218;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public ColorStateList f9219;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f9220;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public FrameLayout f9221;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f9222;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public Typeface f9223;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f9224;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public TextView f9225;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public TextView f9226;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f9227;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public CharSequence f9228;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f9229;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public CharSequence f9230;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.へぬ〴づぞ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2220 extends AnimatorListenerAdapter {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ TextView f9231;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ int f9232;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ int f9233;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ TextView f9235;

        public C2220(int i, TextView textView, int i2, TextView textView2) {
            this.f9233 = i;
            this.f9231 = textView;
            this.f9232 = i2;
            this.f9235 = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            TextView textView;
            C2219 c2219 = C2219.this;
            c2219.f9229 = this.f9233;
            c2219.f9211 = null;
            TextView textView2 = this.f9231;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f9232 == 1 && (textView = C2219.this.f9225) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.f9235;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.f9235.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f9235;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C2219(TextInputLayout textInputLayout) {
        this.f9217 = textInputLayout.getContext();
        this.f9210 = textInputLayout;
        this.f9209 = r0.getResources().getDimensionPixelSize(C2324.design_textinput_caption_translate_y);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m4310() {
        this.f9230 = null;
        m4314();
        if (this.f9229 == 1) {
            this.f9212 = (!this.f9220 || TextUtils.isEmpty(this.f9214)) ? 0 : 2;
        }
        m4320(this.f9229, this.f9212, m4313(this.f9225, null));
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4311() {
        if ((this.f9216 == null || this.f9210.getEditText() == null) ? false : true) {
            C1096.m2486(this.f9216, C1096.m2513(this.f9210.getEditText()), 0, C1096.m2500(this.f9210.getEditText()), 0);
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int m4312() {
        TextView textView = this.f9225;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final boolean m4313(TextView textView, CharSequence charSequence) {
        return C1096.m2517(this.f9210) && this.f9210.isEnabled() && !(this.f9212 == this.f9229 && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m4314() {
        Animator animator = this.f9211;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4315(TextView textView, int i) {
        if (this.f9216 == null && this.f9221 == null) {
            LinearLayout linearLayout = new LinearLayout(this.f9217);
            this.f9216 = linearLayout;
            linearLayout.setOrientation(0);
            this.f9210.addView(this.f9216, -1, -2);
            this.f9221 = new FrameLayout(this.f9217);
            this.f9216.addView(this.f9221, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f9210.getEditText() != null) {
                m4311();
            }
        }
        if (i == 0 || i == 1) {
            this.f9221.setVisibility(0);
            this.f9221.addView(textView);
            this.f9224++;
        } else {
            this.f9216.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f9216.setVisibility(0);
        this.f9227++;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean m4316() {
        return (this.f9212 != 1 || this.f9225 == null || TextUtils.isEmpty(this.f9230)) ? false : true;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final TextView m4317(int i) {
        if (i == 1) {
            return this.f9225;
        }
        if (i != 2) {
            return null;
        }
        return this.f9226;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m4318(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(C2294.f9509);
            list.add(ofFloat);
            if (i3 == i) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f9209, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(C2294.f9511);
                list.add(ofFloat2);
            }
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m4319(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f9216;
        if (linearLayout == null) {
            return;
        }
        if (!(i == 0 || i == 1) || (frameLayout = this.f9221) == null) {
            linearLayout.removeView(textView);
        } else {
            int i2 = this.f9224 - 1;
            this.f9224 = i2;
            if (i2 == 0) {
                frameLayout.setVisibility(8);
            }
            this.f9221.removeView(textView);
        }
        int i3 = this.f9227 - 1;
        this.f9227 = i3;
        LinearLayout linearLayout2 = this.f9216;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m4320(int i, int i2, boolean z) {
        TextView m4317;
        TextView m43172;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f9211 = animatorSet;
            ArrayList arrayList = new ArrayList();
            m4318(arrayList, this.f9220, this.f9226, 2, i, i2);
            m4318(arrayList, this.f9222, this.f9225, 1, i, i2);
            C1687.m3685(animatorSet, arrayList);
            animatorSet.addListener(new C2220(i2, m4317(i), i, m4317(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (m43172 = m4317(i2)) != null) {
                m43172.setVisibility(0);
                m43172.setAlpha(1.0f);
            }
            if (i != 0 && (m4317 = m4317(i)) != null) {
                m4317.setVisibility(4);
                if (i == 1) {
                    m4317.setText((CharSequence) null);
                }
            }
            this.f9229 = i2;
        }
        this.f9210.m1538();
        this.f9210.m1518(z, false);
        this.f9210.m1520();
    }
}

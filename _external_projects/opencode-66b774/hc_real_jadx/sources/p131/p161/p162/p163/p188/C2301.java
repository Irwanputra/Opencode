package p131.p161.p162.p163.p188;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import p034.p035.p045.C1096;
import p034.p095.C1687;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.InterfaceC2169;
import p131.p161.p162.p163.p181.C2235;
import p131.p161.p162.p163.p181.C2236;
import p131.p161.p162.p163.p185.C2267;
import p131.p161.p162.p163.p186.C2291;
import p131.p161.p162.p163.p186.C2294;
import p131.p161.p162.p163.p186.C2295;
import p131.p161.p162.p163.p186.C2296;
import p131.p161.p162.p163.p192.InterfaceC2348;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2301 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f9527;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2163 f9528;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public ArrayList<InterfaceC2307> f9529;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f9531;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final InterfaceC2348 f9533;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public C2291 f9534;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final FloatingActionButton f9535;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public C2291 f9536;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Animator f9537;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Drawable f9538;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2180 f9539;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f9540;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public float f9542;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public ViewTreeObserver.OnPreDrawListener f9543;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Drawable f9544;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final C2267 f9545;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public ArrayList<Animator.AnimatorListener> f9546;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f9548;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C2291 f9550;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C2313 f9553;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public ArrayList<Animator.AnimatorListener> f9554;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public C2291 f9555;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f9556;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f9557;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static final TimeInterpolator f9526 = C2294.f9508;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public static final int[] f9521 = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public static final int[] f9524 = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static final int[] f9525 = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static final int[] f9523 = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static final int[] f9522 = {R.attr.state_enabled};

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public static final int[] f9520 = new int[0];

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f9530 = true;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public float f9551 = 1.0f;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f9541 = 0;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final Rect f9552 = new Rect();

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final RectF f9549 = new RectF();

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public final RectF f9547 = new RectF();

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final Matrix f9532 = new Matrix();

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.〳ぜぞぜべっ$〳ぜぞぜべっ, reason: contains not printable characters */
    public abstract class AbstractC2302 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f9558;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f9559;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f9560;

        public AbstractC2302(C2319 c2319) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2301.this.m4462((int) this.f9559);
            this.f9560 = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f9560) {
                C2163 c2163 = C2301.this.f9528;
                this.f9558 = c2163 == null ? 0.0f : c2163.f9045.f9072;
                this.f9559 = mo4481();
                this.f9560 = true;
            }
            C2301 c2301 = C2301.this;
            float f = this.f9558;
            c2301.m4462((int) ((valueAnimator.getAnimatedFraction() * (this.f9559 - f)) + f));
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public abstract float mo4481();
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.〳ぜぞぜべっ$〺つふすそ, reason: contains not printable characters */
    public class C2303 extends AbstractC2302 {
        public C2303(C2301 c2301) {
            super(null);
        }

        @Override // p131.p161.p162.p163.p188.C2301.AbstractC2302
        /* renamed from: げつ〴ぬぐ */
        public float mo4481() {
            return 0.0f;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.〳ぜぞぜべっ$ぁごぐすすぃ, reason: contains not printable characters */
    public class C2304 extends AbstractC2302 {
        public C2304() {
            super(null);
        }

        @Override // p131.p161.p162.p163.p188.C2301.AbstractC2302
        /* renamed from: げつ〴ぬぐ */
        public float mo4481() {
            return C2301.this.f9527;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.〳ぜぞぜべっ$くし〴〺ぅ, reason: contains not printable characters */
    public class C2305 extends AbstractC2302 {
        public C2305() {
            super(null);
        }

        @Override // p131.p161.p162.p163.p188.C2301.AbstractC2302
        /* renamed from: げつ〴ぬぐ */
        public float mo4481() {
            C2301 c2301 = C2301.this;
            return c2301.f9527 + c2301.f9556;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2306 extends C2296 {
        public C2306() {
        }

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C2301.this.f9551 = f;
            matrix.getValues(this.f9515);
            matrix2.getValues(this.f9513);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f9513;
                float f2 = fArr[i];
                float[] fArr2 = this.f9515;
                fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
            }
            this.f9514.setValues(this.f9513);
            return this.f9514;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.〳ぜぞぜべっ$づざかべべ, reason: contains not printable characters */
    public interface InterfaceC2307 {
        /* renamed from: 〺つふすそ */
        void mo1439();

        /* renamed from: げつ〴ぬぐ */
        void mo1440();
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.〳ぜぞぜべっ$なぎぱいぢぎ, reason: contains not printable characters */
    public interface InterfaceC2308 {
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.〳ぜぞぜべっ$びぐびあび, reason: contains not printable characters */
    public class C2309 extends AbstractC2302 {
        public C2309() {
            super(null);
        }

        @Override // p131.p161.p162.p163.p188.C2301.AbstractC2302
        /* renamed from: げつ〴ぬぐ */
        public float mo4481() {
            C2301 c2301 = C2301.this;
            return c2301.f9527 + c2301.f9531;
        }
    }

    public C2301(FloatingActionButton floatingActionButton, InterfaceC2348 interfaceC2348) {
        this.f9535 = floatingActionButton;
        this.f9533 = interfaceC2348;
        C2267 c2267 = new C2267();
        this.f9545 = c2267;
        c2267.m4438(f9521, m4465(new C2309()));
        c2267.m4438(f9524, m4465(new C2305()));
        c2267.m4438(f9525, m4465(new C2305()));
        c2267.m4438(f9523, m4465(new C2305()));
        c2267.m4438(f9522, m4465(new C2304()));
        c2267.m4438(f9520, m4465(new C2303(this)));
        this.f9542 = floatingActionButton.getRotation();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean m4456() {
        return this.f9535.getVisibility() == 0 ? this.f9541 == 1 : this.f9541 != 2;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final AnimatorSet m4457(C2291 c2291, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9535, (Property<FloatingActionButton, Float>) View.ALPHA, f);
        c2291.m4454("opacity").m4448(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9535, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        c2291.m4454("scale").m4448(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new C2321(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f9535, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        c2291.m4454("scale").m4448(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new C2321(this));
        }
        arrayList.add(ofFloat3);
        m4466(f3, this.f9532);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f9535, new C2295(), new C2306(), new Matrix(this.f9532));
        c2291.m4454("iconScale").m4448(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C1687.m3685(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final void m4458() {
        FloatingActionButton.C0444 c0444;
        Drawable drawable;
        Rect rect = this.f9552;
        mo4473(rect);
        C2786.m4836(this.f9544, "Didn't initialize content background");
        if (!mo4467()) {
            InterfaceC2348 interfaceC2348 = this.f9533;
            Drawable drawable2 = this.f9544;
            FloatingActionButton.C0444 c04442 = (FloatingActionButton.C0444) interfaceC2348;
            c04442.getClass();
            if (drawable2 != null) {
                c0444 = c04442;
                drawable = drawable2;
            }
            InterfaceC2348 interfaceC23482 = this.f9533;
            int i = rect.left;
            int i2 = rect.top;
            int i3 = rect.right;
            int i4 = rect.bottom;
            FloatingActionButton.C0444 c04443 = (FloatingActionButton.C0444) interfaceC23482;
            FloatingActionButton.this.f3291.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            int i5 = floatingActionButton.f3293;
            floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
        }
        drawable = new InsetDrawable(this.f9544, rect.left, rect.top, rect.right, rect.bottom);
        c0444 = (FloatingActionButton.C0444) this.f9533;
        c0444.getClass();
        super/*android.widget.ImageButton*/.setBackgroundDrawable(drawable);
        InterfaceC2348 interfaceC234822 = this.f9533;
        int i6 = rect.left;
        int i22 = rect.top;
        int i32 = rect.right;
        int i42 = rect.bottom;
        FloatingActionButton.C0444 c044432 = (FloatingActionButton.C0444) interfaceC234822;
        FloatingActionButton.this.f3291.set(i6, i22, i32, i42);
        FloatingActionButton floatingActionButton2 = FloatingActionButton.this;
        int i52 = floatingActionButton2.f3293;
        floatingActionButton2.setPadding(i6 + i52, i22 + i52, i32 + i52, i42 + i52);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void mo4459(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        C2163 mo4476 = mo4476();
        this.f9528 = mo4476;
        mo4476.setTintList(colorStateList);
        if (mode != null) {
            this.f9528.setTintMode(mode);
        }
        this.f9528.m4266(-12303292);
        this.f9528.m4249(this.f9535.getContext());
        C2236 c2236 = new C2236(this.f9528.f9045.f9074);
        c2236.setTintList(C2235.m4345(colorStateList2));
        this.f9538 = c2236;
        C2163 c2163 = this.f9528;
        c2163.getClass();
        this.f9544 = new LayerDrawable(new Drawable[]{c2163, c2236});
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void mo4460() {
        C2267 c2267 = this.f9545;
        ValueAnimator valueAnimator = c2267.f9455;
        if (valueAnimator != null) {
            valueAnimator.end();
            c2267.f9455 = null;
        }
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean mo4461() {
        return true;
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public void m4462(float f) {
        C2163 c2163 = this.f9528;
        if (c2163 != null) {
            C2163.C2164 c2164 = c2163.f9045;
            if (c2164.f9072 != f) {
                c2164.f9072 = f;
                c2163.m4269();
            }
        }
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final void m4463(float f) {
        this.f9551 = f;
        Matrix matrix = this.f9532;
        m4466(f, matrix);
        this.f9535.setImageMatrix(matrix);
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void m4464() {
        ArrayList<InterfaceC2307> arrayList = this.f9529;
        if (arrayList != null) {
            Iterator<InterfaceC2307> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo1440();
            }
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final ValueAnimator m4465(AbstractC2302 abstractC2302) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f9526);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC2302);
        valueAnimator.addUpdateListener(abstractC2302);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m4466(float f, Matrix matrix) {
        matrix.reset();
        if (this.f9535.getDrawable() == null || this.f9540 == 0) {
            return;
        }
        RectF rectF = this.f9549;
        RectF rectF2 = this.f9547;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i = this.f9540;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f9540;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean mo4467() {
        return true;
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final boolean m4468() {
        return C1096.m2517(this.f9535) && !this.f9535.isInEditMode();
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void mo4469(ColorStateList colorStateList) {
        Drawable drawable = this.f9538;
        if (drawable != null) {
            C2786.m4788(drawable, C2235.m4345(colorStateList));
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float mo4470() {
        return this.f9527;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void mo4471(int[] iArr) {
        C2267.C2268 c2268;
        ValueAnimator valueAnimator;
        C2267 c2267 = this.f9545;
        int size = c2267.f9456.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c2268 = null;
                break;
            }
            c2268 = c2267.f9456.get(i);
            if (StateSet.stateSetMatches(c2268.f9459, iArr)) {
                break;
            } else {
                i++;
            }
        }
        C2267.C2268 c22682 = c2267.f9454;
        if (c2268 == c22682) {
            return;
        }
        if (c22682 != null && (valueAnimator = c2267.f9455) != null) {
            valueAnimator.cancel();
            c2267.f9455 = null;
        }
        c2267.f9454 = c2268;
        if (c2268 != null) {
            ValueAnimator valueAnimator2 = c2268.f9458;
            c2267.f9455 = valueAnimator2;
            valueAnimator2.start();
        }
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final boolean m4472() {
        return !this.f9548 || this.f9535.getSizeDimension() >= this.f9557;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo4473(Rect rect) {
        int sizeDimension = this.f9548 ? (this.f9557 - this.f9535.getSizeDimension()) / 2 : 0;
        int max = Math.max(sizeDimension, (int) Math.ceil(this.f9530 ? mo4470() + this.f9531 : 0.0f));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void mo4474(float f, float f2, float f3) {
        m4458();
        m4462(f);
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final void m4475(C2180 c2180) {
        this.f9539 = c2180;
        C2163 c2163 = this.f9528;
        if (c2163 != null) {
            c2163.f9045.f9074 = c2180;
            c2163.invalidateSelf();
        }
        Object obj = this.f9538;
        if (obj instanceof InterfaceC2169) {
            ((InterfaceC2169) obj).setShapeAppearanceModel(c2180);
        }
        C2313 c2313 = this.f9553;
        if (c2313 != null) {
            c2313.f9581 = c2180;
            c2313.invalidateSelf();
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C2163 mo4476() {
        C2180 c2180 = this.f9539;
        c2180.getClass();
        return new C2163(c2180);
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public void mo4477() {
        FloatingActionButton floatingActionButton;
        int i;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f9542 % 90.0f != 0.0f) {
                i = 1;
                if (this.f9535.getLayerType() != 1) {
                    floatingActionButton = this.f9535;
                    floatingActionButton.setLayerType(i, null);
                }
            } else if (this.f9535.getLayerType() != 0) {
                floatingActionButton = this.f9535;
                i = 0;
                floatingActionButton.setLayerType(i, null);
            }
        }
        C2163 c2163 = this.f9528;
        if (c2163 != null) {
            c2163.m4242((int) this.f9542);
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m4478() {
        ArrayList<InterfaceC2307> arrayList = this.f9529;
        if (arrayList != null) {
            Iterator<InterfaceC2307> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo1439();
            }
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean m4479() {
        return this.f9535.getVisibility() != 0 ? this.f9541 == 2 : this.f9541 != 1;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void mo4480() {
    }
}

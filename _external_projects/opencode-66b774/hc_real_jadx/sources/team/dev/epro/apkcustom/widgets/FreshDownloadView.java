package team.dev.epro.apkcustom.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import p234.p235.p236.C2776;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class FreshDownloadView extends View {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public RectF f4137;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float f4138;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public float f4139;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public boolean f4140;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Rect f4141;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public DashPathEffect f4142;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f4143;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public Path f4144;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f4145;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public float f4146;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public AnimatorSet f4147;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public AnimatorSet f4148;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public float f4149;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public float f4150;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public PathMeasure f4151;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public float f4152;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public AnimatorSet f4153;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f4154;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public float f4155;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public DashPathEffect f4156;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean f4157;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public float f4158;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public float f4159;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public Path f4160;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public PathMeasure f4161;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public EnumC0569 f4162;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f4163;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public EnumC0570 f4164;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f4165;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public float f4166;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public Path f4167;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public DashPathEffect f4168;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f4169;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public Paint f4170;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public Rect f4171;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public float f4172;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public float f4173;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public Path f4174;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f4175;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public float f4176;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public float f4177;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f4178;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f4179;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public PathMeasure f4180;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float f4181;

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$〳ぜぞぜべっ, reason: contains not printable characters */
    public class C0565 extends AnimatorListenerAdapter {
        public C0565() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FreshDownloadView freshDownloadView = FreshDownloadView.this;
            freshDownloadView.f4156 = null;
            freshDownloadView.f4142 = null;
            freshDownloadView.f4168 = null;
            freshDownloadView.m1712();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$〺つふすそ, reason: contains not printable characters */
    public class C0566 extends AnimatorListenerAdapter {
        public C0566() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            FreshDownloadView.this.f4157 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FreshDownloadView.this.f4157 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FreshDownloadView.this.f4157 = true;
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$ぁごぐすすぃ, reason: contains not printable characters */
    public class C0567 implements ValueAnimator.AnimatorUpdateListener {
        public C0567() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FreshDownloadView freshDownloadView = FreshDownloadView.this;
            float f = FreshDownloadView.this.f4152;
            freshDownloadView.f4168 = new DashPathEffect(new float[]{f, f}, f * floatValue);
            FreshDownloadView freshDownloadView2 = FreshDownloadView.this;
            float f2 = FreshDownloadView.this.f4139;
            freshDownloadView2.f4142 = new DashPathEffect(new float[]{f2, f2}, f2 * floatValue);
            FreshDownloadView freshDownloadView3 = FreshDownloadView.this;
            float f3 = (freshDownloadView3.f4155 - freshDownloadView3.f4181) * (1.0f - floatValue);
            freshDownloadView3.f4167.reset();
            FreshDownloadView freshDownloadView4 = FreshDownloadView.this;
            freshDownloadView4.f4167.moveTo(freshDownloadView4.f4179 + freshDownloadView4.f4138, freshDownloadView4.f4181 + f3);
            FreshDownloadView freshDownloadView5 = FreshDownloadView.this;
            freshDownloadView5.f4167.lineTo(freshDownloadView5.f4179 + freshDownloadView5.f4138, freshDownloadView5.f4181 + f3 + freshDownloadView5.f4146);
            FreshDownloadView freshDownloadView6 = FreshDownloadView.this;
            float f4 = FreshDownloadView.this.f4146;
            freshDownloadView6.f4156 = new DashPathEffect(new float[]{f4, f4}, floatValue * f4);
            FreshDownloadView.this.invalidate();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$いいにぽつ, reason: contains not printable characters */
    public class C0568 extends AnimatorListenerAdapter {
        public C0568() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            FreshDownloadView.this.f4143 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FreshDownloadView.this.f4143 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FreshDownloadView.this.f4143 = true;
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$ぇぬぎばつ, reason: contains not printable characters */
    public enum EnumC0569 {
        f4186,
        f4187
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$おぐぴう〸ず, reason: contains not printable characters */
    public enum EnumC0570 {
        f4189,
        f4190,
        f4193,
        f4191
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$くし〴〺ぅ, reason: contains not printable characters */
    public class C0571 implements ValueAnimator.AnimatorUpdateListener {
        public C0571() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FreshDownloadView freshDownloadView = FreshDownloadView.this;
            freshDownloadView.f4149 = floatValue;
            freshDownloadView.invalidate();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0572 extends AnimatorListenerAdapter {
        public C0572() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            FreshDownloadView.this.f4145 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FreshDownloadView.this.f4145 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FreshDownloadView.this.f4145 = true;
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$づざかべべ, reason: contains not printable characters */
    public class C0573 extends AnimatorListenerAdapter {
        public C0573() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            FreshDownloadView.this.f4140 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FreshDownloadView.this.f4140 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FreshDownloadView.this.f4140 = true;
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$てぜきぽく, reason: contains not printable characters */
    public class C0574 extends AnimatorListenerAdapter {
        public C0574() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FreshDownloadView.this.f4162 = EnumC0569.f4187;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FreshDownloadView.this.f4162 = EnumC0569.f4186;
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$なぎぱいぢぎ, reason: contains not printable characters */
    public class C0575 implements ValueAnimator.AnimatorUpdateListener {
        public C0575() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FreshDownloadView freshDownloadView = FreshDownloadView.this;
            freshDownloadView.f4177 = (freshDownloadView.getRadius() * 0.52f * floatValue) + freshDownloadView.f4155;
            FreshDownloadView.this.m1712();
            FreshDownloadView.this.invalidate();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$のぷのちつ, reason: contains not printable characters */
    public class C0576 implements ValueAnimator.AnimatorUpdateListener {
        public C0576() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            FreshDownloadView.this.f4159 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FreshDownloadView.this.invalidate();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$びぐびあび, reason: contains not printable characters */
    public class C0577 implements ValueAnimator.AnimatorUpdateListener {
        public C0577() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            FreshDownloadView.this.f4176 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FreshDownloadView.this.invalidate();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$へぬ〴づぞ, reason: contains not printable characters */
    public class C0578 implements ValueAnimator.AnimatorUpdateListener {
        public C0578() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            FreshDownloadView.this.f4172 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FreshDownloadView.this.invalidate();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$ぺぁあねじ, reason: contains not printable characters */
    public class C0579 extends AnimatorListenerAdapter {
        public C0579() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FreshDownloadView freshDownloadView = FreshDownloadView.this;
            freshDownloadView.f4164 = EnumC0570.f4190;
            freshDownloadView.invalidate();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.widgets.FreshDownloadView$ぺふねづ〺, reason: contains not printable characters */
    public class C0580 implements ValueAnimator.AnimatorUpdateListener {
        public C0580() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            FreshDownloadView.this.f4150 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FreshDownloadView.this.invalidate();
        }
    }

    public FreshDownloadView(Context context) {
        this(context, null);
    }

    public FreshDownloadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FreshDownloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4143 = false;
        this.f4145 = false;
        this.f4174 = new Path();
        this.f4164 = EnumC0570.f4189;
        this.f4169 = getResources().getDimension(2131165351);
        this.f4141 = new Rect();
        this.f4137 = new RectF();
        this.f4170 = new Paint();
        this.f4167 = new Path();
        this.f4144 = new Path();
        this.f4160 = new Path();
        this.f4180 = new PathMeasure();
        this.f4151 = new PathMeasure();
        this.f4161 = new PathMeasure();
        this.f4171 = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2776.FreshDownloadView);
        if (obtainStyledAttributes != null) {
            try {
                setRadius(obtainStyledAttributes.getDimension(2, getResources().getDimension(2131165292)));
                setCircularColor(obtainStyledAttributes.getColor(0, getResources().getColor(2131099734)));
                setProgressColor(obtainStyledAttributes.getColor(1, getResources().getColor(2131099724)));
                setCircularWidth(obtainStyledAttributes.getDimension(3, getResources().getDimension(2131165290)));
                setProgressTextSize(obtainStyledAttributes.getDimension(4, getResources().getDimension(2131165293)));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f4170.setStrokeCap(Paint.Cap.ROUND);
        this.f4170.setStrokeWidth(getCircularWidth());
        this.f4170.setStyle(Paint.Style.STROKE);
        this.f4170.setAntiAlias(true);
    }

    private int getCurrentHeight() {
        return (int) ((this.f4169 * 2.0f) + (getRadius() * 2.0f));
    }

    private int getCurrentWidth() {
        return (int) ((this.f4169 * 2.0f) + (getRadius() * 2.0f));
    }

    private AnimatorSet getDownLoadErrorAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator duration = ValueAnimator.ofFloat(0.2f, 0.8f).setDuration(300L);
        duration.setInterpolator(new OvershootInterpolator());
        duration.addUpdateListener(new C0571());
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.2f, 0.8f).setDuration(300L);
        duration2.setInterpolator(new OvershootInterpolator());
        duration2.addUpdateListener(new C0577());
        animatorSet.play(duration);
        animatorSet.play(duration2).after(100L);
        animatorSet.addListener(new C0573());
        return animatorSet;
    }

    private AnimatorSet getDownloadOkAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 65.0f).setDuration(100L);
        duration.addUpdateListener(new C0580());
        duration.addListener(new C0574());
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 0.7f).setDuration(200L);
        duration2.setInterpolator(new AccelerateInterpolator());
        duration2.addUpdateListener(new C0576());
        ValueAnimator duration3 = ValueAnimator.ofFloat(0.0f, 0.35f, 0.2f).setDuration(500L);
        duration3.addUpdateListener(new C0578());
        duration3.addListener(new C0572());
        animatorSet.play(duration2).after(duration);
        animatorSet.play(duration3).after(200L);
        animatorSet.addListener(new C0566());
        return animatorSet;
    }

    private AnimatorSet getPrepareAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.3f, 0.0f).setDuration(500L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new C0575());
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(800L);
        duration2.setInterpolator(new DecelerateInterpolator());
        duration2.addUpdateListener(new C0567());
        duration2.addListener(new C0565());
        animatorSet.addListener(new C0579());
        animatorSet.play(duration).before(duration2);
        animatorSet.addListener(new C0568());
        return animatorSet;
    }

    public int getCircularColor() {
        return this.f4154;
    }

    public float getCircularWidth() {
        return this.f4163;
    }

    public int getProgressColor() {
        return this.f4175;
    }

    public float getProgressTextSize() {
        return this.f4165;
    }

    public float getRadius() {
        return this.f4138;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f4170.setPathEffect(null);
        this.f4170.setStyle(Paint.Style.STROKE);
        this.f4170.setColor(getCircularColor());
        RectF rectF = this.f4137;
        rectF.set(this.f4141);
        float f = this.f4169;
        rectF.inset(f, f);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f4170);
        int ordinal = this.f4164.ordinal();
        if (ordinal == 0) {
            this.f4170.setColor(getProgressColor());
            DashPathEffect dashPathEffect = this.f4156;
            if (dashPathEffect != null) {
                this.f4170.setPathEffect(dashPathEffect);
            }
            canvas.drawPath(this.f4167, this.f4170);
            DashPathEffect dashPathEffect2 = this.f4168;
            if (dashPathEffect2 != null) {
                this.f4170.setPathEffect(dashPathEffect2);
            }
            canvas.drawPath(this.f4144, this.f4170);
            DashPathEffect dashPathEffect3 = this.f4142;
            if (dashPathEffect3 != null) {
                this.f4170.setPathEffect(dashPathEffect3);
            }
            canvas.drawPath(this.f4160, this.f4170);
            return;
        }
        if (ordinal == 1) {
            float f2 = this.f4173;
            this.f4170.setColor(getProgressColor());
            if (f2 <= 0.0f) {
                canvas.drawPoint(this.f4179 + this.f4138, this.f4181, this.f4170);
            } else {
                canvas.drawArc(rectF, -90.0f, f2 * 360.0f, false, this.f4170);
            }
            m1710(canvas, f2);
            return;
        }
        if (ordinal == 2) {
            EnumC0569 enumC0569 = this.f4162;
            float f3 = this.f4150;
            this.f4170.setColor(getProgressColor());
            int ordinal2 = enumC0569.ordinal();
            if (ordinal2 == 0) {
                canvas.drawArc(rectF, 270.0f - f3, 0.36f, false, this.f4170);
                return;
            }
            if (ordinal2 != 1) {
                return;
            }
            Path path = this.f4174;
            path.reset();
            path.lineTo(0.0f, 0.0f);
            PathMeasure pathMeasure = this.f4180;
            float f4 = this.f4172;
            float f5 = this.f4178;
            pathMeasure.getSegment(f4 * f5, (f4 + this.f4159) * f5, path, true);
            canvas.drawPath(path, this.f4170);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        if (this.f4145) {
            m1710(canvas, this.f4173);
        }
        this.f4170.setColor(-1);
        Path path2 = this.f4174;
        path2.reset();
        path2.lineTo(0.0f, 0.0f);
        PathMeasure pathMeasure2 = this.f4180;
        float f6 = this.f4158;
        pathMeasure2.getSegment(f6 * 0.2f, this.f4176 * f6, path2, true);
        canvas.drawPath(path2, this.f4170);
        path2.reset();
        path2.lineTo(0.0f, 0.0f);
        PathMeasure pathMeasure3 = this.f4151;
        float f7 = this.f4166;
        pathMeasure3.getSegment(0.2f * f7, this.f4149 * f7, path2, true);
        canvas.drawPath(path2, this.f4170);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingRight = getPaddingRight() + getPaddingLeft() + getCurrentWidth() + 0;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + getCurrentHeight() + 0;
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSizeAndState(paddingRight, i, 0)), Math.max(getSuggestedMinimumHeight(), View.resolveSizeAndState(paddingBottom, i2, 0)));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f4154 = bundle.getInt(Crypt.a(Crypt.xrc("\u001agk\u001bej\u00196h\u001ddmM4:\u00193iLbm\u0019a=MekI3:\u001da")));
        this.f4175 = bundle.getInt(Crypt.a(Crypt.xrc("\u0019k;Kfh\u001969N`i\u001eji\u001b`iIb<O7n\u001d6iMb:K3nJefNclKd<I3i\u001c1m\u001d7gJdjNcgAglK7fJ")));
        this.f4163 = bundle.getFloat(Crypt.a(Crypt.xrc("\u001c6=\u001c3lOcnA4;Kei\u001a0<@foLknJ7nK79L6")));
        this.f4173 = bundle.getFloat(Crypt.a(Crypt.xrc("\u001b7>@fl\u00190>H4nK4=\u001d0;L3nO1mL`m\u001ea>Me")));
        this.f4138 = bundle.getFloat(Crypt.a(Crypt.xrc("Igg\u001cgf\u00191fAc;O4j\u0019c<\u001a69O7gLkf\u001d6<\u001ee")));
        this.f4164 = (EnumC0570) bundle.getSerializable(Crypt.a(Crypt.xrc("LcgL7<\u0019a>OjmO6jHkiAe>@a;\u001aa=KkjH1")));
        this.f4165 = bundle.getFloat(Crypt.a(Crypt.xrc("\u00196iL0>\u001c49K4o\u001b0gMcn\u001a1>Jag\u0019a=\u0019joM0<L1oL6fLf;M3o@7k\u001d1m\u001eg=Jf>O1jKagL")));
        super.onRestoreInstanceState(bundle.getParcelable(Crypt.a(Crypt.xrc("\u001ajkLe=\u001a0<Ha9\u001a6l\u001c6iJ4gMjn\u001c6f\u0019j9J1"))));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(Crypt.a(Crypt.xrc("\u001ajkLe=\u001a0<Ha9\u001a6l\u001c6iJ4gMjn\u001c6f\u0019j9J1")), super.onSaveInstanceState());
        bundle.putInt(Crypt.a(Crypt.xrc("\u001agk\u001bej\u00196h\u001ddmM4:\u00193iLbm\u0019a=MekI3:\u001da")), this.f4154);
        bundle.putInt(Crypt.a(Crypt.xrc("\u0019k;Kfh\u001969N`i\u001eji\u001b`iIb<O7n\u001d6iMb:K3nJefNclKd<I3i\u001c1m\u001d7gJdjNcgAglK7fJ")), this.f4175);
        bundle.putFloat(Crypt.a(Crypt.xrc("\u001c6=\u001c3lOcnA4;Kei\u001a0<@foLknJ7nK79L6")), this.f4163);
        bundle.putFloat(Crypt.a(Crypt.xrc("\u001b7>@fl\u00190>H4nK4=\u001d0;L3nO1mL`m\u001ea>Me")), this.f4173);
        bundle.putFloat(Crypt.a(Crypt.xrc("Igg\u001cgf\u00191fAc;O4j\u0019c<\u001a69O7gLkf\u001d6<\u001ee")), this.f4138);
        bundle.putSerializable(Crypt.a(Crypt.xrc("LcgL7<\u0019a>OjmO6jHkiAe>@a;\u001aa=KkjH1")), this.f4164);
        bundle.putFloat(Crypt.a(Crypt.xrc("\u00196iL0>\u001c49K4o\u001b0gMcn\u001a1>Jag\u0019a=\u0019joM0<L1oL6fLf;M3o@7k\u001d1m\u001eg=Jf>O1jKagL")), this.f4165);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop() + 0;
        int height = getHeight() - getPaddingBottom();
        int paddingLeft = getPaddingLeft() + 0;
        this.f4141.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), height);
        m1708(paddingTop, paddingLeft, getRadius());
    }

    public void setCircularColor(int i) {
        this.f4154 = i;
    }

    public void setCircularWidth(float f) {
        this.f4163 = f;
    }

    public void setProgressColor(int i) {
        this.f4175 = i;
    }

    public synchronized void setProgressInternal(float f) {
        AnimatorSet animatorSet;
        this.f4173 = f;
        if (this.f4164 == EnumC0570.f4189 && ((animatorSet = this.f4148) == null || !this.f4143)) {
            if (animatorSet == null) {
                this.f4148 = getPrepareAnimator();
            }
            this.f4148.start();
        }
        invalidate();
        if (f >= 1.0f) {
            m1711();
        }
    }

    public void setProgressTextSize(float f) {
        this.f4165 = f;
    }

    public void setRadius(float f) {
        this.f4138 = f;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1708(int i, int i2, float f) {
        float f2 = this.f4169;
        float f3 = i + f2;
        this.f4179 = i2 + f2;
        this.f4181 = f3;
        float f4 = (f * 0.48f) + f3;
        this.f4155 = f4;
        this.f4177 = f4;
        this.f4164 = EnumC0570.f4189;
        m1712();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m1709() {
        if (this.f4164 == EnumC0570.f4190 || this.f4143 || this.f4140 || this.f4157) {
            return;
        }
        this.f4164 = EnumC0570.f4189;
        this.f4177 = this.f4155;
        m1712();
        postInvalidate();
        this.f4173 = 0.0f;
        this.f4159 = 0.0f;
        this.f4150 = 0.0f;
        this.f4172 = 0.0f;
        this.f4149 = 0.0f;
        this.f4176 = 0.0f;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1710(Canvas canvas, float f) {
        String valueOf = String.valueOf(Math.round(f * 100.0f));
        Rect rect = this.f4141;
        this.f4170.setStyle(Paint.Style.FILL);
        this.f4170.setTextSize(getProgressTextSize());
        this.f4170.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetricsInt fontMetricsInt = this.f4170.getFontMetricsInt();
        float f2 = (((rect.bottom + rect.top) - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
        canvas.drawText(valueOf, rect.centerX(), f2, this.f4170);
        this.f4170.getTextBounds(valueOf, 0, valueOf.length(), this.f4171);
        this.f4170.setTextSize(getProgressTextSize() / 3.0f);
        this.f4170.setTextAlign(Paint.Align.LEFT);
        canvas.drawText(Crypt.a(Crypt.xrc("L7<\u001c6kAakMkj@0=M3l\u00191>\u001ekf@f;OaiH1")), (this.f4138 * 0.1f) + (this.f4171.width() / 2) + rect.centerX(), f2, this.f4170);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m1711() {
        this.f4164 = EnumC0570.f4193;
        this.f4167.reset();
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        double cos = Math.cos(Math.toRadians(25.0d));
        double radius = getRadius();
        Double.isNaN(radius);
        Double.isNaN(radius);
        double d = cos * radius;
        double sin = Math.sin(Math.toRadians(25.0d));
        double radius2 = getRadius();
        Double.isNaN(radius2);
        Double.isNaN(radius2);
        double d2 = sin * radius2;
        double cos2 = Math.cos(Math.toRadians(53.0d)) * 2.0d * d;
        Math.sin(Math.toRadians(53.0d));
        double cos3 = Math.cos(Math.toRadians(53.0d)) * cos2;
        Path path = this.f4167;
        double d3 = measuredWidth;
        Double.isNaN(d3);
        Double.isNaN(d3);
        double d4 = d3 - d;
        double d5 = measuredHeight;
        Double.isNaN(d5);
        Double.isNaN(d5);
        double d6 = d5 - d2;
        float f = (float) d6;
        path.moveTo((float) d4, f);
        this.f4167.lineTo((float) (d4 + cos3), (float) ((Math.sin(Math.toRadians(53.0d)) * cos2) + d6));
        Path path2 = this.f4167;
        Double.isNaN(d3);
        Double.isNaN(d3);
        path2.lineTo((float) (d3 + d), f);
        this.f4180.setPath(this.f4167, false);
        this.f4178 = this.f4180.getLength();
        AnimatorSet animatorSet = this.f4153;
        if (animatorSet == null || !this.f4157) {
            if (animatorSet == null) {
                this.f4153 = getDownloadOkAnimator();
            }
            this.f4153.start();
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m1712() {
        this.f4167.reset();
        this.f4144.reset();
        this.f4160.reset();
        this.f4167.moveTo(this.f4179 + this.f4138, this.f4177);
        Path path = this.f4167;
        float f = this.f4179;
        float f2 = this.f4138;
        path.lineTo(f + f2, this.f4177 + f2);
        Path path2 = this.f4144;
        float f3 = this.f4179;
        float f4 = this.f4138;
        path2.moveTo(f3 + f4, this.f4177 + f4);
        Path path3 = this.f4144;
        double d = this.f4179 + this.f4138;
        double tan = Math.tan(Math.toRadians(40.0d));
        float f5 = this.f4138;
        double d2 = f5;
        Double.isNaN(d2);
        Double.isNaN(d);
        path3.lineTo((float) (d - ((tan * d2) * 0.46000000834465027d)), (this.f4177 + f5) - (f5 * 0.46f));
        Path path4 = this.f4160;
        float f6 = this.f4179;
        float f7 = this.f4138;
        path4.moveTo(f6 + f7, this.f4177 + f7);
        Path path5 = this.f4160;
        double d3 = this.f4179 + this.f4138;
        double tan2 = Math.tan(Math.toRadians(40.0d));
        float f8 = this.f4138;
        double d4 = f8;
        Double.isNaN(d4);
        Double.isNaN(d3);
        path5.lineTo((float) ((tan2 * d4 * 0.46000000834465027d) + d3), (this.f4177 + f8) - (f8 * 0.46f));
        this.f4180.setPath(this.f4167, false);
        this.f4151.setPath(this.f4144, false);
        this.f4161.setPath(this.f4160, false);
        this.f4146 = this.f4180.getLength();
        this.f4152 = this.f4151.getLength();
        this.f4139 = this.f4161.getLength();
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m1713() {
        this.f4164 = EnumC0570.f4191;
        Rect rect = this.f4141;
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.f4167.reset();
        Path path = this.f4167;
        double d = centerX;
        double cos = Math.cos(Math.toRadians(45.0d));
        double radius = getRadius();
        Double.isNaN(radius);
        Double.isNaN(radius);
        Double.isNaN(d);
        Double.isNaN(d);
        float f = (float) (d - (cos * radius));
        double d2 = centerY;
        double sin = Math.sin(Math.toRadians(45.0d));
        double radius2 = getRadius();
        Double.isNaN(radius2);
        Double.isNaN(radius2);
        Double.isNaN(d2);
        Double.isNaN(d2);
        path.moveTo(f, (float) (d2 - (sin * radius2)));
        Path path2 = this.f4167;
        double cos2 = Math.cos(Math.toRadians(45.0d));
        double radius3 = getRadius();
        Double.isNaN(radius3);
        Double.isNaN(radius3);
        Double.isNaN(d);
        Double.isNaN(d);
        float f2 = (float) ((cos2 * radius3) + d);
        double sin2 = Math.sin(Math.toRadians(45.0d));
        double radius4 = getRadius();
        Double.isNaN(radius4);
        Double.isNaN(radius4);
        Double.isNaN(d2);
        Double.isNaN(d2);
        path2.lineTo(f2, (float) ((sin2 * radius4) + d2));
        this.f4180.setPath(this.f4167, false);
        this.f4158 = this.f4180.getLength();
        this.f4167.reset();
        Path path3 = this.f4167;
        double cos3 = Math.cos(Math.toRadians(45.0d));
        double radius5 = getRadius();
        Double.isNaN(radius5);
        Double.isNaN(radius5);
        Double.isNaN(d);
        Double.isNaN(d);
        float f3 = (float) ((cos3 * radius5) + d);
        double sin3 = Math.sin(Math.toRadians(45.0d));
        double radius6 = getRadius();
        Double.isNaN(radius6);
        Double.isNaN(radius6);
        Double.isNaN(d2);
        Double.isNaN(d2);
        path3.moveTo(f3, (float) (d2 - (sin3 * radius6)));
        Path path4 = this.f4167;
        double cos4 = Math.cos(Math.toRadians(45.0d));
        double radius7 = getRadius();
        Double.isNaN(radius7);
        Double.isNaN(radius7);
        Double.isNaN(d);
        Double.isNaN(d);
        float f4 = (float) (d - (cos4 * radius7));
        double sin4 = Math.sin(Math.toRadians(45.0d));
        double radius8 = getRadius();
        Double.isNaN(radius8);
        Double.isNaN(radius8);
        Double.isNaN(d2);
        Double.isNaN(d2);
        path4.lineTo(f4, (float) ((sin4 * radius8) + d2));
        this.f4151.setPath(this.f4167, false);
        this.f4166 = this.f4151.getLength();
        invalidate();
        AnimatorSet animatorSet = this.f4147;
        if (animatorSet == null || !this.f4140) {
            if (animatorSet == null) {
                this.f4147 = getDownLoadErrorAnimator();
            }
            this.f4147.start();
        }
    }
}

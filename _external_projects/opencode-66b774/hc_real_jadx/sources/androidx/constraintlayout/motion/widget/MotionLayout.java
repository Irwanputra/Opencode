package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p034.p035.p045.InterfaceC1068;
import p034.p086.p087.p088.C1515;
import p034.p086.p087.p088.C1519;
import p034.p086.p087.p088.C1520;
import p034.p086.p087.p088.C1521;
import p034.p086.p087.p088.C1522;
import p034.p086.p087.p088.C1544;
import p034.p086.p087.p088.C1546;
import p034.p086.p087.p088.C1547;
import p034.p086.p087.p088.InterfaceC1513;
import p034.p086.p090.C1560;
import p034.p086.p090.C1563;
import p034.p086.p090.C1566;
import p034.p086.p090.C1575;
import p034.p086.p091.p092.AbstractInterpolatorC1646;
import p034.p086.p091.p092.C1583;
import p034.p086.p091.p092.C1603;
import p034.p086.p091.p092.C1606;
import p034.p086.p091.p092.C1607;
import p034.p086.p091.p092.C1608;
import p034.p086.p091.p092.C1625;
import p034.p086.p091.p092.C1643;
import p034.p086.p091.p092.C1645;
import p034.p086.p091.p092.ViewOnTouchListenerC1644;
import p034.p086.p091.p093.C1653;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MotionLayout extends ConstraintLayout implements InterfaceC1068 {

    /* renamed from: 〱〴なぱへて, reason: contains not printable characters */
    public static boolean f688;

    /* renamed from: 〱〵つてう, reason: contains not printable characters */
    public View f689;

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public ArrayList<InterfaceC0112> f690;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public float f691;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public ArrayList<MotionHelper> f692;

    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public EnumC0120 f693;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public boolean f694;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f695;

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public int f696;

    /* renamed from: ぁにあがあ, reason: contains not printable characters */
    public ArrayList<Integer> f697;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public int f698;

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public float f699;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public HashMap<View, C1643> f700;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f701;

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public float f702;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public InterfaceC0112 f703;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public C1653 f704;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public int f705;

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public int f706;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public float f707;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public boolean f708;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public boolean f709;

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public boolean f710;

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public float f711;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public int f712;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public long f713;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public float f714;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public float f715;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public float f716;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public int f717;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public C1606 f718;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public C1583 f719;

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public C0114 f720;

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public int f721;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public long f722;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public float f723;

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public C1645 f724;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public float f725;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public boolean f726;

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public boolean f727;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public C0115 f728;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public Interpolator f729;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean f730;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public long f731;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public float f732;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int f733;

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public int f734;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public boolean f735;

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public int f736;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public ArrayList<MotionHelper> f737;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public C0113 f738;

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public C0119 f739;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f740;

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public boolean f741;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public float f742;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public long f743;

    /* renamed from: へ〱そかのず, reason: contains not printable characters */
    public RectF f744;

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public int f745;

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public int f746;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public int f747;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public float f748;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$〳ぜぞぜべっ, reason: contains not printable characters */
    public interface InterfaceC0112 {
        /* renamed from: 〺つふすそ */
        void mo260(MotionLayout motionLayout, int i, int i2);

        /* renamed from: くし〴〺ぅ */
        void mo261(MotionLayout motionLayout, int i, boolean z, float f);

        /* renamed from: げつ〴ぬぐ */
        void mo262(MotionLayout motionLayout, int i, int i2, float f);

        /* renamed from: びぐびあび */
        void mo263(MotionLayout motionLayout, int i);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$〺つふすそ, reason: contains not printable characters */
    public class C0113 extends AbstractInterpolatorC1646 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f750;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public float f751 = 0.0f;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f749 = 0.0f;

        public C0113() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = this.f751;
            if (f2 > 0.0f) {
                float f3 = this.f750;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                MotionLayout.this.f742 = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.f749;
            }
            float f4 = this.f750;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            MotionLayout.this.f742 = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.f749;
        }

        @Override // p034.p086.p091.p092.AbstractInterpolatorC1646
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public float mo277() {
            return MotionLayout.this.f742;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$ぁごぐすすぃ, reason: contains not printable characters */
    public class C0114 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public float f755 = Float.NaN;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f753 = Float.NaN;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f754 = -1;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f757 = -1;

        public C0114() {
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m278() {
            int i = this.f754;
            if (i != -1 || this.f757 != -1) {
                if (i == -1) {
                    MotionLayout.this.m272(this.f757);
                } else {
                    int i2 = this.f757;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(EnumC0120.SETUP);
            }
            if (Float.isNaN(this.f753)) {
                if (Float.isNaN(this.f755)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f755);
            } else {
                MotionLayout.this.setProgress(this.f755, this.f753);
                this.f755 = Float.NaN;
                this.f753 = Float.NaN;
                this.f754 = -1;
                this.f757 = -1;
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$くし〴〺ぅ, reason: contains not printable characters */
    public class C0115 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public Paint f758;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int[] f759;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public Paint f760;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public float[] f761;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float[] f763;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public float[] f764;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public Paint f765;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public int f766;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public Paint f767;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Path f769;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public Paint f771;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public DashPathEffect f772;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public Rect f768 = new Rect();

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public int f770 = 1;

        public C0115() {
            Paint paint = new Paint();
            this.f765 = paint;
            paint.setAntiAlias(true);
            this.f765.setColor(-21965);
            this.f765.setStrokeWidth(2.0f);
            this.f765.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f767 = paint2;
            paint2.setAntiAlias(true);
            this.f767.setColor(-2067046);
            this.f767.setStrokeWidth(2.0f);
            this.f767.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f760 = paint3;
            paint3.setAntiAlias(true);
            this.f760.setColor(-13391360);
            this.f760.setStrokeWidth(2.0f);
            this.f760.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f758 = paint4;
            paint4.setAntiAlias(true);
            this.f758.setColor(-13391360);
            this.f758.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f761 = new float[8];
            Paint paint5 = new Paint();
            this.f771 = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f772 = dashPathEffect;
            this.f760.setPathEffect(dashPathEffect);
            this.f763 = new float[100];
            this.f759 = new int[50];
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final void m279(Canvas canvas) {
            float[] fArr = this.f764;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f760);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f760);
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public void m280(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f768);
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m281(Canvas canvas, float f, float f2) {
            float[] fArr = this.f764;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder m4207 = C2098.m4207("");
            Double.isNaN((min2 * 100.0f) / Math.abs(f5 - f3));
            m4207.append(((int) (r14 + 0.5d)) / 100.0f);
            String sb = m4207.toString();
            m280(sb, this.f758);
            canvas.drawText(sb, ((min2 / 2.0f) - (this.f768.width() / 2)) + min, f2 - 20.0f, this.f758);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f760);
            StringBuilder m42072 = C2098.m4207("");
            Double.isNaN((max2 * 100.0f) / Math.abs(f6 - f4));
            m42072.append(((int) (r2 + 0.5d)) / 100.0f);
            String sb2 = m42072.toString();
            m280(sb2, this.f758);
            canvas.drawText(sb2, f + 5.0f, max - ((max2 / 2.0f) - (this.f768.height() / 2)), this.f758);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f760);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m282(Canvas canvas, int i, int i2, C1643 c1643) {
            int i3;
            int i4;
            float f;
            float f2;
            int i5;
            if (i == 4) {
                boolean z = false;
                boolean z2 = false;
                for (int i6 = 0; i6 < this.f766; i6++) {
                    int[] iArr = this.f759;
                    if (iArr[i6] == 1) {
                        z = true;
                    }
                    if (iArr[i6] == 2) {
                        z2 = true;
                    }
                }
                if (z) {
                    m285(canvas);
                }
                if (z2) {
                    m279(canvas);
                }
            }
            if (i == 2) {
                m285(canvas);
            }
            if (i == 3) {
                m279(canvas);
            }
            canvas.drawLines(this.f764, this.f765);
            View view = c1643.f7680;
            if (view != null) {
                i3 = view.getWidth();
                i4 = c1643.f7680.getHeight();
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i7 = 1;
            while (i7 < i2 - 1) {
                if (i == 4 && this.f759[i7 - 1] == 0) {
                    i5 = i7;
                } else {
                    float[] fArr = this.f763;
                    int i8 = i7 * 2;
                    float f3 = fArr[i8];
                    float f4 = fArr[i8 + 1];
                    this.f769.reset();
                    this.f769.moveTo(f3, f4 + 10.0f);
                    this.f769.lineTo(f3 + 10.0f, f4);
                    this.f769.lineTo(f3, f4 - 10.0f);
                    this.f769.lineTo(f3 - 10.0f, f4);
                    this.f769.close();
                    int i9 = i7 - 1;
                    c1643.f7681.get(i9);
                    if (i == 4) {
                        int[] iArr2 = this.f759;
                        if (iArr2[i9] == 1) {
                            m283(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr2[i9] == 2) {
                            m281(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr2[i9] == 3) {
                            f = f4;
                            f2 = f3;
                            i5 = i7;
                            m284(canvas, f3 - 0.0f, f4 - 0.0f, i3, i4);
                            canvas.drawPath(this.f769, this.f771);
                        }
                        f = f4;
                        f2 = f3;
                        i5 = i7;
                        canvas.drawPath(this.f769, this.f771);
                    } else {
                        f = f4;
                        f2 = f3;
                        i5 = i7;
                    }
                    if (i == 2) {
                        m283(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 3) {
                        m281(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        m284(canvas, f2 - 0.0f, f - 0.0f, i3, i4);
                    }
                    canvas.drawPath(this.f769, this.f771);
                }
                i7 = i5 + 1;
            }
            float[] fArr2 = this.f764;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f767);
                float[] fArr3 = this.f764;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f767);
            }
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final void m283(Canvas canvas, float f, float f2) {
            float[] fArr = this.f764;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            StringBuilder m4207 = C2098.m4207("");
            m4207.append(((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            String sb = m4207.toString();
            m280(sb, this.f758);
            canvas.drawTextOnPath(sb, path, (hypot2 / 2.0f) - (this.f768.width() / 2), -20.0f, this.f758);
            canvas.drawLine(f, f2, f10, f11, this.f760);
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final void m284(Canvas canvas, float f, float f2, int i, int i2) {
            StringBuilder m4207 = C2098.m4207("");
            Double.isNaN(((f - (i / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i));
            m4207.append(((int) (r2 + 0.5d)) / 100.0f);
            String sb = m4207.toString();
            m280(sb, this.f758);
            canvas.drawText(sb, ((f / 2.0f) - (this.f768.width() / 2)) + 0.0f, f2 - 20.0f, this.f758);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f760);
            StringBuilder m42072 = C2098.m4207("");
            Double.isNaN(((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i2));
            m42072.append(((int) (r2 + 0.5d)) / 100.0f);
            String sb2 = m42072.toString();
            m280(sb2, this.f758);
            canvas.drawText(sb2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.f768.height() / 2)), this.f758);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f760);
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final void m285(Canvas canvas) {
            float[] fArr = this.f764;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f760);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0116 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ View f773;

        public RunnableC0116(MotionLayout motionLayout, View view) {
            this.f773 = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f773.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$づざかべべ, reason: contains not printable characters */
    public interface InterfaceC0117 {
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C0118 implements InterfaceC0117 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static C0118 f774 = new C0118();

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public VelocityTracker f775;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$びぐびあび, reason: contains not printable characters */
    public class C0119 {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f780;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f781;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1520 f779 = new C1520();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1520 f776 = new C1520();

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C1566 f778 = null;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C1566 f782 = null;

        public C0119() {
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m286(C1520 c1520, C1520 c15202) {
            ArrayList<C1544> arrayList = c1520.f7035;
            HashMap<C1544, C1544> hashMap = new HashMap<>();
            hashMap.put(c1520, c15202);
            c15202.f7035.clear();
            c15202.mo3320(c1520, hashMap);
            Iterator<C1544> it = arrayList.iterator();
            while (it.hasNext()) {
                C1544 next = it.next();
                C1544 c1519 = next instanceof C1519 ? new C1519() : next instanceof C1515 ? new C1515() : next instanceof C1522 ? new C1522() : next instanceof InterfaceC1513 ? new C1546() : new C1544();
                c15202.f7035.add(c1519);
                C1544 c1544 = c1519.f7203;
                if (c1544 != null) {
                    ((C1521) c1544).f7035.remove(c1519);
                    c1519.mo3342();
                }
                c1519.f7203 = c15202;
                hashMap.put(next, c1519);
            }
            Iterator<C1544> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1544 next2 = it2.next();
                hashMap.get(next2).mo3320(next2, hashMap);
            }
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C1544 m287(C1520 c1520, View view) {
            if (c1520.f7210 == view) {
                return c1520;
            }
            ArrayList<C1544> arrayList = c1520.f7035;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1544 c1544 = arrayList.get(i);
                if (c1544.f7210 == view) {
                    return c1544;
                }
            }
            return null;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m288() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f700.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                MotionLayout.this.f700.put(childAt, new C1643(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                C1643 c1643 = MotionLayout.this.f700.get(childAt2);
                if (c1643 != null) {
                    if (this.f778 != null) {
                        C1544 m287 = m287(this.f779, childAt2);
                        if (m287 != null) {
                            C1566 c1566 = this.f778;
                            C1603 c1603 = c1643.f7691;
                            c1603.f7553 = 0.0f;
                            c1603.f7549 = 0.0f;
                            c1643.m3581(c1603);
                            c1643.f7691.m3562(m287.m3409(), m287.m3417(), m287.m3438(), m287.m3418());
                            C1566.C1569 m3506 = c1566.m3506(c1643.f7670);
                            c1643.f7691.m3560(m3506);
                            c1643.f7673 = m3506.f7423.f7420;
                            c1643.f7687.m3571(m287, c1566, c1643.f7670);
                        } else if (MotionLayout.this.f698 != 0) {
                            C2786.m4831();
                            C2786.m4795(childAt2);
                            childAt2.getClass().getName();
                        }
                    }
                    if (this.f782 != null) {
                        C1544 m2872 = m287(this.f776, childAt2);
                        if (m2872 != null) {
                            C1566 c15662 = this.f782;
                            C1603 c16032 = c1643.f7684;
                            c16032.f7553 = 1.0f;
                            c16032.f7549 = 1.0f;
                            c1643.m3581(c16032);
                            c1643.f7684.m3562(m2872.m3409(), m2872.m3417(), m2872.m3438(), m2872.m3418());
                            c1643.f7684.m3560(c15662.m3506(c1643.f7670));
                            c1643.f7672.m3571(m2872, c15662, c1643.f7670);
                        } else if (MotionLayout.this.f698 != 0) {
                            C2786.m4831();
                            C2786.m4795(childAt2);
                            childAt2.getClass().getName();
                        }
                    }
                }
            }
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public void m289() {
            MotionLayout motionLayout = MotionLayout.this;
            int i = motionLayout.f740;
            int i2 = motionLayout.f733;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout2 = MotionLayout.this;
            motionLayout2.f696 = mode;
            motionLayout2.f745 = mode2;
            int optimizationLevel = motionLayout2.getOptimizationLevel();
            MotionLayout motionLayout3 = MotionLayout.this;
            if (motionLayout3.f705 == motionLayout3.getStartState()) {
                MotionLayout.this.m310(this.f776, optimizationLevel, i, i2);
                if (this.f778 != null) {
                    MotionLayout.this.m310(this.f779, optimizationLevel, i, i2);
                }
            } else {
                if (this.f778 != null) {
                    MotionLayout.this.m310(this.f779, optimizationLevel, i, i2);
                }
                MotionLayout.this.m310(this.f776, optimizationLevel, i, i2);
            }
            int i3 = 0;
            boolean z = true;
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout motionLayout4 = MotionLayout.this;
                motionLayout4.f696 = mode;
                motionLayout4.f745 = mode2;
                if (motionLayout4.f705 == motionLayout4.getStartState()) {
                    MotionLayout.this.m310(this.f776, optimizationLevel, i, i2);
                    if (this.f778 != null) {
                        MotionLayout.this.m310(this.f779, optimizationLevel, i, i2);
                    }
                } else {
                    if (this.f778 != null) {
                        MotionLayout.this.m310(this.f779, optimizationLevel, i, i2);
                    }
                    MotionLayout.this.m310(this.f776, optimizationLevel, i, i2);
                }
                MotionLayout.this.f706 = this.f779.m3438();
                MotionLayout.this.f734 = this.f779.m3418();
                MotionLayout.this.f721 = this.f776.m3438();
                MotionLayout.this.f746 = this.f776.m3418();
                MotionLayout motionLayout5 = MotionLayout.this;
                motionLayout5.f741 = (motionLayout5.f706 == motionLayout5.f721 && motionLayout5.f734 == motionLayout5.f746) ? false : true;
            }
            MotionLayout motionLayout6 = MotionLayout.this;
            int i4 = motionLayout6.f706;
            int i5 = motionLayout6.f734;
            int i6 = motionLayout6.f696;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((motionLayout6.f699 * (motionLayout6.f721 - i4)) + i4);
            }
            int i7 = motionLayout6.f745;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i5 = (int) ((motionLayout6.f699 * (motionLayout6.f746 - i5)) + i5);
            }
            int i8 = i5;
            C1520 c1520 = this.f779;
            motionLayout6.m311(i, i2, i4, i8, c1520.f7027 || this.f776.f7027, c1520.f7029 || this.f776.f7029);
            MotionLayout motionLayout7 = MotionLayout.this;
            int childCount = motionLayout7.getChildCount();
            motionLayout7.f739.m288();
            motionLayout7.f694 = true;
            int width = motionLayout7.getWidth();
            int height = motionLayout7.getHeight();
            C1583.C1584 c1584 = motionLayout7.f719.f7501;
            int i9 = c1584 != null ? c1584.f7516 : -1;
            if (i9 != -1) {
                for (int i10 = 0; i10 < childCount; i10++) {
                    C1643 c1643 = motionLayout7.f700.get(motionLayout7.getChildAt(i10));
                    if (c1643 != null) {
                        c1643.f7690 = i9;
                    }
                }
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                C1643 c16432 = motionLayout7.f700.get(motionLayout7.getChildAt(i11));
                if (c16432 != null) {
                    motionLayout7.f719.m3540(c16432);
                    c16432.m3582(width, height, motionLayout7.getNanoTime());
                }
            }
            C1583.C1584 c15842 = motionLayout7.f719.f7501;
            float f = c15842 != null ? c15842.f7528 : 0.0f;
            if (f != 0.0f) {
                boolean z2 = ((double) f) < 0.0d;
                float abs = Math.abs(f);
                float f2 = -3.4028235E38f;
                float f3 = Float.MAX_VALUE;
                int i12 = 0;
                float f4 = Float.MAX_VALUE;
                float f5 = -3.4028235E38f;
                while (true) {
                    if (i12 >= childCount) {
                        z = false;
                        break;
                    }
                    C1643 c16433 = motionLayout7.f700.get(motionLayout7.getChildAt(i12));
                    if (!Float.isNaN(c16433.f7673)) {
                        break;
                    }
                    C1603 c1603 = c16433.f7684;
                    float f6 = c1603.f7551;
                    float f7 = c1603.f7545;
                    float f8 = z2 ? f7 - f6 : f7 + f6;
                    f4 = Math.min(f4, f8);
                    f5 = Math.max(f5, f8);
                    i12++;
                }
                if (!z) {
                    while (i3 < childCount) {
                        C1643 c16434 = motionLayout7.f700.get(motionLayout7.getChildAt(i3));
                        C1603 c16032 = c16434.f7684;
                        float f9 = c16032.f7551;
                        float f10 = c16032.f7545;
                        float f11 = z2 ? f10 - f9 : f10 + f9;
                        c16434.f7685 = 1.0f / (1.0f - abs);
                        c16434.f7695 = abs - (((f11 - f4) * abs) / (f5 - f4));
                        i3++;
                    }
                    return;
                }
                for (int i13 = 0; i13 < childCount; i13++) {
                    C1643 c16435 = motionLayout7.f700.get(motionLayout7.getChildAt(i13));
                    if (!Float.isNaN(c16435.f7673)) {
                        f3 = Math.min(f3, c16435.f7673);
                        f2 = Math.max(f2, c16435.f7673);
                    }
                }
                while (i3 < childCount) {
                    C1643 c16436 = motionLayout7.f700.get(motionLayout7.getChildAt(i3));
                    if (!Float.isNaN(c16436.f7673)) {
                        c16436.f7685 = 1.0f / (1.0f - abs);
                        float f12 = c16436.f7673;
                        c16436.f7695 = abs - (z2 ? ((f2 - f12) / (f2 - f3)) * abs : ((f12 - f3) * abs) / (f2 - f3));
                    }
                    i3++;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final void m290(C1520 c1520, C1566 c1566) {
            SparseArray<C1544> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, c1520);
            sparseArray.put(MotionLayout.this.getId(), c1520);
            Iterator<C1544> it = c1520.f7035.iterator();
            while (it.hasNext()) {
                C1544 next = it.next();
                sparseArray.put(((View) next.f7210).getId(), next);
            }
            Iterator<C1544> it2 = c1520.f7035.iterator();
            while (it2.hasNext()) {
                C1544 next2 = it2.next();
                View view = (View) next2.f7210;
                int id = view.getId();
                if (c1566.f7349.containsKey(Integer.valueOf(id))) {
                    c1566.f7349.get(Integer.valueOf(id)).m3519(layoutParams);
                }
                next2.m3416(c1566.m3506(view.getId()).f7427.f7376);
                next2.m3421(c1566.m3506(view.getId()).f7427.f7406);
                if (view instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) view;
                    int id2 = constraintHelper.getId();
                    if (c1566.f7349.containsKey(Integer.valueOf(id2))) {
                        C1566.C1569 c1569 = c1566.f7349.get(Integer.valueOf(id2));
                        if (next2 instanceof C1546) {
                            constraintHelper.mo253(c1569, (C1546) next2, layoutParams, sparseArray);
                        }
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).m305();
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                } else {
                    layoutParams.resolveLayoutDirection(0);
                }
                MotionLayout motionLayout = MotionLayout.this;
                boolean z = MotionLayout.f688;
                motionLayout.m313(false, view, next2, layoutParams, sparseArray);
                next2.f7217 = c1566.m3506(view.getId()).f7422.f7443 == 1 ? view.getVisibility() : c1566.m3506(view.getId()).f7422.f7442;
            }
            Iterator<C1544> it3 = c1520.f7035.iterator();
            while (it3.hasNext()) {
                C1544 next3 = it3.next();
                if (next3 instanceof C1547) {
                    ConstraintHelper constraintHelper2 = (ConstraintHelper) next3.f7210;
                    InterfaceC1513 interfaceC1513 = (InterfaceC1513) next3;
                    constraintHelper2.m302(interfaceC1513, sparseArray);
                    ((C1547) interfaceC1513).m3443();
                }
            }
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void m291(C1566 c1566, C1566 c15662) {
            C1544.EnumC1545 enumC1545 = C1544.EnumC1545.WRAP_CONTENT;
            this.f778 = c1566;
            this.f782 = c15662;
            this.f779 = new C1520();
            this.f776 = new C1520();
            C1520 c1520 = this.f779;
            MotionLayout motionLayout = MotionLayout.this;
            boolean z = MotionLayout.f688;
            c1520.m3340(motionLayout.f863.f7031);
            this.f776.m3340(MotionLayout.this.f863.f7031);
            this.f779.f7035.clear();
            this.f776.f7035.clear();
            m286(MotionLayout.this.f863, this.f779);
            m286(MotionLayout.this.f863, this.f776);
            if (MotionLayout.this.f725 > 0.5d) {
                if (c1566 != null) {
                    m290(this.f779, c1566);
                }
                m290(this.f776, c15662);
            } else {
                m290(this.f776, c15662);
                if (c1566 != null) {
                    m290(this.f779, c1566);
                }
            }
            this.f779.f7024 = MotionLayout.this.m309();
            C1520 c15202 = this.f779;
            c15202.f7019.m3371(c15202);
            this.f776.f7024 = MotionLayout.this.m309();
            C1520 c15203 = this.f776;
            c15203.f7019.m3371(c15203);
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.f779.f7206[0] = enumC1545;
                    this.f776.f7206[0] = enumC1545;
                }
                if (layoutParams.height == -2) {
                    this.f779.f7206[1] = enumC1545;
                    this.f776.f7206[1] = enumC1545;
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$ぺぁあねじ, reason: contains not printable characters */
    public enum EnumC0120 {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context) {
        super(context);
        this.f742 = 0.0f;
        this.f695 = -1;
        this.f705 = -1;
        this.f701 = -1;
        this.f740 = 0;
        this.f733 = 0;
        this.f730 = true;
        this.f700 = new HashMap<>();
        this.f722 = 0L;
        this.f748 = 1.0f;
        this.f707 = 0.0f;
        this.f725 = 0.0f;
        this.f715 = 0.0f;
        this.f694 = false;
        this.f698 = 0;
        this.f726 = false;
        this.f704 = new C1653();
        this.f738 = new C0113();
        this.f735 = false;
        this.f709 = false;
        this.f692 = null;
        this.f737 = null;
        this.f690 = null;
        this.f712 = 0;
        this.f731 = -1L;
        this.f711 = 0.0f;
        this.f736 = 0;
        this.f702 = 0.0f;
        this.f741 = false;
        this.f724 = new C1645();
        this.f710 = false;
        this.f693 = EnumC0120.UNDEFINED;
        this.f739 = new C0119();
        this.f727 = false;
        this.f744 = new RectF();
        this.f689 = null;
        this.f697 = new ArrayList<>();
        m275(null);
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f742 = 0.0f;
        this.f695 = -1;
        this.f705 = -1;
        this.f701 = -1;
        this.f740 = 0;
        this.f733 = 0;
        this.f730 = true;
        this.f700 = new HashMap<>();
        this.f722 = 0L;
        this.f748 = 1.0f;
        this.f707 = 0.0f;
        this.f725 = 0.0f;
        this.f715 = 0.0f;
        this.f694 = false;
        this.f698 = 0;
        this.f726 = false;
        this.f704 = new C1653();
        this.f738 = new C0113();
        this.f735 = false;
        this.f709 = false;
        this.f692 = null;
        this.f737 = null;
        this.f690 = null;
        this.f712 = 0;
        this.f731 = -1L;
        this.f711 = 0.0f;
        this.f736 = 0;
        this.f702 = 0.0f;
        this.f741 = false;
        this.f724 = new C1645();
        this.f710 = false;
        this.f693 = EnumC0120.UNDEFINED;
        this.f739 = new C0119();
        this.f727 = false;
        this.f744 = new RectF();
        this.f689 = null;
        this.f697 = new ArrayList<>();
        m275(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f742 = 0.0f;
        this.f695 = -1;
        this.f705 = -1;
        this.f701 = -1;
        this.f740 = 0;
        this.f733 = 0;
        this.f730 = true;
        this.f700 = new HashMap<>();
        this.f722 = 0L;
        this.f748 = 1.0f;
        this.f707 = 0.0f;
        this.f725 = 0.0f;
        this.f715 = 0.0f;
        this.f694 = false;
        this.f698 = 0;
        this.f726 = false;
        this.f704 = new C1653();
        this.f738 = new C0113();
        this.f735 = false;
        this.f709 = false;
        this.f692 = null;
        this.f737 = null;
        this.f690 = null;
        this.f712 = 0;
        this.f731 = -1L;
        this.f711 = 0.0f;
        this.f736 = 0;
        this.f702 = 0.0f;
        this.f741 = false;
        this.f724 = new C1645();
        this.f710 = false;
        this.f693 = EnumC0120.UNDEFINED;
        this.f739 = new C0119();
        this.f727 = false;
        this.f744 = new RectF();
        this.f689 = null;
        this.f697 = new ArrayList<>();
        m275(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ad  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public int[] getConstraintSetIds() {
        C1583 c1583 = this.f719;
        if (c1583 == null) {
            return null;
        }
        int size = c1583.f7496.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = c1583.f7496.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f705;
    }

    public ArrayList<C1583.C1584> getDefinedTransitions() {
        C1583 c1583 = this.f719;
        if (c1583 == null) {
            return null;
        }
        return c1583.f7508;
    }

    public C1606 getDesignTool() {
        if (this.f718 == null) {
            this.f718 = new C1606(this);
        }
        return this.f718;
    }

    public int getEndState() {
        return this.f701;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f725;
    }

    public int getStartState() {
        return this.f695;
    }

    public float getTargetPosition() {
        return this.f715;
    }

    public Bundle getTransitionState() {
        if (this.f720 == null) {
            this.f720 = new C0114();
        }
        C0114 c0114 = this.f720;
        MotionLayout motionLayout = MotionLayout.this;
        c0114.f757 = motionLayout.f701;
        c0114.f754 = motionLayout.f695;
        c0114.f753 = motionLayout.getVelocity();
        c0114.f755 = MotionLayout.this.getProgress();
        C0114 c01142 = this.f720;
        c01142.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", c01142.f755);
        bundle.putFloat("motion.velocity", c01142.f753);
        bundle.putInt("motion.StartState", c01142.f754);
        bundle.putInt("motion.EndState", c01142.f757);
        return bundle;
    }

    public long getTransitionTimeMs() {
        if (this.f719 != null) {
            this.f748 = r0.m3542() / 1000.0f;
        }
        return (long) (this.f748 * 1000.0f);
    }

    public float getVelocity() {
        return this.f742;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return Build.VERSION.SDK_INT >= 19 ? super.isAttachedToWindow() : getWindowToken() != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x017d, code lost:
    
        if (r1 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x017f, code lost:
    
        r1.m3507(r19, true);
        setConstraintSet(null);
        requestLayout();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0189, code lost:
    
        r19.f695 = r19.f705;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1583.C1584 c1584;
        C1608 c1608;
        int i;
        RectF m3564;
        C1583 c1583 = this.f719;
        if (c1583 != null && this.f730 && (c1584 = c1583.f7501) != null && (!c1584.f7518) && (c1608 = c1584.f7523) != null && ((motionEvent.getAction() != 0 || (m3564 = c1608.m3564(this, new RectF())) == null || m3564.contains(motionEvent.getX(), motionEvent.getY())) && (i = c1608.f7589) != -1)) {
            View view = this.f689;
            if (view == null || view.getId() != i) {
                this.f689 = findViewById(i);
            }
            if (this.f689 != null) {
                this.f744.set(r0.getLeft(), this.f689.getTop(), this.f689.getRight(), this.f689.getBottom());
                if (this.f744.contains(motionEvent.getX(), motionEvent.getY()) && !m271(0.0f, 0.0f, this.f689, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f710 = true;
        try {
            if (this.f719 == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f717 != i5 || this.f747 != i6) {
                m265();
                m270(true);
            }
            this.f717 = i5;
            this.f747 = i6;
        } finally {
            this.f710 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (((r6 == r3.f780 && r7 == r3.f781) ? false : true) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p034.p035.p045.InterfaceC1120
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        C1608 c1608;
        C1583 c1583 = this.f719;
        if (c1583 != null) {
            boolean m309 = m309();
            c1583.f7498 = m309;
            C1583.C1584 c1584 = c1583.f7501;
            if (c1584 == null || (c1608 = c1584.f7523) == null) {
                return;
            }
            c1608.m3563(m309);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x03d4, code lost:
    
        if (1.0f > r7) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03de, code lost:
    
        if (1.0f > r4) goto L209;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f690 == null) {
                this.f690 = new ArrayList<>();
            }
            this.f690.add(motionHelper);
            if (motionHelper.f684) {
                if (this.f692 == null) {
                    this.f692 = new ArrayList<>();
                }
                this.f692.add(motionHelper);
            }
            if (motionHelper.f687) {
                if (this.f737 == null) {
                    this.f737 = new ArrayList<>();
                }
                this.f737.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f692;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f737;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        C1583 c1583;
        C1583.C1584 c1584;
        if (this.f741 || this.f705 != -1 || (c1583 = this.f719) == null || (c1584 = c1583.f7501) == null || c1584.f7517 != 0) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i) {
        this.f698 = i;
        invalidate();
    }

    public void setInteractionEnabled(boolean z) {
        this.f730 = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f719 != null) {
            setState(EnumC0120.MOVING);
            Interpolator m3546 = this.f719.m3546();
            if (m3546 != null) {
                setProgress(m3546.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f737;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f737.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f692;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f692.get(i).setProgress(f);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r3.f725 == 0.0f) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r3.f725 == 1.0f) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setProgress(float r4) {
        /*
            r3 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$ぺぁあねじ r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0120.FINISHED
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            boolean r2 = r3.isAttachedToWindow()
            if (r2 != 0) goto L1b
            androidx.constraintlayout.motion.widget.MotionLayout$ぁごぐすすぃ r0 = r3.f720
            if (r0 != 0) goto L16
            androidx.constraintlayout.motion.widget.MotionLayout$ぁごぐすすぃ r0 = new androidx.constraintlayout.motion.widget.MotionLayout$ぁごぐすすぃ
            r0.<init>()
            r3.f720 = r0
        L16:
            androidx.constraintlayout.motion.widget.MotionLayout$ぁごぐすすぃ r0 = r3.f720
            r0.f755 = r4
            return
        L1b:
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 > 0) goto L2a
            int r2 = r3.f695
            r3.f705 = r2
            float r2 = r3.f725
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L43
            goto L40
        L2a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 < 0) goto L3b
            int r2 = r3.f701
            r3.f705 = r2
            float r2 = r3.f725
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L43
            goto L40
        L3b:
            r0 = -1
            r3.f705 = r0
            androidx.constraintlayout.motion.widget.MotionLayout$ぺぁあねじ r0 = androidx.constraintlayout.motion.widget.MotionLayout.EnumC0120.MOVING
        L40:
            r3.setState(r0)
        L43:
            づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ r0 = r3.f719
            if (r0 != 0) goto L48
            return
        L48:
            r0 = 1
            r3.f708 = r0
            r3.f715 = r4
            r3.f707 = r4
            r1 = -1
            r3.f743 = r1
            r3.f722 = r1
            r4 = 0
            r3.f729 = r4
            r3.f694 = r0
            r3.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.setProgress(float):void");
    }

    public void setScene(C1583 c1583) {
        C1608 c1608;
        this.f719 = c1583;
        boolean m309 = m309();
        c1583.f7498 = m309;
        C1583.C1584 c1584 = c1583.f7501;
        if (c1584 != null && (c1608 = c1584.f7523) != null) {
            c1608.m3563(m309);
        }
        m265();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        setState(EnumC0120.SETUP);
        this.f705 = i;
        this.f695 = -1;
        this.f701 = -1;
        C1560 c1560 = this.f859;
        if (c1560 != null) {
            c1560.m3497(i, i2, i3);
            return;
        }
        C1583 c1583 = this.f719;
        if (c1583 != null) {
            c1583.m3539(i).m3507(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }

    public void setState(EnumC0120 enumC0120) {
        EnumC0120 enumC01202 = EnumC0120.FINISHED;
        if (enumC0120 == enumC01202 && this.f705 == -1) {
            return;
        }
        EnumC0120 enumC01203 = this.f693;
        this.f693 = enumC0120;
        EnumC0120 enumC01204 = EnumC0120.MOVING;
        if (enumC01203 == enumC01204 && enumC0120 == enumC01204) {
            m273();
        }
        int ordinal = enumC01203.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (enumC0120 == enumC01204) {
                m273();
            }
            if (enumC0120 != enumC01202) {
                return;
            }
        } else if (ordinal != 2 || enumC0120 != enumC01202) {
            return;
        }
        m268();
    }

    public void setTransition(int i) {
        C1583.C1584 c1584;
        C1583 c1583 = this.f719;
        if (c1583 != null) {
            Iterator<C1583.C1584> it = c1583.f7508.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c1584 = null;
                    break;
                } else {
                    c1584 = it.next();
                    if (c1584.f7520 == i) {
                        break;
                    }
                }
            }
            this.f695 = c1584.f7526;
            this.f701 = c1584.f7519;
            if (!isAttachedToWindow()) {
                if (this.f720 == null) {
                    this.f720 = new C0114();
                }
                C0114 c0114 = this.f720;
                c0114.f754 = this.f695;
                c0114.f757 = this.f701;
                return;
            }
            float f = Float.NaN;
            int i2 = this.f705;
            if (i2 == this.f695) {
                f = 0.0f;
            } else if (i2 == this.f701) {
                f = 1.0f;
            }
            C1583 c15832 = this.f719;
            c15832.f7501 = c1584;
            C1608 c1608 = c1584.f7523;
            if (c1608 != null) {
                c1608.m3563(c15832.f7498);
            }
            this.f739.m291(this.f719.m3539(this.f695), this.f719.m3539(this.f701));
            m265();
            this.f725 = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
            } else {
                C2786.m4831();
                m267(0.0f);
            }
        }
    }

    public void setTransitionDuration(int i) {
        C1583 c1583 = this.f719;
        if (c1583 == null) {
            return;
        }
        C1583.C1584 c1584 = c1583.f7501;
        if (c1584 != null) {
            c1584.f7512 = i;
        } else {
            c1583.f7497 = i;
        }
    }

    public void setTransitionListener(InterfaceC0112 interfaceC0112) {
        this.f703 = interfaceC0112;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f720 == null) {
            this.f720 = new C0114();
        }
        C0114 c0114 = this.f720;
        c0114.getClass();
        c0114.f755 = bundle.getFloat("motion.progress");
        c0114.f753 = bundle.getFloat("motion.velocity");
        c0114.f754 = bundle.getInt("motion.StartState");
        c0114.f757 = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f720.m278();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return C2786.m4778(context, this.f695) + "->" + C2786.m4778(context, this.f701) + " (pos:" + this.f725 + " Dpos/Dt:" + this.f742;
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: 〳ぜぞぜべっ */
    public void mo100(View view, int i, int i2, int[] iArr, int i3) {
        C1583.C1584 c1584;
        boolean z;
        C1608 c1608;
        float f;
        C1608 c16082;
        C1608 c16083;
        int i4;
        C1583 c1583 = this.f719;
        if (c1583 == null || (c1584 = c1583.f7501) == null || !(!c1584.f7518)) {
            return;
        }
        if (!z || (c16083 = c1584.f7523) == null || (i4 = c16083.f7589) == -1 || view.getId() == i4) {
            C1583 c15832 = this.f719;
            if (c15832 != null) {
                C1583.C1584 c15842 = c15832.f7501;
                if ((c15842 == null || (c16082 = c15842.f7523) == null) ? false : c16082.f7588) {
                    float f2 = this.f707;
                    if ((f2 == 1.0f || f2 == 0.0f) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
            }
            if (c1584.f7523 != null) {
                C1608 c16084 = this.f719.f7501.f7523;
                if ((c16084.f7586 & 1) != 0) {
                    float f3 = i;
                    float f4 = i2;
                    c16084.f7583.m269(c16084.f7594, c16084.f7583.getProgress(), c16084.f7577, c16084.f7579, c16084.f7590);
                    float f5 = c16084.f7596;
                    if (f5 != 0.0f) {
                        float[] fArr = c16084.f7590;
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f = (f3 * f5) / fArr[0];
                    } else {
                        float[] fArr2 = c16084.f7590;
                        if (fArr2[1] == 0.0f) {
                            fArr2[1] = 1.0E-7f;
                        }
                        f = (f4 * c16084.f7580) / fArr2[1];
                    }
                    float f6 = this.f725;
                    if ((f6 <= 0.0f && f < 0.0f) || (f6 >= 1.0f && f > 0.0f)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            view.setNestedScrollingEnabled(false);
                            view.post(new RunnableC0116(this, view));
                            return;
                        }
                        return;
                    }
                }
            }
            float f7 = this.f707;
            long nanoTime = getNanoTime();
            float f8 = i;
            this.f714 = f8;
            float f9 = i2;
            this.f691 = f9;
            double d = nanoTime - this.f713;
            Double.isNaN(d);
            Double.isNaN(d);
            this.f723 = (float) (d * 1.0E-9d);
            this.f713 = nanoTime;
            C1583.C1584 c15843 = this.f719.f7501;
            if (c15843 != null && (c1608 = c15843.f7523) != null) {
                float progress = c1608.f7583.getProgress();
                if (!c1608.f7597) {
                    c1608.f7597 = true;
                    c1608.f7583.setProgress(progress);
                }
                c1608.f7583.m269(c1608.f7594, progress, c1608.f7577, c1608.f7579, c1608.f7590);
                float f10 = c1608.f7596;
                float[] fArr3 = c1608.f7590;
                if (Math.abs((c1608.f7580 * fArr3[1]) + (f10 * fArr3[0])) < 0.01d) {
                    float[] fArr4 = c1608.f7590;
                    fArr4[0] = 0.01f;
                    fArr4[1] = 0.01f;
                }
                float f11 = c1608.f7596;
                float max = Math.max(Math.min(progress + (f11 != 0.0f ? (f8 * f11) / c1608.f7590[0] : (f9 * c1608.f7580) / c1608.f7590[1]), 1.0f), 0.0f);
                if (max != c1608.f7583.getProgress()) {
                    c1608.f7583.setProgress(max);
                }
            }
            if (f7 != this.f707) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            m270(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f735 = true;
        }
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public void m264() {
        C1583.C1584 c1584;
        C1608 c1608;
        View view;
        C1583 c1583 = this.f719;
        if (c1583 == null) {
            return;
        }
        if (c1583.m3543(this, this.f705)) {
            requestLayout();
            return;
        }
        int i = this.f705;
        if (i != -1) {
            C1583 c15832 = this.f719;
            Iterator<C1583.C1584> it = c15832.f7508.iterator();
            while (it.hasNext()) {
                C1583.C1584 next = it.next();
                if (next.f7525.size() > 0) {
                    Iterator<C1583.C1584.ViewOnClickListenerC1585> it2 = next.f7525.iterator();
                    while (it2.hasNext()) {
                        it2.next().m3552(this);
                    }
                }
            }
            Iterator<C1583.C1584> it3 = c15832.f7506.iterator();
            while (it3.hasNext()) {
                C1583.C1584 next2 = it3.next();
                if (next2.f7525.size() > 0) {
                    Iterator<C1583.C1584.ViewOnClickListenerC1585> it4 = next2.f7525.iterator();
                    while (it4.hasNext()) {
                        it4.next().m3552(this);
                    }
                }
            }
            Iterator<C1583.C1584> it5 = c15832.f7508.iterator();
            while (it5.hasNext()) {
                C1583.C1584 next3 = it5.next();
                if (next3.f7525.size() > 0) {
                    Iterator<C1583.C1584.ViewOnClickListenerC1585> it6 = next3.f7525.iterator();
                    while (it6.hasNext()) {
                        it6.next().m3553(this, i, next3);
                    }
                }
            }
            Iterator<C1583.C1584> it7 = c15832.f7506.iterator();
            while (it7.hasNext()) {
                C1583.C1584 next4 = it7.next();
                if (next4.f7525.size() > 0) {
                    Iterator<C1583.C1584.ViewOnClickListenerC1585> it8 = next4.f7525.iterator();
                    while (it8.hasNext()) {
                        it8.next().m3553(this, i, next4);
                    }
                }
            }
        }
        if (!this.f719.m3549() || (c1584 = this.f719.f7501) == null || (c1608 = c1584.f7523) == null) {
            return;
        }
        int i2 = c1608.f7594;
        if (i2 != -1) {
            view = c1608.f7583.findViewById(i2);
            if (view == null) {
                C2786.m4778(c1608.f7583.getContext(), c1608.f7594);
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new ViewOnTouchListenerC1644(c1608));
            nestedScrollView.setOnScrollChangeListener(new C1607(c1608));
        }
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: ぁごぐすすぃ */
    public void mo102(View view, int i) {
        C1608 c1608;
        C1583 c1583 = this.f719;
        if (c1583 == null) {
            return;
        }
        float f = this.f714;
        float f2 = this.f723;
        float f3 = f / f2;
        float f4 = this.f691 / f2;
        C1583.C1584 c1584 = c1583.f7501;
        if (c1584 == null || (c1608 = c1584.f7523) == null) {
            return;
        }
        c1608.f7597 = false;
        float progress = c1608.f7583.getProgress();
        c1608.f7583.m269(c1608.f7594, progress, c1608.f7577, c1608.f7579, c1608.f7590);
        float f5 = c1608.f7596;
        float[] fArr = c1608.f7590;
        float f6 = fArr[0];
        float f7 = c1608.f7580;
        float f8 = fArr[1];
        float f9 = f5 != 0.0f ? (f3 * f5) / fArr[0] : (f4 * f7) / fArr[1];
        if (!Float.isNaN(f9)) {
            progress += f9 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z = progress != 1.0f;
            int i2 = c1608.f7584;
            if ((i2 != 3) && z) {
                c1608.f7583.m274(i2, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f9);
            }
        }
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public void m265() {
        this.f739.m289();
        invalidate();
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final void m266() {
        ArrayList<InterfaceC0112> arrayList;
        if (this.f703 == null && ((arrayList = this.f690) == null || arrayList.isEmpty())) {
            return;
        }
        Iterator<Integer> it = this.f697.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            InterfaceC0112 interfaceC0112 = this.f703;
            if (interfaceC0112 != null) {
                interfaceC0112.mo263(this, next.intValue());
            }
            ArrayList<InterfaceC0112> arrayList2 = this.f690;
            if (arrayList2 != null) {
                Iterator<InterfaceC0112> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().mo263(this, next.intValue());
                }
            }
        }
        this.f697.clear();
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void m267(float f) {
        if (this.f719 == null) {
            return;
        }
        float f2 = this.f725;
        float f3 = this.f707;
        if (f2 != f3 && this.f708) {
            this.f725 = f3;
        }
        float f4 = this.f725;
        if (f4 == f) {
            return;
        }
        this.f726 = false;
        this.f715 = f;
        this.f748 = r0.m3542() / 1000.0f;
        setProgress(this.f715);
        this.f729 = this.f719.m3546();
        this.f708 = false;
        this.f722 = getNanoTime();
        this.f694 = true;
        this.f707 = f4;
        this.f725 = f4;
        invalidate();
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void m268() {
        int i;
        ArrayList<InterfaceC0112> arrayList;
        if ((this.f703 != null || ((arrayList = this.f690) != null && !arrayList.isEmpty())) && this.f736 == -1) {
            this.f736 = this.f705;
            if (this.f697.isEmpty()) {
                i = -1;
            } else {
                i = this.f697.get(r0.size() - 1).intValue();
            }
            int i2 = this.f705;
            if (i != i2 && i2 != -1) {
                this.f697.add(Integer.valueOf(i2));
            }
        }
        m266();
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void m269(int i, float f, float f2, float f3, float[] fArr) {
        HashMap<View, C1643> hashMap = this.f700;
        View view = this.f849.get(i);
        C1643 c1643 = hashMap.get(view);
        if (c1643 != null) {
            c1643.m3578(f, f2, f3, fArr);
            float y = view.getY();
            int i2 = ((f - this.f716) > 0.0f ? 1 : ((f - this.f716) == 0.0f ? 0 : -1));
            this.f716 = f;
            this.f732 = y;
            return;
        }
        if (view != null) {
            view.getContext().getResources().getResourceName(i);
            return;
        }
        String str = "" + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0207, code lost:
    
        if (r1 != r2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x020a, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x020b, code lost:
    
        r20.f705 = r2;
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0217, code lost:
    
        if (r1 != r2) goto L149;
     */
    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m270(boolean r21) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.m270(boolean):void");
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: てぜきぽく */
    public void mo110(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final boolean m271(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m271(view.getLeft() + f, view.getTop() + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        this.f744.set(view.getLeft() + f, view.getTop() + f2, f + view.getRight(), f2 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (this.f744.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: なぎぱいぢぎ */
    public void mo111(View view, View view2, int i, int i2) {
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public void m272(int i) {
        C1563 c1563;
        if (!isAttachedToWindow()) {
            if (this.f720 == null) {
                this.f720 = new C0114();
            }
            this.f720.f757 = i;
            return;
        }
        C1583 c1583 = this.f719;
        if (c1583 != null && (c1563 = c1583.f7495) != null) {
            int i2 = this.f705;
            float f = -1;
            C1563.C1565 c1565 = c1563.f7336.get(i);
            if (c1565 == null) {
                i2 = i;
            } else if (f != -1.0f && f != -1.0f) {
                Iterator<C1563.C1564> it = c1565.f7343.iterator();
                C1563.C1564 c1564 = null;
                while (true) {
                    if (it.hasNext()) {
                        C1563.C1564 next = it.next();
                        if (next.m3502(f, f)) {
                            if (i2 == next.f7341) {
                                break;
                            } else {
                                c1564 = next;
                            }
                        }
                    } else if (c1564 != null) {
                        i2 = c1564.f7341;
                    }
                }
            } else if (c1565.f7344 != i2) {
                Iterator<C1563.C1564> it2 = c1565.f7343.iterator();
                while (it2.hasNext()) {
                    if (i2 == it2.next().f7341) {
                        break;
                    }
                }
                i2 = c1565.f7344;
            }
            if (i2 != -1) {
                i = i2;
            }
        }
        int i3 = this.f705;
        if (i3 == i) {
            return;
        }
        if (this.f695 == i) {
            m267(0.0f);
            return;
        }
        if (this.f701 == i) {
            m267(1.0f);
            return;
        }
        this.f701 = i;
        if (i3 != -1) {
            setTransition(i3, i);
            m267(1.0f);
            this.f725 = 0.0f;
            m267(1.0f);
            return;
        }
        this.f726 = false;
        this.f715 = 1.0f;
        this.f707 = 0.0f;
        this.f725 = 0.0f;
        this.f743 = getNanoTime();
        this.f722 = getNanoTime();
        this.f708 = false;
        this.f729 = null;
        this.f748 = this.f719.m3542() / 1000.0f;
        this.f695 = -1;
        this.f719.m3547(-1, this.f701);
        this.f719.m3550();
        int childCount = getChildCount();
        this.f700.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            this.f700.put(childAt, new C1643(childAt));
        }
        this.f694 = true;
        this.f739.m291(null, this.f719.m3539(i));
        m265();
        this.f739.m288();
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt2 = getChildAt(i5);
            C1643 c1643 = this.f700.get(childAt2);
            if (c1643 != null) {
                C1603 c1603 = c1643.f7691;
                c1603.f7553 = 0.0f;
                c1603.f7549 = 0.0f;
                c1603.m3562(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                C1625 c1625 = c1643.f7687;
                c1625.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                c1625.f7645 = childAt2.getVisibility();
                c1625.f7633 = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 21) {
                    c1625.f7641 = childAt2.getElevation();
                }
                c1625.f7643 = childAt2.getRotation();
                c1625.f7634 = childAt2.getRotationX();
                c1625.f7632 = childAt2.getRotationY();
                c1625.f7647 = childAt2.getScaleX();
                c1625.f7635 = childAt2.getScaleY();
                c1625.f7648 = childAt2.getPivotX();
                c1625.f7642 = childAt2.getPivotY();
                c1625.f7644 = childAt2.getTranslationX();
                c1625.f7646 = childAt2.getTranslationY();
                if (i6 >= 21) {
                    c1625.f7638 = childAt2.getTranslationZ();
                }
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i7 = 0; i7 < childCount; i7++) {
            C1643 c16432 = this.f700.get(getChildAt(i7));
            this.f719.m3540(c16432);
            c16432.m3582(width, height, getNanoTime());
        }
        C1583.C1584 c1584 = this.f719.f7501;
        float f2 = c1584 != null ? c1584.f7528 : 0.0f;
        if (f2 != 0.0f) {
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            for (int i8 = 0; i8 < childCount; i8++) {
                C1603 c16032 = this.f700.get(getChildAt(i8)).f7684;
                float f5 = c16032.f7545 + c16032.f7551;
                f3 = Math.min(f3, f5);
                f4 = Math.max(f4, f5);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                C1643 c16433 = this.f700.get(getChildAt(i9));
                C1603 c16033 = c16433.f7684;
                float f6 = c16033.f7551;
                float f7 = c16033.f7545;
                c16433.f7685 = 1.0f / (1.0f - f2);
                c16433.f7695 = f2 - ((((f6 + f7) - f3) * f2) / (f4 - f3));
            }
        }
        this.f707 = 0.0f;
        this.f725 = 0.0f;
        this.f694 = true;
        invalidate();
    }

    @Override // p034.p035.p045.InterfaceC1081
    /* renamed from: のぷのちつ */
    public boolean mo112(View view, View view2, int i, int i2) {
        C1583.C1584 c1584;
        C1608 c1608;
        C1583 c1583 = this.f719;
        return (c1583 == null || (c1584 = c1583.f7501) == null || (c1608 = c1584.f7523) == null || (c1608.f7586 & 2) != 0) ? false : true;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final void m273() {
        ArrayList<InterfaceC0112> arrayList;
        if ((this.f703 == null && ((arrayList = this.f690) == null || arrayList.isEmpty())) || this.f702 == this.f707) {
            return;
        }
        if (this.f736 != -1) {
            InterfaceC0112 interfaceC0112 = this.f703;
            if (interfaceC0112 != null) {
                interfaceC0112.mo260(this, this.f695, this.f701);
            }
            ArrayList<InterfaceC0112> arrayList2 = this.f690;
            if (arrayList2 != null) {
                Iterator<InterfaceC0112> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().mo260(this, this.f695, this.f701);
                }
            }
        }
        this.f736 = -1;
        float f = this.f707;
        this.f702 = f;
        InterfaceC0112 interfaceC01122 = this.f703;
        if (interfaceC01122 != null) {
            interfaceC01122.mo262(this, this.f695, this.f701, f);
        }
        ArrayList<InterfaceC0112> arrayList3 = this.f690;
        if (arrayList3 != null) {
            Iterator<InterfaceC0112> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().mo262(this, this.f695, this.f701, this.f707);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if ((((r15 * r6) - (((r1 * r6) * r6) / 2.0f)) + r13) > 1.0f) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r13 = r12.f738;
        r14 = r12.f725;
        r0 = r12.f719.m3538();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        r5 = r12.f704;
        r6 = r12.f725;
        r9 = r12.f748;
        r10 = r12.f719.m3538();
        r13 = r12.f719.f7501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r13 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        r13 = r13.f7523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r13 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        r11 = r13.f7581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        r5.m3598(r6, r14, r15, r9, r10, r11);
        r12.f742 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        r11 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if ((((((r1 * r3) * r3) / 2.0f) + (r15 * r3)) + r13) < 0.0f) goto L26;
     */
    /* renamed from: びえぁぜい, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m274(int r13, float r14, float r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.m274(int, float, float):void");
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final void m275(AttributeSet attributeSet) {
        C1583 c1583;
        C1583 c15832;
        int i;
        f688 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1575.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == C1575.MotionLayout_layoutDescription) {
                    this.f719 = new C1583(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C1575.MotionLayout_currentState) {
                    this.f705 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C1575.MotionLayout_motionProgress) {
                    this.f715 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f694 = true;
                } else if (index == C1575.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == C1575.MotionLayout_showPaths) {
                    if (this.f698 == 0) {
                        i = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                        this.f698 = i;
                    }
                } else if (index == C1575.MotionLayout_motionDebug) {
                    i = obtainStyledAttributes.getInt(index, 0);
                    this.f698 = i;
                }
            }
            obtainStyledAttributes.recycle();
            C1583 c15833 = this.f719;
            if (!z) {
                this.f719 = null;
            }
        }
        if (this.f698 != 0 && (c15832 = this.f719) != null) {
            int m3550 = c15832.m3550();
            C1583 c15834 = this.f719;
            C1566 m3539 = c15834.m3539(c15834.m3550());
            C2786.m4778(getContext(), m3550);
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                int id = childAt.getId();
                if (id == -1) {
                    childAt.getClass().getName();
                }
                if ((m3539.f7349.containsKey(Integer.valueOf(id)) ? m3539.f7349.get(Integer.valueOf(id)) : null) == null) {
                    C2786.m4795(childAt);
                }
            }
            Integer[] numArr = (Integer[]) m3539.f7349.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = numArr[i4].intValue();
            }
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = iArr[i5];
                C2786.m4778(getContext(), i6);
                findViewById(iArr[i5]);
                int i7 = m3539.m3506(i6).f7427.f7406;
                int i8 = m3539.m3506(i6).f7427.f7376;
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<C1583.C1584> it = this.f719.f7508.iterator();
            while (it.hasNext()) {
                C1583.C1584 next = it.next();
                C1583.C1584 c1584 = this.f719.f7501;
                Context context = getContext();
                if (next.f7526 != -1) {
                    context.getResources().getResourceEntryName(next.f7526);
                }
                if (next.f7519 != -1) {
                    context.getResources().getResourceEntryName(next.f7519);
                }
                int i9 = next.f7526;
                int i10 = next.f7519;
                C2786.m4778(getContext(), i9);
                C2786.m4778(getContext(), i10);
                sparseIntArray.get(i9);
                sparseIntArray2.get(i10);
                sparseIntArray.put(i9, i10);
                sparseIntArray2.put(i10, i9);
                this.f719.m3539(i9);
                this.f719.m3539(i10);
            }
        }
        if (this.f705 != -1 || (c1583 = this.f719) == null) {
            return;
        }
        this.f705 = c1583.m3550();
        this.f695 = this.f719.m3550();
        this.f701 = this.f719.m3548();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void mo276(int i) {
        this.f859 = null;
    }

    @Override // p034.p035.p045.InterfaceC1068
    /* renamed from: ぺふねづ〺 */
    public void mo116(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f735 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f735 = false;
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.f720 == null) {
                this.f720 = new C0114();
            }
            C0114 c0114 = this.f720;
            c0114.f755 = f;
            c0114.f753 = f2;
            return;
        }
        setProgress(f);
        setState(EnumC0120.MOVING);
        this.f742 = f2;
        m267(1.0f);
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f720 == null) {
                this.f720 = new C0114();
            }
            C0114 c0114 = this.f720;
            c0114.f754 = i;
            c0114.f757 = i2;
            return;
        }
        C1583 c1583 = this.f719;
        if (c1583 != null) {
            this.f695 = i;
            this.f701 = i2;
            c1583.m3547(i, i2);
            this.f739.m291(this.f719.m3539(i), this.f719.m3539(i2));
            m265();
            this.f725 = 0.0f;
            m267(0.0f);
        }
    }

    public void setTransition(C1583.C1584 c1584) {
        C1608 c1608;
        C1583 c1583 = this.f719;
        c1583.f7501 = c1584;
        if (c1584 != null && (c1608 = c1584.f7523) != null) {
            c1608.m3563(c1583.f7498);
        }
        setState(EnumC0120.SETUP);
        float f = this.f705 == this.f719.m3548() ? 1.0f : 0.0f;
        this.f725 = f;
        this.f707 = f;
        this.f715 = f;
        this.f743 = (c1584.f7521 & 1) != 0 ? -1L : getNanoTime();
        int m3550 = this.f719.m3550();
        int m3548 = this.f719.m3548();
        if (m3550 == this.f695 && m3548 == this.f701) {
            return;
        }
        this.f695 = m3550;
        this.f701 = m3548;
        this.f719.m3547(m3550, m3548);
        this.f739.m291(this.f719.m3539(this.f695), this.f719.m3539(this.f701));
        C0119 c0119 = this.f739;
        int i = this.f695;
        int i2 = this.f701;
        c0119.f780 = i;
        c0119.f781 = i2;
        c0119.m289();
        m265();
    }
}

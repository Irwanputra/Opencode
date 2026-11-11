package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import p034.p086.p090.C1575;
import p034.p086.p091.p092.AbstractC1587;
import p034.p086.p091.p092.AbstractC1626;
import p034.p086.p091.p092.AbstractInterpolatorC1646;
import p034.p086.p091.p092.C1603;
import p034.p086.p091.p092.C1643;
import p034.p086.p091.p093.AbstractC1651;
import p034.p086.p091.p093.C1650;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MotionTelltales extends MockView {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public Matrix f830;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f831;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public float[] f832;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f833;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public Paint f834;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public float f835;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public MotionLayout f836;

    public MotionTelltales(Context context) {
        super(context);
        this.f834 = new Paint();
        this.f832 = new float[2];
        this.f830 = new Matrix();
        this.f831 = 0;
        this.f833 = -65281;
        this.f835 = 0.25f;
        m296(context, null);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f834 = new Paint();
        this.f832 = new float[2];
        this.f830 = new Matrix();
        this.f831 = 0;
        this.f833 = -65281;
        this.f835 = 0.25f;
        m296(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f834 = new Paint();
        this.f832 = new float[2];
        this.f830 = new Matrix();
        this.f831 = 0;
        this.f833 = -65281;
        this.f835 = 0.25f;
        m296(context, attributeSet);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    private void m296(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1575.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.MotionTelltales_telltales_tailColor) {
                    this.f833 = obtainStyledAttributes.getColor(index, this.f833);
                } else if (index == C1575.MotionTelltales_telltales_velocityMode) {
                    this.f831 = obtainStyledAttributes.getInt(index, this.f831);
                } else if (index == C1575.MotionTelltales_telltales_tailScale) {
                    this.f835 = obtainStyledAttributes.getFloat(index, this.f835);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f834.setColor(this.f833);
        this.f834.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        float f;
        float[] fArr;
        int i3;
        int i4;
        float[] fArr2;
        int i5;
        AbstractC1587 abstractC1587;
        int i6;
        AbstractC1587 abstractC15872;
        AbstractC1587 abstractC15873;
        AbstractC1587 abstractC15874;
        double[] dArr;
        int i7;
        float[] fArr3;
        float f2;
        C1650 c1650;
        float f3;
        int i8;
        MotionTelltales motionTelltales = this;
        super.onDraw(canvas);
        getMatrix().invert(motionTelltales.f830);
        if (motionTelltales.f836 == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                motionTelltales.f836 = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i9 = 5;
        float[] fArr4 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        int i10 = 0;
        while (i10 < i9) {
            float f4 = fArr4[i10];
            int i11 = 0;
            while (i11 < i9) {
                float f5 = fArr4[i11];
                MotionLayout motionLayout = motionTelltales.f836;
                float[] fArr5 = motionTelltales.f832;
                int i12 = motionTelltales.f831;
                float f6 = motionLayout.f742;
                float f7 = motionLayout.f725;
                if (motionLayout.f729 != null) {
                    float signum = Math.signum(motionLayout.f715 - f7);
                    float interpolation = motionLayout.f729.getInterpolation(motionLayout.f725 + 1.0E-5f);
                    float interpolation2 = motionLayout.f729.getInterpolation(motionLayout.f725);
                    f6 = (((interpolation - interpolation2) / 1.0E-5f) * signum) / motionLayout.f748;
                    f7 = interpolation2;
                }
                Interpolator interpolator = motionLayout.f729;
                if (interpolator instanceof AbstractInterpolatorC1646) {
                    f6 = ((AbstractInterpolatorC1646) interpolator).mo277();
                }
                float f8 = f6;
                C1643 c1643 = motionLayout.f700.get(motionTelltales);
                if ((i12 & 1) == 0) {
                    int width2 = getWidth();
                    int height2 = getHeight();
                    float m3580 = c1643.m3580(f7, c1643.f7682);
                    HashMap<String, AbstractC1587> hashMap = c1643.f7671;
                    AbstractC1587 abstractC15875 = hashMap == null ? null : hashMap.get("translationX");
                    HashMap<String, AbstractC1587> hashMap2 = c1643.f7671;
                    fArr = fArr4;
                    if (hashMap2 == null) {
                        i6 = i12;
                        abstractC1587 = null;
                    } else {
                        abstractC1587 = hashMap2.get("translationY");
                        i6 = i12;
                    }
                    HashMap<String, AbstractC1587> hashMap3 = c1643.f7671;
                    i3 = i10;
                    if (hashMap3 == null) {
                        i5 = i11;
                        abstractC15872 = null;
                    } else {
                        abstractC15872 = hashMap3.get("rotation");
                        i5 = i11;
                    }
                    HashMap<String, AbstractC1587> hashMap4 = c1643.f7671;
                    i2 = height;
                    if (hashMap4 == null) {
                        i = width;
                        abstractC15873 = null;
                    } else {
                        abstractC15873 = hashMap4.get("scaleX");
                        i = width;
                    }
                    HashMap<String, AbstractC1587> hashMap5 = c1643.f7671;
                    if (hashMap5 == null) {
                        f = f8;
                        abstractC15874 = null;
                    } else {
                        abstractC15874 = hashMap5.get("scaleY");
                        f = f8;
                    }
                    HashMap<String, AbstractC1626> hashMap6 = c1643.f7676;
                    AbstractC1626 abstractC1626 = hashMap6 == null ? null : hashMap6.get("translationX");
                    HashMap<String, AbstractC1626> hashMap7 = c1643.f7676;
                    AbstractC1626 abstractC16262 = hashMap7 == null ? null : hashMap7.get("translationY");
                    HashMap<String, AbstractC1626> hashMap8 = c1643.f7676;
                    AbstractC1626 abstractC16263 = hashMap8 == null ? null : hashMap8.get("rotation");
                    HashMap<String, AbstractC1626> hashMap9 = c1643.f7676;
                    AbstractC1626 abstractC16264 = hashMap9 == null ? null : hashMap9.get("scaleX");
                    HashMap<String, AbstractC1626> hashMap10 = c1643.f7676;
                    AbstractC1626 abstractC16265 = hashMap10 == null ? null : hashMap10.get("scaleY");
                    C1650 c16502 = new C1650();
                    c16502.f7721 = 0.0f;
                    c16502.f7723 = 0.0f;
                    c16502.f7719 = 0.0f;
                    c16502.f7718 = 0.0f;
                    c16502.f7720 = 0.0f;
                    c16502.m3586(abstractC15872, m3580);
                    c16502.m3589(abstractC15875, abstractC1587, m3580);
                    c16502.m3590(abstractC15873, abstractC15874, m3580);
                    if (abstractC16263 != null) {
                        c16502.f7721 = abstractC16263.m3573(m3580);
                    }
                    if (abstractC1626 != null) {
                        c16502.f7719 = abstractC1626.m3573(m3580);
                    }
                    if (abstractC16262 != null) {
                        c16502.f7723 = abstractC16262.m3573(m3580);
                    }
                    c16502.m3587(abstractC16264, abstractC16265, m3580);
                    AbstractC1651 abstractC1651 = c1643.f7694;
                    if (abstractC1651 != null) {
                        double[] dArr2 = c1643.f7693;
                        if (dArr2.length > 0) {
                            double d = m3580;
                            abstractC1651.mo3594(d, dArr2);
                            c1643.f7694.mo3596(d, c1643.f7678);
                            c1650 = c16502;
                            i8 = i6;
                            fArr3 = fArr5;
                            f3 = f5;
                            c1643.f7691.m3561(f5, f4, fArr5, c1643.f7688, c1643.f7678, c1643.f7693);
                        } else {
                            c1650 = c16502;
                            f3 = f5;
                            fArr3 = fArr5;
                            i8 = i6;
                        }
                        c1650.m3588(f3, f4, width2, height2, fArr3);
                        i7 = i8;
                        f2 = f3;
                    } else if (c1643.f7669 != null) {
                        double m35802 = c1643.m3580(m3580, c1643.f7682);
                        c1643.f7669[0].mo3596(m35802, c1643.f7678);
                        c1643.f7669[0].mo3594(m35802, c1643.f7693);
                        float f9 = c1643.f7682[0];
                        int i13 = 0;
                        while (true) {
                            dArr = c1643.f7678;
                            if (i13 >= dArr.length) {
                                break;
                            }
                            double d2 = dArr[i13];
                            double d3 = f9;
                            Double.isNaN(d3);
                            Double.isNaN(d3);
                            Double.isNaN(d3);
                            dArr[i13] = d2 * d3;
                            i13++;
                        }
                        i7 = i6;
                        fArr3 = fArr5;
                        f2 = f5;
                        c1643.f7691.m3561(f5, f4, fArr5, c1643.f7688, dArr, c1643.f7693);
                        c16502.m3588(f2, f4, width2, height2, fArr3);
                    } else {
                        C1603 c1603 = c1643.f7684;
                        AbstractC1626 abstractC16266 = abstractC16265;
                        float f10 = c1603.f7551;
                        C1603 c16032 = c1643.f7691;
                        AbstractC1626 abstractC16267 = abstractC16264;
                        float f11 = f10 - c16032.f7551;
                        AbstractC1626 abstractC16268 = abstractC16262;
                        float f12 = c1603.f7545 - c16032.f7545;
                        AbstractC1626 abstractC16269 = abstractC1626;
                        float f13 = c1603.f7543 - c16032.f7543;
                        float f14 = (c1603.f7555 - c16032.f7555) + f12;
                        fArr5[0] = ((f13 + f11) * f5) + ((1.0f - f5) * f11);
                        fArr5[1] = (f14 * f4) + ((1.0f - f4) * f12);
                        c16502.f7721 = 0.0f;
                        c16502.f7723 = 0.0f;
                        c16502.f7719 = 0.0f;
                        c16502.f7718 = 0.0f;
                        c16502.f7720 = 0.0f;
                        c16502.m3586(abstractC15872, m3580);
                        c16502.m3589(abstractC15875, abstractC1587, m3580);
                        c16502.m3590(abstractC15873, abstractC15874, m3580);
                        if (abstractC16263 != null) {
                            c16502.f7721 = abstractC16263.m3573(m3580);
                        }
                        if (abstractC16269 != null) {
                            c16502.f7719 = abstractC16269.m3573(m3580);
                        }
                        if (abstractC16268 != null) {
                            c16502.f7723 = abstractC16268.m3573(m3580);
                        }
                        c16502.m3587(abstractC16267, abstractC16266, m3580);
                        i4 = i6;
                        fArr2 = fArr5;
                        c16502.m3588(f5, f4, width2, height2, fArr5);
                    }
                    i4 = i7;
                    f5 = f2;
                    fArr2 = fArr3;
                } else {
                    i = width;
                    i2 = height;
                    f = f8;
                    fArr = fArr4;
                    i3 = i10;
                    i4 = i12;
                    fArr2 = fArr5;
                    i5 = i11;
                    c1643.m3578(f7, f5, f4, fArr2);
                }
                if (i4 < 2) {
                    fArr2[0] = fArr2[0] * f;
                    fArr2[1] = fArr2[1] * f;
                }
                motionTelltales = this;
                motionTelltales.f830.mapVectors(motionTelltales.f832);
                width = i;
                float f15 = width * f5;
                height = i2;
                float f16 = height * f4;
                float[] fArr6 = motionTelltales.f832;
                float f17 = fArr6[0];
                float f18 = motionTelltales.f835;
                float f19 = f15 - (f17 * f18);
                float f20 = f16 - (fArr6[1] * f18);
                motionTelltales.f830.mapVectors(fArr6);
                canvas.drawLine(f15, f16, f19, f20, motionTelltales.f834);
                i11 = i5 + 1;
                fArr4 = fArr;
                i10 = i3;
                i9 = 5;
            }
            i10++;
            i9 = 5;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f821 = charSequence.toString();
        requestLayout();
    }
}

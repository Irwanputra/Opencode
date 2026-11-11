package p034.p086.p091.p092;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import defpackage.C0999;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import p034.p086.p090.C1572;
import p034.p086.p091.p093.AbstractC1651;
import p034.p086.p091.p093.C1659;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1626 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1572 f7649;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f7650;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1639 f7651;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f7654 = 0;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f7652 = 0;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ArrayList<C1631> f7653 = new ArrayList<>();

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$〳ぜぞぜべっ, reason: contains not printable characters */
    public static class C1627 extends AbstractC1626 {
        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            view.setRotation(m3575(f));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$〺つふすそ, reason: contains not printable characters */
    public static class C1628 extends AbstractC1626 {
        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            view.setAlpha(m3575(f));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C1629 extends AbstractC1626 {

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean f7655 = false;

        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m3575(f));
                return;
            }
            if (this.f7655) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f7655 = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m3575(f)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$いいにぽつ, reason: contains not printable characters */
    public static class C1630 extends AbstractC1626 {
        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            view.setRotationY(m3575(f));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$ぇぬぎばつ, reason: contains not printable characters */
    public static class C1631 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f7656;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f7657;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f7658;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public float f7659;

        public C1631(int i, float f, float f2, float f3) {
            this.f7658 = i;
            this.f7656 = f3;
            this.f7657 = f2;
            this.f7659 = f;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$おぐぴう〸ず, reason: contains not printable characters */
    public static class C1632 extends AbstractC1626 {
        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(m3575(f));
            }
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1633 extends AbstractC1626 {

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public float[] f7660 = new float[1];

        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            this.f7660[0] = m3575(f);
            this.f7649.m3529(view, this.f7660);
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1634 implements Comparator<C1631> {
        public C1634(AbstractC1626 abstractC1626) {
        }

        @Override // java.util.Comparator
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(C1631 c1631, C1631 c16312) {
            return C0999.m2326(c1631.f7658, c16312.f7658);
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$づざかべべ, reason: contains not printable characters */
    public static class C1635 extends AbstractC1626 {
        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(m3575(f));
            }
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$てぜきぽく, reason: contains not printable characters */
    public static class C1636 extends AbstractC1626 {
        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            view.setScaleY(m3575(f));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C1637 extends AbstractC1626 {
        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$のぷのちつ, reason: contains not printable characters */
    public static class C1638 extends AbstractC1626 {
        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            view.setTranslationX(m3575(f));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$びぐびあび, reason: contains not printable characters */
    public static class C1639 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public double[] f7661;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float[] f7662;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public double[] f7663;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public double[] f7664;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1659 f7665 = new C1659();

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public float[] f7666;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public AbstractC1651 f7667;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public float[] f7668;

        public C1639(int i, int i2, int i3) {
            new HashMap();
            this.f7665.f7773 = i;
            this.f7662 = new float[i3];
            this.f7664 = new double[i3];
            this.f7668 = new float[i3];
            this.f7666 = new float[i3];
            float[] fArr = new float[i3];
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$へぬ〴づぞ, reason: contains not printable characters */
    public static class C1640 extends AbstractC1626 {
        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            view.setTranslationY(m3575(f));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$ぺぁあねじ, reason: contains not printable characters */
    public static class C1641 extends AbstractC1626 {
        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            view.setRotationX(m3575(f));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.なぎぱいぢぎ$ぺふねづ〺, reason: contains not printable characters */
    public static class C1642 extends AbstractC1626 {
        @Override // p034.p086.p091.p092.AbstractC1626
        /* renamed from: くし〴〺ぅ */
        public void mo3574(View view, float f) {
            view.setScaleX(m3575(f));
        }
    }

    public String toString() {
        String str = this.f7650;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C1631> it = this.f7653.iterator();
        while (it.hasNext()) {
            C1631 next = it.next();
            StringBuilder m4179 = C2098.m4179(str, "[");
            m4179.append(next.f7658);
            m4179.append(" , ");
            m4179.append(decimalFormat.format(next.f7656));
            m4179.append("] ");
            str = m4179.toString();
        }
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0036. Please report as an issue. */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float m3573(float f) {
        double m3615;
        double signum;
        double m36152;
        C1639 c1639 = this.f7651;
        AbstractC1651 abstractC1651 = c1639.f7667;
        double d = 0.0d;
        if (abstractC1651 != null) {
            double d2 = f;
            abstractC1651.mo3596(d2, c1639.f7661);
            c1639.f7667.mo3594(d2, c1639.f7663);
        } else {
            double[] dArr = c1639.f7661;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
        }
        double d3 = f;
        double m3618 = c1639.f7665.m3618(d3);
        C1659 c1659 = c1639.f7665;
        double d4 = 2.0d;
        switch (c1659.f7773) {
            case 1:
                break;
            case 2:
                m3615 = c1659.m3615(d3) * 4.0d;
                signum = Math.signum((((c1659.m3616(d3) * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                d = m3615 * signum;
                break;
            case 3:
                m36152 = c1659.m3615(d3);
                d = m36152 * d4;
                break;
            case 4:
                m36152 = -c1659.m3615(d3);
                d = m36152 * d4;
                break;
            case 5:
                d4 = c1659.m3615(d3) * (-6.283185307179586d);
                m36152 = Math.sin(c1659.m3616(d3) * 6.283185307179586d);
                d = m36152 * d4;
                break;
            case 6:
                m3615 = c1659.m3615(d3) * 4.0d;
                signum = (((c1659.m3616(d3) * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                d = m3615 * signum;
                break;
            default:
                m3615 = c1659.m3615(d3) * 6.283185307179586d;
                signum = Math.cos(c1659.m3616(d3) * 6.283185307179586d);
                d = m3615 * signum;
                break;
        }
        double[] dArr2 = c1639.f7661;
        return (float) ((d * c1639.f7663[1]) + (m3618 * dArr2[1]) + dArr2[0]);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public abstract void mo3574(View view, float f);

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float m3575(float f) {
        C1639 c1639 = this.f7651;
        AbstractC1651 abstractC1651 = c1639.f7667;
        if (abstractC1651 != null) {
            abstractC1651.mo3594(f, c1639.f7663);
        } else {
            double[] dArr = c1639.f7663;
            dArr[0] = c1639.f7666[0];
            dArr[1] = c1639.f7662[0];
        }
        return (float) ((c1639.f7665.m3618(f) * c1639.f7663[1]) + c1639.f7663[0]);
    }

    @TargetApi(19)
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m3576(float f) {
        int i;
        AbstractC1651 abstractC1651;
        int size = this.f7653.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f7653, new C1634(this));
        double[] dArr = new double[size];
        char c = 1;
        char c2 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, 2);
        this.f7651 = new C1639(this.f7654, this.f7652, size);
        Iterator<C1631> it = this.f7653.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C1631 next = it.next();
            float f2 = next.f7659;
            double d = f2;
            Double.isNaN(d);
            dArr[i2] = d * 0.01d;
            double[] dArr3 = dArr2[i2];
            float f3 = next.f7656;
            dArr3[c2] = f3;
            double[] dArr4 = dArr2[i2];
            float f4 = next.f7657;
            dArr4[c] = f4;
            C1639 c1639 = this.f7651;
            int i3 = next.f7658;
            double[] dArr5 = c1639.f7664;
            double d2 = i3;
            Double.isNaN(d2);
            Double.isNaN(d2);
            dArr5[i2] = d2 / 100.0d;
            c1639.f7668[i2] = f2;
            c1639.f7666[i2] = f4;
            c1639.f7662[i2] = f3;
            i2++;
            c = 1;
            c2 = 0;
        }
        C1639 c16392 = this.f7651;
        double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) double.class, c16392.f7664.length, 2);
        float[] fArr = c16392.f7662;
        c16392.f7663 = new double[fArr.length + 1];
        c16392.f7661 = new double[fArr.length + 1];
        if (c16392.f7664[0] > 0.0d) {
            c16392.f7665.m3617(0.0d, c16392.f7668[0]);
        }
        double[] dArr7 = c16392.f7664;
        int length = dArr7.length - 1;
        if (dArr7[length] < 1.0d) {
            c16392.f7665.m3617(1.0d, c16392.f7668[length]);
        }
        for (int i4 = 0; i4 < dArr6.length; i4++) {
            dArr6[i4][0] = c16392.f7666[i4];
            int i5 = 0;
            while (true) {
                if (i5 < c16392.f7662.length) {
                    dArr6[i5][1] = r7[i5];
                    i5++;
                }
            }
            c16392.f7665.m3617(c16392.f7664[i4], c16392.f7668[i4]);
        }
        C1659 c1659 = c16392.f7665;
        double d3 = 0.0d;
        int i6 = 0;
        while (true) {
            float[] fArr2 = c1659.f7772;
            if (i6 >= fArr2.length) {
                break;
            }
            double d4 = fArr2[i6];
            Double.isNaN(d4);
            Double.isNaN(d4);
            Double.isNaN(d4);
            d3 += d4;
            i6++;
        }
        double d5 = 0.0d;
        int i7 = 1;
        while (true) {
            float[] fArr3 = c1659.f7772;
            if (i7 >= fArr3.length) {
                break;
            }
            int i8 = i7 - 1;
            float f5 = (fArr3[i8] + fArr3[i7]) / 2.0f;
            double[] dArr8 = c1659.f7770;
            double d6 = dArr8[i7] - dArr8[i8];
            double d7 = f5;
            Double.isNaN(d7);
            Double.isNaN(d7);
            Double.isNaN(d7);
            d5 = (d6 * d7) + d5;
            i7++;
        }
        int i9 = 0;
        while (true) {
            float[] fArr4 = c1659.f7772;
            if (i9 >= fArr4.length) {
                break;
            }
            double d8 = fArr4[i9];
            Double.isNaN(d8);
            Double.isNaN(d8);
            Double.isNaN(d8);
            fArr4[i9] = (float) (d8 * (d3 / d5));
            i9++;
        }
        c1659.f7771[0] = 0.0d;
        int i10 = 1;
        while (true) {
            float[] fArr5 = c1659.f7772;
            if (i10 >= fArr5.length) {
                break;
            }
            int i11 = i10 - 1;
            float f6 = (fArr5[i11] + fArr5[i10]) / 2.0f;
            double[] dArr9 = c1659.f7770;
            double d9 = dArr9[i10] - dArr9[i11];
            double[] dArr10 = c1659.f7771;
            double d10 = dArr10[i11];
            double d11 = f6;
            Double.isNaN(d11);
            Double.isNaN(d11);
            Double.isNaN(d11);
            dArr10[i10] = (d9 * d11) + d10;
            i10++;
        }
        double[] dArr11 = c16392.f7664;
        if (dArr11.length > 1) {
            i = 0;
            abstractC1651 = AbstractC1651.m3591(0, dArr11, dArr6);
        } else {
            i = 0;
            abstractC1651 = null;
        }
        c16392.f7667 = abstractC1651;
        AbstractC1651.m3591(i, dArr, dArr2);
    }
}

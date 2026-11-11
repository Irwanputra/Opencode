package p034.p086.p091.p092;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import p034.p086.p090.C1572;
import p034.p086.p091.p093.AbstractC1651;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1609 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public AbstractC1651 f7603;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f7604;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String f7605;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public long f7607;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f7599 = 0;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int[] f7602 = new int[10];

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float[][] f7606 = (float[][]) Array.newInstance((Class<?>) float.class, 10, 3);

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float[] f7600 = new float[3];

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f7598 = false;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f7601 = Float.NaN;

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$〳ぜぞぜべっ, reason: contains not printable characters */
    public static class C1610 extends AbstractC1609 {
        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            view.setRotationY(m3565(f, j, view, c1645));
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$〺つふすそ, reason: contains not printable characters */
    public static class C1611 extends AbstractC1609 {

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public float[] f7608;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public SparseArray<C1572> f7609;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public SparseArray<float[]> f7610 = new SparseArray<>();

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public float[] f7611;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public String f7612;

        public C1611(String str, SparseArray<C1572> sparseArray) {
            this.f7612 = str.split(",")[1];
            this.f7609 = sparseArray;
        }

        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: くし〴〺ぅ */
        public void mo3566(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: づざかべべ */
        public void mo3568(int i) {
            int size = this.f7609.size();
            int m3531 = this.f7609.valueAt(0).m3531();
            double[] dArr = new double[size];
            int i2 = m3531 + 2;
            this.f7611 = new float[i2];
            this.f7608 = new float[m3531];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f7609.keyAt(i3);
                C1572 valueAt = this.f7609.valueAt(i3);
                float[] valueAt2 = this.f7610.valueAt(i3);
                double d = keyAt;
                Double.isNaN(d);
                dArr[i3] = d * 0.01d;
                valueAt.m3530(this.f7611);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f7611.length) {
                        dArr2[i3][i4] = r8[i4];
                        i4++;
                    }
                }
                dArr2[i3][m3531] = valueAt2[0];
                dArr2[i3][m3531 + 1] = valueAt2[1];
            }
            this.f7603 = AbstractC1651.m3591(i, dArr, dArr2);
        }

        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            this.f7603.mo3597(f, this.f7611);
            float[] fArr = this.f7611;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f7607;
            if (Float.isNaN(this.f7601)) {
                float m3584 = c1645.m3584(view, this.f7612, 0);
                this.f7601 = m3584;
                if (Float.isNaN(m3584)) {
                    this.f7601 = 0.0f;
                }
            }
            double d = this.f7601;
            double d2 = j2;
            Double.isNaN(d2);
            double d3 = f2;
            Double.isNaN(d3);
            Double.isNaN(d);
            float f4 = (float) ((((d2 * 1.0E-9d) * d3) + d) % 1.0d);
            this.f7601 = f4;
            this.f7607 = j;
            float m3567 = m3567(f4);
            this.f7598 = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f7608;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f7598;
                float[] fArr3 = this.f7611;
                this.f7598 = z | (((double) fArr3[i]) != 0.0d);
                fArr2[i] = (fArr3[i] * m3567) + f3;
                i++;
            }
            this.f7609.valueAt(0).m3529(view, this.f7608);
            if (f2 != 0.0f) {
                this.f7598 = true;
            }
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C1612 extends AbstractC1609 {
        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            view.setRotationX(m3565(f, j, view, c1645));
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$いいにぽつ, reason: contains not printable characters */
    public static class C1613 extends AbstractC1609 {
        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            view.setScaleY(m3565(f, j, view, c1645));
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1614 extends AbstractC1609 {
        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(m3565(f, j, view, c1645));
            }
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1615 extends AbstractC1609 {
        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            view.setAlpha(m3565(f, j, view, c1645));
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$づざかべべ, reason: contains not printable characters */
    public static class C1616 extends AbstractC1609 {

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean f7613 = false;

        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m3565(f, j, view, c1645));
            } else {
                if (this.f7613) {
                    return false;
                }
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f7613 = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(m3565(f, j, view, c1645)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$てぜきぽく, reason: contains not printable characters */
    public static class C1617 extends AbstractC1609 {
        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            view.setTranslationY(m3565(f, j, view, c1645));
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C1618 extends AbstractC1609 {
        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            view.setRotation(m3565(f, j, view, c1645));
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$のぷのちつ, reason: contains not printable characters */
    public static class C1619 extends AbstractC1609 {
        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(m3565(f, j, view, c1645));
            }
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$びぐびあび, reason: contains not printable characters */
    public static class C1620 extends AbstractC1609 {
        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$ぺぁあねじ, reason: contains not printable characters */
    public static class C1621 extends AbstractC1609 {
        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            view.setScaleX(m3565(f, j, view, c1645));
            return this.f7598;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざとぅぼこ〺$ぺふねづ〺, reason: contains not printable characters */
    public static class C1622 extends AbstractC1609 {
        @Override // p034.p086.p091.p092.AbstractC1609
        /* renamed from: びぐびあび */
        public boolean mo3569(View view, float f, long j, C1645 c1645) {
            view.setTranslationX(m3565(f, j, view, c1645));
            return this.f7598;
        }
    }

    public String toString() {
        String str = this.f7605;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f7604; i++) {
            StringBuilder m4179 = C2098.m4179(str, "[");
            m4179.append(this.f7602[i]);
            m4179.append(" , ");
            m4179.append(decimalFormat.format(this.f7606[i]));
            m4179.append("] ");
            str = m4179.toString();
        }
        return str;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float m3565(float f, long j, View view, C1645 c1645) {
        HashMap<String, float[]> hashMap;
        float f2;
        this.f7603.mo3597(f, this.f7600);
        float[] fArr = this.f7600;
        boolean z = true;
        float f3 = fArr[1];
        if (f3 == 0.0f) {
            this.f7598 = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f7601)) {
            float m3584 = c1645.m3584(view, this.f7605, 0);
            this.f7601 = m3584;
            if (Float.isNaN(m3584)) {
                this.f7601 = 0.0f;
            }
        }
        long j2 = j - this.f7607;
        double d = this.f7601;
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = f3;
        Double.isNaN(d3);
        Double.isNaN(d);
        float f4 = (float) ((((d2 * 1.0E-9d) * d3) + d) % 1.0d);
        this.f7601 = f4;
        String str = this.f7605;
        if (c1645.f7696.containsKey(view)) {
            hashMap = c1645.f7696.get(view);
            if (hashMap.containsKey(str)) {
                float[] fArr2 = hashMap.get(str);
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f4;
                hashMap.put(str, fArr2);
                this.f7607 = j;
                f2 = this.f7600[0];
                float m3567 = (m3567(this.f7601) * f2) + this.f7600[2];
                if (f2 == 0.0f && f3 == 0.0f) {
                    z = false;
                }
                this.f7598 = z;
                return m3567;
            }
            hashMap.put(str, new float[]{f4});
        } else {
            hashMap = new HashMap<>();
            hashMap.put(str, new float[]{f4});
        }
        c1645.f7696.put(view, hashMap);
        this.f7607 = j;
        f2 = this.f7600[0];
        float m35672 = (m3567(this.f7601) * f2) + this.f7600[2];
        if (f2 == 0.0f) {
            z = false;
        }
        this.f7598 = z;
        return m35672;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo3566(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f7602;
        int i3 = this.f7604;
        iArr[i3] = i;
        float[][] fArr = this.f7606;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.f7599 = Math.max(this.f7599, i2);
        this.f7604++;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float m3567(float f) {
        float abs;
        switch (this.f7599) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - abs;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void mo3568(int i) {
        int i2;
        int i3 = this.f7604;
        if (i3 == 0) {
            return;
        }
        int[] iArr = this.f7602;
        float[][] fArr = this.f7606;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i3 - 1;
        iArr2[1] = 0;
        int i4 = 2;
        while (i4 > 0) {
            int i5 = i4 - 1;
            int i6 = iArr2[i5];
            i4 = i5 - 1;
            int i7 = iArr2[i4];
            if (i6 < i7) {
                int i8 = iArr[i7];
                int i9 = i6;
                int i10 = i9;
                while (i9 < i7) {
                    if (iArr[i9] <= i8) {
                        int i11 = iArr[i10];
                        iArr[i10] = iArr[i9];
                        iArr[i9] = i11;
                        float[] fArr2 = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = fArr2;
                        i10++;
                    }
                    i9++;
                }
                int i12 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i12;
                float[] fArr3 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = fArr3;
                int i13 = i4 + 1;
                iArr2[i4] = i10 - 1;
                int i14 = i13 + 1;
                iArr2[i13] = i6;
                int i15 = i14 + 1;
                iArr2[i14] = i7;
                i4 = i15 + 1;
                iArr2[i15] = i10 + 1;
            }
        }
        int i16 = 1;
        int i17 = 0;
        while (true) {
            int[] iArr3 = this.f7602;
            if (i16 >= iArr3.length) {
                break;
            }
            if (iArr3[i16] != iArr3[i16 - 1]) {
                i17++;
            }
            i16++;
        }
        if (i17 == 0) {
            i17 = 1;
        }
        double[] dArr = new double[i17];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, i17, 3);
        int i18 = 0;
        while (i2 < this.f7604) {
            if (i2 > 0) {
                int[] iArr4 = this.f7602;
                i2 = iArr4[i2] == iArr4[i2 + (-1)] ? i2 + 1 : 0;
            }
            double d = this.f7602[i2];
            Double.isNaN(d);
            dArr[i18] = d * 0.01d;
            double[] dArr3 = dArr2[i18];
            float[][] fArr4 = this.f7606;
            dArr3[0] = fArr4[i2][0];
            dArr2[i18][1] = fArr4[i2][1];
            dArr2[i18][2] = fArr4[i2][2];
            i18++;
        }
        this.f7603 = AbstractC1651.m3591(i, dArr, dArr2);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public abstract boolean mo3569(View view, float f, long j, C1645 c1645);
}

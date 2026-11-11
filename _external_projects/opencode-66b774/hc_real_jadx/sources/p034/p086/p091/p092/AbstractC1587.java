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
import p034.p086.p090.C1572;
import p034.p086.p091.p093.AbstractC1651;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1587 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int[] f7534 = new int[10];

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float[] f7535 = new float[10];

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public AbstractC1651 f7536;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f7537;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f7538;

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$〳ぜぞぜべっ, reason: contains not printable characters */
    public static class C1588 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            view.setRotation((float) this.f7536.mo3592(f, 0));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$〺つふすそ, reason: contains not printable characters */
    public static class C1589 extends AbstractC1587 {

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public float[] f7539;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public SparseArray<C1572> f7540;

        public C1589(String str, SparseArray<C1572> sparseArray) {
            String str2 = str.split(",")[1];
            this.f7540 = sparseArray;
        }

        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: 〺つふすそ */
        public void mo3554(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            this.f7536.mo3597(f, this.f7539);
            this.f7540.valueAt(0).m3529(view, this.f7539);
        }

        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: びぐびあび */
        public void mo3557(int i) {
            int size = this.f7540.size();
            int m3531 = this.f7540.valueAt(0).m3531();
            double[] dArr = new double[size];
            this.f7539 = new float[m3531];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, m3531);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.f7540.keyAt(i2);
                C1572 valueAt = this.f7540.valueAt(i2);
                double d = keyAt;
                Double.isNaN(d);
                dArr[i2] = d * 0.01d;
                valueAt.m3530(this.f7539);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f7539.length) {
                        dArr2[i2][i3] = r6[i3];
                        i3++;
                    }
                }
            }
            this.f7536 = AbstractC1651.m3591(i, dArr, dArr2);
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C1590 extends AbstractC1587 {

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f7541 = false;

        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress((float) this.f7536.mo3592(f, 0));
                return;
            }
            if (this.f7541) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f7541 = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf((float) this.f7536.mo3592(f, 0)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$いいにぽつ, reason: contains not printable characters */
    public static class C1591 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            view.setRotationY((float) this.f7536.mo3592(f, 0));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$おぐぴう〸ず, reason: contains not printable characters */
    public static class C1592 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ((float) this.f7536.mo3592(f, 0));
            }
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1593 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation((float) this.f7536.mo3592(f, 0));
            }
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1594 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            view.setAlpha((float) this.f7536.mo3592(f, 0));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$づざかべべ, reason: contains not printable characters */
    public static class C1595 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            view.setPivotX((float) this.f7536.mo3592(f, 0));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$てぜきぽく, reason: contains not printable characters */
    public static class C1596 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            view.setScaleY((float) this.f7536.mo3592(f, 0));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C1597 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            view.setPivotY((float) this.f7536.mo3592(f, 0));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$のぷのちつ, reason: contains not printable characters */
    public static class C1598 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            view.setTranslationX((float) this.f7536.mo3592(f, 0));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$びぐびあび, reason: contains not printable characters */
    public static class C1599 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$へぬ〴づぞ, reason: contains not printable characters */
    public static class C1600 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            view.setTranslationY((float) this.f7536.mo3592(f, 0));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$ぺぁあねじ, reason: contains not printable characters */
    public static class C1601 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            view.setRotationX((float) this.f7536.mo3592(f, 0));
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぉざぅち〻$ぺふねづ〺, reason: contains not printable characters */
    public static class C1602 extends AbstractC1587 {
        @Override // p034.p086.p091.p092.AbstractC1587
        /* renamed from: くし〴〺ぅ */
        public void mo3555(View view, float f) {
            view.setScaleX((float) this.f7536.mo3592(f, 0));
        }
    }

    public String toString() {
        String str = this.f7537;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f7538; i++) {
            StringBuilder m4179 = C2098.m4179(str, "[");
            m4179.append(this.f7534[i]);
            m4179.append(" , ");
            m4179.append(decimalFormat.format(this.f7535[i]));
            m4179.append("] ");
            str = m4179.toString();
        }
        return str;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo3554(int i, float f) {
        int[] iArr = this.f7534;
        if (iArr.length < this.f7538 + 1) {
            this.f7534 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f7535;
            this.f7535 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f7534;
        int i2 = this.f7538;
        iArr2[i2] = i;
        this.f7535[i2] = f;
        this.f7538 = i2 + 1;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public abstract void mo3555(View view, float f);

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float m3556(float f) {
        return (float) this.f7536.mo3592(f, 0);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void mo3557(int i) {
        int i2;
        int i3 = this.f7538;
        if (i3 == 0) {
            return;
        }
        int[] iArr = this.f7534;
        float[] fArr = this.f7535;
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
                        float f = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = f;
                        i10++;
                    }
                    i9++;
                }
                int i12 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i12;
                float f2 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = f2;
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
        for (int i17 = 1; i17 < this.f7538; i17++) {
            int[] iArr3 = this.f7534;
            if (iArr3[i17 - 1] != iArr3[i17]) {
                i16++;
            }
        }
        double[] dArr = new double[i16];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, i16, 1);
        int i18 = 0;
        while (i2 < this.f7538) {
            if (i2 > 0) {
                int[] iArr4 = this.f7534;
                i2 = iArr4[i2] == iArr4[i2 + (-1)] ? i2 + 1 : 0;
            }
            double d = this.f7534[i2];
            Double.isNaN(d);
            dArr[i18] = d * 0.01d;
            dArr2[i18][0] = this.f7535[i2];
            i18++;
        }
        this.f7536 = AbstractC1651.m3591(i, dArr, dArr2);
    }
}

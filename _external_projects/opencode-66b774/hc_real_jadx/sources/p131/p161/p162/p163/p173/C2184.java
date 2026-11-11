package p131.p161.p162.p163.p173;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.BitSet;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2170;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2184 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C2170[] f9147 = new C2170[4];

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Matrix[] f9143 = new Matrix[4];

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Matrix[] f9146 = new Matrix[4];

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final PointF f9150 = new PointF();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Path f9148 = new Path();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Path f9149 = new Path();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final C2170 f9144 = new C2170();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final float[] f9142 = new float[2];

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final float[] f9151 = new float[2];

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f9145 = true;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.のぷのちつ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC2185 {
    }

    public C2184() {
        for (int i = 0; i < 4; i++) {
            this.f9147[i] = new C2170();
            this.f9143[i] = new Matrix();
            this.f9146[i] = new Matrix();
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4295(C2180 c2180, float f, RectF rectF, InterfaceC2185 interfaceC2185, Path path) {
        int i;
        float centerX;
        float f2;
        C2170 c2170;
        Matrix matrix;
        Path path2;
        float f3;
        float f4;
        path.rewind();
        this.f9148.rewind();
        this.f9149.rewind();
        this.f9149.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            InterfaceC2177 interfaceC2177 = i2 != 1 ? i2 != 2 ? i2 != 3 ? c2180.f9126 : c2180.f9124 : c2180.f9118 : c2180.f9120;
            C2186 c2186 = i2 != 1 ? i2 != 2 ? i2 != 3 ? c2180.f9119 : c2180.f9123 : c2180.f9127 : c2180.f9122;
            C2170 c21702 = this.f9147[i2];
            c2186.getClass();
            c2186.mo4282(c21702, 90.0f, f, interfaceC2177.mo4271(rectF));
            int i3 = i2 + 1;
            float f5 = i3 * 90;
            this.f9143[i2].reset();
            PointF pointF = this.f9150;
            if (i2 == 1) {
                f3 = rectF.right;
            } else if (i2 != 2) {
                f3 = i2 != 3 ? rectF.right : rectF.left;
                f4 = rectF.top;
                pointF.set(f3, f4);
                Matrix matrix2 = this.f9143[i2];
                PointF pointF2 = this.f9150;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.f9143[i2].preRotate(f5);
                float[] fArr = this.f9142;
                C2170[] c2170Arr = this.f9147;
                fArr[0] = c2170Arr[i2].f9096;
                fArr[1] = c2170Arr[i2].f9100;
                this.f9143[i2].mapPoints(fArr);
                this.f9146[i2].reset();
                Matrix matrix3 = this.f9146[i2];
                float[] fArr2 = this.f9142;
                matrix3.setTranslate(fArr2[0], fArr2[1]);
                this.f9146[i2].preRotate(f5);
                i2 = i3;
            } else {
                f3 = rectF.left;
            }
            f4 = rectF.bottom;
            pointF.set(f3, f4);
            Matrix matrix22 = this.f9143[i2];
            PointF pointF22 = this.f9150;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f9143[i2].preRotate(f5);
            float[] fArr3 = this.f9142;
            C2170[] c2170Arr2 = this.f9147;
            fArr3[0] = c2170Arr2[i2].f9096;
            fArr3[1] = c2170Arr2[i2].f9100;
            this.f9143[i2].mapPoints(fArr3);
            this.f9146[i2].reset();
            Matrix matrix32 = this.f9146[i2];
            float[] fArr22 = this.f9142;
            matrix32.setTranslate(fArr22[0], fArr22[1]);
            this.f9146[i2].preRotate(f5);
            i2 = i3;
        }
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            float[] fArr4 = this.f9142;
            C2170[] c2170Arr3 = this.f9147;
            fArr4[0] = c2170Arr3[i4].f9097;
            fArr4[1] = c2170Arr3[i4].f9094;
            this.f9143[i4].mapPoints(fArr4);
            float[] fArr5 = this.f9142;
            if (i4 == 0) {
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.f9147[i4].m4274(this.f9143[i4], path);
            if (interfaceC2185 != null) {
                C2170 c21703 = this.f9147[i4];
                Matrix matrix4 = this.f9143[i4];
                C2163.C2165 c2165 = (C2163.C2165) interfaceC2185;
                BitSet bitSet = C2163.this.f9055;
                c21703.getClass();
                bitSet.set(i4, false);
                C2170.AbstractC2175[] abstractC2175Arr = C2163.this.f9051;
                c21703.m4273(c21703.f9099);
                abstractC2175Arr[i4] = new C2187(c21703, new ArrayList(c21703.f9093), matrix4);
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.f9142;
            C2170[] c2170Arr4 = this.f9147;
            fArr6[0] = c2170Arr4[i4].f9096;
            fArr6[1] = c2170Arr4[i4].f9100;
            this.f9143[i4].mapPoints(fArr6);
            float[] fArr7 = this.f9151;
            C2170[] c2170Arr5 = this.f9147;
            fArr7[0] = c2170Arr5[i6].f9097;
            fArr7[1] = c2170Arr5[i6].f9094;
            this.f9143[i6].mapPoints(fArr7);
            float f6 = this.f9142[0];
            float[] fArr8 = this.f9151;
            float max = Math.max(((float) Math.hypot(f6 - fArr8[0], r13[1] - fArr8[1])) - 0.001f, 0.0f);
            float[] fArr9 = this.f9142;
            C2170[] c2170Arr6 = this.f9147;
            fArr9[0] = c2170Arr6[i4].f9096;
            fArr9[1] = c2170Arr6[i4].f9100;
            this.f9143[i4].mapPoints(fArr9);
            if (i4 == 1 || i4 == 3) {
                centerX = rectF.centerX();
                f2 = this.f9142[0];
            } else {
                centerX = rectF.centerY();
                f2 = this.f9142[1];
            }
            float abs = Math.abs(centerX - f2);
            this.f9144.m4276(0.0f, 0.0f);
            C2183 c2183 = i4 != 1 ? i4 != 2 ? i4 != 3 ? c2180.f9121 : c2180.f9128 : c2180.f9125 : c2180.f9129;
            c2183.mo4238(max, abs, f, this.f9144);
            Path path3 = new Path();
            this.f9144.m4274(this.f9146[i4], path3);
            if (this.f9145 && Build.VERSION.SDK_INT >= 19 && (c2183.mo4272() || m4296(path3, i4) || m4296(path3, i6))) {
                path3.op(path3, this.f9149, Path.Op.DIFFERENCE);
                float[] fArr10 = this.f9142;
                C2170 c21704 = this.f9144;
                fArr10[0] = c21704.f9097;
                fArr10[1] = c21704.f9094;
                this.f9146[i4].mapPoints(fArr10);
                Path path4 = this.f9148;
                float[] fArr11 = this.f9142;
                path4.moveTo(fArr11[0], fArr11[1]);
                c2170 = this.f9144;
                matrix = this.f9146[i4];
                path2 = this.f9148;
            } else {
                c2170 = this.f9144;
                matrix = this.f9146[i4];
                path2 = path;
            }
            c2170.m4274(matrix, path2);
            if (interfaceC2185 != null) {
                C2170 c21705 = this.f9144;
                Matrix matrix5 = this.f9146[i4];
                C2163.C2165 c21652 = (C2163.C2165) interfaceC2185;
                c21705.getClass();
                C2163.this.f9055.set(i4 + 4, false);
                C2170.AbstractC2175[] abstractC2175Arr2 = C2163.this.f9061;
                c21705.m4273(c21705.f9099);
                abstractC2175Arr2[i4] = new C2187(c21705, new ArrayList(c21705.f9093), matrix5);
            }
            i4 = i5;
        }
        path.close();
        this.f9148.close();
        if (Build.VERSION.SDK_INT < 19 || this.f9148.isEmpty()) {
            return;
        }
        path.op(this.f9148, Path.Op.UNION);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean m4296(Path path, int i) {
        Path path2 = new Path();
        this.f9147[i].m4274(this.f9143[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4297(C2180 c2180, float f, RectF rectF, Path path) {
        m4295(c2180, f, rectF, null, path);
    }
}

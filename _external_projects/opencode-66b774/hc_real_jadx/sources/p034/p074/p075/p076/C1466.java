package p034.p074.p075.p076;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import org.xmlpull.v1.XmlPullParser;
import p034.p035.p038.C1010;
import p034.p035.p043.p044.C1063;
import p034.p080.C1502;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1466 extends AbstractC1480 {

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static final PorterDuff.Mode f6767 = PorterDuff.Mode.SRC_IN;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final float[] f6768;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f6769;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final Rect f6770;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1467 f6771;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ColorFilter f6772;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f6773;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public PorterDuffColorFilter f6774;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final Matrix f6775;

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ$〳ぜぞぜべっ, reason: contains not printable characters */
    public static class C1467 extends Drawable.ConstantState {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public PorterDuff.Mode f6776;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1469 f6777;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public ColorStateList f6778;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean f6779;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ColorStateList f6780;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f6781;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f6782;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public Paint f6783;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public Bitmap f6784;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public PorterDuff.Mode f6785;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public int f6786;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean f6787;

        public C1467() {
            this.f6780 = null;
            this.f6785 = C1466.f6767;
            this.f6777 = new C1469();
        }

        public C1467(C1467 c1467) {
            this.f6780 = null;
            this.f6785 = C1466.f6767;
            if (c1467 != null) {
                this.f6781 = c1467.f6781;
                C1469 c1469 = new C1469(c1467.f6777);
                this.f6777 = c1469;
                if (c1467.f6777.f6797 != null) {
                    c1469.f6797 = new Paint(c1467.f6777.f6797);
                }
                if (c1467.f6777.f6801 != null) {
                    this.f6777.f6801 = new Paint(c1467.f6777.f6801);
                }
                this.f6780 = c1467.f6780;
                this.f6785 = c1467.f6785;
                this.f6782 = c1467.f6782;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6781;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1466(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1466(this);
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m3202(int i, int i2) {
            this.f6784.eraseColor(0);
            Canvas canvas = new Canvas(this.f6784);
            C1469 c1469 = this.f6777;
            c1469.m3205(c1469.f6789, C1469.f6788, canvas, i, i2, null);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m3203() {
            C1469 c1469 = this.f6777;
            if (c1469.f6794 == null) {
                c1469.f6794 = Boolean.valueOf(c1469.f6789.mo3207());
            }
            return c1469.f6794.booleanValue();
        }
    }

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
    public static class C1468 extends AbstractC1473 {
        public C1468() {
        }

        public C1468(C1468 c1468) {
            super(c1468);
        }

        @Override // p034.p074.p075.p076.C1466.AbstractC1473
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean mo3204() {
            return true;
        }
    }

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C1469 {

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public static final Matrix f6788 = new Matrix();

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public final C1474 f6789;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Path f6790;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f6791;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public float f6792;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public final C1502<String, Object> f6793;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public Boolean f6794;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Matrix f6795;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Path f6796;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public Paint f6797;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public float f6798;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public PathMeasure f6799;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public int f6800;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Paint f6801;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public String f6802;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public float f6803;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public float f6804;

        public C1469() {
            this.f6795 = new Matrix();
            this.f6803 = 0.0f;
            this.f6792 = 0.0f;
            this.f6804 = 0.0f;
            this.f6798 = 0.0f;
            this.f6800 = Base64.BASELENGTH;
            this.f6802 = null;
            this.f6794 = null;
            this.f6793 = new C1502<>();
            this.f6789 = new C1474();
            this.f6796 = new Path();
            this.f6790 = new Path();
        }

        public C1469(C1469 c1469) {
            this.f6795 = new Matrix();
            this.f6803 = 0.0f;
            this.f6792 = 0.0f;
            this.f6804 = 0.0f;
            this.f6798 = 0.0f;
            this.f6800 = Base64.BASELENGTH;
            this.f6802 = null;
            this.f6794 = null;
            C1502<String, Object> c1502 = new C1502<>();
            this.f6793 = c1502;
            this.f6789 = new C1474(c1469.f6789, c1502);
            this.f6796 = new Path(c1469.f6796);
            this.f6790 = new Path(c1469.f6790);
            this.f6803 = c1469.f6803;
            this.f6792 = c1469.f6792;
            this.f6804 = c1469.f6804;
            this.f6798 = c1469.f6798;
            this.f6791 = c1469.f6791;
            this.f6800 = c1469.f6800;
            this.f6802 = c1469.f6802;
            String str = c1469.f6802;
            if (str != null) {
                c1502.put(str, this);
            }
            this.f6794 = c1469.f6794;
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f6800;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f6800 = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final void m3205(C1474 c1474, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            C1469 c1469;
            C1469 c14692 = this;
            c1474.f6826.set(matrix);
            c1474.f6826.preConcat(c1474.f6824);
            canvas.save();
            ?? r11 = 0;
            int i3 = 0;
            while (i3 < c1474.f6822.size()) {
                AbstractC1472 abstractC1472 = c1474.f6822.get(i3);
                if (abstractC1472 instanceof C1474) {
                    m3205((C1474) abstractC1472, c1474.f6826, canvas, i, i2, colorFilter);
                } else if (abstractC1472 instanceof AbstractC1473) {
                    AbstractC1473 abstractC1473 = (AbstractC1473) abstractC1472;
                    float f = i / c14692.f6804;
                    float f2 = i2 / c14692.f6798;
                    float min = Math.min(f, f2);
                    Matrix matrix2 = c1474.f6826;
                    c14692.f6795.set(matrix2);
                    c14692.f6795.postScale(f, f2);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[r11], fArr[1]);
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f3 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    float abs = max > 0.0f ? Math.abs(f3) / max : 0.0f;
                    if (abs == 0.0f) {
                        c1469 = this;
                    } else {
                        c1469 = this;
                        Path path = c1469.f6796;
                        abstractC1473.getClass();
                        path.reset();
                        C1010[] c1010Arr = abstractC1473.f6819;
                        if (c1010Arr != null) {
                            C1010.m2348(c1010Arr, path);
                        }
                        Path path2 = c1469.f6796;
                        c1469.f6790.reset();
                        if (abstractC1473.mo3204()) {
                            c1469.f6790.setFillType(abstractC1473.f6818 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            c1469.f6790.addPath(path2, c1469.f6795);
                            canvas.clipPath(c1469.f6790);
                        } else {
                            C1470 c1470 = (C1470) abstractC1473;
                            float f4 = c1470.f6816;
                            if (f4 != 0.0f || c1470.f6811 != 1.0f) {
                                float f5 = c1470.f6813;
                                float f6 = (f4 + f5) % 1.0f;
                                float f7 = (c1470.f6811 + f5) % 1.0f;
                                if (c1469.f6799 == null) {
                                    c1469.f6799 = new PathMeasure();
                                }
                                c1469.f6799.setPath(c1469.f6796, r11);
                                float length = c1469.f6799.getLength();
                                float f8 = f6 * length;
                                float f9 = f7 * length;
                                path2.reset();
                                if (f8 > f9) {
                                    c1469.f6799.getSegment(f8, length, path2, true);
                                    c1469.f6799.getSegment(0.0f, f9, path2, true);
                                } else {
                                    c1469.f6799.getSegment(f8, f9, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            c1469.f6790.addPath(path2, c1469.f6795);
                            C1063 c1063 = c1470.f6805;
                            if (c1063.m2402() || c1063.f5514 != 0) {
                                C1063 c10632 = c1470.f6805;
                                if (c1469.f6797 == null) {
                                    Paint paint = new Paint(1);
                                    c1469.f6797 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = c1469.f6797;
                                if (c10632.m2402()) {
                                    Shader shader = c10632.f5515;
                                    shader.setLocalMatrix(c1469.f6795);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(c1470.f6807 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(Base64.BASELENGTH);
                                    int i4 = c10632.f5514;
                                    float f10 = c1470.f6807;
                                    PorterDuff.Mode mode = C1466.f6767;
                                    paint2.setColor((i4 & 16777215) | (((int) (Color.alpha(i4) * f10)) << 24));
                                }
                                paint2.setColorFilter(colorFilter);
                                c1469.f6790.setFillType(c1470.f6818 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(c1469.f6790, paint2);
                            }
                            C1063 c10633 = c1470.f6812;
                            if (c10633.m2402() || c10633.f5514 != 0) {
                                C1063 c10634 = c1470.f6812;
                                if (c1469.f6801 == null) {
                                    Paint paint3 = new Paint(1);
                                    c1469.f6801 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = c1469.f6801;
                                Paint.Join join = c1470.f6809;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c1470.f6814;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c1470.f6808);
                                if (c10634.m2402()) {
                                    Shader shader2 = c10634.f5515;
                                    shader2.setLocalMatrix(c1469.f6795);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(c1470.f6815 * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(Base64.BASELENGTH);
                                    int i5 = c10634.f5514;
                                    float f11 = c1470.f6815;
                                    PorterDuff.Mode mode2 = C1466.f6767;
                                    paint4.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                                }
                                paint4.setColorFilter(colorFilter);
                                paint4.setStrokeWidth(c1470.f6806 * abs * min);
                                canvas.drawPath(c1469.f6790, paint4);
                            }
                        }
                    }
                    i3++;
                    c14692 = c1469;
                    r11 = 0;
                }
                c1469 = c14692;
                i3++;
                c14692 = c1469;
                r11 = 0;
            }
            canvas.restore();
        }
    }

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1470 extends AbstractC1473 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public C1063 f6805;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public float f6806;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public float f6807;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public float f6808;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public Paint.Join f6809;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int[] f6810;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public float f6811;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C1063 f6812;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public float f6813;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public Paint.Cap f6814;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public float f6815;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public float f6816;

        public C1470() {
            this.f6806 = 0.0f;
            this.f6815 = 1.0f;
            this.f6807 = 1.0f;
            this.f6816 = 0.0f;
            this.f6811 = 1.0f;
            this.f6813 = 0.0f;
            this.f6814 = Paint.Cap.BUTT;
            this.f6809 = Paint.Join.MITER;
            this.f6808 = 4.0f;
        }

        public C1470(C1470 c1470) {
            super(c1470);
            this.f6806 = 0.0f;
            this.f6815 = 1.0f;
            this.f6807 = 1.0f;
            this.f6816 = 0.0f;
            this.f6811 = 1.0f;
            this.f6813 = 0.0f;
            this.f6814 = Paint.Cap.BUTT;
            this.f6809 = Paint.Join.MITER;
            this.f6808 = 4.0f;
            this.f6810 = c1470.f6810;
            this.f6812 = c1470.f6812;
            this.f6806 = c1470.f6806;
            this.f6815 = c1470.f6815;
            this.f6805 = c1470.f6805;
            this.f6818 = c1470.f6818;
            this.f6807 = c1470.f6807;
            this.f6816 = c1470.f6816;
            this.f6811 = c1470.f6811;
            this.f6813 = c1470.f6813;
            this.f6814 = c1470.f6814;
            this.f6809 = c1470.f6809;
            this.f6808 = c1470.f6808;
        }

        public float getFillAlpha() {
            return this.f6807;
        }

        public int getFillColor() {
            return this.f6805.f5514;
        }

        public float getStrokeAlpha() {
            return this.f6815;
        }

        public int getStrokeColor() {
            return this.f6812.f5514;
        }

        public float getStrokeWidth() {
            return this.f6806;
        }

        public float getTrimPathEnd() {
            return this.f6811;
        }

        public float getTrimPathOffset() {
            return this.f6813;
        }

        public float getTrimPathStart() {
            return this.f6816;
        }

        public void setFillAlpha(float f) {
            this.f6807 = f;
        }

        public void setFillColor(int i) {
            this.f6805.f5514 = i;
        }

        public void setStrokeAlpha(float f) {
            this.f6815 = f;
        }

        public void setStrokeColor(int i) {
            this.f6812.f5514 = i;
        }

        public void setStrokeWidth(float f) {
            this.f6806 = f;
        }

        public void setTrimPathEnd(float f) {
            this.f6811 = f;
        }

        public void setTrimPathOffset(float f) {
            this.f6813 = f;
        }

        public void setTrimPathStart(float f) {
            this.f6816 = f;
        }

        @Override // p034.p074.p075.p076.C1466.AbstractC1472
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean mo3206(int[] iArr) {
            return this.f6812.m2404(iArr) | this.f6805.m2404(iArr);
        }

        @Override // p034.p074.p075.p076.C1466.AbstractC1472
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean mo3207() {
            return this.f6805.m2403() || this.f6812.m2403();
        }
    }

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ$づざかべべ, reason: contains not printable characters */
    public static abstract class AbstractC1472 {
        public AbstractC1472() {
        }

        public AbstractC1472(C1471 c1471) {
        }

        /* renamed from: 〺つふすそ */
        public boolean mo3206(int[] iArr) {
            return false;
        }

        /* renamed from: げつ〴ぬぐ */
        public boolean mo3207() {
            return false;
        }
    }

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ$なぎぱいぢぎ, reason: contains not printable characters */
    public static abstract class AbstractC1473 extends AbstractC1472 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public String f6817;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f6818;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1010[] f6819;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f6820;

        public AbstractC1473() {
            super(null);
            this.f6819 = null;
            this.f6818 = 0;
        }

        public AbstractC1473(AbstractC1473 abstractC1473) {
            super(null);
            this.f6819 = null;
            this.f6818 = 0;
            this.f6817 = abstractC1473.f6817;
            this.f6820 = abstractC1473.f6820;
            this.f6819 = C2786.m4767(abstractC1473.f6819);
        }

        public C1010[] getPathData() {
            return this.f6819;
        }

        public String getPathName() {
            return this.f6817;
        }

        public void setPathData(C1010[] c1010Arr) {
            if (!C2786.m4768(this.f6819, c1010Arr)) {
                this.f6819 = C2786.m4767(c1010Arr);
                return;
            }
            C1010[] c1010Arr2 = this.f6819;
            for (int i = 0; i < c1010Arr.length; i++) {
                c1010Arr2[i].f5386 = c1010Arr[i].f5386;
                for (int i2 = 0; i2 < c1010Arr[i].f5385.length; i2++) {
                    c1010Arr2[i].f5385[i2] = c1010Arr[i].f5385[i2];
                }
            }
        }

        /* renamed from: くし〴〺ぅ */
        public boolean mo3204() {
            return false;
        }
    }

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ$びぐびあび, reason: contains not printable characters */
    public static class C1474 extends AbstractC1472 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public float f6821;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final ArrayList<AbstractC1472> f6822;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public float f6823;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public final Matrix f6824;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f6825;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Matrix f6826;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public float f6827;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public int[] f6828;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public float f6829;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public String f6830;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public float f6831;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public float f6832;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public int f6833;

        public C1474() {
            super(null);
            this.f6826 = new Matrix();
            this.f6822 = new ArrayList<>();
            this.f6825 = 0.0f;
            this.f6831 = 0.0f;
            this.f6827 = 0.0f;
            this.f6829 = 1.0f;
            this.f6823 = 1.0f;
            this.f6821 = 0.0f;
            this.f6832 = 0.0f;
            this.f6824 = new Matrix();
            this.f6830 = null;
        }

        public C1474(C1474 c1474, C1502<String, Object> c1502) {
            super(null);
            AbstractC1473 c1468;
            this.f6826 = new Matrix();
            this.f6822 = new ArrayList<>();
            this.f6825 = 0.0f;
            this.f6831 = 0.0f;
            this.f6827 = 0.0f;
            this.f6829 = 1.0f;
            this.f6823 = 1.0f;
            this.f6821 = 0.0f;
            this.f6832 = 0.0f;
            Matrix matrix = new Matrix();
            this.f6824 = matrix;
            this.f6830 = null;
            this.f6825 = c1474.f6825;
            this.f6831 = c1474.f6831;
            this.f6827 = c1474.f6827;
            this.f6829 = c1474.f6829;
            this.f6823 = c1474.f6823;
            this.f6821 = c1474.f6821;
            this.f6832 = c1474.f6832;
            this.f6828 = c1474.f6828;
            String str = c1474.f6830;
            this.f6830 = str;
            this.f6833 = c1474.f6833;
            if (str != null) {
                c1502.put(str, this);
            }
            matrix.set(c1474.f6824);
            ArrayList<AbstractC1472> arrayList = c1474.f6822;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC1472 abstractC1472 = arrayList.get(i);
                if (abstractC1472 instanceof C1474) {
                    this.f6822.add(new C1474((C1474) abstractC1472, c1502));
                } else {
                    if (abstractC1472 instanceof C1470) {
                        c1468 = new C1470((C1470) abstractC1472);
                    } else {
                        if (!(abstractC1472 instanceof C1468)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        c1468 = new C1468((C1468) abstractC1472);
                    }
                    this.f6822.add(c1468);
                    String str2 = c1468.f6817;
                    if (str2 != null) {
                        c1502.put(str2, c1468);
                    }
                }
            }
        }

        public String getGroupName() {
            return this.f6830;
        }

        public Matrix getLocalMatrix() {
            return this.f6824;
        }

        public float getPivotX() {
            return this.f6831;
        }

        public float getPivotY() {
            return this.f6827;
        }

        public float getRotation() {
            return this.f6825;
        }

        public float getScaleX() {
            return this.f6829;
        }

        public float getScaleY() {
            return this.f6823;
        }

        public float getTranslateX() {
            return this.f6821;
        }

        public float getTranslateY() {
            return this.f6832;
        }

        public void setPivotX(float f) {
            if (f != this.f6831) {
                this.f6831 = f;
                m3208();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f6827) {
                this.f6827 = f;
                m3208();
            }
        }

        public void setRotation(float f) {
            if (f != this.f6825) {
                this.f6825 = f;
                m3208();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f6829) {
                this.f6829 = f;
                m3208();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f6823) {
                this.f6823 = f;
                m3208();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f6821) {
                this.f6821 = f;
                m3208();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f6832) {
                this.f6832 = f;
                m3208();
            }
        }

        @Override // p034.p074.p075.p076.C1466.AbstractC1472
        /* renamed from: 〺つふすそ */
        public boolean mo3206(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f6822.size(); i++) {
                z |= this.f6822.get(i).mo3206(iArr);
            }
            return z;
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m3208() {
            this.f6824.reset();
            this.f6824.postTranslate(-this.f6831, -this.f6827);
            this.f6824.postScale(this.f6829, this.f6823);
            this.f6824.postRotate(this.f6825, 0.0f, 0.0f);
            this.f6824.postTranslate(this.f6821 + this.f6831, this.f6832 + this.f6827);
        }

        @Override // p034.p074.p075.p076.C1466.AbstractC1472
        /* renamed from: げつ〴ぬぐ */
        public boolean mo3207() {
            for (int i = 0; i < this.f6822.size(); i++) {
                if (this.f6822.get(i).mo3207()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ$ぺぁあねじ, reason: contains not printable characters */
    public static class C1475 extends Drawable.ConstantState {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Drawable.ConstantState f6834;

        public C1475(Drawable.ConstantState constantState) {
            this.f6834 = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6834.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6834.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1466 c1466 = new C1466();
            c1466.f6850 = (VectorDrawable) this.f6834.newDrawable();
            return c1466;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1466 c1466 = new C1466();
            c1466.f6850 = (VectorDrawable) this.f6834.newDrawable(resources);
            return c1466;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1466 c1466 = new C1466();
            c1466.f6850 = (VectorDrawable) this.f6834.newDrawable(resources, theme);
            return c1466;
        }
    }

    public C1466() {
        this.f6769 = true;
        this.f6768 = new float[9];
        this.f6775 = new Matrix();
        this.f6770 = new Rect();
        this.f6771 = new C1467();
    }

    public C1466(C1467 c1467) {
        this.f6769 = true;
        this.f6768 = new float[9];
        this.f6775 = new Matrix();
        this.f6770 = new Rect();
        this.f6771 = c1467;
        this.f6774 = m3201(c1467.f6780, c1467.f6785);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C1466 m3200(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1466 c1466 = new C1466();
        c1466.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1466;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6850;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        if ((r1 == r7.getWidth() && r3 == r6.f6784.getHeight()) == false) goto L42;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p074.p075.p076.C1466.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6850;
        if (drawable == null) {
            return this.f6771.f6777.getRootAlpha();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6771.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6850;
        if (drawable == null) {
            return this.f6772;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6850 != null && Build.VERSION.SDK_INT >= 24) {
            return new C1475(this.f6850.getConstantState());
        }
        this.f6771.f6781 = getChangingConfigurations();
        return this.f6771;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f6771.f6777.f6792;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f6771.f6777.f6803;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void inflate(android.content.res.Resources r27, org.xmlpull.v1.XmlPullParser r28, android.util.AttributeSet r29, android.content.res.Resources.Theme r30) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p074.p075.p076.C1466.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6850;
        return drawable != null ? C2786.m4797(drawable) : this.f6771.f6782;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C1467 c1467;
        ColorStateList colorStateList;
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c1467 = this.f6771) != null && (c1467.m3203() || ((colorStateList = this.f6771.f6780) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6773 && super.mutate() == this) {
            this.f6771 = new C1467(this.f6771);
            this.f6773 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f6850;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1467 c1467 = this.f6771;
        ColorStateList colorStateList = c1467.f6780;
        if (colorStateList != null && (mode = c1467.f6785) != null) {
            this.f6774 = m3201(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (c1467.m3203()) {
            boolean mo3206 = c1467.f6777.f6789.mo3206(iArr);
            c1467.f6787 |= mo3206;
            if (mo3206) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f6771.f6777.getRootAlpha() != i) {
            this.f6771.f6777.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            C2786.m4824(drawable, z);
        } else {
            this.f6771.f6782 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6772 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTint(int i) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            C2786.m4806(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            C2786.m4788(drawable, colorStateList);
            return;
        }
        C1467 c1467 = this.f6771;
        if (c1467.f6780 != colorStateList) {
            c1467.f6780 = colorStateList;
            this.f6774 = m3201(colorStateList, c1467.f6785);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            C2786.m4802(drawable, mode);
            return;
        }
        C1467 c1467 = this.f6771;
        if (c1467.f6785 != mode) {
            c1467.f6785 = mode;
            this.f6774 = m3201(c1467.f6780, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public PorterDuffColorFilter m3201(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}

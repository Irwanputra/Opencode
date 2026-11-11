package p131.p161.p162.p163.p173;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.BitSet;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p038.p039.InterfaceC1015;
import p131.p161.p162.p163.p171.C2156;
import p131.p161.p162.p163.p173.C2170;
import p131.p161.p162.p163.p173.C2184;
import p131.p161.p162.p163.p192.C2349;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2163 extends Drawable implements InterfaceC1015, InterfaceC2169 {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static final String f9042 = C2163.class.getSimpleName();

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static final Paint f9043 = new Paint(1);

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Path f9044;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2164 f9045;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Matrix f9046;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final RectF f9047;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final Paint f9048;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final C2349 f9049;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final Paint f9050;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C2170.AbstractC2175[] f9051;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public PorterDuffColorFilter f9052;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public PorterDuffColorFilter f9053;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final C2184.InterfaceC2185 f9054;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final BitSet f9055;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final Region f9056;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final RectF f9057;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f9058;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final Region f9059;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final C2184 f9060;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2170.AbstractC2175[] f9061;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public boolean f9062;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public C2180 f9063;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final Path f9064;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final RectF f9065;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ$〺つふすそ, reason: contains not printable characters */
    public static final class C2164 extends Drawable.ConstantState {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public PorterDuff.Mode f9066;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C2156 f9067;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public ColorStateList f9068;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public float f9069;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public float f9070;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public int f9071;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public float f9072;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ColorFilter f9073;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C2180 f9074;

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public int f9075;

        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public boolean f9076;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public int f9077;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public ColorStateList f9078;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public float f9079;

        /* renamed from: でどあくず, reason: contains not printable characters */
        public Paint.Style f9080;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public ColorStateList f9081;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public int f9082;

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public int f9083;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public ColorStateList f9084;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public float f9085;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public Rect f9086;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public float f9087;

        public C2164(C2164 c2164) {
            this.f9084 = null;
            this.f9078 = null;
            this.f9081 = null;
            this.f9068 = null;
            this.f9066 = PorterDuff.Mode.SRC_IN;
            this.f9086 = null;
            this.f9069 = 1.0f;
            this.f9087 = 1.0f;
            this.f9082 = Base64.BASELENGTH;
            this.f9085 = 0.0f;
            this.f9072 = 0.0f;
            this.f9070 = 0.0f;
            this.f9071 = 0;
            this.f9077 = 0;
            this.f9083 = 0;
            this.f9075 = 0;
            this.f9076 = false;
            this.f9080 = Paint.Style.FILL_AND_STROKE;
            this.f9074 = c2164.f9074;
            this.f9067 = c2164.f9067;
            this.f9079 = c2164.f9079;
            this.f9073 = c2164.f9073;
            this.f9084 = c2164.f9084;
            this.f9078 = c2164.f9078;
            this.f9066 = c2164.f9066;
            this.f9068 = c2164.f9068;
            this.f9082 = c2164.f9082;
            this.f9069 = c2164.f9069;
            this.f9083 = c2164.f9083;
            this.f9071 = c2164.f9071;
            this.f9076 = c2164.f9076;
            this.f9087 = c2164.f9087;
            this.f9085 = c2164.f9085;
            this.f9072 = c2164.f9072;
            this.f9070 = c2164.f9070;
            this.f9077 = c2164.f9077;
            this.f9075 = c2164.f9075;
            this.f9081 = c2164.f9081;
            this.f9080 = c2164.f9080;
            if (c2164.f9086 != null) {
                this.f9086 = new Rect(c2164.f9086);
            }
        }

        public C2164(C2180 c2180, C2156 c2156) {
            this.f9084 = null;
            this.f9078 = null;
            this.f9081 = null;
            this.f9068 = null;
            this.f9066 = PorterDuff.Mode.SRC_IN;
            this.f9086 = null;
            this.f9069 = 1.0f;
            this.f9087 = 1.0f;
            this.f9082 = Base64.BASELENGTH;
            this.f9085 = 0.0f;
            this.f9072 = 0.0f;
            this.f9070 = 0.0f;
            this.f9071 = 0;
            this.f9077 = 0;
            this.f9083 = 0;
            this.f9075 = 0;
            this.f9076 = false;
            this.f9080 = Paint.Style.FILL_AND_STROKE;
            this.f9074 = c2180;
            this.f9067 = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C2163 c2163 = new C2163(this);
            c2163.f9058 = true;
            return c2163;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2165 implements C2184.InterfaceC2185 {
        public C2165() {
        }
    }

    public C2163() {
        this(new C2180());
    }

    public C2163(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C2180.m4283(context, attributeSet, i, i2, new C2178(0)).m4291());
    }

    public C2163(C2164 c2164) {
        this.f9051 = new C2170.AbstractC2175[4];
        this.f9061 = new C2170.AbstractC2175[4];
        this.f9055 = new BitSet(8);
        this.f9046 = new Matrix();
        this.f9044 = new Path();
        this.f9064 = new Path();
        this.f9047 = new RectF();
        this.f9065 = new RectF();
        this.f9056 = new Region();
        this.f9059 = new Region();
        Paint paint = new Paint(1);
        this.f9050 = paint;
        Paint paint2 = new Paint(1);
        this.f9048 = paint2;
        this.f9049 = new C2349();
        this.f9060 = new C2184();
        this.f9057 = new RectF();
        this.f9062 = true;
        this.f9045 = c2164;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f9043;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m4255();
        m4245(getState());
        this.f9054 = new C2165();
    }

    public C2163(C2180 c2180) {
        this(new C2164(c2180, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ef, code lost:
    
        if ((r2 < 21 || !(m4254() || r10.f9044.isConvex() || r2 >= 29)) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cb  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p162.p163.p173.C2163.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f9045;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f9045.f9071 == 2) {
            return;
        }
        if (m4254()) {
            outline.setRoundRect(getBounds(), m4267() * this.f9045.f9087);
            return;
        }
        m4241(m4244(), this.f9044);
        if (this.f9044.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f9044);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f9045.f9086;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f9056.set(getBounds());
        m4241(m4244(), this.f9044);
        this.f9059.setPath(this.f9044, this.f9056);
        this.f9056.op(this.f9059, Region.Op.DIFFERENCE);
        return this.f9056;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f9058 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f9045.f9068) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f9045.f9081) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f9045.f9078) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f9045.f9084) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f9045 = new C2164(this.f9045);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f9058 = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p131.p161.p162.p163.p185.C2249.InterfaceC2250
    public boolean onStateChange(int[] iArr) {
        boolean z = m4245(iArr) || m4255();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C2164 c2164 = this.f9045;
        if (c2164.f9082 != i) {
            c2164.f9082 = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9045.f9073 = colorFilter;
        super.invalidateSelf();
    }

    @Override // p131.p161.p162.p163.p173.InterfaceC2169
    public void setShapeAppearanceModel(C2180 c2180) {
        this.f9045.f9074 = c2180;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintList(ColorStateList colorStateList) {
        this.f9045.f9068 = colorStateList;
        m4255();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintMode(PorterDuff.Mode mode) {
        C2164 c2164 = this.f9045;
        if (c2164.f9066 != mode) {
            c2164.f9066 = mode;
            m4255();
            super.invalidateSelf();
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float m4240() {
        return this.f9045.f9074.f9118.mo4271(m4244());
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m4241(RectF rectF, Path path) {
        m4251(rectF, path);
        if (this.f9045.f9069 != 1.0f) {
            this.f9046.reset();
            Matrix matrix = this.f9046;
            float f = this.f9045.f9069;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f9046);
        }
        path.computeBounds(this.f9057, true);
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public void m4242(int i) {
        C2164 c2164 = this.f9045;
        if (c2164.f9075 != i) {
            c2164.f9075 = i;
            super.invalidateSelf();
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m4243(Canvas canvas, Paint paint, Path path, C2180 c2180, RectF rectF) {
        if (!c2180.m4287(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float mo4271 = c2180.f9126.mo4271(rectF) * this.f9045.f9087;
            canvas.drawRoundRect(rectF, mo4271, mo4271, paint);
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public RectF m4244() {
        this.f9047.set(getBounds());
        return this.f9047;
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final boolean m4245(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f9045.f9084 == null || color2 == (colorForState2 = this.f9045.f9084.getColorForState(iArr, (color2 = this.f9050.getColor())))) {
            z = false;
        } else {
            this.f9050.setColor(colorForState2);
            z = true;
        }
        if (this.f9045.f9078 == null || color == (colorForState = this.f9045.f9078.getColorForState(iArr, (color = this.f9048.getColor())))) {
            return z;
        }
        this.f9048.setColor(colorForState);
        return true;
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public void m4246(float f, int i) {
        this.f9045.f9079 = f;
        invalidateSelf();
        m4261(ColorStateList.valueOf(i));
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final boolean m4247() {
        Paint.Style style = this.f9045.f9080;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f9048.getStrokeWidth() > 0.0f;
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public void m4248(int i) {
        C2164 c2164 = this.f9045;
        if (c2164.f9071 != i) {
            c2164.f9071 = i;
            super.invalidateSelf();
        }
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void m4249(Context context) {
        this.f9045.f9067 = new C2156(context);
        m4269();
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public float m4250() {
        return this.f9045.f9074.f9126.mo4271(m4244());
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m4251(RectF rectF, Path path) {
        C2184 c2184 = this.f9060;
        C2164 c2164 = this.f9045;
        c2184.m4295(c2164.f9074, c2164.f9087, rectF, this.f9054, path);
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void m4252(ColorStateList colorStateList) {
        C2164 c2164 = this.f9045;
        if (c2164.f9084 != colorStateList) {
            c2164.f9084 = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void m4253(float f) {
        C2164 c2164 = this.f9045;
        if (c2164.f9087 != f) {
            c2164.f9087 = f;
            this.f9058 = true;
            invalidateSelf();
        }
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean m4254() {
        return this.f9045.f9074.m4287(m4244());
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final boolean m4255() {
        PorterDuffColorFilter porterDuffColorFilter = this.f9052;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f9053;
        C2164 c2164 = this.f9045;
        this.f9052 = m4265(c2164.f9068, c2164.f9066, this.f9050, true);
        C2164 c21642 = this.f9045;
        this.f9053 = m4265(c21642.f9081, c21642.f9066, this.f9048, false);
        C2164 c21643 = this.f9045;
        if (c21643.f9076) {
            this.f9049.m4501(c21643.f9068.getColorForState(getState(), 0));
        }
        return (C2786.m4781(porterDuffColorFilter, this.f9052) && C2786.m4781(porterDuffColorFilter2, this.f9053)) ? false : true;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int m4256(int i) {
        C2164 c2164 = this.f9045;
        float f = c2164.f9072 + c2164.f9070 + c2164.f9085;
        C2156 c2156 = c2164.f9067;
        return c2156 != null ? c2156.m4237(i, f) : i;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int m4257() {
        double d = this.f9045.f9083;
        double cos = Math.cos(Math.toRadians(r0.f9075));
        Double.isNaN(d);
        return (int) (cos * d);
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public void m4258(Paint.Style style) {
        this.f9045.f9080 = style;
        super.invalidateSelf();
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public void m4259(float f) {
        this.f9045.f9079 = f;
        invalidateSelf();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m4260(Canvas canvas) {
        this.f9055.cardinality();
        if (this.f9045.f9083 != 0) {
            canvas.drawPath(this.f9044, this.f9049.f9651);
        }
        for (int i = 0; i < 4; i++) {
            C2170.AbstractC2175 abstractC2175 = this.f9051[i];
            C2349 c2349 = this.f9049;
            int i2 = this.f9045.f9077;
            Matrix matrix = C2170.AbstractC2175.f9113;
            abstractC2175.mo4280(matrix, c2349, i2, canvas);
            this.f9061[i].mo4280(matrix, this.f9049, this.f9045.f9077, canvas);
        }
        if (this.f9062) {
            int m4270 = m4270();
            int m4257 = m4257();
            canvas.translate(-m4270, -m4257);
            canvas.drawPath(this.f9044, f9043);
            canvas.translate(m4270, m4257);
        }
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public void m4261(ColorStateList colorStateList) {
        C2164 c2164 = this.f9045;
        if (c2164.f9078 != colorStateList) {
            c2164.f9078 = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final float m4262() {
        if (m4247()) {
            return this.f9048.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void m4263(float f) {
        C2164 c2164 = this.f9045;
        if (c2164.f9072 != f) {
            c2164.f9072 = f;
            m4269();
        }
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public void m4264(float f, ColorStateList colorStateList) {
        this.f9045.f9079 = f;
        invalidateSelf();
        m4261(colorStateList);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final PorterDuffColorFilter m4265(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int m4256;
        if (colorStateList == null || mode == null) {
            return (!z || (m4256 = m4256((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(m4256, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m4256(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public void m4266(int i) {
        this.f9049.m4501(i);
        this.f9045.f9076 = false;
        super.invalidateSelf();
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float m4267() {
        return this.f9045.f9074.f9124.mo4271(m4244());
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float m4268() {
        return this.f9045.f9074.f9120.mo4271(m4244());
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final void m4269() {
        C2164 c2164 = this.f9045;
        float f = c2164.f9072 + c2164.f9070;
        c2164.f9077 = (int) Math.ceil(0.75f * f);
        this.f9045.f9083 = (int) Math.ceil(f * 0.25f);
        m4255();
        super.invalidateSelf();
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int m4270() {
        double d = this.f9045.f9083;
        double sin = Math.sin(Math.toRadians(r0.f9075));
        Double.isNaN(d);
        return (int) (sin * d);
    }
}

package p131.p161.p162.p163.p183;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p038.p039.InterfaceC1015;
import p034.p095.C1687;
import p131.p161.p162.p163.p167.C2145;
import p131.p161.p162.p163.p171.C2156;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p181.C2235;
import p131.p161.p162.p163.p185.C2249;
import p131.p161.p162.p163.p186.C2291;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.でどあくず.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2244 extends C2163 implements InterfaceC1015, Drawable.Callback, C2249.InterfaceC2250 {

    /* renamed from: 〻しざ〹おま, reason: contains not printable characters */
    public static final int[] f9300 = {R.attr.state_enabled};

    /* renamed from: 〻はぎっぼ, reason: contains not printable characters */
    public static final ShapeDrawable f9301 = new ShapeDrawable(new OvalShape());

    /* renamed from: 〱〴なぱへて, reason: contains not printable characters */
    public ColorStateList f9302;

    /* renamed from: 〱〵つてう, reason: contains not printable characters */
    public int[] f9303;

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public float f9304;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public float f9305;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public float f9306;

    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public ColorFilter f9307;

    /* renamed from: 〺えなひあ, reason: contains not printable characters */
    public TextUtils.TruncateAt f9308;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public boolean f9309;

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public int f9310;

    /* renamed from: ぁにあがあ, reason: contains not printable characters */
    public boolean f9311;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public ColorStateList f9312;

    /* renamed from: いたぷすいだ, reason: contains not printable characters */
    public WeakReference<InterfaceC2245> f9313;

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public int f9314;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public ColorStateList f9315;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public ColorStateList f9316;

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public final PointF f9317;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public boolean f9318;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public boolean f9319;

    /* renamed from: えみにぃほす, reason: contains not printable characters */
    public boolean f9320;

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public final C2249 f9321;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public CharSequence f9322;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public float f9323;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public float f9324;

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public int f9325;

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public final Paint.FontMetrics f9326;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public final Context f9327;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public float f9328;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public float f9329;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public ColorStateList f9330;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public Drawable f9331;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public ColorStateList f9332;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public Drawable f9333;

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public int f9334;

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public int f9335;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public float f9336;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public float f9337;

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public boolean f9338;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public boolean f9339;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public CharSequence f9340;

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public ColorStateList f9341;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public float f9342;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public float f9343;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public final Paint f9344;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public Drawable f9345;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public float f9346;

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public int f9347;

    /* renamed from: のかまじえ, reason: contains not printable characters */
    public int f9348;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public C2291 f9349;

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public final RectF f9350;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public float f9351;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public boolean f9352;

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public PorterDuffColorFilter f9353;

    /* renamed from: ひぞ〴つき, reason: contains not printable characters */
    public boolean f9354;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public ColorStateList f9355;

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public final Path f9356;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public Drawable f9357;

    /* renamed from: へ〱そかのず, reason: contains not printable characters */
    public PorterDuff.Mode f9358;

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public int f9359;

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public int f9360;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public C2291 f9361;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public ColorStateList f9362;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.でどあくず.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC2245 {
        /* renamed from: げつ〴ぬぐ */
        void mo1381();
    }

    public C2244(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9343 = -1.0f;
        this.f9344 = new Paint(1);
        this.f9326 = new Paint.FontMetrics();
        this.f9350 = new RectF();
        this.f9317 = new PointF();
        this.f9356 = new Path();
        this.f9334 = Base64.BASELENGTH;
        this.f9358 = PorterDuff.Mode.SRC_IN;
        this.f9313 = new WeakReference<>(null);
        this.f9045.f9067 = new C2156(context);
        m4269();
        this.f9327 = context;
        C2249 c2249 = new C2249(this);
        this.f9321 = c2249;
        this.f9322 = "";
        c2249.f9367.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f9300;
        setState(iArr);
        m4392(iArr);
        this.f9354 = true;
        if (C2235.f9290) {
            f9301.setTint(-1);
        }
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public static boolean m4352(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public static boolean m4353(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Drawable drawable;
        int i7;
        float f;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f9334) == 0) {
            return;
        }
        if (i < 255) {
            float f2 = bounds.left;
            float f3 = bounds.top;
            float f4 = bounds.right;
            float f5 = bounds.bottom;
            i2 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i) : canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
        } else {
            i2 = 0;
        }
        if (!this.f9320) {
            this.f9344.setColor(this.f9347);
            this.f9344.setStyle(Paint.Style.FILL);
            this.f9350.set(bounds);
            canvas.drawRoundRect(this.f9350, m4362(), m4362(), this.f9344);
        }
        if (!this.f9320) {
            this.f9344.setColor(this.f9335);
            this.f9344.setStyle(Paint.Style.FILL);
            Paint paint = this.f9344;
            ColorFilter colorFilter = this.f9307;
            if (colorFilter == null) {
                colorFilter = this.f9353;
            }
            paint.setColorFilter(colorFilter);
            this.f9350.set(bounds);
            canvas.drawRoundRect(this.f9350, m4362(), m4362(), this.f9344);
        }
        if (this.f9320) {
            super.draw(canvas);
        }
        if (this.f9336 > 0.0f && !this.f9320) {
            this.f9344.setColor(this.f9310);
            this.f9344.setStyle(Paint.Style.STROKE);
            if (!this.f9320) {
                Paint paint2 = this.f9344;
                ColorFilter colorFilter2 = this.f9307;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f9353;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.f9350;
            float f6 = bounds.left;
            float f7 = this.f9336 / 2.0f;
            rectF.set(f6 + f7, bounds.top + f7, bounds.right - f7, bounds.bottom - f7);
            float f8 = this.f9343 - (this.f9336 / 2.0f);
            canvas.drawRoundRect(this.f9350, f8, f8, this.f9344);
        }
        this.f9344.setColor(this.f9359);
        this.f9344.setStyle(Paint.Style.FILL);
        this.f9350.set(bounds);
        if (this.f9320) {
            m4251(new RectF(bounds), this.f9356);
            i3 = 0;
            m4243(canvas, this.f9344, this.f9356, this.f9045.f9074, m4244());
        } else {
            canvas.drawRoundRect(this.f9350, m4362(), m4362(), this.f9344);
            i3 = 0;
        }
        if (m4391()) {
            m4381(bounds, this.f9350);
            RectF rectF2 = this.f9350;
            float f9 = rectF2.left;
            float f10 = rectF2.top;
            canvas.translate(f9, f10);
            this.f9357.setBounds(i3, i3, (int) this.f9350.width(), (int) this.f9350.height());
            this.f9357.draw(canvas);
            canvas.translate(-f9, -f10);
        }
        if (m4357()) {
            m4381(bounds, this.f9350);
            RectF rectF3 = this.f9350;
            float f11 = rectF3.left;
            float f12 = rectF3.top;
            canvas.translate(f11, f12);
            this.f9333.setBounds(i3, i3, (int) this.f9350.width(), (int) this.f9350.height());
            this.f9333.draw(canvas);
            canvas.translate(-f11, -f12);
        }
        if (!this.f9354 || this.f9322 == null) {
            i4 = i2;
            i5 = Base64.BASELENGTH;
            i6 = 0;
        } else {
            PointF pointF = this.f9317;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.f9322 != null) {
                float m4393 = m4393() + this.f9329 + this.f9337;
                if (C2786.m4807(this) == 0) {
                    pointF.x = bounds.left + m4393;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - m4393;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                this.f9321.f9367.getFontMetrics(this.f9326);
                Paint.FontMetrics fontMetrics = this.f9326;
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.f9350;
            rectF4.setEmpty();
            if (this.f9322 != null) {
                float m43932 = m4393() + this.f9329 + this.f9337;
                float m4358 = m4358() + this.f9304 + this.f9324;
                if (C2786.m4807(this) == 0) {
                    rectF4.left = bounds.left + m43932;
                    f = bounds.right - m4358;
                } else {
                    rectF4.left = bounds.left + m4358;
                    f = bounds.right - m43932;
                }
                rectF4.right = f;
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            C2249 c2249 = this.f9321;
            if (c2249.f9369 != null) {
                c2249.f9367.drawableState = getState();
                C2249 c22492 = this.f9321;
                c22492.f9369.m4231(this.f9327, c22492.f9367, c22492.f9365);
            }
            this.f9321.f9367.setTextAlign(align);
            boolean z = Math.round(this.f9321.m4399(this.f9322.toString())) > Math.round(this.f9350.width());
            if (z) {
                i7 = canvas.save();
                canvas.clipRect(this.f9350);
            } else {
                i7 = 0;
            }
            CharSequence charSequence = this.f9322;
            if (z && this.f9308 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f9321.f9367, this.f9350.width(), this.f9308);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF2 = this.f9317;
            float f13 = pointF2.x;
            float f14 = pointF2.y;
            TextPaint textPaint = this.f9321.f9367;
            i6 = 0;
            i5 = Base64.BASELENGTH;
            i4 = i2;
            canvas.drawText(charSequence2, 0, length, f13, f14, textPaint);
            if (z) {
                canvas.restoreToCount(i7);
            }
        }
        if (m4383()) {
            m4373(bounds, this.f9350);
            RectF rectF5 = this.f9350;
            float f15 = rectF5.left;
            float f16 = rectF5.top;
            canvas.translate(f15, f16);
            this.f9331.setBounds(i6, i6, (int) this.f9350.width(), (int) this.f9350.height());
            if (C2235.f9290) {
                this.f9345.setBounds(this.f9331.getBounds());
                this.f9345.jumpToCurrentState();
                drawable = this.f9345;
            } else {
                drawable = this.f9331;
            }
            drawable.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (this.f9334 < i5) {
            canvas.restoreToCount(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9334;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f9307;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f9346;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(m4358() + this.f9321.m4399(this.f9322.toString()) + m4393() + this.f9329 + this.f9337 + this.f9324 + this.f9304), this.f9348);
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f9320) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f9346, this.f9343);
        } else {
            outline.setRoundRect(bounds, this.f9343);
        }
        outline.setAlpha(this.f9334 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (m4353(this.f9316) || m4353(this.f9355) || m4353(this.f9315)) {
            return true;
        }
        if (this.f9311 && m4353(this.f9302)) {
            return true;
        }
        C2145 c2145 = this.f9321.f9369;
        if ((c2145 == null || (colorStateList = c2145.f8987) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.f9352 && this.f9333 != null && this.f9319) || m4352(this.f9357) || m4352(this.f9333) || m4353(this.f9341);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m4391()) {
            onLayoutDirectionChanged |= C2786.m4783(this.f9357, i);
        }
        if (m4357()) {
            onLayoutDirectionChanged |= C2786.m4783(this.f9333, i);
        }
        if (m4383()) {
            onLayoutDirectionChanged |= C2786.m4783(this.f9331, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m4391()) {
            onLevelChange |= this.f9357.setLevel(i);
        }
        if (m4357()) {
            onLevelChange |= this.f9333.setLevel(i);
        }
        if (m4383()) {
            onLevelChange |= this.f9331.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable, p131.p161.p162.p163.p185.C2249.InterfaceC2250
    public boolean onStateChange(int[] iArr) {
        if (this.f9320) {
            super.onStateChange(iArr);
        }
        return m4382(iArr, this.f9303);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f9334 != i) {
            this.f9334 = i;
            invalidateSelf();
        }
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f9307 != colorFilter) {
            this.f9307 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintList(ColorStateList colorStateList) {
        if (this.f9341 != colorStateList) {
            this.f9341 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f9358 != mode) {
            this.f9358 = mode;
            this.f9353 = C1687.m3723(this, this.f9341, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m4391()) {
            visible |= this.f9357.setVisible(z, z2);
        }
        if (m4357()) {
            visible |= this.f9333.setVisible(z, z2);
        }
        if (m4383()) {
            visible |= this.f9331.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public void m4354(ColorStateList colorStateList) {
        if (this.f9315 != colorStateList) {
            this.f9315 = colorStateList;
            if (this.f9320) {
                m4261(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public void m4355(Drawable drawable) {
        Drawable drawable2 = this.f9357;
        Drawable m4759 = drawable2 != null ? C2786.m4759(drawable2) : null;
        if (m4759 != drawable) {
            float m4393 = m4393();
            this.f9357 = drawable != null ? C2786.m4758(drawable).mutate() : null;
            float m43932 = m4393();
            m4394(m4759);
            if (m4391()) {
                m4365(this.f9357);
            }
            invalidateSelf();
            if (m4393 != m43932) {
                m4384();
            }
        }
    }

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public void m4356(float f) {
        if (this.f9346 != f) {
            this.f9346 = f;
            invalidateSelf();
            m4384();
        }
    }

    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public final boolean m4357() {
        return this.f9352 && this.f9333 != null && this.f9338;
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public float m4358() {
        if (m4383()) {
            return this.f9306 + this.f9342 + this.f9351;
        }
        return 0.0f;
    }

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public void m4359(ColorStateList colorStateList) {
        if (this.f9362 != colorStateList) {
            this.f9362 = colorStateList;
            this.f9302 = this.f9311 ? C2235.m4345(colorStateList) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public void m4360(C2145 c2145) {
        this.f9321.m4398(c2145, this.f9327);
    }

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public void m4361(float f) {
        if (this.f9306 != f) {
            this.f9306 = f;
            invalidateSelf();
            if (m4383()) {
                m4384();
            }
        }
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public float m4362() {
        return this.f9320 ? m4267() : this.f9343;
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public void m4363(boolean z) {
        if (this.f9319 != z) {
            this.f9319 = z;
            float m4393 = m4393();
            if (!z && this.f9338) {
                this.f9338 = false;
            }
            float m43932 = m4393();
            invalidateSelf();
            if (m4393 != m43932) {
                m4384();
            }
        }
    }

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public void m4364(ColorStateList colorStateList) {
        if (this.f9312 != colorStateList) {
            this.f9312 = colorStateList;
            if (m4383()) {
                C2786.m4788(this.f9331, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public final void m4365(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C2786.m4783(drawable, C2786.m4807(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f9331) {
            if (drawable.isStateful()) {
                drawable.setState(this.f9303);
            }
            C2786.m4788(drawable, this.f9312);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f9357;
        if (drawable == drawable2 && this.f9309) {
            C2786.m4788(drawable2, this.f9330);
        }
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public final void m4366(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m4383()) {
            float f = this.f9304 + this.f9351 + this.f9342 + this.f9306 + this.f9324;
            if (C2786.m4807(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public void m4367(boolean z) {
        if (this.f9339 != z) {
            boolean m4391 = m4391();
            this.f9339 = z;
            boolean m43912 = m4391();
            if (m4391 != m43912) {
                if (m43912) {
                    m4365(this.f9357);
                } else {
                    m4394(this.f9357);
                }
                invalidateSelf();
                m4384();
            }
        }
    }

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public void m4368(float f) {
        if (this.f9337 != f) {
            this.f9337 = f;
            invalidateSelf();
            m4384();
        }
    }

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public void m4369(float f) {
        if (this.f9351 != f) {
            this.f9351 = f;
            invalidateSelf();
            if (m4383()) {
                m4384();
            }
        }
    }

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public void m4370(float f) {
        if (this.f9336 != f) {
            this.f9336 = f;
            this.f9344.setStrokeWidth(f);
            if (this.f9320) {
                this.f9045.f9079 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public void m4371(float f) {
        if (this.f9323 != f) {
            float m4393 = m4393();
            this.f9323 = f;
            float m43932 = m4393();
            invalidateSelf();
            if (m4393 != m43932) {
                m4384();
            }
        }
    }

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public void m4372(float f) {
        if (this.f9304 != f) {
            this.f9304 = f;
            invalidateSelf();
            m4384();
        }
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public final void m4373(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m4383()) {
            float f = this.f9304 + this.f9351;
            if (C2786.m4807(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f9342;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f9342;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f9342;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public Drawable m4374() {
        Drawable drawable = this.f9331;
        if (drawable != null) {
            return C2786.m4759(drawable);
        }
        return null;
    }

    @Override // p131.p161.p162.p163.p185.C2249.InterfaceC2250
    /* renamed from: げつ〴ぬぐ */
    public void mo1302() {
        m4384();
        invalidateSelf();
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public void m4375(boolean z) {
        if (this.f9352 != z) {
            boolean m4357 = m4357();
            this.f9352 = z;
            boolean m43572 = m4357();
            if (m4357 != m43572) {
                if (m43572) {
                    m4365(this.f9333);
                } else {
                    m4394(this.f9333);
                }
                invalidateSelf();
                m4384();
            }
        }
    }

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public void m4376(ColorStateList colorStateList) {
        if (this.f9332 != colorStateList) {
            this.f9332 = colorStateList;
            if (this.f9352 && this.f9333 != null && this.f9319) {
                C2786.m4788(this.f9333, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public void m4377(boolean z) {
        if (this.f9311 != z) {
            this.f9311 = z;
            this.f9302 = z ? C2235.m4345(this.f9362) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public void m4378(float f) {
        if (this.f9328 != f) {
            float m4393 = m4393();
            this.f9328 = f;
            float m43932 = m4393();
            invalidateSelf();
            if (m4393 != m43932) {
                m4384();
            }
        }
    }

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public void m4379(ColorStateList colorStateList) {
        this.f9309 = true;
        if (this.f9330 != colorStateList) {
            this.f9330 = colorStateList;
            if (m4391()) {
                C2786.m4788(this.f9357, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public void m4380(float f) {
        if (this.f9324 != f) {
            this.f9324 = f;
            invalidateSelf();
            m4384();
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public final void m4381(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m4391() || m4357()) {
            float f = this.f9329 + this.f9305;
            if (C2786.m4807(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + this.f9323;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - this.f9323;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f9323;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00df  */
    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4382(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p162.p163.p183.C2244.m4382(int[], int[]):boolean");
    }

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public final boolean m4383() {
        return this.f9318 && this.f9331 != null;
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public void m4384() {
        InterfaceC2245 interfaceC2245 = this.f9313.get();
        if (interfaceC2245 != null) {
            interfaceC2245.mo1381();
        }
    }

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public void m4385(Drawable drawable) {
        Drawable m4374 = m4374();
        if (m4374 != drawable) {
            float m4358 = m4358();
            this.f9331 = drawable != null ? C2786.m4758(drawable).mutate() : null;
            if (C2235.f9290) {
                this.f9345 = new RippleDrawable(C2235.m4345(this.f9362), this.f9331, f9301);
            }
            float m43582 = m4358();
            m4394(m4374);
            if (m4383()) {
                m4365(this.f9331);
            }
            invalidateSelf();
            if (m4358 != m43582) {
                m4384();
            }
        }
    }

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public void m4386(boolean z) {
        if (this.f9318 != z) {
            boolean m4383 = m4383();
            this.f9318 = z;
            boolean m43832 = m4383();
            if (m4383 != m43832) {
                if (m43832) {
                    m4365(this.f9331);
                } else {
                    m4394(this.f9331);
                }
                invalidateSelf();
                m4384();
            }
        }
    }

    @Deprecated
    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public void m4387(float f) {
        if (this.f9343 != f) {
            this.f9343 = f;
            this.f9045.f9074 = this.f9045.f9074.m4286(f);
            invalidateSelf();
        }
    }

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public void m4388(float f) {
        if (this.f9342 != f) {
            this.f9342 = f;
            invalidateSelf();
            if (m4383()) {
                m4384();
            }
        }
    }

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public void m4389(float f) {
        if (this.f9329 != f) {
            this.f9329 = f;
            invalidateSelf();
            m4384();
        }
    }

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public void m4390(Drawable drawable) {
        if (this.f9333 != drawable) {
            float m4393 = m4393();
            this.f9333 = drawable;
            float m43932 = m4393();
            m4394(this.f9333);
            m4365(this.f9333);
            invalidateSelf();
            if (m4393 != m43932) {
                m4384();
            }
        }
    }

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public final boolean m4391() {
        return this.f9339 && this.f9357 != null;
    }

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public boolean m4392(int[] iArr) {
        if (Arrays.equals(this.f9303, iArr)) {
            return false;
        }
        this.f9303 = iArr;
        if (m4383()) {
            return m4382(getState(), iArr);
        }
        return false;
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public float m4393() {
        if (m4391() || m4357()) {
            return this.f9305 + this.f9323 + this.f9328;
        }
        return 0.0f;
    }

    /* renamed from: へ〱そかのず, reason: contains not printable characters */
    public final void m4394(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public void m4395(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f9322, charSequence)) {
            return;
        }
        this.f9322 = charSequence;
        this.f9321.f9370 = true;
        invalidateSelf();
        m4384();
    }

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public void m4396(float f) {
        if (this.f9305 != f) {
            float m4393 = m4393();
            this.f9305 = f;
            float m43932 = m4393();
            invalidateSelf();
            if (m4393 != m43932) {
                m4384();
            }
        }
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public void m4397(ColorStateList colorStateList) {
        if (this.f9355 != colorStateList) {
            this.f9355 = colorStateList;
            onStateChange(getState());
        }
    }
}

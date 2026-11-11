package p034.p050.p057.p058;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p050.p057.p058.C1282;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1269 extends Drawable implements Drawable.Callback {

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static final /* synthetic */ int f6173 = 0;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AbstractC1271 f6175;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f6176;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public Runnable f6177;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Rect f6178;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Drawable f6179;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public long f6180;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C1270 f6182;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Drawable f6183;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f6184;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public long f6185;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f6181 = Base64.BASELENGTH;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f6174 = -1;

    /* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public static class C1270 implements Drawable.Callback {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Drawable.Callback f6186;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f6186;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f6186;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ$くし〴〺ぅ, reason: contains not printable characters */
    public static abstract class AbstractC1271 extends Drawable.ConstantState {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f6187;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Resources f6188;

        /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
        public boolean f6189;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public Drawable[] f6190;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean f6191;

        /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
        public ColorFilter f6192;

        /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
        public int f6193;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public int f6194;

        /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
        public boolean f6195;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public int f6196;

        /* renamed from: ぉひのべい, reason: contains not printable characters */
        public PorterDuff.Mode f6197;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public int f6198;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f6199;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C1269 f6200;

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public boolean f6201;

        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public boolean f6202;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public boolean f6203;

        /* renamed from: じぜこほぱ, reason: contains not printable characters */
        public boolean f6204;

        /* renamed from: せづっ〸ちね, reason: contains not printable characters */
        public boolean f6205;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f6206;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public boolean f6207;

        /* renamed from: でどあくず, reason: contains not printable characters */
        public boolean f6208;

        /* renamed from: どぇぞほだ, reason: contains not printable characters */
        public boolean f6209;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public SparseArray<Drawable.ConstantState> f6210;

        /* renamed from: なぶひせが, reason: contains not printable characters */
        public int f6211;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public boolean f6212;

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public int f6213;

        /* renamed from: びえぁぜい, reason: contains not printable characters */
        public int f6214;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f6215;

        /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
        public boolean f6216;

        /* renamed from: ぷぞてのほき, reason: contains not printable characters */
        public boolean f6217;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public int f6218;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public boolean f6219;

        /* renamed from: ぺづげぺが, reason: contains not printable characters */
        public ColorStateList f6220;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public Rect f6221;

        public AbstractC1271(AbstractC1271 abstractC1271, C1269 c1269, Resources resources) {
            this.f6199 = 160;
            this.f6219 = false;
            this.f6207 = false;
            this.f6189 = true;
            this.f6214 = 0;
            this.f6211 = 0;
            this.f6200 = c1269;
            this.f6188 = resources != null ? resources : abstractC1271 != null ? abstractC1271.f6188 : null;
            int i = abstractC1271 != null ? abstractC1271.f6199 : 0;
            int i2 = C1269.f6173;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            int i3 = i != 0 ? i : 160;
            this.f6199 = i3;
            if (abstractC1271 == null) {
                this.f6190 = new Drawable[10];
                this.f6187 = 0;
                return;
            }
            this.f6215 = abstractC1271.f6215;
            this.f6206 = abstractC1271.f6206;
            this.f6208 = true;
            this.f6216 = true;
            this.f6219 = abstractC1271.f6219;
            this.f6207 = abstractC1271.f6207;
            this.f6189 = abstractC1271.f6189;
            this.f6195 = abstractC1271.f6195;
            this.f6193 = abstractC1271.f6193;
            this.f6214 = abstractC1271.f6214;
            this.f6211 = abstractC1271.f6211;
            this.f6209 = abstractC1271.f6209;
            this.f6192 = abstractC1271.f6192;
            this.f6204 = abstractC1271.f6204;
            this.f6220 = abstractC1271.f6220;
            this.f6197 = abstractC1271.f6197;
            this.f6205 = abstractC1271.f6205;
            this.f6217 = abstractC1271.f6217;
            if (abstractC1271.f6199 == i3) {
                if (abstractC1271.f6191) {
                    this.f6221 = new Rect(abstractC1271.f6221);
                    this.f6191 = true;
                }
                if (abstractC1271.f6212) {
                    this.f6218 = abstractC1271.f6218;
                    this.f6198 = abstractC1271.f6198;
                    this.f6194 = abstractC1271.f6194;
                    this.f6196 = abstractC1271.f6196;
                    this.f6212 = true;
                }
            }
            if (abstractC1271.f6203) {
                this.f6213 = abstractC1271.f6213;
                this.f6203 = true;
            }
            if (abstractC1271.f6201) {
                this.f6202 = abstractC1271.f6202;
                this.f6201 = true;
            }
            Drawable[] drawableArr = abstractC1271.f6190;
            this.f6190 = new Drawable[drawableArr.length];
            this.f6187 = abstractC1271.f6187;
            SparseArray<Drawable.ConstantState> sparseArray = abstractC1271.f6210;
            this.f6210 = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f6187);
            int i4 = this.f6187;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    Drawable.ConstantState constantState = drawableArr[i5].getConstantState();
                    if (constantState != null) {
                        this.f6210.put(i5, constantState);
                    } else {
                        this.f6190[i5] = drawableArr[i5];
                    }
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f6187;
            Drawable[] drawableArr = this.f6190;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f6210.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6215 | this.f6206;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m2935() {
            this.f6212 = true;
            m2936();
            int i = this.f6187;
            Drawable[] drawableArr = this.f6190;
            this.f6198 = -1;
            this.f6218 = -1;
            this.f6196 = 0;
            this.f6194 = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f6218) {
                    this.f6218 = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f6198) {
                    this.f6198 = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f6194) {
                    this.f6194 = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f6196) {
                    this.f6196 = minimumHeight;
                }
            }
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m2936() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f6210;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = this.f6210.keyAt(i);
                    Drawable.ConstantState valueAt = this.f6210.valueAt(i);
                    Drawable[] drawableArr = this.f6190;
                    Drawable newDrawable = valueAt.newDrawable(this.f6188);
                    if (Build.VERSION.SDK_INT >= 23) {
                        newDrawable.setLayoutDirection(this.f6193);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f6200);
                    drawableArr[keyAt] = mutate;
                }
                this.f6210 = null;
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int m2937(Drawable drawable) {
            int i = this.f6187;
            if (i >= this.f6190.length) {
                int i2 = i + 10;
                C1282.C1283 c1283 = (C1282.C1283) this;
                Drawable[] drawableArr = new Drawable[i2];
                System.arraycopy(c1283.f6190, 0, drawableArr, 0, i);
                c1283.f6190 = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(c1283.f6240, 0, iArr, 0, i);
                c1283.f6240 = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f6200);
            this.f6190[i] = drawable;
            this.f6187++;
            this.f6206 = drawable.getChangingConfigurations() | this.f6206;
            this.f6203 = false;
            this.f6201 = false;
            this.f6221 = null;
            this.f6191 = false;
            this.f6212 = false;
            this.f6208 = false;
            return i;
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public abstract void mo2938();

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final void m2939(Resources resources) {
            if (resources != null) {
                this.f6188 = resources;
                int i = C1269.f6173;
                int i2 = resources.getDisplayMetrics().densityDpi;
                if (i2 == 0) {
                    i2 = 160;
                }
                int i3 = this.f6199;
                this.f6199 = i2;
                if (i3 != i2) {
                    this.f6212 = false;
                    this.f6191 = false;
                }
            }
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final Drawable m2940(int i) {
            int indexOfKey;
            Drawable drawable = this.f6190[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f6210;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f6210.valueAt(indexOfKey).newDrawable(this.f6188);
            if (Build.VERSION.SDK_INT >= 23) {
                newDrawable.setLayoutDirection(this.f6193);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f6200);
            this.f6190[i] = mutate;
            this.f6210.removeAt(indexOfKey);
            if (this.f6210.size() == 0) {
                this.f6210 = null;
            }
            return mutate;
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1272 implements Runnable {
        public RunnableC1272() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1269.this.m2932(true);
            C1269.this.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        AbstractC1271 abstractC1271 = this.f6175;
        abstractC1271.getClass();
        if (theme != null) {
            abstractC1271.m2936();
            int i = abstractC1271.f6187;
            Drawable[] drawableArr = abstractC1271.f6190;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    abstractC1271.f6206 |= drawableArr[i2].getChangingConfigurations();
                }
            }
            abstractC1271.m2939(theme.getResources());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f6175.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6183;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f6179;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6181;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f6175.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        AbstractC1271 abstractC1271 = this.f6175;
        synchronized (abstractC1271) {
            z = false;
            if (abstractC1271.f6208) {
                z = abstractC1271.f6216;
            } else {
                abstractC1271.m2936();
                abstractC1271.f6208 = true;
                int i = abstractC1271.f6187;
                Drawable[] drawableArr = abstractC1271.f6190;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getConstantState() == null) {
                        abstractC1271.f6216 = false;
                    }
                }
                abstractC1271.f6216 = true;
                z = true;
            }
            break;
        }
        if (!z) {
            return null;
        }
        this.f6175.f6215 = getChangingConfigurations();
        return this.f6175;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f6183;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f6178;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        AbstractC1271 abstractC1271 = this.f6175;
        if (abstractC1271.f6207) {
            if (!abstractC1271.f6212) {
                abstractC1271.m2935();
            }
            return abstractC1271.f6198;
        }
        Drawable drawable = this.f6183;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        AbstractC1271 abstractC1271 = this.f6175;
        if (abstractC1271.f6207) {
            if (!abstractC1271.f6212) {
                abstractC1271.m2935();
            }
            return abstractC1271.f6218;
        }
        Drawable drawable = this.f6183;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        AbstractC1271 abstractC1271 = this.f6175;
        if (abstractC1271.f6207) {
            if (!abstractC1271.f6212) {
                abstractC1271.m2935();
            }
            return abstractC1271.f6196;
        }
        Drawable drawable = this.f6183;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        AbstractC1271 abstractC1271 = this.f6175;
        if (abstractC1271.f6207) {
            if (!abstractC1271.f6212) {
                abstractC1271.m2935();
            }
            return abstractC1271.f6194;
        }
        Drawable drawable = this.f6183;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6183;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        AbstractC1271 abstractC1271 = this.f6175;
        if (abstractC1271.f6203) {
            return abstractC1271.f6213;
        }
        abstractC1271.m2936();
        int i = abstractC1271.f6187;
        Drawable[] drawableArr = abstractC1271.f6190;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        abstractC1271.f6213 = opacity;
        abstractC1271.f6203 = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f6183;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        AbstractC1271 abstractC1271 = this.f6175;
        Rect rect2 = null;
        if (!abstractC1271.f6219) {
            Rect rect3 = abstractC1271.f6221;
            if (rect3 != null || abstractC1271.f6191) {
                rect2 = rect3;
            } else {
                abstractC1271.m2936();
                Rect rect4 = new Rect();
                int i = abstractC1271.f6187;
                Drawable[] drawableArr = abstractC1271.f6190;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                abstractC1271.f6191 = true;
                abstractC1271.f6221 = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f6183;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f6175.f6209 && C2786.m4807(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC1271 abstractC1271 = this.f6175;
        if (abstractC1271 != null) {
            abstractC1271.f6203 = false;
            abstractC1271.f6201 = false;
        }
        if (drawable != this.f6183 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f6175.f6209;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f6179;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f6179 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f6183;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f6176) {
                this.f6183.setAlpha(this.f6181);
            }
        }
        if (this.f6180 != 0) {
            this.f6180 = 0L;
            z = true;
        }
        if (this.f6185 != 0) {
            this.f6185 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f6184 && super.mutate() == this) {
            AbstractC1271 mo2930 = mo2930();
            mo2930.mo2938();
            mo2933(mo2930);
            this.f6184 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6179;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f6183;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        AbstractC1271 abstractC1271 = this.f6175;
        int i2 = this.f6174;
        int i3 = abstractC1271.f6187;
        Drawable[] drawableArr = abstractC1271.f6190;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        abstractC1271.f6193 = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f6179;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f6183;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6179;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f6183;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f6183 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f6176 && this.f6181 == i) {
            return;
        }
        this.f6176 = true;
        this.f6181 = i;
        Drawable drawable = this.f6183;
        if (drawable != null) {
            if (this.f6185 == 0) {
                drawable.setAlpha(i);
            } else {
                m2932(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC1271 abstractC1271 = this.f6175;
        if (abstractC1271.f6209 != z) {
            abstractC1271.f6209 = z;
            Drawable drawable = this.f6183;
            if (drawable != null) {
                C2786.m4824(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC1271 abstractC1271 = this.f6175;
        abstractC1271.f6204 = true;
        if (abstractC1271.f6192 != colorFilter) {
            abstractC1271.f6192 = colorFilter;
            Drawable drawable = this.f6183;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC1271 abstractC1271 = this.f6175;
        if (abstractC1271.f6189 != z) {
            abstractC1271.f6189 = z;
            Drawable drawable = this.f6183;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f6183;
        if (drawable != null) {
            C2786.m4821(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f6178;
        if (rect == null) {
            this.f6178 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f6183;
        if (drawable != null) {
            C2786.m4777(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC1271 abstractC1271 = this.f6175;
        abstractC1271.f6205 = true;
        if (abstractC1271.f6220 != colorStateList) {
            abstractC1271.f6220 = colorStateList;
            C2786.m4788(this.f6183, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC1271 abstractC1271 = this.f6175;
        abstractC1271.f6217 = true;
        if (abstractC1271.f6197 != mode) {
            abstractC1271.f6197 = mode;
            C2786.m4802(this.f6183, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f6179;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f6183;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f6183 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AbstractC1271 mo2930() {
        throw null;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m2931(Drawable drawable) {
        if (this.f6182 == null) {
            this.f6182 = new C1270();
        }
        C1270 c1270 = this.f6182;
        c1270.f6186 = drawable.getCallback();
        drawable.setCallback(c1270);
        try {
            if (this.f6175.f6214 <= 0 && this.f6176) {
                drawable.setAlpha(this.f6181);
            }
            AbstractC1271 abstractC1271 = this.f6175;
            if (abstractC1271.f6204) {
                drawable.setColorFilter(abstractC1271.f6192);
            } else {
                if (abstractC1271.f6205) {
                    C2786.m4788(drawable, abstractC1271.f6220);
                }
                AbstractC1271 abstractC12712 = this.f6175;
                if (abstractC12712.f6217) {
                    C2786.m4802(drawable, abstractC12712.f6197);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f6175.f6189);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i >= 19) {
                drawable.setAutoMirrored(this.f6175.f6209);
            }
            Rect rect = this.f6178;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C1270 c12702 = this.f6182;
            Drawable.Callback callback = c12702.f6186;
            c12702.f6186 = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2932(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f6176 = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f6183
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f6185
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f6181
            r3.setAlpha(r9)
            goto L36
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ$くし〴〺ぅ r9 = r13.f6175
            int r9 = r9.f6214
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f6181
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L36:
            r13.f6185 = r7
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.f6179
            if (r9 == 0) goto L61
            long r10 = r13.f6180
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f6179 = r0
            goto L61
        L4e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ$くし〴〺ぅ r4 = r13.f6175
            int r4 = r4.f6211
            int r3 = r3 / r4
            int r4 = r13.f6181
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f6180 = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f6177
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p057.p058.C1269.m2932(boolean):void");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void mo2933(AbstractC1271 abstractC1271) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: びぐびあび, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2934(int r10) {
        /*
            r9 = this;
            int r0 = r9.f6174
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ$くし〴〺ぅ r0 = r9.f6175
            int r0 = r0.f6211
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f6179
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f6183
            if (r0 == 0) goto L29
            r9.f6179 = r0
            づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ$くし〴〺ぅ r0 = r9.f6175
            int r0 = r0.f6211
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f6180 = r0
            goto L35
        L29:
            r9.f6179 = r4
            r9.f6180 = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f6183
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ$くし〴〺ぅ r0 = r9.f6175
            int r1 = r0.f6187
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m2940(r10)
            r9.f6183 = r0
            r9.f6174 = r10
            if (r0 == 0) goto L5a
            づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ$くし〴〺ぅ r10 = r9.f6175
            int r10 = r10.f6214
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f6185 = r2
        L51:
            r9.m2931(r0)
            goto L5a
        L55:
            r9.f6183 = r4
            r10 = -1
            r9.f6174 = r10
        L5a:
            long r0 = r9.f6185
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f6180
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f6177
            if (r0 != 0) goto L73
            づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ$げつ〴ぬぐ r0 = new づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.〺つふすそ$げつ〴ぬぐ
            r0.<init>()
            r9.f6177 = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m2932(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p057.p058.C1269.m2934(int):boolean");
    }
}

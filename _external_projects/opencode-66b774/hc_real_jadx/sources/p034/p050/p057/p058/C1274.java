package p034.p050.p057.p058;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p034.p035.p038.p039.InterfaceC1015;
import p034.p050.p057.p058.C1269;
import p034.p050.p057.p058.C1282;
import p034.p074.p075.p076.C1462;
import p034.p080.C1504;
import p034.p080.C1507;

@SuppressLint({"RestrictedAPI"})
/* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1274 extends C1282 implements InterfaceC1015 {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public C1277 f6224;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f6225;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f6226;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public AbstractC1276 f6227;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f6228;

    /* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public static class C1275 extends AbstractC1276 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Animatable f6229;

        public C1275(Animatable animatable) {
            super(null);
            this.f6229 = animatable;
        }

        @Override // p034.p050.p057.p058.C1274.AbstractC1276
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void mo2943() {
            this.f6229.start();
        }

        @Override // p034.p050.p057.p058.C1274.AbstractC1276
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void mo2944() {
            this.f6229.stop();
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.げつ〴ぬぐ$ぁごぐすすぃ, reason: contains not printable characters */
    public static abstract class AbstractC1276 {
        public AbstractC1276(C1278 c1278) {
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo2945() {
        }

        /* renamed from: くし〴〺ぅ */
        public abstract void mo2943();

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean mo2946() {
            return false;
        }

        /* renamed from: びぐびあび */
        public abstract void mo2944();
    }

    /* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.げつ〴ぬぐ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1277 extends C1282.C1283 {

        /* renamed from: 〺でおいここ, reason: contains not printable characters */
        public C1507<Integer> f6230;

        /* renamed from: おかぷせ〱, reason: contains not printable characters */
        public C1504<Long> f6231;

        public C1277(C1277 c1277, C1274 c1274, Resources resources) {
            super(c1277, c1274, resources);
            C1507<Integer> c1507;
            if (c1277 != null) {
                this.f6231 = c1277.f6231;
                c1507 = c1277.f6230;
            } else {
                this.f6231 = new C1504<>();
                c1507 = new C1507<>(10);
            }
            this.f6230 = c1507;
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public static long m2947(int i, int i2) {
            return i2 | (i << 32);
        }

        @Override // p034.p050.p057.p058.C1282.C1283, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1274(this, null);
        }

        @Override // p034.p050.p057.p058.C1282.C1283, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1274(this, resources);
        }

        @Override // p034.p050.p057.p058.C1282.C1283, p034.p050.p057.p058.C1269.AbstractC1271
        /* renamed from: づざかべべ */
        public void mo2938() {
            this.f6231 = this.f6231.clone();
            this.f6230 = this.f6230.clone();
        }

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public int m2948(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f6230.m3299(i, 0).intValue();
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.げつ〴ぬぐ$づざかべべ, reason: contains not printable characters */
    public static class C1279 extends AbstractC1276 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final boolean f6232;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final ObjectAnimator f6233;

        public C1279(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C1280 c1280 = new C1280(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(c1280.f6235);
            ofInt.setInterpolator(c1280);
            this.f6232 = z2;
            this.f6233 = ofInt;
        }

        @Override // p034.p050.p057.p058.C1274.AbstractC1276
        /* renamed from: 〺つふすそ */
        public void mo2945() {
            this.f6233.reverse();
        }

        @Override // p034.p050.p057.p058.C1274.AbstractC1276
        /* renamed from: くし〴〺ぅ */
        public void mo2943() {
            this.f6233.start();
        }

        @Override // p034.p050.p057.p058.C1274.AbstractC1276
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2946() {
            return this.f6232;
        }

        @Override // p034.p050.p057.p058.C1274.AbstractC1276
        /* renamed from: びぐびあび */
        public void mo2944() {
            this.f6233.cancel();
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.げつ〴ぬぐ$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C1280 implements TimeInterpolator {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f6234;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f6235;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int[] f6236;

        public C1280(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f6234 = numberOfFrames;
            int[] iArr = this.f6236;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f6236 = new int[numberOfFrames];
            }
            int[] iArr2 = this.f6236;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f6235 = i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f6235) + 0.5f);
            int i2 = this.f6234;
            int[] iArr = this.f6236;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f6235 : 0.0f);
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.げつ〴ぬぐ$びぐびあび, reason: contains not printable characters */
    public static class C1281 extends AbstractC1276 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C1462 f6237;

        public C1281(C1462 c1462) {
            super(null);
            this.f6237 = c1462;
        }

        @Override // p034.p050.p057.p058.C1274.AbstractC1276
        /* renamed from: くし〴〺ぅ */
        public void mo2943() {
            this.f6237.start();
        }

        @Override // p034.p050.p057.p058.C1274.AbstractC1276
        /* renamed from: びぐびあび */
        public void mo2944() {
            this.f6237.stop();
        }
    }

    public C1274() {
        this(null, null);
    }

    public C1274(C1277 c1277, Resources resources) {
        super(null);
        this.f6228 = -1;
        this.f6225 = -1;
        C1277 c12772 = new C1277(c1277, this, resources);
        super.mo2933(c12772);
        this.f6224 = c12772;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0247, code lost:
    
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x024e, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de  */
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p034.p050.p057.p058.C1274 m2941(android.content.Context r18, android.content.res.Resources r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21, android.content.res.Resources.Theme r22) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p057.p058.C1274.m2941(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.げつ〴ぬぐ");
    }

    @Override // p034.p050.p057.p058.C1282, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p034.p050.p057.p058.C1269, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC1276 abstractC1276 = this.f6227;
        if (abstractC1276 != null) {
            abstractC1276.mo2944();
            this.f6227 = null;
            m2934(this.f6228);
            this.f6228 = -1;
            this.f6225 = -1;
        }
    }

    @Override // p034.p050.p057.p058.C1282, p034.p050.p057.p058.C1269, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f6226) {
            super.mutate();
            if (this == this) {
                this.f6224.mo2938();
                this.f6226 = true;
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00eb  */
    @Override // p034.p050.p057.p058.C1282, p034.p050.p057.p058.C1269, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p057.p058.C1274.onStateChange(int[]):boolean");
    }

    @Override // p034.p050.p057.p058.C1269, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC1276 abstractC1276 = this.f6227;
        if (abstractC1276 != null && (visible || z2)) {
            if (z) {
                abstractC1276.mo2943();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // p034.p050.p057.p058.C1282, p034.p050.p057.p058.C1269
    /* renamed from: 〺つふすそ */
    public C1269.AbstractC1271 mo2930() {
        return new C1277(this.f6224, this, null);
    }

    @Override // p034.p050.p057.p058.C1282, p034.p050.p057.p058.C1269
    /* renamed from: づざかべべ */
    public void mo2933(C1269.AbstractC1271 abstractC1271) {
        super.mo2933(abstractC1271);
        if (abstractC1271 instanceof C1277) {
            this.f6224 = (C1277) abstractC1271;
        }
    }

    @Override // p034.p050.p057.p058.C1282
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1282.C1283 mo2930() {
        return new C1277(this.f6224, this, null);
    }
}

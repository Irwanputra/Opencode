package p034.p035.p047;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;
import p034.p035.p045.C1096;

/* renamed from: づざかべべ.〳ぜぞぜべっ.へぬ〴づぞ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractViewOnTouchListenerC1126 implements View.OnTouchListener {

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final int f5620 = ViewConfiguration.getTapTimeout();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f5621;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1128 f5622;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float[] f5623;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float[] f5624;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f5625;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f5626;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean f5627;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Interpolator f5628;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Runnable f5629;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float[] f5630;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float[] f5631;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f5632;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final View f5633;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f5634;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f5635;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float[] f5636;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.へぬ〴づぞ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public class RunnableC1127 implements Runnable {
        public RunnableC1127() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View childAt;
            AbstractViewOnTouchListenerC1126 abstractViewOnTouchListenerC1126 = AbstractViewOnTouchListenerC1126.this;
            if (abstractViewOnTouchListenerC1126.f5625) {
                if (abstractViewOnTouchListenerC1126.f5634) {
                    abstractViewOnTouchListenerC1126.f5634 = false;
                    C1128 c1128 = abstractViewOnTouchListenerC1126.f5622;
                    c1128.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c1128.f5644 = currentAnimationTimeMillis;
                    c1128.f5647 = -1L;
                    c1128.f5645 = currentAnimationTimeMillis;
                    c1128.f5641 = 0.5f;
                    c1128.f5640 = 0;
                    c1128.f5638 = 0;
                }
                C1128 c11282 = AbstractViewOnTouchListenerC1126.this.f5622;
                if ((c11282.f5647 > 0 && AnimationUtils.currentAnimationTimeMillis() > c11282.f5647 + ((long) c11282.f5648)) || !AbstractViewOnTouchListenerC1126.this.m2564()) {
                    AbstractViewOnTouchListenerC1126.this.f5625 = false;
                    return;
                }
                AbstractViewOnTouchListenerC1126 abstractViewOnTouchListenerC11262 = AbstractViewOnTouchListenerC1126.this;
                if (abstractViewOnTouchListenerC11262.f5627) {
                    abstractViewOnTouchListenerC11262.f5627 = false;
                    abstractViewOnTouchListenerC11262.getClass();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    abstractViewOnTouchListenerC11262.f5633.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c11282.f5645 == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float m2566 = c11282.m2566(currentAnimationTimeMillis2);
                long j = currentAnimationTimeMillis2 - c11282.f5645;
                c11282.f5645 = currentAnimationTimeMillis2;
                float f = j * ((m2566 * 4.0f) + ((-4.0f) * m2566 * m2566));
                c11282.f5640 = (int) (c11282.f5642 * f);
                int i = (int) (f * c11282.f5646);
                c11282.f5638 = i;
                ListView listView = ((C1125) AbstractViewOnTouchListenerC1126.this).f5619;
                if (Build.VERSION.SDK_INT >= 19) {
                    listView.scrollListBy(i);
                } else {
                    int firstVisiblePosition = listView.getFirstVisiblePosition();
                    if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
                        listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
                    }
                }
                C1096.m2482(AbstractViewOnTouchListenerC1126.this.f5633, this);
            }
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.へぬ〴づぞ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1128 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f5639;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public float f5641;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f5642;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f5643;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public float f5646;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public int f5648;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public long f5644 = Long.MIN_VALUE;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public long f5647 = -1;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public long f5645 = 0;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f5640 = 0;

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f5638 = 0;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final float m2566(long j) {
            if (j < this.f5644) {
                return 0.0f;
            }
            long j2 = this.f5647;
            if (j2 < 0 || j < j2) {
                return AbstractViewOnTouchListenerC1126.m2561((j - r0) / this.f5643, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f5641;
            return (AbstractViewOnTouchListenerC1126.m2561((j - j2) / this.f5648, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    public AbstractViewOnTouchListenerC1126(View view) {
        C1128 c1128 = new C1128();
        this.f5622 = c1128;
        this.f5628 = new AccelerateInterpolator();
        this.f5631 = new float[]{0.0f, 0.0f};
        this.f5623 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5624 = new float[]{0.0f, 0.0f};
        this.f5636 = new float[]{0.0f, 0.0f};
        this.f5630 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5633 = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f5630;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.f5636;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.f5621 = 1;
        float[] fArr3 = this.f5623;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f5631;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f5624;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f5635 = f5620;
        c1128.f5643 = 500;
        c1128.f5639 = 500;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static float m2561(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f5626
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L7d
        L16:
            r5.m2565()
            goto L7d
        L1a:
            r5.f5627 = r2
            r5.f5632 = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f5633
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m2563(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f5633
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m2563(r2, r7, r6, r3)
            づざかべべ.〳ぜぞぜべっ.へぬ〴づぞ.げつ〴ぬぐ$げつ〴ぬぐ r7 = r5.f5622
            r7.f5642 = r0
            r7.f5646 = r6
            boolean r6 = r5.f5625
            if (r6 != 0) goto L7d
            boolean r6 = r5.m2564()
            if (r6 == 0) goto L7d
            java.lang.Runnable r6 = r5.f5629
            if (r6 != 0) goto L61
            づざかべべ.〳ぜぞぜべっ.へぬ〴づぞ.げつ〴ぬぐ$〺つふすそ r6 = new づざかべべ.〳ぜぞぜべっ.へぬ〴づぞ.げつ〴ぬぐ$〺つふすそ
            r6.<init>()
            r5.f5629 = r6
        L61:
            r5.f5625 = r2
            r5.f5634 = r2
            boolean r6 = r5.f5632
            if (r6 != 0) goto L76
            int r6 = r5.f5635
            if (r6 <= 0) goto L76
            android.view.View r7 = r5.f5633
            java.lang.Runnable r0 = r5.f5629
            long r3 = (long) r6
            p034.p035.p045.C1096.m2501(r7, r0, r3)
            goto L7b
        L76:
            java.lang.Runnable r6 = r5.f5629
            r6.run()
        L7b:
            r5.f5632 = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p035.p047.AbstractViewOnTouchListenerC1126.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final float m2562(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f5621;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f5625 && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m2563(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f5631
            r0 = r0[r4]
            float[] r1 = r3.f5623
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m2561(r0, r2, r1)
            float r1 = r3.m2562(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m2562(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L26
            android.view.animation.Interpolator r6 = r3.f5628
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L30
        L26:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L39
            android.view.animation.Interpolator r6 = r3.f5628
            float r5 = r6.getInterpolation(r5)
        L30:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m2561(r5, r6, r0)
            goto L3a
        L39:
            r5 = 0
        L3a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3f
            return r2
        L3f:
            float[] r6 = r3.f5624
            r6 = r6[r4]
            float[] r0 = r3.f5636
            r0 = r0[r4]
            float[] r1 = r3.f5630
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L58
            float r5 = r5 * r6
            float r4 = m2561(r5, r0, r4)
            return r4
        L58:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = m2561(r5, r0, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p035.p047.AbstractViewOnTouchListenerC1126.m2563(int, float, float, float):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /* renamed from: づざかべべ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2564() {
        /*
            r9 = this;
            づざかべべ.〳ぜぞぜべっ.へぬ〴づぞ.げつ〴ぬぐ$げつ〴ぬぐ r0 = r9.f5622
            float r1 = r0.f5646
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f5642
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            づざかべべ.〳ぜぞぜべっ.へぬ〴づぞ.くし〴〺ぅ r4 = (p034.p035.p047.C1125) r4
            android.widget.ListView r4 = r4.f5619
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = 0
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = 1
        L51:
            if (r1 != 0) goto L54
        L53:
            r2 = 0
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p035.p047.AbstractViewOnTouchListenerC1126.m2564():boolean");
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m2565() {
        int i = 0;
        if (this.f5634) {
            this.f5625 = false;
            return;
        }
        C1128 c1128 = this.f5622;
        c1128.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - c1128.f5644);
        int i3 = c1128.f5639;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c1128.f5648 = i;
        c1128.f5641 = c1128.m2566(currentAnimationTimeMillis);
        c1128.f5647 = currentAnimationTimeMillis;
    }
}

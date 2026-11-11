package p034.p065.p066;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1380 extends RecyclerView.AbstractC0214 {

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final DisplayMetrics f6539;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public float f6541;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public PointF f6543;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final LinearInterpolator f6542 = new LinearInterpolator();

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final DecelerateInterpolator f6536 = new DecelerateInterpolator();

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f6540 = false;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f6538 = 0;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f6537 = 0;

    public C1380(Context context) {
        this.f6539 = context.getResources().getDisplayMetrics();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0214
    /* renamed from: 〺つふすそ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo792(android.view.View r11, androidx.recyclerview.widget.RecyclerView.C0224 r12, androidx.recyclerview.widget.RecyclerView.AbstractC0214.C0216 r13) {
        /*
            r10 = this;
            android.graphics.PointF r12 = r10.f6543
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r12 == 0) goto L17
            float r12 = r12.x
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            goto L17
        Lf:
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto L15
            r9 = 1
            goto L18
        L15:
            r9 = -1
            goto L18
        L17:
            r9 = 0
        L18:
            androidx.recyclerview.widget.RecyclerView$てぜきぽく r12 = r10.f1498
            if (r12 == 0) goto L49
            boolean r4 = r12.mo657()
            if (r4 != 0) goto L23
            goto L49
        L23:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r4
            int r5 = r12.m831(r11)
            int r6 = r4.leftMargin
            int r5 = r5 - r6
            int r6 = r12.m839(r11)
            int r4 = r4.rightMargin
            int r6 = r6 + r4
            int r7 = r12.m862()
            int r4 = r12.f1522
            int r12 = r12.m828()
            int r8 = r4 - r12
            r4 = r10
            int r12 = r4.m3111(r5, r6, r7, r8, r9)
            goto L4a
        L49:
            r12 = 0
        L4a:
            android.graphics.PointF r4 = r10.f6543
            if (r4 == 0) goto L5d
            float r4 = r4.y
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L55
            goto L5d
        L55:
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L5b
            r9 = 1
            goto L5e
        L5b:
            r9 = -1
            goto L5e
        L5d:
            r9 = 0
        L5e:
            androidx.recyclerview.widget.RecyclerView$てぜきぽく r0 = r10.f1498
            if (r0 == 0) goto L90
            boolean r1 = r0.mo663()
            if (r1 != 0) goto L69
            goto L90
        L69:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            int r2 = r0.m856(r11)
            int r3 = r1.topMargin
            int r5 = r2 - r3
            int r11 = r0.m863(r11)
            int r1 = r1.bottomMargin
            int r6 = r11 + r1
            int r7 = r0.m860()
            int r11 = r0.f1523
            int r0 = r0.m847()
            int r8 = r11 - r0
            r4 = r10
            int r3 = r4.m3111(r5, r6, r7, r8, r9)
        L90:
            int r11 = r12 * r12
            int r0 = r3 * r3
            int r0 = r0 + r11
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            int r11 = (int) r0
            int r11 = r10.m3110(r11)
            if (r11 <= 0) goto La8
            int r12 = -r12
            int r0 = -r3
            android.view.animation.DecelerateInterpolator r1 = r10.f6536
            r13.m795(r12, r0, r11, r1)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p065.p066.C1380.mo792(android.view.View, androidx.recyclerview.widget.RecyclerView$でどあくず, androidx.recyclerview.widget.RecyclerView$ざっざへづ$げつ〴ぬぐ):void");
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int mo3109(int i) {
        float abs = Math.abs(i);
        if (!this.f6540) {
            this.f6541 = mo3102(this.f6539);
            this.f6540 = true;
        }
        return (int) Math.ceil(abs * this.f6541);
    }

    /* renamed from: づざかべべ */
    public float mo3102(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int m3110(int i) {
        double mo3109 = mo3109(i);
        Double.isNaN(mo3109);
        return (int) Math.ceil(mo3109 / 0.3356d);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m3111(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }
}

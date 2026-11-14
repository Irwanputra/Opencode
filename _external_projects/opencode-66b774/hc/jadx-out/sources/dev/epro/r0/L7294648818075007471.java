package dev.epro.r0;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L7294648818075007471 extends Drawable.ConstantState {
    public Drawable.ConstantState a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f351o;
    public float p;
    public int q;
    public float r;
    public int s;
    public I9906786506247477813 t;
    public int u;
    public int v;
    public final Rect w;
    public int[] x;

    public L7294648818075007471(L7294648818075007471 l7294648818075007471) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.f351o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = FocusRingDrawable.q;
        if (l7294648818075007471 != null) {
            this.a = l7294648818075007471.a;
            this.b = l7294648818075007471.b;
            this.c = l7294648818075007471.c;
            this.d = l7294648818075007471.d;
            this.e = l7294648818075007471.e;
            this.f = l7294648818075007471.f;
            this.g = l7294648818075007471.g;
            this.h = l7294648818075007471.h;
            this.i = l7294648818075007471.i;
            this.j = l7294648818075007471.j;
            this.k = l7294648818075007471.k;
            this.l = l7294648818075007471.l;
            this.m = l7294648818075007471.m;
            this.n = l7294648818075007471.n;
            this.f351o = l7294648818075007471.f351o;
            this.p = l7294648818075007471.p;
            this.q = l7294648818075007471.q;
            this.r = l7294648818075007471.r;
            this.s = l7294648818075007471.s;
            this.u = l7294648818075007471.u;
            this.v = l7294648818075007471.v;
            I9906786506247477813 i9906786506247477813 = l7294648818075007471.t;
            if (i9906786506247477813 instanceof A11042752882447342413) {
                this.t = ((A11042752882447342413) i9906786506247477813).i().a();
            } else if (i9906786506247477813 instanceof R3555377658195931925) {
                R3555377658195931925 r3555377658195931925 = (R3555377658195931925) i9906786506247477813;
                O3228356295430981133 o3228356295430981133 = new O3228356295430981133();
                int i = r3555377658195931925.a;
                o3228356295430981133.a = i;
                o3228356295430981133.b = r3555377658195931925.b;
                int[][] iArr = r3555377658195931925.c;
                int[][] iArr2 = new int[iArr.length][];
                o3228356295430981133.c = iArr2;
                A11042752882447342413[] a11042752882447342413Arr = r3555377658195931925.d;
                o3228356295430981133.d = new A11042752882447342413[a11042752882447342413Arr.length];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(a11042752882447342413Arr, 0, (A11042752882447342413[]) o3228356295430981133.d, 0, o3228356295430981133.a);
                this.t = o3228356295430981133.a != 0 ? new R3555377658195931925(o3228356295430981133) : null;
            } else {
                this.t = i9906786506247477813;
            }
            if (l7294648818075007471.w != null) {
                this.w = new Rect(l7294648818075007471.w);
            }
            int[] iArr3 = l7294648818075007471.x;
            this.x = Arrays.copyOf(iArr3, iArr3.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, (Resources) null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources);
    }
}

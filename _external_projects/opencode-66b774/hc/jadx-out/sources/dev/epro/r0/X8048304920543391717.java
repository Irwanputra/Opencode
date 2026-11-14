package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X8048304920543391717 {
    public static final H3941990871852382745 m = new H3941990871852382745(1);
    public static final H3941990871852382745 n = new H3941990871852382745(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final H3941990871852382745 f576o = new H3941990871852382745(3);
    public static final H3941990871852382745 p = new H3941990871852382745(4);
    public static final H3941990871852382745 q = new H3941990871852382745(5);
    public static final H3941990871852382745 r = new H3941990871852382745(0);
    public final I11571046933844109529 c;
    public final U15853425786981391261 d;
    public final float g;
    public Y16108220161693303283 j;
    public float k;
    public boolean l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean e = false;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public X8048304920543391717(I11571046933844109529 i11571046933844109529, U15853425786981391261 u15853425786981391261) {
        this.c = i11571046933844109529;
        this.d = u15853425786981391261;
        if (u15853425786981391261 == f576o || u15853425786981391261 == p || u15853425786981391261 == q) {
            this.g = 0.1f;
        } else if (u15853425786981391261 == r) {
            this.g = 0.00390625f;
        } else if (u15853425786981391261 == m || u15853425786981391261 == n) {
            this.g = 0.002f;
        } else {
            this.g = 1.0f;
        }
        this.j = null;
        this.k = Float.MAX_VALUE;
        this.l = false;
    }

    public final void a(float f) {
        this.d.d0(this.c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                Z3383101362411723454.s();
                return;
            }
            i++;
        }
    }
}

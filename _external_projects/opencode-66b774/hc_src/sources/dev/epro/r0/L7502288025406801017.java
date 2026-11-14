package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L7502288025406801017 implements Iterator, D14639766352081121636 {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L7502288025406801017(O827298036535440209 o827298036535440209, byte b) {
        this(o827298036535440209.c);
        this.d = b;
        switch (b) {
            case 1:
                this.e = o827298036535440209;
                this(o827298036535440209.c);
                break;
            default:
                this.e = o827298036535440209;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e;
        if (!hasNext()) {
            Z3383101362411723454.u();
            return null;
        }
        int i = this.b;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                e = ((O827298036535440209) obj).e(i);
                break;
            case 1:
                e = ((O827298036535440209) obj).h(i);
                break;
            default:
                e = ((K4498948325030944807) obj).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            S10973172697741180971.m("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((O827298036535440209) obj).f(i);
                break;
            case 1:
                ((O827298036535440209) obj).f(i);
                break;
            default:
                ((K4498948325030944807) obj).b(i);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L7502288025406801017(K4498948325030944807 k4498948325030944807) {
        this(k4498948325030944807.c);
        this.d = (byte) 2;
        this.e = k4498948325030944807;
    }

    public L7502288025406801017(int i) {
        this.a = i;
    }
}

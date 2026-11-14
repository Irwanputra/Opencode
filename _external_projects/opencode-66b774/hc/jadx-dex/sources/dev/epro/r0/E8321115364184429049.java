package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E8321115364184429049 implements java.lang.Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ java.lang.Object[] c;
    public /* synthetic */ int d;

    public E8321115364184429049(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.b = new int[i5];
        this.c = new java.lang.Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dev.epro.r0.E8321115364184429049 clone() throws java.lang.CloneNotSupportedException {
        java.lang.Object objClone = super.clone();
        objClone.getClass();
        dev.epro.r0.E8321115364184429049 e8321115364184429049 = (dev.epro.r0.E8321115364184429049) objClone;
        e8321115364184429049.b = (int[]) this.b.clone();
        e8321115364184429049.c = (java.lang.Object[]) this.c.clone();
        return e8321115364184429049;
    }

    public final int b(int i) {
        if (this.a) {
            dev.epro.r0.V1475975160983963926.v(this);
        }
        return this.b[i];
    }

    public final void c(int i, java.lang.Object obj) {
        int iO = dev.epro.r0.I3887072968740112330.o(this.d, i, this.b);
        if (iO >= 0) {
            this.c[iO] = obj;
            return;
        }
        int i2 = ~iO;
        int i3 = this.d;
        if (i2 < i3) {
            java.lang.Object[] objArr = this.c;
            if (objArr[i2] == dev.epro.r0.V1475975160983963926.m) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            dev.epro.r0.V1475975160983963926.v(this);
            i2 = ~dev.epro.r0.I3887072968740112330.o(this.d, i, this.b);
        }
        int i4 = this.d;
        if (i4 >= this.b.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.b = java.util.Arrays.copyOf(this.b, i8);
            this.c = java.util.Arrays.copyOf(this.c, i8);
        }
        int i9 = this.d;
        if (i9 - i2 != 0) {
            int[] iArr = this.b;
            int i10 = i2 + 1;
            dev.epro.r0.O5378677881740157249.m0(i10, i2, i9, iArr, iArr);
            java.lang.Object[] objArr2 = this.c;
            dev.epro.r0.O5378677881740157249.n0(i10, i2, this.d, objArr2, objArr2);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final int d() {
        if (this.a) {
            dev.epro.r0.V1475975160983963926.v(this);
        }
        return this.d;
    }

    public final java.lang.Object e(int i) {
        if (this.a) {
            dev.epro.r0.V1475975160983963926.v(this);
        }
        java.lang.Object[] objArr = this.c;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException();
    }

    public final java.lang.String toString() {
        if (d() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            java.lang.Object objE = e(i2);
            if (objE != this) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

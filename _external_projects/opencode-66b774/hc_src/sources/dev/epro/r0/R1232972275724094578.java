package dev.epro.r0;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R1232972275724094578 extends M2335452796812725357 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R1232972275724094578(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 3);
        this.c = b;
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final double k(long j, Object obj) {
        byte b = this.c;
        Unsafe unsafe = this.b;
        switch (b) {
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final float l(long j, Object obj) {
        byte b = this.c;
        Unsafe unsafe = this.b;
        switch (b) {
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final void m(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!Q4627374422374928592.g) {
                    Q4627374422374928592.d(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    Q4627374422374928592.c(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!Q4627374422374928592.g) {
                    Q4627374422374928592.d(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    Q4627374422374928592.c(j, obj, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final void n(long j, Object obj, byte b) {
        switch (this.c) {
            case 0:
                if (!Q4627374422374928592.g) {
                    Q4627374422374928592.d(j, obj, b);
                    break;
                } else {
                    Q4627374422374928592.c(j, obj, b);
                    break;
                }
            default:
                if (!Q4627374422374928592.g) {
                    Q4627374422374928592.d(j, obj, b);
                    break;
                } else {
                    Q4627374422374928592.c(j, obj, b);
                    break;
                }
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final void o(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final void p(Object obj, long j, float f) {
        byte b = this.c;
        Unsafe unsafe = this.b;
        switch (b) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final boolean q(long j, Object obj) {
        switch (this.c) {
            case 0:
                if (!Q4627374422374928592.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!Q4627374422374928592.g) {
                    break;
                } else {
                    break;
                }
        }
        return Q4627374422374928592.k(j, obj);
    }
}

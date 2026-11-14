package dev.epro.r0;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I1710567001611842124 extends M2335452796812725357 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I1710567001611842124(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 0);
        this.c = b;
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final boolean a(long j, Object obj) {
        switch (this.c) {
            case 0:
                if (Z3287610729711297369.g) {
                    if (Z3287610729711297369.f(j, obj) == 0) {
                        return false;
                    }
                } else if (Z3287610729711297369.g(j, obj) == 0) {
                    return false;
                }
                return true;
            case 1:
                if (Z3287610729711297369.g) {
                    if (Z3287610729711297369.f(j, obj) == 0) {
                        return false;
                    }
                } else if (Z3287610729711297369.g(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                return this.b.getBoolean(obj, j);
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final byte b(long j, Object obj) {
        switch (this.c) {
            case 0:
                return Z3287610729711297369.g ? Z3287610729711297369.f(j, obj) : Z3287610729711297369.g(j, obj);
            case 1:
                return Z3287610729711297369.g ? Z3287610729711297369.f(j, obj) : Z3287610729711297369.g(j, obj);
            default:
                return this.b.getByte(obj, j);
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final double c(long j, Object obj) {
        switch (this.c) {
            case 0:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            default:
                return this.b.getDouble(obj, j);
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final float d(long j, Object obj) {
        switch (this.c) {
            case 0:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            default:
                return this.b.getFloat(obj, j);
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final void e(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!Z3287610729711297369.g) {
                    Z3287610729711297369.n(j, obj, z ? (byte) 1 : (byte) 0);
                } else {
                    Z3287610729711297369.m(j, obj, z ? (byte) 1 : (byte) 0);
                }
                break;
            case 1:
                if (!Z3287610729711297369.g) {
                    Z3287610729711297369.n(j, obj, z ? (byte) 1 : (byte) 0);
                } else {
                    Z3287610729711297369.m(j, obj, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                this.b.putBoolean(obj, j, z);
                break;
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final void f(long j, Object obj, byte b) {
        switch (this.c) {
            case 0:
                if (!Z3287610729711297369.g) {
                    Z3287610729711297369.n(j, obj, b);
                } else {
                    Z3287610729711297369.m(j, obj, b);
                }
                break;
            case 1:
                if (!Z3287610729711297369.g) {
                    Z3287610729711297369.n(j, obj, b);
                } else {
                    Z3287610729711297369.m(j, obj, b);
                }
                break;
            default:
                this.b.putByte(obj, j, b);
                break;
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final void g(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.b.putDouble(obj, j, d);
                break;
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final void h(Object obj, long j, float f) {
        switch (this.c) {
            case 0:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            case 1:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.b.putFloat(obj, j, f);
                break;
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public boolean i() {
        switch (this.c) {
            case 2:
                if (!super.i()) {
                    return false;
                }
                try {
                    Class<?> cls = this.b.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    Z3287610729711297369.k(th);
                    return false;
                }
            default:
                return super.i();
        }
    }

    @Override // dev.epro.r0.M2335452796812725357
    public final boolean j() {
        switch (this.c) {
            case 0:
            case 1:
                break;
            default:
                Unsafe unsafe = this.b;
                if (unsafe != null) {
                    try {
                        Class<?> cls = unsafe.getClass();
                        cls.getMethod("objectFieldOffset", Field.class);
                        Class cls2 = Long.TYPE;
                        cls.getMethod("getLong", Object.class, cls2);
                        if (Z3287610729711297369.c() != null) {
                            try {
                                Class<?> cls3 = unsafe.getClass();
                                cls3.getMethod("getByte", cls2);
                                cls3.getMethod("putByte", cls2, Byte.TYPE);
                                cls3.getMethod("getInt", cls2);
                                cls3.getMethod("putInt", cls2, Integer.TYPE);
                                cls3.getMethod("getLong", cls2);
                                cls3.getMethod("putLong", cls2, cls2);
                                cls3.getMethod("copyMemory", cls2, cls2, cls2);
                                cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            } catch (Throwable th) {
                                Z3287610729711297369.k(th);
                                return false;
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        Z3287610729711297369.k(th2);
                        return false;
                    }
                }
                break;
        }
        return false;
    }
}

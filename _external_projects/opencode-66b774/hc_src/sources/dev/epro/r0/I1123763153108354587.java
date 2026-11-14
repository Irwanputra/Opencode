package dev.epro.r0;

import ads_mobile_sdk.pm3;
import ads_mobile_sdk.yu;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I1123763153108354587 extends yu {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I1123763153108354587(Unsafe unsafe, byte b) {
        super(unsafe);
        this.f = b;
    }

    @Override // ads_mobile_sdk.yu
    public final void a(Object obj, long j, boolean z) {
        switch (this.f) {
            case 0:
                if (!pm3.e) {
                    byte b = z ? (byte) 1 : (byte) 0;
                    long j2 = (-4) & j;
                    yu yuVar = pm3.c;
                    int i = (((int) j) & 3) << 3;
                    int i2 = (b & 255) << i;
                    yuVar.a(i2 | ((~(255 << i)) & ((Unsafe) yuVar.a).getInt(obj, j2)), j2, obj);
                    break;
                } else {
                    byte b2 = z ? (byte) 1 : (byte) 0;
                    long j3 = (-4) & j;
                    yu yuVar2 = pm3.c;
                    int i3 = ((Unsafe) yuVar2.a).getInt(obj, j3);
                    int i4 = ((~((int) j)) & 3) << 3;
                    yuVar2.a(((b2 & 255) << i4) | ((~(255 << i4)) & i3), j3, obj);
                    break;
                }
            case 1:
                if (!pm3.e) {
                    byte b3 = z ? (byte) 1 : (byte) 0;
                    long j4 = (-4) & j;
                    yu yuVar3 = pm3.c;
                    int i5 = (((int) j) & 3) << 3;
                    int i6 = (b3 & 255) << i5;
                    yuVar3.a(i6 | ((~(255 << i5)) & ((Unsafe) yuVar3.a).getInt(obj, j4)), j4, obj);
                    break;
                } else {
                    byte b4 = z ? (byte) 1 : (byte) 0;
                    long j5 = (-4) & j;
                    yu yuVar4 = pm3.c;
                    int i7 = ((Unsafe) yuVar4.a).getInt(obj, j5);
                    int i8 = ((~((int) j)) & 3) << 3;
                    yuVar4.a(((b4 & 255) << i8) | ((~(255 << i8)) & i7), j5, obj);
                    break;
                }
            default:
                ((Unsafe) this.a).putBoolean(obj, j, z);
                break;
        }
    }

    @Override // ads_mobile_sdk.yu
    public boolean b() {
        switch (this.f) {
            case 2:
                if (!super.b()) {
                    return false;
                }
                try {
                    Class<?> cls = ((Unsafe) this.a).getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", cls2);
                    cls.getMethod("putByte", cls2, Byte.TYPE);
                    cls.getMethod("getInt", cls2);
                    cls.getMethod("putInt", cls2, Integer.TYPE);
                    cls.getMethod("getLong", cls2);
                    cls.getMethod("putLong", cls2, cls2);
                    cls.getMethod("copyMemory", cls2, cls2, cls2);
                    cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                    return true;
                } catch (Throwable th) {
                    pm3.a(th);
                    return false;
                }
            default:
                return super.b();
        }
    }

    @Override // ads_mobile_sdk.yu
    public final float c(long j, Object obj) {
        switch (this.f) {
            case 0:
                return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
            default:
                return ((Unsafe) this.a).getFloat(obj, j);
        }
    }

    @Override // ads_mobile_sdk.yu
    public final double b(long j, Object obj) {
        switch (this.f) {
            case 0:
                return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
            default:
                return ((Unsafe) this.a).getDouble(obj, j);
        }
    }

    @Override // ads_mobile_sdk.yu
    public final boolean a(long j, Object obj) {
        switch (this.f) {
            case 0:
                if (pm3.e) {
                    if (((byte) ((((Unsafe) pm3.c.a).getInt(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                } else {
                    if (((byte) ((((Unsafe) pm3.c.a).getInt(obj, j & (-4)) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                }
                return false;
            case 1:
                if (pm3.e) {
                    if (((byte) ((((Unsafe) pm3.c.a).getInt(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                } else {
                    if (((byte) ((((Unsafe) pm3.c.a).getInt(obj, j & (-4)) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                }
                return false;
            default:
                return ((Unsafe) this.a).getBoolean(obj, j);
        }
    }

    @Override // ads_mobile_sdk.yu
    public final void a(Object obj, long j, double d) {
        switch (this.f) {
            case 0:
                a(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                a(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                ((Unsafe) this.a).putDouble(obj, j, d);
                break;
        }
    }

    @Override // ads_mobile_sdk.yu
    public final void a(Object obj, long j, float f) {
        switch (this.f) {
            case 0:
                a(Float.floatToIntBits(f), j, obj);
                break;
            case 1:
                a(Float.floatToIntBits(f), j, obj);
                break;
            default:
                ((Unsafe) this.a).putFloat(obj, j, f);
                break;
        }
    }

    @Override // ads_mobile_sdk.yu
    /* renamed from: a */
    public boolean mo9a() {
        switch (this.f) {
            case 2:
                if (!super.mo9a()) {
                    return false;
                }
                try {
                    Class<?> cls = ((Unsafe) this.a).getClass();
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
                    pm3.a(th);
                    return false;
                }
            default:
                return super.mo9a();
        }
    }
}

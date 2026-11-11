package p131.p145.p149;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p131.p145.p146.AbstractC2029;
import p131.p145.p146.AbstractC2030;
import p131.p145.p149.AbstractC2040;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2074 implements Cloneable {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static Class[] f8860;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final HashMap<Class, HashMap<String, Method>> f8861;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static Class[] f8862;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final HashMap<Class, HashMap<String, Method>> f8863;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final InterfaceC2062 f8864 = new C2061();

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final InterfaceC2062 f8865 = new C2058();

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static Class[] f8866;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f8868;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public InterfaceC2062 f8870;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AbstractC2029 f8871;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Class f8873;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public Object f8876;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Method f8874 = null;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Method f8872 = null;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C2033 f8869 = null;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final ReentrantReadWriteLock f8867 = new ReentrantReadWriteLock();

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final Object[] f8875 = new Object[1];

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.ぺふねづ〺$〺つふすそ, reason: contains not printable characters */
    public static class C2075 extends C2074 {

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public int f8877;

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public C2063 f8878;

        public C2075(String str, C2063 c2063) {
            super(str);
            this.f8873 = Integer.TYPE;
            this.f8869 = c2063;
            this.f8878 = c2063;
        }

        @Override // p131.p145.p149.C2074
        public Object clone() {
            C2075 c2075 = (C2075) super.clone();
            c2075.f8878 = (C2063) c2075.f8869;
            return c2075;
        }

        @Override // p131.p145.p149.C2074
        /* renamed from: 〺つふすそ */
        public C2074 clone() {
            C2075 c2075 = (C2075) super.clone();
            c2075.f8878 = (C2063) c2075.f8869;
            return c2075;
        }

        @Override // p131.p145.p149.C2074
        /* renamed from: ぁごぐすすぃ */
        public void mo4167(Class cls) {
            if (this.f8871 != null) {
                return;
            }
            this.f8874 = m4165(cls, C2074.f8861, "set", this.f8873);
        }

        @Override // p131.p145.p149.C2074
        /* renamed from: くし〴〺ぅ */
        public Object mo4168() {
            return Integer.valueOf(this.f8877);
        }

        @Override // p131.p145.p149.C2074
        /* renamed from: げつ〴ぬぐ */
        public void mo4169(float f) {
            this.f8877 = this.f8878.m4149(f);
        }

        @Override // p131.p145.p149.C2074
        /* renamed from: なぎぱいぢぎ */
        public void mo4170(Object obj) {
            AbstractC2029 abstractC2029 = this.f8871;
            if (abstractC2029 != null) {
                abstractC2029.mo4118(obj, Integer.valueOf(this.f8877));
                return;
            }
            if (this.f8874 != null) {
                try {
                    this.f8875[0] = Integer.valueOf(this.f8877);
                    this.f8874.invoke(obj, this.f8875);
                } catch (IllegalAccessException e) {
                    e.toString();
                } catch (InvocationTargetException e2) {
                    e2.toString();
                }
            }
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.ぺふねづ〺$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2076 extends C2074 {

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public C2072 f8879;

        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public float f8880;

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public AbstractC2030 f8881;

        public C2076(String str, C2072 c2072) {
            super(str);
            this.f8873 = Float.TYPE;
            this.f8869 = c2072;
            this.f8879 = c2072;
        }

        @Override // p131.p145.p149.C2074
        public Object clone() {
            C2076 c2076 = (C2076) super.clone();
            c2076.f8879 = (C2072) c2076.f8869;
            return c2076;
        }

        @Override // p131.p145.p149.C2074
        /* renamed from: 〺つふすそ */
        public C2074 clone() {
            C2076 c2076 = (C2076) super.clone();
            c2076.f8879 = (C2072) c2076.f8869;
            return c2076;
        }

        @Override // p131.p145.p149.C2074
        /* renamed from: ぁごぐすすぃ */
        public void mo4167(Class cls) {
            if (this.f8871 != null) {
                return;
            }
            this.f8874 = m4165(cls, C2074.f8861, "set", this.f8873);
        }

        @Override // p131.p145.p149.C2074
        /* renamed from: くし〴〺ぅ */
        public Object mo4168() {
            return Float.valueOf(this.f8880);
        }

        @Override // p131.p145.p149.C2074
        /* renamed from: げつ〴ぬぐ */
        public void mo4169(float f) {
            this.f8880 = this.f8879.m4160(f);
        }

        @Override // p131.p145.p149.C2074
        /* renamed from: なぎぱいぢぎ */
        public void mo4170(Object obj) {
            AbstractC2030 abstractC2030 = this.f8881;
            if (abstractC2030 != null) {
                abstractC2030.mo4121(obj, this.f8880);
                return;
            }
            AbstractC2029 abstractC2029 = this.f8871;
            if (abstractC2029 != null) {
                abstractC2029.mo4118(obj, Float.valueOf(this.f8880));
                return;
            }
            if (this.f8874 != null) {
                try {
                    this.f8875[0] = Float.valueOf(this.f8880);
                    this.f8874.invoke(obj, this.f8875);
                } catch (IllegalAccessException e) {
                    e.toString();
                } catch (InvocationTargetException e2) {
                    e2.toString();
                }
            }
        }
    }

    static {
        Class cls = Float.TYPE;
        Class cls2 = Integer.TYPE;
        f8866 = new Class[]{cls, Float.class, Double.TYPE, cls2, Double.class, Integer.class};
        Class cls3 = Double.TYPE;
        f8862 = new Class[]{cls2, Integer.class, cls, cls3, Float.class, Double.class};
        f8860 = new Class[]{cls3, Double.class, cls, cls2, Float.class, Integer.class};
        f8861 = new HashMap<>();
        f8863 = new HashMap<>();
    }

    public C2074(String str) {
        this.f8868 = str;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static C2074 m4164(String str, AbstractC2040... abstractC2040Arr) {
        C2033 c2033;
        int length = abstractC2040Arr.length;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < length; i++) {
            if (abstractC2040Arr[i] instanceof AbstractC2040.C2042) {
                z = true;
            } else if (abstractC2040Arr[i] instanceof AbstractC2040.C2041) {
                z2 = true;
            } else {
                z3 = true;
            }
        }
        if (z && !z2 && !z3) {
            AbstractC2040.C2042[] c2042Arr = new AbstractC2040.C2042[length];
            for (int i2 = 0; i2 < length; i2++) {
                c2042Arr[i2] = (AbstractC2040.C2042) abstractC2040Arr[i2];
            }
            c2033 = new C2072(c2042Arr);
        } else if (!z2 || z || z3) {
            c2033 = new C2033(abstractC2040Arr);
        } else {
            AbstractC2040.C2041[] c2041Arr = new AbstractC2040.C2041[length];
            for (int i3 = 0; i3 < length; i3++) {
                c2041Arr[i3] = (AbstractC2040.C2041) abstractC2040Arr[i3];
            }
            c2033 = new C2063(c2041Arr);
        }
        if (c2033 instanceof C2063) {
            return new C2075(str, (C2063) c2033);
        }
        if (c2033 instanceof C2072) {
            return new C2076(str, (C2072) c2033);
        }
        C2074 c2074 = new C2074(str);
        c2074.f8869 = c2033;
        c2074.f8873 = abstractC2040Arr[0].f8805;
        return c2074;
    }

    public String toString() {
        return this.f8868 + ": " + this.f8869.toString();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Method m4165(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
        try {
            this.f8867.writeLock().lock();
            HashMap<String, Method> hashMap2 = hashMap.get(cls);
            Method method = hashMap2 != null ? hashMap2.get(this.f8868) : null;
            if (method == null) {
                method = m4171(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap<>();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.f8868, method);
            }
            return method;
        } finally {
            this.f8867.writeLock().unlock();
        }
    }

    @Override // 
    /* renamed from: 〺つふすそ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C2074 clone() {
        try {
            C2074 c2074 = (C2074) super.clone();
            c2074.f8868 = this.f8868;
            c2074.f8871 = this.f8871;
            c2074.f8869 = this.f8869.clone();
            c2074.f8870 = this.f8870;
            return c2074;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void mo4167(Class cls) {
        this.f8874 = m4165(cls, f8861, "set", this.f8873);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Object mo4168() {
        return this.f8876;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo4169(float f) {
        this.f8876 = this.f8869.mo4129(f);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo4170(Object obj) {
        AbstractC2029 abstractC2029 = this.f8871;
        if (abstractC2029 != null) {
            abstractC2029.mo4118(obj, mo4168());
        }
        if (this.f8874 != null) {
            try {
                this.f8875[0] = mo4168();
                this.f8874.invoke(obj, this.f8875);
            } catch (IllegalAccessException e) {
                e.toString();
            } catch (InvocationTargetException e2) {
                e2.toString();
            }
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Method m4171(Class cls, String str, Class cls2) {
        StringBuilder m4207;
        String str2 = this.f8868;
        if (str2 != null && str2.length() != 0) {
            str = str + Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
        }
        Method method = null;
        if (cls2 == null) {
            try {
                return cls.getMethod(str, null);
            } catch (NoSuchMethodException e) {
                try {
                    method = cls.getDeclaredMethod(str, null);
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                    m4207 = C2098.m4207("Couldn't find no-arg method for property ");
                    m4207.append(this.f8868);
                    m4207.append(": ");
                    m4207.append(e);
                }
            }
        } else {
            Class<?>[] clsArr = new Class[1];
            for (Class<?> cls3 : this.f8873.equals(Float.class) ? f8866 : this.f8873.equals(Integer.class) ? f8862 : this.f8873.equals(Double.class) ? f8860 : new Class[]{this.f8873}) {
                clsArr[0] = cls3;
                try {
                    try {
                        Method method2 = cls.getMethod(str, clsArr);
                        this.f8873 = cls3;
                        return method2;
                    } catch (NoSuchMethodException unused2) {
                    }
                } catch (NoSuchMethodException unused3) {
                    method = cls.getDeclaredMethod(str, clsArr);
                    method.setAccessible(true);
                    this.f8873 = cls3;
                    return method;
                }
            }
            m4207 = C2098.m4207("Couldn't find setter/getter for property ");
            m4207.append(this.f8868);
            m4207.append(" with value type ");
            m4207.append(this.f8873);
        }
        m4207.toString();
        return method;
    }
}

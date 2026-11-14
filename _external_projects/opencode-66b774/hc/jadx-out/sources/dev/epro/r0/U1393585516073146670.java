package dev.epro.r0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U1393585516073146670 {
    public static final W929662112881511578 b = new W929662112881511578(0);
    public final /* synthetic */ P14575954172000745949 a;

    public U1393585516073146670(P14575954172000745949 p14575954172000745949) {
        this.a = p14575954172000745949;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        W929662112881511578 w929662112881511578 = b;
        W929662112881511578 w9296621128815115782 = (W929662112881511578) w929662112881511578.get(classLoader);
        if (w9296621128815115782 == null) {
            w9296621128815115782 = new W929662112881511578(0);
            w929662112881511578.put(classLoader, w9296621128815115782);
        }
        Class cls = (Class) w9296621128815115782.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        w9296621128815115782.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new M8821877208104636290(G6547577305291411977.s("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new M8821877208104636290(G6547577305291411977.s("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final C13374971588771233833 a(String str) {
        try {
            return (C13374971588771233833) c(this.a.t.r.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new M8821877208104636290(G6547577305291411977.s("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new M8821877208104636290(G6547577305291411977.s("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new M8821877208104636290(G6547577305291411977.s("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new M8821877208104636290(G6547577305291411977.s("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}

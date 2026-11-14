package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C14766148968941961570 {
    public static final java.util.TimeZone a;
    public static final java.lang.String b;

    static {
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = dev.epro.r0.M8927913404651150384.j0(dev.epro.r0.M8927913404651150384.i0(dev.epro.r0.K5458285210510848811.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(dev.epro.r0.P10208541982779414550 p10208541982779414550, dev.epro.r0.P10208541982779414550 p102085419827794145502) {
        p10208541982779414550.getClass();
        return dev.epro.r0.S10823041268949770285.t(p10208541982779414550.d, p102085419827794145502.d) && p10208541982779414550.e == p102085419827794145502.e && dev.epro.r0.S10823041268949770285.t(p10208541982779414550.a, p102085419827794145502.a);
    }

    public static final int b(long j, java.util.concurrent.TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            dev.epro.r0.Z3383101362411723454.j("timeout < 0");
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            dev.epro.r0.S10973172697741180971.i("timeout too large");
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        dev.epro.r0.S10973172697741180971.i("timeout too small");
        return 0;
    }

    public static final void c(java.net.Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (java.lang.AssertionError e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            if (!dev.epro.r0.S10823041268949770285.t(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final java.lang.String d(java.lang.String str, java.lang.Object... objArr) {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        return java.lang.String.format(locale, str, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(dev.epro.r0.P10917817599008460069 p10917817599008460069) {
        java.lang.String strA = p10917817599008460069.f.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        byte[] bArr = dev.epro.r0.L14928198200995638215.a;
        try {
            return java.lang.Long.parseLong(strA);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public static final java.nio.charset.Charset f(dev.epro.r0.J6206369225411265287 j6206369225411265287, java.nio.charset.Charset charset) {
        j6206369225411265287.getClass();
        charset.getClass();
        int i = j6206369225411265287.i(dev.epro.r0.L14928198200995638215.b);
        if (i == -1) {
            return charset;
        }
        if (i == 0) {
            return dev.epro.r0.F16059529287866721367.a;
        }
        if (i == 1) {
            return dev.epro.r0.F16059529287866721367.b;
        }
        if (i == 2) {
            java.nio.charset.Charset charset2 = dev.epro.r0.F16059529287866721367.a;
            java.nio.charset.Charset charset3 = dev.epro.r0.F16059529287866721367.f;
            if (charset3 != null) {
                return charset3;
            }
            java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName("UTF-32LE");
            charsetForName.getClass();
            dev.epro.r0.F16059529287866721367.f = charsetForName;
            return charsetForName;
        }
        if (i == 3) {
            return dev.epro.r0.F16059529287866721367.c;
        }
        if (i != 4) {
            throw new java.lang.AssertionError();
        }
        java.nio.charset.Charset charset4 = dev.epro.r0.F16059529287866721367.a;
        java.nio.charset.Charset charset5 = dev.epro.r0.F16059529287866721367.g;
        if (charset5 != null) {
            return charset5;
        }
        java.nio.charset.Charset charsetForName2 = java.nio.charset.Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        dev.epro.r0.F16059529287866721367.g = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(dev.epro.r0.S7370861580758580261 s7370861580758580261, int i) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = java.lang.System.nanoTime();
        long jC = s7370861580758580261.a().e() ? s7370861580758580261.a().c() - jNanoTime : Long.MAX_VALUE;
        s7370861580758580261.a().d(java.lang.Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            dev.epro.r0.P5176232750190581838 p5176232750190581838 = new dev.epro.r0.P5176232750190581838();
            while (s7370861580758580261.m(p5176232750190581838, 8192L) != -1) {
                p5176232750190581838.b();
            }
            if (jC == Long.MAX_VALUE) {
                s7370861580758580261.a().a();
                return true;
            }
            s7370861580758580261.a().d(jNanoTime + jC);
            return true;
        } catch (java.io.InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                s7370861580758580261.a().a();
                return false;
            }
            s7370861580758580261.a().d(jNanoTime + jC);
            return false;
        } catch (java.lang.Throwable th) {
            if (jC == Long.MAX_VALUE) {
                s7370861580758580261.a().a();
            } else {
                s7370861580758580261.a().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final dev.epro.r0.F12902864952249894497 h(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            dev.epro.r0.O12229768880637238015 o12229768880637238015 = (dev.epro.r0.O12229768880637238015) it.next();
            dev.epro.r0.P5124777957357031757 p5124777957357031757 = o12229768880637238015.a;
            dev.epro.r0.P5124777957357031757 p51247779573570317572 = o12229768880637238015.b;
            java.lang.String strL = p5124777957357031757.l();
            java.lang.String strL2 = p51247779573570317572.l();
            arrayList.add(strL);
            arrayList.add(dev.epro.r0.M8927913404651150384.D0(strL2).toString());
        }
        return new dev.epro.r0.F12902864952249894497((java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
    }

    public static final java.lang.String i(dev.epro.r0.P10208541982779414550 p10208541982779414550, boolean z) {
        p10208541982779414550.getClass();
        int i = p10208541982779414550.e;
        java.lang.String str = p10208541982779414550.d;
        if (dev.epro.r0.M8927913404651150384.L(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z) {
            java.lang.String str2 = p10208541982779414550.a;
            str2.getClass();
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final java.util.List j(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            return dev.epro.r0.O2161699089510411363.a;
        }
        if (list.size() == 1) {
            java.util.List listSingletonList = java.util.Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        java.lang.Object[] array = list.toArray();
        array.getClass();
        java.util.List listAsList = java.util.Arrays.asList(array);
        listAsList.getClass();
        java.util.List listUnmodifiableList = java.util.Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final java.util.List k(java.lang.Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return dev.epro.r0.O2161699089510411363.a;
        }
        if (objArr.length == 1) {
            java.util.List listSingletonList = java.util.Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr.clone();
        objArr2.getClass();
        java.util.List listAsList = java.util.Arrays.asList(objArr2);
        listAsList.getClass();
        java.util.List listUnmodifiableList = java.util.Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}

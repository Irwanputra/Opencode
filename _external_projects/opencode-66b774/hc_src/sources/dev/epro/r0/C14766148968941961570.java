package dev.epro.r0;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class C14766148968941961570 {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = M8927913404651150384.j0(M8927913404651150384.i0(K5458285210510848811.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(P10208541982779414550 p10208541982779414550, P10208541982779414550 p102085419827794145502) {
        p10208541982779414550.getClass();
        return S10823041268949770285.t(p10208541982779414550.d, p102085419827794145502.d) && p10208541982779414550.e == p102085419827794145502.e && S10823041268949770285.t(p10208541982779414550.a, p102085419827794145502.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            Z3383101362411723454.j("timeout < 0");
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            S10973172697741180971.i("timeout too large");
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        S10973172697741180971.i("timeout too small");
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!S10823041268949770285.t(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long e(P10917817599008460069 p10917817599008460069) {
        String a2 = p10917817599008460069.f.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        byte[] bArr = L14928198200995638215.a;
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(J6206369225411265287 j6206369225411265287, Charset charset) {
        j6206369225411265287.getClass();
        charset.getClass();
        int i = j6206369225411265287.i(L14928198200995638215.b);
        if (i == -1) {
            return charset;
        }
        if (i == 0) {
            return F16059529287866721367.a;
        }
        if (i == 1) {
            return F16059529287866721367.b;
        }
        if (i == 2) {
            Charset charset2 = F16059529287866721367.a;
            Charset charset3 = F16059529287866721367.f;
            if (charset3 != null) {
                return charset3;
            }
            Charset forName = Charset.forName("UTF-32LE");
            forName.getClass();
            F16059529287866721367.f = forName;
            return forName;
        }
        if (i == 3) {
            return F16059529287866721367.c;
        }
        if (i != 4) {
            throw new AssertionError();
        }
        Charset charset4 = F16059529287866721367.a;
        Charset charset5 = F16059529287866721367.g;
        if (charset5 != null) {
            return charset5;
        }
        Charset forName2 = Charset.forName("UTF-32BE");
        forName2.getClass();
        F16059529287866721367.g = forName2;
        return forName2;
    }

    public static final boolean g(S7370861580758580261 s7370861580758580261, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long c = s7370861580758580261.a().e() ? s7370861580758580261.a().c() - nanoTime : Long.MAX_VALUE;
        s7370861580758580261.a().d(Math.min(c, timeUnit.toNanos(i)) + nanoTime);
        try {
            P5176232750190581838 p5176232750190581838 = new P5176232750190581838();
            while (s7370861580758580261.m(p5176232750190581838, 8192L) != -1) {
                p5176232750190581838.b();
            }
            if (c == Long.MAX_VALUE) {
                s7370861580758580261.a().a();
                return true;
            }
            s7370861580758580261.a().d(nanoTime + c);
            return true;
        } catch (InterruptedIOException unused) {
            if (c == Long.MAX_VALUE) {
                s7370861580758580261.a().a();
                return false;
            }
            s7370861580758580261.a().d(nanoTime + c);
            return false;
        } catch (Throwable th) {
            if (c == Long.MAX_VALUE) {
                s7370861580758580261.a().a();
            } else {
                s7370861580758580261.a().d(nanoTime + c);
            }
            throw th;
        }
    }

    public static final F12902864952249894497 h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            O12229768880637238015 o12229768880637238015 = (O12229768880637238015) it.next();
            P5124777957357031757 p5124777957357031757 = o12229768880637238015.a;
            P5124777957357031757 p51247779573570317572 = o12229768880637238015.b;
            String l = p5124777957357031757.l();
            String l2 = p51247779573570317572.l();
            arrayList.add(l);
            arrayList.add(M8927913404651150384.D0(l2).toString());
        }
        return new F12902864952249894497((String[]) arrayList.toArray(new String[0]));
    }

    public static final String i(P10208541982779414550 p10208541982779414550, boolean z) {
        p10208541982779414550.getClass();
        int i = p10208541982779414550.e;
        String str = p10208541982779414550.d;
        if (M8927913404651150384.L(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = p10208541982779414550.a;
            str2.getClass();
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return O2161699089510411363.a;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            singletonList.getClass();
            return singletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        List unmodifiableList = Collections.unmodifiableList(asList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return O2161699089510411363.a;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            singletonList.getClass();
            return singletonList;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        objArr2.getClass();
        List asList = Arrays.asList(objArr2);
        asList.getClass();
        List unmodifiableList = Collections.unmodifiableList(asList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }
}

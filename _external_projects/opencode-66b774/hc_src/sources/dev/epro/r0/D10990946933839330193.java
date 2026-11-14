package dev.epro.r0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Vector;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D10990946933839330193 implements Z1784283759719197609 {
    public static final String g;
    public static final long h;
    public T1177712003054613961 a;
    public Vector b;
    public boolean c;
    public ArrayList d;
    public String[] e;
    public boolean f;

    static {
        String concat = D10990946933839330193.class.getName().concat(".timeout");
        g = concat;
        h = Long.parseLong(System.getProperty(concat, "1200000"));
    }

    @Override // dev.epro.r0.Z1784283759719197609
    public final void a(int i, byte[] bArr) {
        synchronized (this.b) {
            try {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.b.addElement(bArr2);
                this.b.notifyAll();
                if (this.b.size() > 5) {
                    this.c = true;
                    throw new IOException("Error, peer is flooding us with authentication packets.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.Z1784283759719197609
    public final void b(IOException iOException) {
        synchronized (this.b) {
            this.c = true;
            this.b.notifyAll();
        }
    }

    public final boolean c(String str, String str2) {
        T1177712003054613961 t1177712003054613961 = this.a;
        try {
            e(str);
            String[] strArr = this.e;
            if (strArr != null) {
                for (String str3 : strArr) {
                    if (str3.compareTo("password") == 0) {
                        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
                        t17032536773975598836.o(50);
                        t17032536773975598836.t(str);
                        t17032536773975598836.t("ssh-connection");
                        t17032536773975598836.t("password");
                        t17032536773975598836.n(false);
                        t17032536773975598836.t(str2);
                        t1177712003054613961.m(t17032536773975598836.f());
                        byte[] d = d();
                        byte b = d[0];
                        if (b == 52) {
                            f();
                            return true;
                        }
                        if (b != 51) {
                            throw new IOException("Unexpected SSH message (type " + ((int) b) + ")");
                        }
                        int length = d.length;
                        System.arraycopy(d, 0, new byte[length], 0, length);
                        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(d, length);
                        int b2 = c9142879380583651391.b();
                        if (b2 != 51) {
                            throw new IOException("This is not a SSH_MSG_USERAUTH_FAILURE! (" + b2 + ")");
                        }
                        String[] f = c9142879380583651391.f();
                        c9142879380583651391.a();
                        if (c9142879380583651391.j() != 0) {
                            throw new IOException("Padding in SSH_MSG_USERAUTH_FAILURE packet!");
                        }
                        this.e = f;
                        return false;
                    }
                }
            }
            throw new IOException("Authentication method password not supported by the server at this stage.");
        } catch (IOException e) {
            t1177712003054613961.b(e, false);
            Z3383101362411723454.q("Password authentication failed.", e);
            return false;
        }
    }

    public final byte[] d() {
        long currentTimeMillis;
        long currentTimeMillis2;
        byte[] bArr;
        Throwable th;
        while (true) {
            synchronized (this.b) {
                try {
                    currentTimeMillis = System.currentTimeMillis() + h;
                } catch (Throwable th2) {
                    throw th2;
                }
                for (currentTimeMillis2 = System.currentTimeMillis(); this.b.size() == 0 && currentTimeMillis2 < currentTimeMillis; currentTimeMillis2 = System.currentTimeMillis()) {
                    if (this.c) {
                        T1177712003054613961 t1177712003054613961 = this.a;
                        synchronized (t1177712003054613961.e) {
                            th = t1177712003054613961.g;
                        }
                        throw new IOException("The connection is closed.", th);
                    }
                    try {
                        this.b.wait(h);
                    } catch (InterruptedException e) {
                        throw new InterruptedIOException(e.getMessage());
                    }
                    throw th2;
                }
                if (this.b.size() == 0) {
                    throw new IOException("No valid packets after " + h + " milliseconds, you can increase the timeout by setting the property -D" + g + "=<MILLISECONDS>");
                }
                bArr = (byte[]) this.b.firstElement();
                this.b.removeElementAt(0);
            }
            if (bArr[0] != 53) {
                return bArr;
            }
            int length = bArr.length;
            System.arraycopy(bArr, 0, new byte[length], 0, length);
            C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr, length);
            int b = c9142879380583651391.b();
            if (b != 53) {
                Q11088980322693754445.h(G6547577305291411977.o(b, "This is not a SSH_MSG_USERAUTH_BANNER! (", ")"));
                return null;
            }
            String h2 = c9142879380583651391.h("UTF-8");
            c9142879380583651391.g();
            if (c9142879380583651391.j() != 0) {
                Q11088980322693754445.h("Padding in SSH_MSG_USERAUTH_REQUEST packet!");
                return null;
            }
            this.d.add(h2);
        }
    }

    public final void e(String str) {
        T1177712003054613961 t1177712003054613961 = this.a;
        if (this.f) {
            return;
        }
        t1177712003054613961.j(this, 0, 255);
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.o(5);
        t17032536773975598836.t("ssh-userauth");
        t1177712003054613961.m(t17032536773975598836.f());
        T17032536773975598836 t170325367739755988362 = new T17032536773975598836();
        t170325367739755988362.o(50);
        t170325367739755988362.t(str);
        t170325367739755988362.t("ssh-connection");
        t170325367739755988362.t("none");
        t1177712003054613961.m(t170325367739755988362.f());
        byte[] d = d();
        int length = d.length;
        System.arraycopy(d, 0, new byte[length], 0, length);
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(d, length);
        int b = c9142879380583651391.b();
        if (b != 6) {
            Q11088980322693754445.h(G6547577305291411977.o(b, "This is not a SSH_MSG_SERVICE_ACCEPT! (", ")"));
            return;
        }
        if (c9142879380583651391.j() > 0) {
            c9142879380583651391.g();
        }
        if (c9142879380583651391.j() != 0) {
            Q11088980322693754445.h("Padding in SSH_MSG_SERVICE_ACCEPT packet!");
            return;
        }
        byte[] d2 = d();
        this.f = true;
        byte b2 = d2[0];
        if (b2 == 52) {
            f();
            return;
        }
        if (b2 != 51) {
            Q11088980322693754445.h(G6547577305291411977.o(b2, "Unexpected SSH message (type ", ")"));
            return;
        }
        int length2 = d2.length;
        System.arraycopy(d2, 0, new byte[length2], 0, length2);
        C9142879380583651391 c91428793805836513912 = new C9142879380583651391(d2, length2);
        int b3 = c91428793805836513912.b();
        if (b3 != 51) {
            Q11088980322693754445.h(G6547577305291411977.o(b3, "This is not a SSH_MSG_USERAUTH_FAILURE! (", ")"));
            return;
        }
        String[] f = c91428793805836513912.f();
        c91428793805836513912.a();
        if (c91428793805836513912.j() == 0) {
            this.e = f;
        } else {
            Q11088980322693754445.h("Padding in SSH_MSG_USERAUTH_FAILURE packet!");
        }
    }

    public final void f() {
        T1177712003054613961 t1177712003054613961 = this.a;
        synchronized (t1177712003054613961.j) {
            int i = 0;
            while (true) {
                try {
                    if (i >= t1177712003054613961.j.size()) {
                        break;
                    }
                    M11333858610097094041 m11333858610097094041 = (M11333858610097094041) t1177712003054613961.j.elementAt(i);
                    if (m11333858610097094041.a == this && m11333858610097094041.b == 0 && m11333858610097094041.c == 255) {
                        t1177712003054613961.j.removeElementAt(i);
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        O3808217931002834139 o3808217931002834139 = this.a.h;
        o3808217931002834139.p = true;
        if (o3808217931002834139.n && o3808217931002834139.l == null) {
            o3808217931002834139.l = new J15730374346044043770(true);
        }
        if (o3808217931002834139.f406o && o3808217931002834139.m == null) {
            o3808217931002834139.m = new J15730374346044043770(false);
        }
    }
}

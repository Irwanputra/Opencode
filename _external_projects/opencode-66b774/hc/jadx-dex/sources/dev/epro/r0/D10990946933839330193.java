package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D10990946933839330193 implements dev.epro.r0.Z1784283759719197609 {
    public static final java.lang.String g;
    public static final long h;
    public dev.epro.r0.T1177712003054613961 a;
    public java.util.Vector b;
    public boolean c;
    public java.util.ArrayList d;
    public java.lang.String[] e;
    public boolean f;

    static {
        java.lang.String strConcat = dev.epro.r0.D10990946933839330193.class.getName().concat(".timeout");
        g = strConcat;
        h = java.lang.Long.parseLong(java.lang.System.getProperty(strConcat, "1200000"));
    }

    public final void a(int i, byte[] bArr) {
        synchronized (this.b) {
            try {
                byte[] bArr2 = new byte[i];
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
                this.b.addElement(bArr2);
                this.b.notifyAll();
                if (this.b.size() > 5) {
                    this.c = true;
                    throw new java.io.IOException("Error, peer is flooding us with authentication packets.");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b(java.io.IOException iOException) {
        synchronized (this.b) {
            this.c = true;
            this.b.notifyAll();
        }
    }

    public final boolean c(java.lang.String str, java.lang.String str2) {
        dev.epro.r0.T1177712003054613961 t1177712003054613961 = this.a;
        try {
            e(str);
            java.lang.String[] strArr = this.e;
            if (strArr != null) {
                for (java.lang.String str3 : strArr) {
                    if (str3.compareTo("password") == 0) {
                        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
                        t17032536773975598836.o(50);
                        t17032536773975598836.t(str);
                        t17032536773975598836.t("ssh-connection");
                        t17032536773975598836.t("password");
                        t17032536773975598836.n(false);
                        t17032536773975598836.t(str2);
                        t1177712003054613961.m(t17032536773975598836.f());
                        byte[] bArrD = d();
                        byte b = bArrD[0];
                        if (b == 52) {
                            f();
                            return true;
                        }
                        if (b != 51) {
                            throw new java.io.IOException("Unexpected SSH message (type " + ((int) b) + ")");
                        }
                        int length = bArrD.length;
                        java.lang.System.arraycopy(bArrD, 0, new byte[length], 0, length);
                        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArrD, length);
                        int iB = c9142879380583651391.b();
                        if (iB != 51) {
                            throw new java.io.IOException("This is not a SSH_MSG_USERAUTH_FAILURE! (" + iB + ")");
                        }
                        java.lang.String[] strArrF = c9142879380583651391.f();
                        c9142879380583651391.a();
                        if (c9142879380583651391.j() != 0) {
                            throw new java.io.IOException("Padding in SSH_MSG_USERAUTH_FAILURE packet!");
                        }
                        this.e = strArrF;
                        return false;
                    }
                }
            }
            throw new java.io.IOException("Authentication method password not supported by the server at this stage.");
        } catch (java.io.IOException e) {
            t1177712003054613961.b(e, false);
            dev.epro.r0.Z3383101362411723454.q("Password authentication failed.", e);
            return false;
        }
    }

    public final byte[] d() {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        byte[] bArr;
        java.lang.Throwable th;
        while (true) {
            synchronized (this.b) {
                try {
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis() + h;
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
                for (jCurrentTimeMillis2 = java.lang.System.currentTimeMillis(); this.b.size() == 0 && jCurrentTimeMillis2 < jCurrentTimeMillis; jCurrentTimeMillis2 = java.lang.System.currentTimeMillis()) {
                    if (this.c) {
                        dev.epro.r0.T1177712003054613961 t1177712003054613961 = this.a;
                        synchronized (t1177712003054613961.e) {
                            th = t1177712003054613961.g;
                        }
                        throw new java.io.IOException("The connection is closed.", th);
                    }
                    try {
                        this.b.wait(h);
                    } catch (java.lang.InterruptedException e) {
                        throw new java.io.InterruptedIOException(e.getMessage());
                    }
                    throw th2;
                }
                if (this.b.size() == 0) {
                    throw new java.io.IOException("No valid packets after " + h + " milliseconds, you can increase the timeout by setting the property -D" + g + "=<MILLISECONDS>");
                }
                bArr = (byte[]) this.b.firstElement();
                this.b.removeElementAt(0);
            }
            if (bArr[0] != 53) {
                return bArr;
            }
            int length = bArr.length;
            java.lang.System.arraycopy(bArr, 0, new byte[length], 0, length);
            dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr, length);
            int iB = c9142879380583651391.b();
            if (iB != 53) {
                dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.o(iB, "This is not a SSH_MSG_USERAUTH_BANNER! (", ")"));
                return null;
            }
            java.lang.String strH = c9142879380583651391.h("UTF-8");
            c9142879380583651391.g();
            if (c9142879380583651391.j() != 0) {
                dev.epro.r0.Q11088980322693754445.h("Padding in SSH_MSG_USERAUTH_REQUEST packet!");
                return null;
            }
            this.d.add(strH);
        }
    }

    public final void e(java.lang.String str) {
        dev.epro.r0.T1177712003054613961 t1177712003054613961 = this.a;
        if (this.f) {
            return;
        }
        t1177712003054613961.j(this, 0, 255);
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.o(5);
        t17032536773975598836.t("ssh-userauth");
        t1177712003054613961.m(t17032536773975598836.f());
        dev.epro.r0.T17032536773975598836 t170325367739755988362 = new dev.epro.r0.T17032536773975598836();
        t170325367739755988362.o(50);
        t170325367739755988362.t(str);
        t170325367739755988362.t("ssh-connection");
        t170325367739755988362.t("none");
        t1177712003054613961.m(t170325367739755988362.f());
        byte[] bArrD = d();
        int length = bArrD.length;
        java.lang.System.arraycopy(bArrD, 0, new byte[length], 0, length);
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArrD, length);
        int iB = c9142879380583651391.b();
        if (iB != 6) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.o(iB, "This is not a SSH_MSG_SERVICE_ACCEPT! (", ")"));
            return;
        }
        if (c9142879380583651391.j() > 0) {
            c9142879380583651391.g();
        }
        if (c9142879380583651391.j() != 0) {
            dev.epro.r0.Q11088980322693754445.h("Padding in SSH_MSG_SERVICE_ACCEPT packet!");
            return;
        }
        byte[] bArrD2 = d();
        this.f = true;
        byte b = bArrD2[0];
        if (b == 52) {
            f();
            return;
        }
        if (b != 51) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.o(b, "Unexpected SSH message (type ", ")"));
            return;
        }
        int length2 = bArrD2.length;
        java.lang.System.arraycopy(bArrD2, 0, new byte[length2], 0, length2);
        dev.epro.r0.C9142879380583651391 c91428793805836513912 = new dev.epro.r0.C9142879380583651391(bArrD2, length2);
        int iB2 = c91428793805836513912.b();
        if (iB2 != 51) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.o(iB2, "This is not a SSH_MSG_USERAUTH_FAILURE! (", ")"));
            return;
        }
        java.lang.String[] strArrF = c91428793805836513912.f();
        c91428793805836513912.a();
        if (c91428793805836513912.j() == 0) {
            this.e = strArrF;
        } else {
            dev.epro.r0.Q11088980322693754445.h("Padding in SSH_MSG_USERAUTH_FAILURE packet!");
        }
    }

    public final void f() {
        dev.epro.r0.T1177712003054613961 t1177712003054613961 = this.a;
        synchronized (t1177712003054613961.j) {
            int i = 0;
            while (true) {
                try {
                    if (i >= t1177712003054613961.j.size()) {
                        break;
                    }
                    dev.epro.r0.M11333858610097094041 m11333858610097094041 = (dev.epro.r0.M11333858610097094041) t1177712003054613961.j.elementAt(i);
                    if (m11333858610097094041.a == this && m11333858610097094041.b == 0 && m11333858610097094041.c == 255) {
                        t1177712003054613961.j.removeElementAt(i);
                        break;
                    }
                    i++;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        dev.epro.r0.O3808217931002834139 o3808217931002834139 = this.a.h;
        o3808217931002834139.p = true;
        if (o3808217931002834139.n && o3808217931002834139.l == null) {
            o3808217931002834139.l = new dev.epro.r0.J15730374346044043770(true);
        }
        if (o3808217931002834139.o && o3808217931002834139.m == null) {
            o3808217931002834139.m = new dev.epro.r0.J15730374346044043770(false);
        }
    }
}

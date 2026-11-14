package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.Vector;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I13897573759869141187 implements Z1784283759719197609 {
    public static final long k = Long.parseLong(System.getProperty(I13897573759869141187.class.getName().concat(".timeout"), "1200000"));
    public final T1177712003054613961 b;
    public final HashMap a = new HashMap();
    public final Vector c = new Vector();
    public int d = 100;
    public boolean e = false;
    public int f = 0;
    public int g = 0;
    public final HashMap h = new HashMap();
    public final Vector i = new Vector();
    public boolean j = true;

    public I13897573759869141187(T1177712003054613961 t1177712003054613961) {
        this.b = t1177712003054613961;
        t1177712003054613961.j(this, 80, 100);
    }

    public static IOException f(C16667689525325095505 c16667689525325095505, String str) {
        Throwable th;
        IOException iOException = new IOException(str);
        synchronized (c16667689525325095505.q) {
            th = c16667689525325095505.r;
        }
        return (IOException) iOException.initCause(th);
    }

    @Override // dev.epro.r0.Z1784283759719197609
    public final void a(int i, byte[] bArr) throws IOException {
        byte b = bArr[0];
        switch (b) {
            case 80:
                C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr, i);
                c9142879380583651391.b();
                c9142879380583651391.g();
                if (c9142879380583651391.a()) {
                    this.b.k(new byte[]{82});
                    return;
                }
                return;
            case 81:
                n();
                return;
            case 82:
                m();
                return;
            default:
                switch (b) {
                    case 90:
                        i(i, bArr);
                        return;
                    case 91:
                        j(i, bArr);
                        return;
                    case pd.N0 /* 92 */:
                        k(i, bArr);
                        return;
                    case pd.O0 /* 93 */:
                        l(i, bArr);
                        return;
                    case pd.P0 /* 94 */:
                        g(i, bArr);
                        return;
                    case pd.p0 /* 95 */:
                        h(i, bArr);
                        return;
                    case pd.A0 /* 96 */:
                        if (i != 5) {
                            Q11088980322693754445.h(G6547577305291411977.o(i, "SSH_MSG_CHANNEL_EOF message has wrong size (", ")"));
                            return;
                        }
                        int i2 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
                        C16667689525325095505 c16667689525325095505E = e(i2);
                        if (c16667689525325095505E != null) {
                            c16667689525325095505E.a();
                            return;
                        } else {
                            Q11088980322693754445.h(G6547577305291411977.n(i2, "Unexpected SSH_MSG_CHANNEL_EOF message for non-existent channel "));
                            return;
                        }
                    case pd.H0 /* 97 */:
                        if (i != 5) {
                            Q11088980322693754445.h(G6547577305291411977.o(i, "SSH_MSG_CHANNEL_CLOSE message has wrong size (", ")"));
                            return;
                        }
                        int i3 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
                        C16667689525325095505 c16667689525325095505E2 = e(i3);
                        if (c16667689525325095505E2 == null) {
                            Q11088980322693754445.h(G6547577305291411977.n(i3, "Unexpected SSH_MSG_CHANNEL_CLOSE message for non-existent channel "));
                            return;
                        }
                        synchronized (c16667689525325095505E2) {
                            c16667689525325095505E2.a();
                            c16667689525325095505E2.k = (byte) 4;
                            IOException iOException = new IOException("Close requested by remote");
                            synchronized (c16667689525325095505E2.q) {
                                try {
                                    if (c16667689525325095505E2.r == null) {
                                        c16667689525325095505E2.r = iOException;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            p(c16667689525325095505E2.f);
                            c16667689525325095505E2.notifyAll();
                        }
                        return;
                    case pd.Q0 /* 98 */:
                        C9142879380583651391 c91428793805836513912 = new C9142879380583651391(bArr, i);
                        c91428793805836513912.b();
                        int i4 = c91428793805836513912.i();
                        C16667689525325095505 c16667689525325095505E3 = e(i4);
                        if (c16667689525325095505E3 == null) {
                            Q11088980322693754445.h(G6547577305291411977.n(i4, "Unexpected SSH_MSG_CHANNEL_REQUEST message for non-existent channel "));
                            return;
                        }
                        String strH = c91428793805836513912.h("US-ASCII");
                        boolean zA = c91428793805836513912.a();
                        if (strH.equals("exit-status")) {
                            if (zA) {
                                Q11088980322693754445.h("Badly formatted SSH_MSG_CHANNEL_REQUEST message, 'want reply' is true");
                                return;
                            }
                            int i5 = c91428793805836513912.i();
                            if (c91428793805836513912.j() != 0) {
                                Q11088980322693754445.h("Badly formatted SSH_MSG_CHANNEL_REQUEST message");
                                return;
                            }
                            synchronized (c16667689525325095505E3) {
                                new Integer(i5);
                                c16667689525325095505E3.notifyAll();
                                break;
                            }
                            return;
                        }
                        if (!strH.equals("exit-signal")) {
                            if (zA) {
                                int i6 = c16667689525325095505E3.g;
                                this.b.k(new byte[]{100, (byte) (i6 >> 24), (byte) (i6 >> 16), (byte) (i6 >> 8), (byte) i6});
                                return;
                            }
                            return;
                        }
                        if (zA) {
                            Q11088980322693754445.h("Badly formatted SSH_MSG_CHANNEL_REQUEST message, 'want reply' is true");
                            return;
                        }
                        c91428793805836513912.h("US-ASCII");
                        c91428793805836513912.a();
                        c91428793805836513912.g();
                        c91428793805836513912.g();
                        if (c91428793805836513912.j() != 0) {
                            Q11088980322693754445.h("Badly formatted SSH_MSG_CHANNEL_REQUEST message");
                            return;
                        }
                        synchronized (c16667689525325095505E3) {
                            c16667689525325095505E3.notifyAll();
                            break;
                        }
                        return;
                    case 99:
                        if (i != 5) {
                            Q11088980322693754445.h(G6547577305291411977.o(i, "SSH_MSG_CHANNEL_SUCCESS message has wrong size (", ")"));
                            return;
                        }
                        int i7 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
                        C16667689525325095505 c16667689525325095505E4 = e(i7);
                        if (c16667689525325095505E4 == null) {
                            Q11088980322693754445.h(G6547577305291411977.n(i7, "Unexpected SSH_MSG_CHANNEL_SUCCESS message for non-existent channel "));
                            return;
                        }
                        synchronized (c16667689525325095505E4) {
                            c16667689525325095505E4.notifyAll();
                            break;
                        }
                        return;
                    case 100:
                        if (i != 5) {
                            Q11088980322693754445.h(G6547577305291411977.o(i, "SSH_MSG_CHANNEL_FAILURE message has wrong size (", ")"));
                            return;
                        }
                        int i8 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
                        C16667689525325095505 c16667689525325095505E5 = e(i8);
                        if (c16667689525325095505E5 == null) {
                            Q11088980322693754445.h(G6547577305291411977.n(i8, "Unexpected SSH_MSG_CHANNEL_FAILURE message for non-existent channel "));
                            return;
                        }
                        synchronized (c16667689525325095505E5) {
                            c16667689525325095505E5.notifyAll();
                            break;
                        }
                        return;
                    default:
                        Q11088980322693754445.h(G6547577305291411977.n(b & 255, "Cannot handle unknown channel message "));
                        return;
                }
        }
    }

    @Override // dev.epro.r0.Z1784283759719197609
    public final void b(IOException iOException) {
        synchronized (this.i) {
            for (int i = 0; i < this.i.size(); i++) {
                try {
                    ((J16818366091903755451) this.i.elementAt(i)).c();
                } finally {
                }
            }
            this.j = false;
        }
        synchronized (this.c) {
            try {
                this.e = true;
                int i2 = 0;
                while (true) {
                    int size = this.c.size();
                    Vector vector = this.c;
                    if (i2 < size) {
                        C16667689525325095505 c16667689525325095505 = (C16667689525325095505) vector.elementAt(i2);
                        synchronized (c16667689525325095505) {
                            c16667689525325095505.a();
                            c16667689525325095505.k = (byte) 4;
                            Throwable thInitCause = new IOException("The connection is being shutdown").initCause(iOException);
                            synchronized (c16667689525325095505.q) {
                                try {
                                    if (c16667689525325095505.r == null) {
                                        c16667689525325095505.r = thInitCause;
                                    }
                                } finally {
                                }
                            }
                            c16667689525325095505.notifyAll();
                        }
                        i2++;
                    } else {
                        vector.setSize(0);
                        this.c.trimToSize();
                        this.c.notifyAll();
                    }
                }
            } finally {
            }
        }
    }

    public final int c(C16667689525325095505 c16667689525325095505) {
        int i;
        synchronized (this.c) {
            this.c.addElement(c16667689525325095505);
            i = this.d;
            this.d = i + 1;
        }
        return i;
    }

    public final void d(C16667689525325095505 c16667689525325095505, String str) {
        byte[] bArr = new byte[5];
        synchronized (c16667689525325095505) {
            c16667689525325095505.k = (byte) 4;
            c16667689525325095505.a();
            IOException iOException = new IOException(str);
            synchronized (c16667689525325095505.q) {
                try {
                    if (c16667689525325095505.r == null) {
                        c16667689525325095505.r = iOException;
                    }
                } finally {
                }
            }
            bArr[0] = 97;
            int i = c16667689525325095505.g;
            bArr[1] = (byte) (i >> 24);
            bArr[2] = (byte) (i >> 16);
            bArr[3] = (byte) (i >> 8);
            bArr[4] = (byte) i;
            c16667689525325095505.notifyAll();
        }
        synchronized (c16667689525325095505.h) {
            try {
                if (c16667689525325095505.i) {
                    return;
                }
                this.b.m(bArr);
                c16667689525325095505.i = true;
            } finally {
            }
        }
    }

    public final C16667689525325095505 e(int i) {
        synchronized (this.c) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                try {
                    C16667689525325095505 c16667689525325095505 = (C16667689525325095505) this.c.elementAt(i2);
                    if (c16667689525325095505.f == i) {
                        return c16667689525325095505;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    public final void g(int i, byte[] bArr) throws IOException {
        if (i <= 9) {
            Q11088980322693754445.h(G6547577305291411977.o(i, "SSH_MSG_CHANNEL_DATA message has wrong size (", ")"));
            return;
        }
        int i2 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
        int i3 = (bArr[8] & 255) | ((bArr[5] & 255) << 24) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 8);
        C16667689525325095505 c16667689525325095505E = e(i2);
        if (c16667689525325095505E == null) {
            Q11088980322693754445.h(G6547577305291411977.n(i2, "Unexpected SSH_MSG_CHANNEL_DATA message for non-existent channel "));
            return;
        }
        int i4 = i - 9;
        if (i3 != i4) {
            Q11088980322693754445.h(G11450220448113054352.h(i4, i3, "SSH_MSG_CHANNEL_DATA message has wrong len (calculated ", ", got ", ")"));
            return;
        }
        synchronized (c16667689525325095505E) {
            try {
                byte b = c16667689525325095505E.k;
                if (b == 4) {
                    return;
                }
                if (b != 2) {
                    throw new IOException("Got SSH_MSG_CHANNEL_DATA, but channel is not in correct state (" + ((int) b) + ")");
                }
                int i5 = c16667689525325095505E.l;
                if (i5 < i3) {
                    throw new IOException("Remote sent too much data, does not fit into window.");
                }
                c16667689525325095505E.l = i5 - i3;
                try {
                    ((R11747310517775341069) c16667689525325095505E.d.c).b(bArr, 9, i3);
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(int i, byte[] bArr) throws IOException {
        if (i <= 13) {
            Q11088980322693754445.h(G6547577305291411977.o(i, "SSH_MSG_CHANNEL_EXTENDED_DATA message has wrong size (", ")"));
            return;
        }
        int i2 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
        int i3 = ((bArr[5] & 255) << 24) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 8) | (bArr[8] & 255);
        int i4 = ((bArr[11] & 255) << 8) | ((bArr[9] & 255) << 24) | ((bArr[10] & 255) << 16) | (bArr[12] & 255);
        C16667689525325095505 c16667689525325095505E = e(i2);
        if (c16667689525325095505E == null) {
            Q11088980322693754445.h(G6547577305291411977.n(i2, "Unexpected SSH_MSG_CHANNEL_EXTENDED_DATA message for non-existent channel "));
            return;
        }
        if (i3 != 1) {
            Q11088980322693754445.h(G6547577305291411977.o(i3, "SSH_MSG_CHANNEL_EXTENDED_DATA message has unknown type (", ")"));
            return;
        }
        int i5 = i - 13;
        if (i4 != i5) {
            Q11088980322693754445.h(G11450220448113054352.h(i5, i4, "SSH_MSG_CHANNEL_EXTENDED_DATA message has wrong len (calculated ", ", got ", ")"));
            return;
        }
        synchronized (c16667689525325095505E) {
            try {
                byte b = c16667689525325095505E.k;
                if (b == 4) {
                    return;
                }
                if (b != 2) {
                    throw new IOException("Got SSH_MSG_CHANNEL_EXTENDED_DATA, but channel is not in correct state (" + ((int) b) + ")");
                }
                int i6 = c16667689525325095505E.l;
                if (i6 < i4) {
                    throw new IOException("Remote sent too much data, does not fit into window.");
                }
                c16667689525325095505E.l = i6 - i4;
                try {
                    ((R11747310517775341069) c16667689525325095505E.e.c).b(bArr, 13, i4);
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(int i, byte[] bArr) {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr, i);
        c9142879380583651391.b();
        String strG = c9142879380583651391.g();
        int i2 = c9142879380583651391.i();
        int i3 = c9142879380583651391.i();
        int i4 = c9142879380583651391.i();
        if ("x11".equals(strG)) {
            synchronized (this.a) {
                try {
                    if (this.a.size() == 0) {
                        T1177712003054613961 t1177712003054613961 = this.b;
                        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
                        t17032536773975598836.o(92);
                        t17032536773975598836.u(i2);
                        t17032536773975598836.u(1);
                        t17032536773975598836.t("X11 forwarding not activated");
                        t17032536773975598836.t("");
                        t1177712003054613961.k(t17032536773975598836.f());
                        return;
                    }
                    c9142879380583651391.g();
                    c9142879380583651391.i();
                    C16667689525325095505 c16667689525325095505 = new C16667689525325095505(this);
                    synchronized (c16667689525325095505) {
                        c16667689525325095505.g = i2;
                        c16667689525325095505.m = ((long) i3) & 4294967295L;
                        c16667689525325095505.f184o = i4;
                        c16667689525325095505.f = c(c16667689525325095505);
                    }
                    G11761139737416873721 g11761139737416873721 = new G11761139737416873721();
                    g11761139737416873721.a = c16667689525325095505;
                    g11761139737416873721.setDaemon(true);
                    g11761139737416873721.start();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!"forwarded-tcpip".equals(strG)) {
            T1177712003054613961 t11777120030546139612 = this.b;
            T17032536773975598836 t170325367739755988362 = new T17032536773975598836();
            t170325367739755988362.o(92);
            t170325367739755988362.u(i2);
            t170325367739755988362.u(3);
            t170325367739755988362.t("Unknown channel type");
            t170325367739755988362.t("");
            t11777120030546139612.k(t170325367739755988362.f());
            return;
        }
        c9142879380583651391.g();
        int i5 = c9142879380583651391.i();
        c9142879380583651391.g();
        c9142879380583651391.i();
        synchronized (this.h) {
            if (this.h.get(new Integer(i5)) != null) {
                throw new ClassCastException();
            }
        }
        T1177712003054613961 t11777120030546139613 = this.b;
        T17032536773975598836 t170325367739755988363 = new T17032536773975598836();
        t170325367739755988363.o(92);
        t170325367739755988363.u(i2);
        t170325367739755988363.u(1);
        t170325367739755988363.t("No thanks, unknown port in forwarded-tcpip request");
        t170325367739755988363.t("");
        t11777120030546139613.k(t170325367739755988363.f());
    }

    public final void j(int i, byte[] bArr) throws IOException {
        System.arraycopy(bArr, 0, new byte[i], 0, i);
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr, i);
        int iB = c9142879380583651391.b();
        if (iB != 91) {
            Q11088980322693754445.h(G6547577305291411977.o(iB, "This is not a SSH_MSG_CHANNEL_OPEN_CONFIRMATION! (", ")"));
            return;
        }
        int i2 = c9142879380583651391.i();
        int i3 = c9142879380583651391.i();
        int i4 = c9142879380583651391.i();
        int i5 = c9142879380583651391.i();
        if (c9142879380583651391.j() != 0) {
            Q11088980322693754445.h("Padding in SSH_MSG_CHANNEL_OPEN_CONFIRMATION packet!");
            return;
        }
        C16667689525325095505 c16667689525325095505E = e(i2);
        if (c16667689525325095505E == null) {
            Q11088980322693754445.h(G6547577305291411977.n(i2, "Unexpected SSH_MSG_CHANNEL_OPEN_CONFIRMATION message for non-existent channel "));
            return;
        }
        synchronized (c16667689525325095505E) {
            try {
                if (c16667689525325095505E.k != 1) {
                    throw new IOException("Unexpected SSH_MSG_CHANNEL_OPEN_CONFIRMATION message for channel " + i2);
                }
                c16667689525325095505E.g = i3;
                c16667689525325095505E.m = ((long) i4) & 4294967295L;
                c16667689525325095505E.f184o = i5;
                c16667689525325095505E.k = (byte) 2;
                c16667689525325095505E.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(int i, byte[] bArr) throws IOException {
        if (i < 5) {
            Q11088980322693754445.h(G6547577305291411977.o(i, "SSH_MSG_CHANNEL_OPEN_FAILURE message has wrong size (", ")"));
            return;
        }
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr, i);
        c9142879380583651391.b();
        int i2 = c9142879380583651391.i();
        C16667689525325095505 c16667689525325095505E = e(i2);
        if (c16667689525325095505E == null) {
            Q11088980322693754445.h(G6547577305291411977.n(i2, "Unexpected SSH_MSG_CHANNEL_OPEN_FAILURE message for non-existent channel "));
            return;
        }
        int i3 = c9142879380583651391.i();
        String strH = c9142879380583651391.h("UTF-8");
        String strO = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? G6547577305291411977.o(i3, "UNKNOWN REASON CODE (", ")") : "SSH_OPEN_RESOURCE_SHORTAGE" : "SSH_OPEN_UNKNOWN_CHANNEL_TYPE" : "SSH_OPEN_CONNECT_FAILED" : "SSH_OPEN_ADMINISTRATIVELY_PROHIBITED";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strH);
        for (int i4 = 0; i4 < stringBuffer.length(); i4++) {
            char cCharAt = stringBuffer.charAt(i4);
            if (cCharAt < ' ' || cCharAt > '~') {
                stringBuffer.setCharAt(i4, (char) 65533);
            }
        }
        synchronized (c16667689525325095505E) {
            c16667689525325095505E.a();
            c16667689525325095505E.k = (byte) 4;
            IOException iOException = new IOException("The server refused to open the channel (" + strO + ", '" + stringBuffer.toString() + "')");
            synchronized (c16667689525325095505E.q) {
                try {
                    if (c16667689525325095505E.r == null) {
                        c16667689525325095505E.r = iOException;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c16667689525325095505E.notifyAll();
        }
    }

    public final void l(int i, byte[] bArr) throws IOException {
        if (i != 9) {
            Q11088980322693754445.h(G6547577305291411977.o(i, "SSH_MSG_CHANNEL_WINDOW_ADJUST message has wrong size (", ")"));
            return;
        }
        int i2 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
        int i3 = (bArr[8] & 255) | ((bArr[5] & 255) << 24) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 8);
        C16667689525325095505 c16667689525325095505E = e(i2);
        if (c16667689525325095505E == null) {
            Q11088980322693754445.h(G6547577305291411977.n(i2, "Unexpected SSH_MSG_CHANNEL_WINDOW_ADJUST message for non-existent channel "));
            return;
        }
        synchronized (c16667689525325095505E) {
            try {
                long j = c16667689525325095505E.m + (((long) i3) & 4294967295L);
                c16667689525325095505E.m = j;
                if (j > 4294967295L) {
                    c16667689525325095505E.m = 4294967295L;
                }
                c16667689525325095505E.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        synchronized (this.c) {
            this.g++;
            this.c.notifyAll();
        }
    }

    public final void n() {
        synchronized (this.c) {
            this.f++;
            this.c.notifyAll();
        }
    }

    public final C16667689525325095505 o(int i, String str) throws IOException {
        int iC;
        byte b;
        C16667689525325095505 c16667689525325095505 = new C16667689525325095505(this);
        synchronized (c16667689525325095505) {
            iC = c(c16667689525325095505);
            c16667689525325095505.f = iC;
        }
        int i2 = c16667689525325095505.l;
        int i3 = c16667689525325095505.n;
        T1177712003054613961 t1177712003054613961 = this.b;
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.o(90);
        t17032536773975598836.t("direct-tcpip");
        t17032536773975598836.u(iC);
        t17032536773975598836.u(i2);
        t17032536773975598836.u(i3);
        t17032536773975598836.t(str);
        t17032536773975598836.u(i);
        t17032536773975598836.t("127.0.0.1");
        t17032536773975598836.u(0);
        t1177712003054613961.m(t17032536773975598836.f());
        synchronized (c16667689525325095505) {
            while (true) {
                b = c16667689525325095505.k;
                if (b != 1) {
                    break;
                }
                try {
                    c16667689525325095505.wait(k);
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                }
            }
            if (b != 2) {
                p(c16667689525325095505.f);
                throw f(c16667689525325095505, "Could not open channel (state:" + ((int) c16667689525325095505.k) + ")");
            }
        }
        return c16667689525325095505;
    }

    public final void p(int i) {
        synchronized (this.c) {
            int i2 = 0;
            while (true) {
                try {
                    if (i2 >= this.c.size()) {
                        break;
                    }
                    if (((C16667689525325095505) this.c.elementAt(i2)).f == i) {
                        this.c.removeElementAt(i2);
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void q() throws IOException {
        synchronized (this.c) {
            this.g = 0;
            this.f = 0;
        }
        T1177712003054613961 t1177712003054613961 = this.b;
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.o(80);
        t17032536773975598836.t("trilead-ping");
        t17032536773975598836.n(true);
        t1177712003054613961.m(t17032536773975598836.f());
        try {
            if (!s()) {
            } else {
                throw new IOException("Your server is alive - but buggy. It replied with SSH_MSG_REQUEST_SUCCESS when it actually should not.");
            }
        } catch (IOException e) {
            throw ((IOException) new IOException("The ping request failed.").initCause(e));
        }
    }

    public final void r(C16667689525325095505 c16667689525325095505) {
        synchronized (c16667689525325095505) {
            try {
                if (c16667689525325095505.k != 1) {
                    return;
                }
                c16667689525325095505.k = (byte) 2;
                int i = c16667689525325095505.g;
                int i2 = c16667689525325095505.f;
                int i3 = c16667689525325095505.l;
                int i4 = c16667689525325095505.n;
                synchronized (c16667689525325095505.h) {
                    try {
                        if (c16667689525325095505.i) {
                            return;
                        }
                        T1177712003054613961 t1177712003054613961 = this.b;
                        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
                        t17032536773975598836.o(91);
                        t17032536773975598836.u(i);
                        t17032536773975598836.u(i2);
                        t17032536773975598836.u(i3);
                        t17032536773975598836.u(i4);
                        t1177712003054613961.m(t17032536773975598836.f());
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        r5 = r5.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r5 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r1 != 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r5 != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        if (r1 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        throw new java.io.IOException("Illegal state. The server sent " + r1 + " SSH_MSG_REQUEST_SUCCESS and " + r5 + " SSH_MSG_REQUEST_FAILURE messages.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            r5 = this;
            java.util.Vector r0 = r5.c
            monitor-enter(r0)
        L3:
            int r1 = r5.f     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L27
            int r2 = r5.g     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L27
            boolean r1 = r5.e     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L1f
            java.util.Vector r1 = r5.c     // Catch: java.lang.Throwable -> L17 java.lang.InterruptedException -> L19
            long r2 = dev.epro.r0.I13897573759869141187.k     // Catch: java.lang.Throwable -> L17 java.lang.InterruptedException -> L19
            r1.wait(r2)     // Catch: java.lang.Throwable -> L17 java.lang.InterruptedException -> L19
            goto L3
        L17:
            r5 = move-exception
            goto L5b
        L19:
            java.io.InterruptedIOException r5 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L17
            r5.<init>()     // Catch: java.lang.Throwable -> L17
            throw r5     // Catch: java.lang.Throwable -> L17
        L1f:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "The connection is being shutdown"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L17
            throw r5     // Catch: java.lang.Throwable -> L17
        L27:
            int r5 = r5.g     // Catch: java.lang.Throwable -> L17
            r2 = 1
            if (r5 != 0) goto L30
            if (r1 != r2) goto L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r2
        L30:
            if (r5 != r2) goto L37
            if (r1 != 0) goto L37
            r5 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r5
        L37:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r3.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = "Illegal state. The server sent "
            r3.append(r4)     // Catch: java.lang.Throwable -> L17
            r3.append(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = " SSH_MSG_REQUEST_SUCCESS and "
            r3.append(r1)     // Catch: java.lang.Throwable -> L17
            r3.append(r5)     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = " SSH_MSG_REQUEST_FAILURE messages."
            r3.append(r5)     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L17
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L17
            throw r2     // Catch: java.lang.Throwable -> L17
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I13897573759869141187.s():boolean");
    }
}

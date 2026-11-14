package dev.epro.r0;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.zetetic.database.CursorWindow;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R13387896995173874905 implements Closeable {
    public final L673873344574563461 a;
    public final P5176232750190581838 b;
    public int c;
    public boolean d;
    public final G4640088786804747587 e;

    static {
        Logger.getLogger(K15662838989169835869.class.getName());
    }

    public R13387896995173874905(L673873344574563461 l673873344574563461) {
        this.a = l673873344574563461;
        P5176232750190581838 p5176232750190581838 = new P5176232750190581838();
        this.b = p5176232750190581838;
        this.c = CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
        this.e = new G4640088786804747587(p5176232750190581838);
    }

    public final void b(P15116306960523597113 p15116306960523597113) {
        p15116306960523597113.getClass();
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                int i = this.c;
                int i2 = p15116306960523597113.a;
                if ((i2 & 32) != 0) {
                    i = p15116306960523597113.b[5];
                }
                this.c = i;
                if (((i2 & 2) != 0 ? p15116306960523597113.b[1] : -1) != -1) {
                    G4640088786804747587 g4640088786804747587 = this.e;
                    int min = Math.min((i2 & 2) != 0 ? p15116306960523597113.b[1] : -1, CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE);
                    int i3 = g4640088786804747587.d;
                    if (i3 != min) {
                        if (min < i3) {
                            g4640088786804747587.b = Math.min(g4640088786804747587.b, min);
                        }
                        g4640088786804747587.c = true;
                        g4640088786804747587.d = min;
                        int i4 = g4640088786804747587.h;
                        if (min < i4) {
                            if (min == 0) {
                                O12229768880637238015[] o12229768880637238015Arr = g4640088786804747587.e;
                                O5378677881740157249.x0(0, o12229768880637238015Arr.length, null, o12229768880637238015Arr);
                                g4640088786804747587.f = g4640088786804747587.e.length - 1;
                                g4640088786804747587.g = 0;
                                g4640088786804747587.h = 0;
                            } else {
                                g4640088786804747587.a(i4 - min);
                            }
                        }
                    }
                }
                d(0, 0, 4, 1);
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z, int i, P5176232750190581838 p5176232750190581838, int i2) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            d(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                L673873344574563461 l673873344574563461 = this.a;
                p5176232750190581838.getClass();
                l673873344574563461.y(p5176232750190581838, i2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.d = true;
            this.a.close();
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
        }
        if (i2 > this.c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            S10973172697741180971.i(G6547577305291411977.n(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = L14928198200995638215.a;
        L673873344574563461 l673873344574563461 = this.a;
        l673873344574563461.c((i2 >>> 16) & 255);
        l673873344574563461.c((i2 >>> 8) & 255);
        l673873344574563461.c(i2 & 255);
        l673873344574563461.c(i3 & 255);
        l673873344574563461.c(i4 & 255);
        l673873344574563461.d(i & Integer.MAX_VALUE);
    }

    public final void e(int i, N10274084507843431211 n10274084507843431211, byte[] bArr) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (n10274084507843431211.a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            d(0, bArr.length + 8, 7, 0);
            this.a.d(i);
            this.a.d(n10274084507843431211.a);
            if (bArr.length != 0) {
                L673873344574563461 l673873344574563461 = this.a;
                if (l673873344574563461.c) {
                    throw new IllegalStateException("closed");
                }
                l673873344574563461.b.A(bArr.length, bArr);
                l673873344574563461.b();
            }
            this.a.flush();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.a.flush();
        }
    }

    public final void g(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.e.d(arrayList);
            long j = this.b.b;
            long min = Math.min(this.c, j);
            int i2 = j == min ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            d(i, (int) min, 1, i2);
            this.a.y(this.b, min);
            if (j > min) {
                long j2 = j - min;
                while (j2 > 0) {
                    long min2 = Math.min(this.c, j2);
                    j2 -= min2;
                    d(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                    this.a.y(this.b, min2);
                }
            }
        }
    }

    public final void h(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            d(0, 8, 6, z ? 1 : 0);
            this.a.d(i);
            this.a.d(i2);
            this.a.flush();
        }
    }

    public final void j(int i, N10274084507843431211 n10274084507843431211) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (n10274084507843431211.a == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            d(i, 4, 3, 0);
            this.a.d(n10274084507843431211.a);
            this.a.flush();
        }
    }

    public final void o(int i, long j) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
            Level level = Level.FINE;
            d(i, 4, 8, 0);
            this.a.d((int) j);
            this.a.flush();
        }
    }
}

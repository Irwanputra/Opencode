package dev.epro.r0;

import android.net.TrafficStats;
import android.os.Trace;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z11821137052809198413 extends ExperimentalUrlRequest {
    public static final /* synthetic */ int z = 0;
    public final R9704326227384281667 a;
    public final J3436373395468761580 b;
    public final String c;
    public final TreeMap d;
    public final ArrayList e;
    public final AtomicInteger f;
    public final AtomicBoolean g;
    public final boolean h;
    public final String i;
    public final P15983149023236604271 j;
    public final Executor k;
    public volatile int l;
    public String m;
    public ReadableByteChannel n;

    /* renamed from: o, reason: collision with root package name */
    public N12175049621887677679 f598o;
    public String p;
    public HttpURLConnection q;
    public W7359389094007644644 r;
    public final H1871339784523733955 s;
    public final int t;
    public final O4077903568229246 u;
    public final long v;
    public int w;
    public int x;
    public boolean y;

    public Z11821137052809198413(H1871339784523733955 h1871339784523733955, UrlRequest.Callback callback, ThreadPoolExecutor threadPoolExecutor, Executor executor, String str, String str2, boolean z2, boolean z3, int i, boolean z4, int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2) {
        P15983149023236604271 p15983149023236604271;
        Executor executor3;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.d = treeMap;
        this.e = new ArrayList();
        this.f = new AtomicInteger(0);
        this.g = new AtomicBoolean(false);
        this.l = -1;
        U1748733558996603759.b("Cronet JavaUrlRequest#JavaUrlRequest");
        try {
            Objects.requireNonNull(str, "URL is required");
            Objects.requireNonNull(callback, "Listener is required");
            Objects.requireNonNull(threadPoolExecutor, "Executor is required");
            Objects.requireNonNull(executor, "userExecutor is required");
            this.h = z2;
            this.a = new R9704326227384281667(this, callback, executor);
            this.b = new J3436373395468761580(new L9204765506114502171(threadPoolExecutor, z3 ? i : TrafficStats.getThreadStatsTag(), z4, i2));
            this.s = h1871339784523733955;
            this.t = h1871339784523733955.c;
            this.u = h1871339784523733955.d;
            this.m = str;
            this.c = str2;
            this.v = j;
            a(str3);
            this.i = str3;
            e(arrayList);
            if (uploadDataProvider == null) {
                p15983149023236604271 = null;
            } else {
                if (!treeMap.containsKey("Content-Type")) {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                p15983149023236604271 = new P15983149023236604271(uploadDataProvider, (byte) 1);
            }
            this.j = p15983149023236604271;
            if (executor2 != null && !z2) {
                executor3 = new Q15119607593561432156(executor2, (byte) 0);
                this.k = executor3;
                Trace.endSection();
            }
            executor3 = executor2;
            this.k = executor3;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static void a(String str) {
        Objects.requireNonNull(str, "Method is required.");
        if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || "DELETE".equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
            return;
        }
        S10973172697741180971.j("Invalid http method ".concat(str));
    }

    public final void b(CronetException cronetException) {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f;
            i = atomicInteger.get();
            if (i == 0) {
                S10973172697741180971.m("Can't enter error state before start");
                return;
            } else if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 6));
        c(new G15717426683772243395(this, (byte) 2), "fireDisconnect");
        d();
        N12175049621887677679 n12175049621887677679 = this.f598o;
        R9704326227384281667 r9704326227384281667 = this.a;
        Executor executor = r9704326227384281667.c;
        Z11821137052809198413 z11821137052809198413 = r9704326227384281667.d;
        z11821137052809198413.c(new G15717426683772243395(z11821137052809198413, (byte) 0), "closeResponseChannel");
        E138661690457992157 e138661690457992157 = new E138661690457992157(r9704326227384281667, n12175049621887677679, cronetException, (byte) 4);
        try {
            r9704326227384281667.c(e138661690457992157, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            if (executor != null) {
                U1748733558996603759.b("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed");
                try {
                    executor.execute(new W13948953340889349604(e138661690457992157, (byte) 15));
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public final void c(Runnable runnable, String str) {
        U1748733558996603759.b("Cronet JavaUrlRequest#executeOnExecutor ".concat(str));
        try {
            this.b.execute(new J14815962332293901910(str, runnable, (byte) 0));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.f.getAndSet(8);
        byte b = 2;
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            c(new G15717426683772243395(this, b), "fireDisconnect");
            d();
            N12175049621887677679 n12175049621887677679 = this.f598o;
            R9704326227384281667 r9704326227384281667 = this.a;
            Z11821137052809198413 z11821137052809198413 = r9704326227384281667.d;
            byte b2 = 0;
            z11821137052809198413.c(new G15717426683772243395(z11821137052809198413, b2), "closeResponseChannel");
            r9704326227384281667.c(new S1496729237269593071(r9704326227384281667, n12175049621887677679, b2), "onCanceled");
        }
    }

    public final void d() {
        P15983149023236604271 p15983149023236604271 = this.j;
        if (p15983149023236604271 == null || !this.g.compareAndSet(false, true)) {
            return;
        }
        try {
            this.k.execute(new S8612901348883321174(this, new L4980660535418402690(p15983149023236604271, (byte) 4), (byte) 0));
        } catch (RejectedExecutionException unused) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void e(java.util.ArrayList r9) {
        /*
            r8 = this;
            int r0 = r9.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L78
            java.lang.Object r3 = r9.get(r2)
            int r2 = r2 + 1
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r5 = r1
        L17:
            int r6 = r4.length()
            if (r5 >= r6) goto L49
            char r6 = r4.charAt(r5)
            r7 = 44
            if (r6 == r7) goto L69
            r7 = 47
            if (r6 == r7) goto L69
            r7 = 123(0x7b, float:1.72E-43)
            if (r6 == r7) goto L69
            r7 = 125(0x7d, float:1.75E-43)
            if (r6 == r7) goto L69
            switch(r6) {
                case 39: goto L69;
                case 40: goto L69;
                case 41: goto L69;
                default: goto L34;
            }
        L34:
            switch(r6) {
                case 58: goto L69;
                case 59: goto L69;
                case 60: goto L69;
                case 61: goto L69;
                case 62: goto L69;
                case 63: goto L69;
                case 64: goto L69;
                default: goto L37;
            }
        L37:
            switch(r6) {
                case 91: goto L69;
                case 92: goto L69;
                case 93: goto L69;
                default: goto L3a;
            }
        L3a:
            boolean r7 = java.lang.Character.isISOControl(r6)
            if (r7 != 0) goto L69
            boolean r6 = java.lang.Character.isWhitespace(r6)
            if (r6 != 0) goto L69
            int r5 = r5 + 1
            goto L17
        L49:
            java.lang.Object r4 = r3.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "\r\n"
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L69
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.TreeMap r5 = r8.d
            r5.put(r4, r3)
            goto L6
        L69:
            java.lang.Object r8 = r3.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "Invalid header with headername: "
            java.lang.String r8 = dev.epro.r0.G6547577305291411977.C(r9, r8)
            dev.epro.r0.S10973172697741180971.j(r8)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z11821137052809198413.e(java.util.ArrayList):void");
    }

    public final void f(int i, int i2, Runnable runnable) {
        AtomicInteger atomicInteger = this.f;
        if (!atomicInteger.compareAndSet(i, i2)) {
            int i3 = atomicInteger.get();
            if (i3 == 8 || i3 == 6) {
                return;
            }
            S10973172697741180971.m(G6547577305291411977.t("Invalid state transition - expected ", K5751602218013079365.d0(i), " but was ", K5751602218013079365.d0(i3)));
            return;
        }
        U1748733558996603759.b("Cronet JavaUrlRequest#transitionStates " + K5751602218013079365.d0(i) + " -> " + K5751602218013079365.d0(i2));
        try {
            runnable.run();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        f(3, 1, new U3594978070141619353((Object) this, (byte) 6));
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.f.get();
        int i2 = this.l;
        byte b = 0;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                S10973172697741180971.m(G6547577305291411977.n(i, "Switch is exhaustive: "));
                return;
        }
        R9704326227384281667 r9704326227384281667 = this.a;
        H7783202027784770375 h7783202027784770375 = new H7783202027784770375(statusListener);
        r9704326227384281667.getClass();
        r9704326227384281667.c(new G7890783101991176815(h7783202027784770375, i2, b), "sendStatus");
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.f.get();
        return i == 7 || i == 6 || i == 8;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            S10973172697741180971.j("byteBuffer must be a direct ByteBuffer.");
        } else if (byteBuffer.hasRemaining()) {
            f(4, 5, new Q9622116641457785369(this, new A12732730042960812466(this, byteBuffer, (byte) 2), (byte) 10));
        } else {
            S10973172697741180971.j("ByteBuffer is already full.");
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.s.e.incrementAndGet();
        f(0, 1, new G15717426683772243395(this, (byte) 3));
    }
}

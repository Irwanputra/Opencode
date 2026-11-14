package dev.epro.r0;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z17200250803442165189 implements B15682441012508903446 {
    public final T15985366153370019177 a;
    public final M10634075818626712574 b;
    public long c;
    public final CopyOnWriteArrayList d;
    public final LinkedBlockingDeque e;

    public Z17200250803442165189(T15985366153370019177 t15985366153370019177, M10634075818626712574 m10634075818626712574) {
        m10634075818626712574.getClass();
        this.a = t15985366153370019177;
        this.b = m10634075818626712574;
        this.c = Long.MIN_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = new LinkedBlockingDeque();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x000a, B:12:0x0016, B:14:0x001e, B:21:0x0047, B:68:0x0053, B:71:0x005e, B:26:0x0067, B:28:0x006d, B:32:0x0076, B:34:0x0081, B:35:0x0087, B:37:0x008b, B:42:0x0092, B:45:0x009c, B:47:0x00a0, B:50:0x00a6, B:51:0x00ad, B:54:0x00aa, B:56:0x00bb, B:57:0x00bc, B:60:0x00c0, B:73:0x003b, B:75:0x00c9, B:76:0x00d0), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x000a, B:12:0x0016, B:14:0x001e, B:21:0x0047, B:68:0x0053, B:71:0x005e, B:26:0x0067, B:28:0x006d, B:32:0x0076, B:34:0x0081, B:35:0x0087, B:37:0x008b, B:42:0x0092, B:45:0x009c, B:47:0x00a0, B:50:0x00a6, B:51:0x00ad, B:54:0x00aa, B:56:0x00bb, B:57:0x00bc, B:60:0x00c0, B:73:0x003b, B:75:0x00c9, B:76:0x00d0), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x000a, B:12:0x0016, B:14:0x001e, B:21:0x0047, B:68:0x0053, B:71:0x005e, B:26:0x0067, B:28:0x006d, B:32:0x0076, B:34:0x0081, B:35:0x0087, B:37:0x008b, B:42:0x0092, B:45:0x009c, B:47:0x00a0, B:50:0x00a6, B:51:0x00ad, B:54:0x00aa, B:56:0x00bb, B:57:0x00bc, B:60:0x00c0, B:73:0x003b, B:75:0x00c9, B:76:0x00d0), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0067 A[SYNTHETIC] */
    @Override // dev.epro.r0.B15682441012508903446
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.H3726261569308128079 a() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z17200250803442165189.a():dev.epro.r0.H3726261569308128079");
    }

    public final void b() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            P11191550465322624469 p11191550465322624469 = (P11191550465322624469) it.next();
            p11191550465322624469.cancel();
            P11191550465322624469 a = p11191550465322624469.a();
            if (a != null) {
                this.a.p.addLast(a);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // dev.epro.r0.B15682441012508903446
    public final T15985366153370019177 c() {
        return this.a;
    }

    public final J14476340649358081657 d() {
        P11191550465322624469 a12270298036511864110;
        T15985366153370019177 t15985366153370019177 = this.a;
        if (t15985366153370019177.a(null)) {
            try {
                a12270298036511864110 = t15985366153370019177.b();
            } catch (Throwable th) {
                a12270298036511864110 = new A12270298036511864110(th);
            }
            if (a12270298036511864110.e()) {
                return new J14476340649358081657(a12270298036511864110, (Throwable) null, 6);
            }
            if (a12270298036511864110 instanceof A12270298036511864110) {
                return ((A12270298036511864110) a12270298036511864110).a;
            }
            this.d.add(a12270298036511864110);
            this.b.d().c(new Y2467716061294949505(C14766148968941961570.b + " connect " + t15985366153370019177.i.h.f(), a12270298036511864110, this), 0L);
        }
        return null;
    }
}

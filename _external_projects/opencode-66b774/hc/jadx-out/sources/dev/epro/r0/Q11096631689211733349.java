package dev.epro.r0;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q11096631689211733349 {
    public final J196785984016436306 a;
    public final J16088445080955867036 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final D2443437645761252362 e;
    public final D2443437645761252362 f;
    public final Object g;

    public Q11096631689211733349(J196785984016436306 j196785984016436306, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = j196785984016436306;
        J16088445080955867036 j16088445080955867036 = new J16088445080955867036(j196785984016436306, linkedHashMap, linkedHashMap2, strArr, j196785984016436306.k, new C9424689592673022017(1, this, Q11096631689211733349.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte) 1));
        this.b = j16088445080955867036;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new D2443437645761252362(this, (byte) 9);
        this.f = new D2443437645761252362(this, (byte) 10);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        j16088445080955867036.k = new W2269277550458425547(this, (byte) 6);
    }

    public final Object a(R14062301455140331524 r14062301455140331524) {
        Object objF = this.b.f(r14062301455140331524);
        return objF == Z3437138737604933638.a ? objF : O9245300239821758723.a;
    }
}

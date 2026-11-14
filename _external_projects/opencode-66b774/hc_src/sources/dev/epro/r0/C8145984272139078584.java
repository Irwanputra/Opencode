package dev.epro.r0;

import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C8145984272139078584 extends U2917286957277769200 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ C8145984272139078584(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.U2917286957277769200
    public final int a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((U12307647644992999381) obj).a.groupCount() + 1;
            default:
                return ((C560824835210562156) obj).b;
        }
    }

    public X13869420807587484607 b(int i) {
        Matcher matcher = ((U12307647644992999381) this.b).a;
        P8646985343900033725 N = W7808703833045379622.N(matcher.start(i), matcher.end(i));
        if (N.a < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new X13869420807587484607(group, N);
    }

    @Override // dev.epro.r0.U2917286957277769200, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == null ? true : obj instanceof X13869420807587484607) {
                    return super.contains((X13869420807587484607) obj);
                }
                return false;
            default:
                return ((C560824835210562156) this.b).containsValue(obj);
        }
    }

    @Override // dev.epro.r0.U2917286957277769200, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new V8329864917487020755(T2881242016550624223.F(new V11146580314972738611(K5751602218013079365.M(this), (byte) 1), new S16262227471297796850(this, (byte) 22)));
            default:
                B14108412273878533248 b14108412273878533248 = ((C560824835210562156) this.b).a;
                Y975470382943463598[] y975470382943463598Arr = new Y975470382943463598[8];
                for (int i = 0; i < 8; i++) {
                    y975470382943463598Arr[i] = new I16387300989914550797((byte) 2);
                }
                return new D3990401954667247864(b14108412273878533248, y975470382943463598Arr);
        }
    }
}

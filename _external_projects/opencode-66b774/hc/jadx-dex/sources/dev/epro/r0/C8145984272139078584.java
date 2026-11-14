package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C8145984272139078584 extends dev.epro.r0.U2917286957277769200 {
    public final /* synthetic */ byte a;
    public final java.lang.Object b;

    public /* synthetic */ C8145984272139078584(java.lang.Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final int a() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                return ((dev.epro.r0.U12307647644992999381) obj).a.groupCount() + 1;
            default:
                return ((dev.epro.r0.C560824835210562156) obj).b;
        }
    }

    public dev.epro.r0.X13869420807587484607 b(int i) {
        java.util.regex.Matcher matcher = ((dev.epro.r0.U12307647644992999381) this.b).a;
        dev.epro.r0.P8646985343900033725 p8646985343900033725N = dev.epro.r0.W7808703833045379622.N(matcher.start(i), matcher.end(i));
        if (((dev.epro.r0.I12982432556619280823) p8646985343900033725N).a < 0) {
            return null;
        }
        java.lang.String strGroup = matcher.group(i);
        strGroup.getClass();
        return new dev.epro.r0.X13869420807587484607(strGroup, p8646985343900033725N);
    }

    public final boolean contains(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                if (obj == null ? true : obj instanceof dev.epro.r0.X13869420807587484607) {
                    return super.contains((dev.epro.r0.X13869420807587484607) obj);
                }
                return false;
            default:
                return ((dev.epro.r0.C560824835210562156) this.b).containsValue(obj);
        }
    }

    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.Iterator iterator() {
        switch (this.a) {
            case 0:
                return new dev.epro.r0.V8329864917487020755(dev.epro.r0.T2881242016550624223.F(new dev.epro.r0.V11146580314972738611(dev.epro.r0.K5751602218013079365.M(this), (byte) 1), new dev.epro.r0.S16262227471297796850(this, (byte) 22)));
            default:
                dev.epro.r0.B14108412273878533248 b14108412273878533248 = ((dev.epro.r0.C560824835210562156) this.b).a;
                dev.epro.r0.Y975470382943463598[] y975470382943463598Arr = new dev.epro.r0.Y975470382943463598[8];
                for (int i = 0; i < 8; i++) {
                    y975470382943463598Arr[i] = new dev.epro.r0.I16387300989914550797((byte) 2);
                }
                return new dev.epro.r0.D3990401954667247864(b14108412273878533248, y975470382943463598Arr);
        }
    }
}

package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C13932356399610645840 implements java.util.Iterator, dev.epro.r0.D14639766352081121636 {
    public final /* synthetic */ byte a;
    public int b;
    public java.lang.Object c;
    public final java.lang.Object d;

    public C13932356399610645840(dev.epro.r0.V8500408966188516816 v8500408966188516816) {
        this.a = (byte) 2;
        this.d = v8500408966188516816;
        this.b = -1;
        this.c = dev.epro.r0.U1554499319261669842.q(new dev.epro.r0.R10718507438643490505(v8500408966188516816, this, (dev.epro.r0.R4833348786910499294) null));
    }

    public void a() {
        java.lang.Object objInvoke;
        int i = this.b;
        dev.epro.r0.B2664082256516729321 b2664082256516729321 = (dev.epro.r0.B2664082256516729321) this.d;
        if (i == -2) {
            objInvoke = ((dev.epro.r0.B13729205492206812220) b2664082256516729321.b).invoke();
        } else {
            dev.epro.r0.F4096073349764486348 f4096073349764486348 = b2664082256516729321.c;
            java.lang.Object obj = this.c;
            obj.getClass();
            objInvoke = f4096073349764486348.invoke(obj);
        }
        this.c = objInvoke;
        this.b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        java.lang.Object obj = this.d;
        switch (b) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 1) {
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (this.b < ((java.util.Map) obj).size()) {
                }
                break;
            default:
                dev.epro.r0.T4763115387583174904 t4763115387583174904 = (dev.epro.r0.T4763115387583174904) obj;
                java.util.Iterator it = (java.util.Iterator) this.c;
                while (this.b < t4763115387583174904.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                if (this.b < t4763115387583174904.c && it.hasNext()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        byte b = this.a;
        java.lang.Object obj = this.d;
        java.lang.Object obj2 = null;
        switch (b) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 0) {
                    dev.epro.r0.Z3383101362411723454.u();
                    return null;
                }
                java.lang.Object obj3 = this.c;
                obj3.getClass();
                this.b = -1;
                return obj3;
            case 1:
                return ((dev.epro.r0.N3180492300688416475) this.c).next();
            case 2:
                return ((dev.epro.r0.N3180492300688416475) this.c).next();
            case 3:
                if (hasNext()) {
                    obj2 = this.c;
                    this.b++;
                    java.lang.Object obj4 = ((java.util.Map) obj).get(obj2);
                    if (obj4 == null) {
                        throw new java.util.ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                    this.c = ((dev.epro.r0.H6096100481828783755) obj4).b;
                } else {
                    dev.epro.r0.Z3383101362411723454.u();
                }
                return obj2;
            default:
                dev.epro.r0.T4763115387583174904 t4763115387583174904 = (dev.epro.r0.T4763115387583174904) obj;
                java.util.Iterator it = (java.util.Iterator) this.c;
                while (this.b < t4763115387583174904.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                int i = this.b;
                if (i < t4763115387583174904.c) {
                    this.b = i + 1;
                    return it.next();
                }
                dev.epro.r0.Z3383101362411723454.u();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.a;
        java.lang.Object obj = this.d;
        switch (b) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.b;
                if (i != -1) {
                    ((dev.epro.r0.R3525026539981983083) obj).b.i(i);
                    this.b = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.b;
                if (i2 != -1) {
                    ((dev.epro.r0.V8500408966188516816) obj).b.m(i2);
                    this.b = -1;
                    return;
                }
                return;
            case 3:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C13932356399610645840(dev.epro.r0.T4763115387583174904 t4763115387583174904) {
        this.a = (byte) 4;
        this.d = t4763115387583174904;
        this.c = t4763115387583174904.a.iterator();
    }

    public C13932356399610645840(dev.epro.r0.B2664082256516729321 b2664082256516729321) {
        this.a = (byte) 0;
        this.d = b2664082256516729321;
        this.b = -2;
    }

    public C13932356399610645840(java.lang.Object obj, java.util.Map map) {
        this.a = (byte) 3;
        this.c = obj;
        this.d = map;
    }

    public C13932356399610645840(dev.epro.r0.R3525026539981983083 r3525026539981983083) {
        this.a = (byte) 1;
        this.d = r3525026539981983083;
        this.b = -1;
        this.c = dev.epro.r0.U1554499319261669842.q(new dev.epro.r0.A11487039563529977057(r3525026539981983083, this, null));
    }
}

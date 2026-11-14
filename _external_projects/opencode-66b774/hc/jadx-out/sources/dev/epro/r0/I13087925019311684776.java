package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I13087925019311684776 {
    public final W5797197595347441198 a;
    public final Y17698807562857349923 b;
    public final W2269277550458425547 c;
    public A10693687560045094360 d;
    public A10693687560045094360 e;
    public A10693687560045094360 f;
    public boolean g;
    public final V697849047308847220 h;
    public final V697849047308847220 i;
    public final V697849047308847220 j;
    public final V697849047308847220 k;
    public long l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public B9692660393722135472 f285o;
    public final U16834965109098959004 p;
    public final U16834965109098959004 q;
    public final V697849047308847220 r;

    public I13087925019311684776(W5797197595347441198 w5797197595347441198, Y17698807562857349923 y17698807562857349923, W2269277550458425547 w2269277550458425547) {
        this.a = w5797197595347441198;
        this.b = y17698807562857349923;
        this.c = w2269277550458425547;
        Boolean bool = Boolean.FALSE;
        this.h = V4416135141588678913.t(bool);
        this.i = V4416135141588678913.t(bool);
        this.j = V4416135141588678913.t(bool);
        this.k = V4416135141588678913.t(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        this.n = 9223372034707292159L;
        Object obj = null;
        this.f285o = y17698807562857349923 != null ? y17698807562857349923.b() : null;
        int i = 12;
        this.p = new U16834965109098959004(new Q2551293802323679034(0L), D15913187640519482289.n, obj, i);
        this.q = new U16834965109098959004(Float.valueOf(1.0f), D15913187640519482289.h, obj, i);
        this.r = V4416135141588678913.t(new Q2551293802323679034(0L));
    }

    public final void a() {
        B9692660393722135472 b9692660393722135472 = this.f285o;
        A10693687560045094360 a10693687560045094360 = this.d;
        V697849047308847220 v697849047308847220 = this.i;
        boolean zBooleanValue = ((Boolean) v697849047308847220.getValue()).booleanValue();
        W5797197595347441198 w5797197595347441198 = this.a;
        R4833348786910499294 r4833348786910499294 = null;
        if (zBooleanValue || a10693687560045094360 == null || b9692660393722135472 == null) {
            if (b()) {
                if (b9692660393722135472 != null) {
                    b9692660393722135472.e(1.0f);
                }
                R7033599853981556291.E(w5797197595347441198, null, null, new B11361677180658862244(this, r4833348786910499294, (byte) 0), 3);
                return;
            }
            return;
        }
        v697849047308847220.setValue(Boolean.TRUE);
        boolean zB = b();
        boolean z = !zB;
        if (!zB) {
            b9692660393722135472.e(0.0f);
        }
        R7033599853981556291.E(w5797197595347441198, null, null, new B9486205464174482320(z, this, a10693687560045094360, b9692660393722135472, null), 3);
    }

    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void c() {
        Y17698807562857349923 y17698807562857349923;
        V697849047308847220 v697849047308847220 = this.h;
        boolean zBooleanValue = ((Boolean) v697849047308847220.getValue()).booleanValue();
        byte b = 3;
        W5797197595347441198 w5797197595347441198 = this.a;
        R4833348786910499294 r4833348786910499294 = null;
        if (zBooleanValue) {
            v697849047308847220.setValue(Boolean.FALSE);
            R7033599853981556291.E(w5797197595347441198, null, null, new B11361677180658862244(this, r4833348786910499294, (byte) 2), 3);
        }
        V697849047308847220 v6978490473088472202 = this.i;
        if (((Boolean) v6978490473088472202.getValue()).booleanValue()) {
            v6978490473088472202.setValue(Boolean.FALSE);
            R7033599853981556291.E(w5797197595347441198, null, null, new B11361677180658862244(this, r4833348786910499294, b), 3);
        }
        if (b()) {
            this.j.setValue(Boolean.FALSE);
            R7033599853981556291.E(w5797197595347441198, null, null, new B11361677180658862244(this, r4833348786910499294, (byte) 4), 3);
        }
        this.g = false;
        d(0L);
        this.l = 9223372034707292159L;
        B9692660393722135472 b9692660393722135472 = this.f285o;
        if (b9692660393722135472 != null && (y17698807562857349923 = this.b) != null) {
            y17698807562857349923.a(b9692660393722135472);
        }
        this.f285o = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void d(long j) {
        this.r.setValue(new Q2551293802323679034(j));
    }
}

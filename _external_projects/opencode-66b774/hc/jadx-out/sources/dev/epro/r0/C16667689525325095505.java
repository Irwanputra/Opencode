package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C16667689525325095505 {
    public static final int s = Integer.getInteger(C16667689525325095505.class.getName().concat(".bufferSize"), 1064960).intValue();
    public final int a;
    public final I13897573759869141187 b;
    public final L6461449118602905387 c;
    public final Q7316561721656982910 d;
    public final Q7316561721656982910 e;
    public int f;
    public int g;
    public final Object h;
    public boolean i;
    public final byte[] j;
    public byte k;
    public int l;
    public long m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f184o;
    public boolean p;
    public final Object q;
    public Throwable r;

    public C16667689525325095505(I13897573759869141187 i13897573759869141187) {
        int i = s;
        this.a = i;
        Q7316561721656982910 q7316561721656982910 = new Q7316561721656982910(this);
        this.d = q7316561721656982910;
        Q7316561721656982910 q73165617216569829102 = new Q7316561721656982910(this);
        this.e = q73165617216569829102;
        this.f = -1;
        this.g = -1;
        this.h = new Object();
        this.i = false;
        this.j = new byte[9];
        this.k = (byte) 1;
        this.m = 0L;
        this.n = -1;
        this.f184o = -1;
        this.p = false;
        this.q = new Object();
        this.r = null;
        this.b = i13897573759869141187;
        this.l = i;
        this.n = T1177712003054613961.r - 1024;
        L6461449118602905387 l6461449118602905387 = new L6461449118602905387();
        l6461449118602905387.b = false;
        l6461449118602905387.a = this;
        this.c = l6461449118602905387;
        q7316561721656982910.b = new T8548489830177605674(this, false);
        q73165617216569829102.b = new T8548489830177605674(this, true);
    }

    public final synchronized void a() {
        this.d.y();
        this.e.y();
        this.p = true;
    }
}

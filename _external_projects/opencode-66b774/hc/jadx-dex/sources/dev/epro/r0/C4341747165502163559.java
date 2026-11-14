package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C4341747165502163559 implements dev.epro.r0.Y14924988016309632925, dev.epro.r0.I3673563500665330592 {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;

    public C4341747165502163559() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.a = dev.epro.r0.V4416135141588678913.t(bool);
        this.g = new dev.epro.r0.O15319392248629494012(1.0f);
        this.b = dev.epro.r0.V4416135141588678913.t(bool);
        this.h = new dev.epro.r0.O15319392248629494012(1.0f);
        this.c = dev.epro.r0.V4416135141588678913.t(bool);
        this.d = dev.epro.r0.V4416135141588678913.t(new dev.epro.r0.N13757329872968394114(dev.epro.r0.N13757329872968394114.b));
        this.e = dev.epro.r0.V4416135141588678913.t(bool);
        this.f = dev.epro.r0.V4416135141588678913.t(new dev.epro.r0.U10174709222559481877(dev.epro.r0.U10174709222559481877.g));
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dev.epro.r0.O11692414993408430441 h() {
        android.app.Application application = (android.app.Application) ((dev.epro.r0.Z6787503239643758223) this.a).a;
        android.os.Handler handler = dev.epro.r0.L7597948271951285043.a;
        dev.epro.r0.Q3791352212346016950.m(handler);
        dev.epro.r0.L10699316803831699764 l10699316803831699764 = dev.epro.r0.L7597948271951285043.b;
        dev.epro.r0.Q3791352212346016950.m(l10699316803831699764);
        return new dev.epro.r0.O11692414993408430441(application, handler, l10699316803831699764, (dev.epro.r0.G5446205426701161097) ((dev.epro.r0.D9201356603168736774) this.c).h(), (dev.epro.r0.G15068739404623149094) ((dev.epro.r0.D9201356603168736774) this.d).h(), ((dev.epro.r0.V5098515201292188072) this.e).a(), ((dev.epro.r0.J15730374346044043770) this.f).a0(), (dev.epro.r0.Y15841630011871852334) ((dev.epro.r0.D9201356603168736774) this.g).h(), (dev.epro.r0.A7202329723792933819) ((dev.epro.r0.D9201356603168736774) this.h).h());
    }

    public void b(java.lang.String str) {
        "Receive consent action: ".concat(java.lang.String.valueOf(str));
        android.net.Uri uri = android.net.Uri.parse(str);
        java.lang.String queryParameter = uri.getQueryParameter("action");
        java.lang.String queryParameter2 = uri.getQueryParameter("args");
        dev.epro.r0.Y14924988016309632925[] y14924988016309632925Arr = {this, (dev.epro.r0.J15730374346044043770) this.f};
        dev.epro.r0.Y15841630011871852334 y15841630011871852334 = (dev.epro.r0.Y15841630011871852334) this.e;
        y15841630011871852334.getClass();
        y15841630011871852334.a.execute(new dev.epro.r0.F16393152783805540385(queryParameter, queryParameter2, y14924988016309632925Arr, (byte) 3));
    }

    public java.util.concurrent.Executor f() {
        return new dev.epro.r0.Q9579657892041446906((android.os.Handler) this.c, (byte) 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r5.equals("non_personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r5.equals("personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r5 = 3;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(java.lang.String r6, org.json.JSONObject r7) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C4341747165502163559.g(java.lang.String, org.json.JSONObject):boolean");
    }

    public /* synthetic */ C4341747165502163559(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
    }
}

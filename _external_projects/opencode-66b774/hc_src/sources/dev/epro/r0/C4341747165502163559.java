package dev.epro.r0;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C4341747165502163559 implements Y14924988016309632925, I3673563500665330592 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public C4341747165502163559() {
        Boolean bool = Boolean.FALSE;
        this.a = V4416135141588678913.t(bool);
        this.g = new O15319392248629494012(1.0f);
        this.b = V4416135141588678913.t(bool);
        this.h = new O15319392248629494012(1.0f);
        this.c = V4416135141588678913.t(bool);
        this.d = V4416135141588678913.t(new N13757329872968394114(N13757329872968394114.b));
        this.e = V4416135141588678913.t(bool);
        this.f = V4416135141588678913.t(new U10174709222559481877(U10174709222559481877.g));
    }

    @Override // dev.epro.r0.I3673563500665330592
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O11692414993408430441 h() {
        Application application = (Application) ((Z6787503239643758223) this.a).a;
        Handler handler = L7597948271951285043.a;
        Q3791352212346016950.m(handler);
        L10699316803831699764 l10699316803831699764 = L7597948271951285043.b;
        Q3791352212346016950.m(l10699316803831699764);
        return new O11692414993408430441(application, handler, l10699316803831699764, (G5446205426701161097) ((D9201356603168736774) this.c).h(), (G15068739404623149094) ((D9201356603168736774) this.d).h(), ((V5098515201292188072) this.e).a(), ((J15730374346044043770) this.f).a0(), (Y15841630011871852334) ((D9201356603168736774) this.g).h(), (A7202329723792933819) ((D9201356603168736774) this.h).h());
    }

    public void b(String str) {
        "Receive consent action: ".concat(String.valueOf(str));
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("action");
        String queryParameter2 = parse.getQueryParameter("args");
        Y14924988016309632925[] y14924988016309632925Arr = {this, (J15730374346044043770) this.f};
        Y15841630011871852334 y15841630011871852334 = (Y15841630011871852334) this.e;
        y15841630011871852334.getClass();
        y15841630011871852334.a.execute(new F16393152783805540385(queryParameter, queryParameter2, y14924988016309632925Arr, (byte) 3));
    }

    @Override // dev.epro.r0.Y14924988016309632925
    public Executor f() {
        return new Q9579657892041446906((Handler) this.c, (byte) 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r5.equals("non_personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r5 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r5.equals("personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    @Override // dev.epro.r0.Y14924988016309632925
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(java.lang.String r6, org.json.JSONObject r7) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C4341747165502163559.g(java.lang.String, org.json.JSONObject):boolean");
    }

    public /* synthetic */ C4341747165502163559(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
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

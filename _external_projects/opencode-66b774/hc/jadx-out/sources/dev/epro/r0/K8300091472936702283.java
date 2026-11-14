package dev.epro.r0;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K8300091472936702283 implements A18195026813295081326 {
    public final O15940687614781286589 a;
    public V9368221681098282568 b;

    public K8300091472936702283(O15940687614781286589 o15940687614781286589) {
        this.a = o15940687614781286589;
    }

    @Override // dev.epro.r0.A18195026813295081326
    public final Object d() {
        V9368221681098282568 v9368221681098282568 = this.b;
        if (v9368221681098282568 != null) {
            return v9368221681098282568;
        }
        Application application = this.a.getApplication();
        boolean z = application instanceof A18195026813295081326;
        Class<?> cls = application.getClass();
        if (!z) {
            Q11088980322693754445.m("Hilt service must be attached to an @HiltAndroidApp Application. Found: ", cls);
            return null;
        }
        V9368221681098282568 v93682216810982825682 = new V9368221681098282568(((O15378179187853170099) ((X2169256506870413393) S10823041268949770285.J(application, X2169256506870413393.class))).b);
        this.b = v93682216810982825682;
        return v93682216810982825682;
    }
}

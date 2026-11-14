package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W16959169036269499790 {
    public final G5446205426701161097 a;
    public final O11692414993408430441 b;
    public final G15068739404623149094 c;
    public final A7202329723792933819 f;
    public final Object d = new Object();
    public final Object e = new Object();
    public boolean g = false;
    public boolean h = false;
    public E17149812035295265804 i = new E17149812035295265804(7);

    public W16959169036269499790(G5446205426701161097 g5446205426701161097, O11692414993408430441 o11692414993408430441, G15068739404623149094 g15068739404623149094, A7202329723792933819 a7202329723792933819) {
        this.a = g5446205426701161097;
        this.b = o11692414993408430441;
        this.c = g15068739404623149094;
        this.f = a7202329723792933819;
    }

    public final boolean a() {
        G5446205426701161097 g5446205426701161097 = this.a;
        if (!g5446205426701161097.b.getBoolean("is_pub_misconfigured", false)) {
            int i = !c() ? 0 : g5446205426701161097.b.getInt("consent_status", 0);
            if (i != 1 && i != 3) {
                return false;
            }
        }
        return true;
    }

    public final int b() {
        if (!c()) {
            return 1;
        }
        String string = this.a.b.getString("privacy_options_requirement_status", "UNKNOWN");
        if (string == null) {
            Z3383101362411723454.k("Name is null");
        } else {
            if (string.equals("UNKNOWN")) {
                return 1;
            }
            if (string.equals("NOT_REQUIRED")) {
                return 2;
            }
            if (string.equals("REQUIRED")) {
                return 3;
            }
            S10973172697741180971.j("No enum constant com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.".concat(string));
        }
        return 0;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.d) {
            z = this.g;
        }
        return z;
    }
}

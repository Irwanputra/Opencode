package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ym2 {
    public final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean(false);
    public dev.epro.r0.A8947685337014270457 b = null;
    public dev.epro.r0.A8947685337014270457 c = null;

    public final void a() throws java.security.GeneralSecurityException {
        if (this.a.getAndSet(true)) {
            return;
        }
        try {
            dev.epro.r0.N6049862636207380066.a();
            this.b = (dev.epro.r0.A8947685337014270457) dev.epro.r0.A15222901130456174747.s(new java.lang.String(dev.epro.r0.V4416135141588678913.f("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).h();
            this.c = (dev.epro.r0.A8947685337014270457) dev.epro.r0.A15222901130456174747.s(new java.lang.String(dev.epro.r0.V4416135141588678913.f("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).h();
        } catch (java.lang.Exception e) {
            throw new java.security.GeneralSecurityException("Failed to verify program", e);
        }
    }

    public final boolean a(ads_mobile_sdk.w7 w7Var) {
        byte[] bArrC = w7Var.p().q().q().c();
        byte[] bArrC2 = w7Var.p().p().c();
        try {
            try {
                a();
                dev.epro.r0.A8947685337014270457 a8947685337014270457 = this.b;
                if (a8947685337014270457 != null) {
                    a8947685337014270457.a(bArrC, bArrC2);
                    return true;
                }
                throw new java.security.GeneralSecurityException();
            } catch (java.security.GeneralSecurityException unused) {
                return false;
            }
        } catch (java.security.GeneralSecurityException unused2) {
            dev.epro.r0.A8947685337014270457 a89476853370142704572 = this.c;
            if (a89476853370142704572 == null) {
                return false;
            }
            a89476853370142704572.a(bArrC, bArrC2);
            return true;
        }
    }
}

package androidx.webkit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class WebViewStartUpConfig {
    public final java.util.concurrent.Executor a;
    public final boolean b;
    public final java.util.Set c;

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class Builder {
        public final java.util.concurrent.Executor a;
        public boolean b = true;
        public java.util.HashSet c = null;

        public Builder(java.util.concurrent.Executor executor) {
            this.a = executor;
        }

        public androidx.webkit.WebViewStartUpConfig build() {
            return new androidx.webkit.WebViewStartUpConfig(this.a, this.b, this.c);
        }

        public androidx.webkit.WebViewStartUpConfig.Builder setProfilesToLoadDuringStartup(java.util.Set<java.lang.String> set) {
            if (this.b) {
                this.c = new java.util.HashSet(set);
                return this;
            }
            dev.epro.r0.S10973172697741180971.j("Can't specify profiles to load without running UI thread startup tasks");
            return null;
        }

        public androidx.webkit.WebViewStartUpConfig.Builder setShouldRunUiThreadStartUpTasks(boolean z) {
            if (this.c == null || z) {
                this.b = z;
                return this;
            }
            dev.epro.r0.S10973172697741180971.j("Can't specify profiles to load without running UI thread startup tasks");
            return null;
        }
    }

    public WebViewStartUpConfig(java.util.concurrent.Executor executor, boolean z, java.util.HashSet hashSet) {
        this.a = executor;
        this.b = z;
        this.c = hashSet;
    }

    public java.util.concurrent.Executor getBackgroundExecutor() {
        return this.a;
    }

    public java.util.Set<java.lang.String> getProfilesToLoadDuringStartup() {
        return this.c;
    }

    public boolean shouldRunUiThreadStartUpTasks() {
        return this.b;
    }
}

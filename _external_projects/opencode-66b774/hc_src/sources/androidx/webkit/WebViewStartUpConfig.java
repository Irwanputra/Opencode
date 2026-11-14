package androidx.webkit;

import dev.epro.r0.S10973172697741180971;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class WebViewStartUpConfig {
    public final Executor a;
    public final boolean b;
    public final Set c;

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class Builder {
        public final Executor a;
        public boolean b = true;
        public HashSet c = null;

        public Builder(Executor executor) {
            this.a = executor;
        }

        public WebViewStartUpConfig build() {
            return new WebViewStartUpConfig(this.a, this.b, this.c);
        }

        public Builder setProfilesToLoadDuringStartup(Set<String> set) {
            if (this.b) {
                this.c = new HashSet(set);
                return this;
            }
            S10973172697741180971.j("Can't specify profiles to load without running UI thread startup tasks");
            return null;
        }

        public Builder setShouldRunUiThreadStartUpTasks(boolean z) {
            if (this.c == null || z) {
                this.b = z;
                return this;
            }
            S10973172697741180971.j("Can't specify profiles to load without running UI thread startup tasks");
            return null;
        }
    }

    public WebViewStartUpConfig(Executor executor, boolean z, HashSet hashSet) {
        this.a = executor;
        this.b = z;
        this.c = hashSet;
    }

    public Executor getBackgroundExecutor() {
        return this.a;
    }

    public Set<String> getProfilesToLoadDuringStartup() {
        return this.c;
    }

    public boolean shouldRunUiThreadStartUpTasks() {
        return this.b;
    }
}

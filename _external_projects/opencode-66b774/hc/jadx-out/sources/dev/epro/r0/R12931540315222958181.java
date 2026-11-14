package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R12931540315222958181 {

    @O7462376509978667369("is_browser_custom_tabs_capable")
    public Boolean a;

    public R12931540315222958181(int i) {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof R12931540315222958181) && S10823041268949770285.t(this.a, ((R12931540315222958181) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "BrowserSignals(isDefaultBrowserCustomTabsCapable=" + this.a + ")";
    }

    public R12931540315222958181() {
        this(0);
    }
}

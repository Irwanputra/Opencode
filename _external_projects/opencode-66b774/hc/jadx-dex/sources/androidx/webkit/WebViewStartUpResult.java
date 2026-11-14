package androidx.webkit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public interface WebViewStartUpResult {
    java.lang.Long getMaxTimePerTaskInUiThreadMillis();

    java.util.List<androidx.webkit.StartUpLocation> getNonUiThreadBlockingStartUpLocations();

    java.lang.Long getTotalTimeInUiThreadMillis();

    java.util.List<androidx.webkit.StartUpLocation> getUiThreadBlockingStartUpLocations();
}

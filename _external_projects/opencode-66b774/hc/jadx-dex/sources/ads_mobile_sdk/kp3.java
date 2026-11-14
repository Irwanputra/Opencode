package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class kp3 implements dev.epro.r0.G10406278436229148761 {
    public final /* synthetic */ androidx.webkit.WebViewStartUpResult a;

    public kp3(androidx.webkit.WebViewStartUpResult webViewStartUpResult) {
        this.a = webViewStartUpResult;
    }

    public final java.util.List a() {
        try {
            java.util.List<androidx.webkit.StartUpLocation> nonUiThreadBlockingStartUpLocations = this.a.getNonUiThreadBlockingStartUpLocations();
            if (nonUiThreadBlockingStartUpLocations != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it = nonUiThreadBlockingStartUpLocations.iterator();
                while (it.hasNext()) {
                    java.lang.String stackInformation = ((androidx.webkit.StartUpLocation) it.next()).getStackInformation();
                    if (stackInformation == null) {
                        stackInformation = null;
                    }
                    if (stackInformation != null) {
                        arrayList.add(stackInformation);
                    }
                }
                return arrayList;
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public final java.util.List b() {
        try {
            java.util.List<androidx.webkit.StartUpLocation> uiThreadBlockingStartUpLocations = this.a.getUiThreadBlockingStartUpLocations();
            if (uiThreadBlockingStartUpLocations != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it = uiThreadBlockingStartUpLocations.iterator();
                while (it.hasNext()) {
                    java.lang.String stackInformation = ((androidx.webkit.StartUpLocation) it.next()).getStackInformation();
                    if (stackInformation == null) {
                        stackInformation = null;
                    }
                    if (stackInformation != null) {
                        arrayList.add(stackInformation);
                    }
                }
                return arrayList;
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public final java.lang.Long getMaxTimePerTaskInUiThreadMillis() {
        try {
            return this.a.getMaxTimePerTaskInUiThreadMillis();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final java.lang.Long getTotalTimeInUiThreadMillis() {
        try {
            return this.a.getTotalTimeInUiThreadMillis();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}

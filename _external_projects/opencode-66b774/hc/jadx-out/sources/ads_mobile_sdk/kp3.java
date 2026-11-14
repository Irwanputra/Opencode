package ads_mobile_sdk;

import androidx.webkit.StartUpLocation;
import androidx.webkit.WebViewStartUpResult;
import dev.epro.r0.G10406278436229148761;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class kp3 implements G10406278436229148761 {
    public final /* synthetic */ WebViewStartUpResult a;

    public kp3(WebViewStartUpResult webViewStartUpResult) {
        this.a = webViewStartUpResult;
    }

    @Override // dev.epro.r0.G10406278436229148761
    public final List a() {
        try {
            List<StartUpLocation> nonUiThreadBlockingStartUpLocations = this.a.getNonUiThreadBlockingStartUpLocations();
            if (nonUiThreadBlockingStartUpLocations != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = nonUiThreadBlockingStartUpLocations.iterator();
                while (it.hasNext()) {
                    String stackInformation = ((StartUpLocation) it.next()).getStackInformation();
                    if (stackInformation == null) {
                        stackInformation = null;
                    }
                    if (stackInformation != null) {
                        arrayList.add(stackInformation);
                    }
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // dev.epro.r0.G10406278436229148761
    public final List b() {
        try {
            List<StartUpLocation> uiThreadBlockingStartUpLocations = this.a.getUiThreadBlockingStartUpLocations();
            if (uiThreadBlockingStartUpLocations != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = uiThreadBlockingStartUpLocations.iterator();
                while (it.hasNext()) {
                    String stackInformation = ((StartUpLocation) it.next()).getStackInformation();
                    if (stackInformation == null) {
                        stackInformation = null;
                    }
                    if (stackInformation != null) {
                        arrayList.add(stackInformation);
                    }
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // dev.epro.r0.G10406278436229148761
    public final Long getMaxTimePerTaskInUiThreadMillis() {
        try {
            return this.a.getMaxTimePerTaskInUiThreadMillis();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // dev.epro.r0.G10406278436229148761
    public final Long getTotalTimeInUiThreadMillis() {
        try {
            return this.a.getTotalTimeInUiThreadMillis();
        } catch (Throwable unused) {
            return null;
        }
    }
}

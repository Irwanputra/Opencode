package dev.epro.r0;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G17481180015085314196 {
    public static final R14870407523536536272 a;

    static {
        R14870407523536536272 n8119038573073630541;
        try {
            n8119038573073630541 = new J12850025110886164157((WebViewProviderFactoryBoundaryInterface) K5751602218013079365.w(WebViewProviderFactoryBoundaryInterface.class, O17574792317020433029.f()));
        } catch (ClassNotFoundException unused) {
            n8119038573073630541 = new N8119038573073630541();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Q11088980322693754445.k(e);
            return;
        }
        a = n8119038573073630541;
    }
}

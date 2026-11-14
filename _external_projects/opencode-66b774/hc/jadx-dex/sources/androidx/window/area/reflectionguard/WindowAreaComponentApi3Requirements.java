package androidx.window.area.reflectionguard;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public interface WindowAreaComponentApi3Requirements {
    void addRearDisplayPresentationStatusListener(androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.area.ExtensionWindowAreaStatus> consumer);

    void addRearDisplayStatusListener(androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);

    void endRearDisplayPresentationSession();

    void endRearDisplaySession();

    android.util.DisplayMetrics getRearDisplayMetrics();

    androidx.window.extensions.area.ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.area.ExtensionWindowAreaStatus> consumer);

    void removeRearDisplayStatusListener(androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);

    void startRearDisplayPresentationSession(android.app.Activity activity, androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);

    void startRearDisplaySession(android.app.Activity activity, androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);
}

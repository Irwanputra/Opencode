package androidx.profileinstaller;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ProfileInstallerInitializer implements dev.epro.r0.R4576572296217797762 {
    public final java.util.List a() {
        return java.util.Collections.EMPTY_LIST;
    }

    public final java.lang.Object b(android.content.Context context) {
        android.view.Choreographer.getInstance().postFrameCallback(new dev.epro.r0.X15258821238264337731(this, context.getApplicationContext()));
        return new dev.epro.r0.M10846389789027735899((byte) 22);
    }
}

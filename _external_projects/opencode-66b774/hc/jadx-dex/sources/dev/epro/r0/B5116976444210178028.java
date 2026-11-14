package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class B5116976444210178028 {
    public static int a(android.view.RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(android.view.RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(android.view.RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    public static void d(android.view.RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }
}

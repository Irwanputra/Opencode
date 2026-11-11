.class public Lcom/google/android/gms/ads/mediation/NativeAdMapper;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field public 〺つふすそ:Z

.field public ぁごぐすすぃ:Z

.field public くし〴〺ぅ:Landroid/os/Bundle;

.field public げつ〴ぬぐ:Z

.field public づざかべべ:Landroid/view/View;

.field public なぎぱいぢぎ:Lcom/google/android/gms/ads/VideoController;

.field public びぐびあび:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->くし〴〺ぅ:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public getAdChoicesContent()Landroid/view/View;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->びぐびあび:Landroid/view/View;

    return-object v0
.end method

.method public final getExtras()Landroid/os/Bundle;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->くし〴〺ぅ:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getOverrideClickHandling()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->〺つふすそ:Z

    return v0
.end method

.method public final getOverrideImpressionRecording()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->げつ〴ぬぐ:Z

    return v0
.end method

.method public final getVideoController()Lcom/google/android/gms/ads/VideoController;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->なぎぱいぢぎ:Lcom/google/android/gms/ads/VideoController;

    return-object v0
.end method

.method public handleClick(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method public hasVideoContent()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->ぁごぐすすぃ:Z

    return v0
.end method

.method public recordImpression()V
    .registers 1

    return-void
.end method

.method public setAdChoicesContent(Landroid/view/View;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->びぐびあび:Landroid/view/View;

    return-void
.end method

.method public final setExtras(Landroid/os/Bundle;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->くし〴〺ぅ:Landroid/os/Bundle;

    return-void
.end method

.method public setHasVideoContent(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->ぁごぐすすぃ:Z

    return-void
.end method

.method public setMediaView(Landroid/view/View;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->づざかべべ:Landroid/view/View;

    return-void
.end method

.method public final setOverrideClickHandling(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->〺つふすそ:Z

    return-void
.end method

.method public final setOverrideImpressionRecording(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->げつ〴ぬぐ:Z

    return-void
.end method

.method public trackView(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method public untrackView(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method public final zza(Lcom/google/android/gms/ads/VideoController;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->なぎぱいぢぎ:Lcom/google/android/gms/ads/VideoController;

    return-void
.end method

.method public final zzul()Landroid/view/View;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/NativeAdMapper;->づざかべべ:Landroid/view/View;

    return-object v0
.end method

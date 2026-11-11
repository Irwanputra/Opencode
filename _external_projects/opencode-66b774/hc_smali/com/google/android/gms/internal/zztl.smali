.class public final Lcom/google/android/gms/internal/zztl;
.super Lcom/google/android/gms/internal/zzkt;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzapq:Ljava/lang/String;

.field private zzaqg:Z

.field private final zzbzs:Lcom/google/android/gms/internal/zzsd;

.field private zzbzx:Lcom/google/android/gms/ads/internal/zzak;

.field private final zzcak:Lcom/google/android/gms/internal/zztd;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzux;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/ads/internal/zzv;)V
    .registers 7

    new-instance v0, Lcom/google/android/gms/internal/zzsd;

    invoke-direct {v0, p1, p3, p4, p5}, Lcom/google/android/gms/internal/zzsd;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzux;Lcom/google/android/gms/internal/zzakd;Lcom/google/android/gms/ads/internal/zzv;)V

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/zztl;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzsd;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzsd;)V
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzkt;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zztl;->zzapq:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/zztl;->zzbzs:Lcom/google/android/gms/internal/zzsd;

    new-instance p1, Lcom/google/android/gms/internal/zztd;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zztd;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zztl;->zzcak:Lcom/google/android/gms/internal/zztd;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeu()Lcom/google/android/gms/internal/zztg;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zztg;->zza(Lcom/google/android/gms/internal/zzsd;)V

    return-void
.end method

.method private final abort()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzs:Lcom/google/android/gms/internal/zzsd;

    iget-object v1, p0, Lcom/google/android/gms/internal/zztl;->zzapq:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzsd;->zzav(Ljava/lang/String;)Lcom/google/android/gms/ads/internal/zzak;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    iget-object v1, p0, Lcom/google/android/gms/internal/zztl;->zzcak:Lcom/google/android/gms/internal/zztd;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zztd;->zzd(Lcom/google/android/gms/ads/internal/zzak;)V

    return-void
.end method


# virtual methods
.method public final destroy()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->destroy()V

    :cond_7
    return-void
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getAdUnitId not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzd;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_9
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/zzll;
    .registers 3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getVideoController not implemented for interstitials"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final isLoading()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v0, 0x1

    return v0

    :cond_c
    const/4 v0, 0x0

    return v0
.end method

.method public final isReady()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->isReady()Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v0, 0x1

    return v0

    :cond_c
    const/4 v0, 0x0

    return v0
.end method

.method public final pause()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzd;->pause()V

    :cond_7
    return-void
.end method

.method public final resume()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzd;->resume()V

    :cond_7
    return-void
.end method

.method public final setImmersiveMode(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zztl;->zzaqg:Z

    return-void
.end method

.method public final setManualImpressionsEnabled(Z)V
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zztl;->abort()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/zza;->setManualImpressionsEnabled(Z)V

    :cond_a
    return-void
.end method

.method public final setUserId(Ljava/lang/String;)V
    .registers 2

    return-void
.end method

.method public final showInterstitial()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_f

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zztl;->zzaqg:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzak;->setImmersiveMode(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzak;->showInterstitial()V

    return-void

    :cond_f
    const-string v0, "Interstitial ad must be loaded before showInterstitial()."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void
.end method

.method public final stopLoading()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->stopLoading()V

    :cond_7
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzadp;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzcak:Lcom/google/android/gms/internal/zztd;

    iput-object p1, v0, Lcom/google/android/gms/internal/zztd;->zzbzn:Lcom/google/android/gms/internal/zzadp;

    iget-object p1, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz p1, :cond_b

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zztd;->zzd(Lcom/google/android/gms/ads/internal/zzak;)V

    :cond_b
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzjn;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/zzjn;)V

    :cond_7
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzke;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzcak:Lcom/google/android/gms/internal/zztd;

    iput-object p1, v0, Lcom/google/android/gms/internal/zztd;->zzbzm:Lcom/google/android/gms/internal/zzke;

    iget-object p1, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz p1, :cond_b

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zztd;->zzd(Lcom/google/android/gms/ads/internal/zzak;)V

    :cond_b
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzkh;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzcak:Lcom/google/android/gms/internal/zztd;

    iput-object p1, v0, Lcom/google/android/gms/internal/zztd;->zzape:Lcom/google/android/gms/internal/zzkh;

    iget-object p1, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz p1, :cond_b

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zztd;->zzd(Lcom/google/android/gms/ads/internal/zzak;)V

    :cond_b
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzkx;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzcak:Lcom/google/android/gms/internal/zztd;

    iput-object p1, v0, Lcom/google/android/gms/internal/zztd;->zzbzk:Lcom/google/android/gms/internal/zzkx;

    iget-object p1, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz p1, :cond_b

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zztd;->zzd(Lcom/google/android/gms/ads/internal/zzak;)V

    :cond_b
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzld;)V
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zztl;->abort()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/zzld;)V

    :cond_a
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzlr;)V
    .registers 3

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unused method"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzmr;)V
    .registers 3

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "getVideoController not implemented for interstitials"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzoa;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzcak:Lcom/google/android/gms/internal/zztd;

    iput-object p1, v0, Lcom/google/android/gms/internal/zztd;->zzbzl:Lcom/google/android/gms/internal/zzoa;

    iget-object p1, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz p1, :cond_b

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zztd;->zzd(Lcom/google/android/gms/ads/internal/zzak;)V

    :cond_b
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzxl;)V
    .registers 2

    const-string p1, "setInAppPurchaseListener is deprecated and should not be called."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzxr;Ljava/lang/String;)V
    .registers 3

    const-string p1, "setPlayStorePurchaseParams is deprecated and should not be called."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/zzjj;)Z
    .registers 5

    invoke-static {p1}, Lcom/google/android/gms/internal/zztg;->zzi(Lcom/google/android/gms/internal/zzjj;)Ljava/util/Set;

    move-result-object v0

    const-string v1, "gw"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    invoke-direct {p0}, Lcom/google/android/gms/internal/zztl;->abort()V

    :cond_f
    invoke-static {p1}, Lcom/google/android/gms/internal/zztg;->zzi(Lcom/google/android/gms/internal/zzjj;)Ljava/util/Set;

    move-result-object v0

    const-string v1, "_skipMediation"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-direct {p0}, Lcom/google/android/gms/internal/zztl;->abort()V

    :cond_1e
    iget-object v0, p1, Lcom/google/android/gms/internal/zzjj;->zzbdm:Lcom/google/android/gms/internal/zzmn;

    if-eqz v0, :cond_25

    invoke-direct {p0}, Lcom/google/android/gms/internal/zztl;->abort()V

    :cond_25
    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_2e

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/zza;->zzb(Lcom/google/android/gms/internal/zzjj;)Z

    move-result p1

    return p1

    :cond_2e
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeu()Lcom/google/android/gms/internal/zztg;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/zztg;->zzi(Lcom/google/android/gms/internal/zzjj;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "_ad"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    iget-object v1, p0, Lcom/google/android/gms/internal/zztl;->zzapq:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/zztg;->zzb(Lcom/google/android/gms/internal/zzjj;Ljava/lang/String;)V

    :cond_43
    iget-object v1, p0, Lcom/google/android/gms/internal/zztl;->zzapq:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/zztg;->zza(Lcom/google/android/gms/internal/zzjj;Ljava/lang/String;)Lcom/google/android/gms/internal/zztj;

    move-result-object v0

    if-eqz v0, :cond_76

    iget-boolean p1, v0, Lcom/google/android/gms/internal/zztj;->zzcab:Z

    if-nez p1, :cond_5a

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zztj;->load()Z

    invoke-static {}, Lcom/google/android/gms/internal/zztk;->zzlc()Lcom/google/android/gms/internal/zztk;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zztk;->zzlg()V

    goto :goto_61

    :cond_5a
    invoke-static {}, Lcom/google/android/gms/internal/zztk;->zzlc()Lcom/google/android/gms/internal/zztk;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zztk;->zzlf()V

    :goto_61
    iget-object p1, v0, Lcom/google/android/gms/internal/zztj;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    iput-object p1, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    iget-object p1, v0, Lcom/google/android/gms/internal/zztj;->zzbzz:Lcom/google/android/gms/internal/zzse;

    iget-object v1, p0, Lcom/google/android/gms/internal/zztl;->zzcak:Lcom/google/android/gms/internal/zztd;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzse;->zza(Lcom/google/android/gms/internal/zztd;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zztl;->zzcak:Lcom/google/android/gms/internal/zztd;

    iget-object v1, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zztd;->zzd(Lcom/google/android/gms/ads/internal/zzak;)V

    iget-boolean p1, v0, Lcom/google/android/gms/internal/zztj;->zzcac:Z

    return p1

    :cond_76
    invoke-direct {p0}, Lcom/google/android/gms/internal/zztl;->abort()V

    invoke-static {}, Lcom/google/android/gms/internal/zztk;->zzlc()Lcom/google/android/gms/internal/zztk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zztk;->zzlg()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/zza;->zzb(Lcom/google/android/gms/internal/zzjj;)Z

    move-result p1

    return p1
.end method

.method public final zzbr()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->zzbr()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    return-object v0

    :cond_9
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzbs()Lcom/google/android/gms/internal/zzjn;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->zzbs()Lcom/google/android/gms/internal/zzjn;

    move-result-object v0

    return-object v0

    :cond_9
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzbu()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->zzbu()V

    return-void

    :cond_8
    const-string v0, "Interstitial ad must be loaded before pingManualTrackingUrl()."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void
.end method

.method public final zzcd()Lcom/google/android/gms/internal/zzkx;
    .registers 3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getIAppEventListener not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zzce()Lcom/google/android/gms/internal/zzkh;
    .registers 3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getIAdListener not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zzcp()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztl;->zzbzx:Lcom/google/android/gms/ads/internal/zzak;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzd;->zzcp()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_9
    const/4 v0, 0x0

    return-object v0
.end method

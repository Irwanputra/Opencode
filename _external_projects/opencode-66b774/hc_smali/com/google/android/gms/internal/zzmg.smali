.class public final Lcom/google/android/gms/internal/zzmg;
.super Lcom/google/android/gms/internal/zzkt;
.source ""


# instance fields
.field private zzape:Lcom/google/android/gms/internal/zzkh;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzkt;-><init>()V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzmg;)Lcom/google/android/gms/internal/zzkh;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzmg;->zzape:Lcom/google/android/gms/internal/zzkh;

    return-object p0
.end method


# virtual methods
.method public final destroy()V
    .registers 1

    return-void
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/zzll;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isLoading()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public final isReady()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public final pause()V
    .registers 1

    return-void
.end method

.method public final resume()V
    .registers 1

    return-void
.end method

.method public final setImmersiveMode(Z)V
    .registers 2

    return-void
.end method

.method public final setManualImpressionsEnabled(Z)V
    .registers 2

    return-void
.end method

.method public final setUserId(Ljava/lang/String;)V
    .registers 2

    return-void
.end method

.method public final showInterstitial()V
    .registers 1

    return-void
.end method

.method public final stopLoading()V
    .registers 1

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzadp;)V
    .registers 2

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzjn;)V
    .registers 2

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzke;)V
    .registers 2

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzkh;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzmg;->zzape:Lcom/google/android/gms/internal/zzkh;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzkx;)V
    .registers 2

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzld;)V
    .registers 2

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzlr;)V
    .registers 2

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzmr;)V
    .registers 2

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzoa;)V
    .registers 2

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzxl;)V
    .registers 2

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzxr;Ljava/lang/String;)V
    .registers 3

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/zzjj;)Z
    .registers 3

    const-string p1, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->e(Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/internal/zzajr;->zzajw:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/zzmh;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzmh;-><init>(Lcom/google/android/gms/internal/zzmg;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    return p1
.end method

.method public final zzbr()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzbs()Lcom/google/android/gms/internal/zzjn;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzbu()V
    .registers 1

    return-void
.end method

.method public final zzcd()Lcom/google/android/gms/internal/zzkx;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzce()Lcom/google/android/gms/internal/zzkh;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzcp()Ljava/lang/String;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

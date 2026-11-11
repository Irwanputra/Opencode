.class public final Lcom/google/android/gms/internal/zzml;
.super Lcom/google/android/gms/internal/zzadl;
.source ""


# instance fields
.field private zzbgu:Lcom/google/android/gms/internal/zzadp;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadl;-><init>()V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzml;)Lcom/google/android/gms/internal/zzadp;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzml;->zzbgu:Lcom/google/android/gms/internal/zzadp;

    return-object p0
.end method


# virtual methods
.method public final destroy()V
    .registers 1

    return-void
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isLoaded()Z
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

.method public final setUserId(Ljava/lang/String;)V
    .registers 2

    return-void
.end method

.method public final show()V
    .registers 1

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzadp;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzml;->zzbgu:Lcom/google/android/gms/internal/zzadp;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzadv;)V
    .registers 3

    const-string p1, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->e(Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/internal/zzajr;->zzajw:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/zzmm;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzmm;-><init>(Lcom/google/android/gms/internal/zzml;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final zzb(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V
    .registers 2

    return-void
.end method

.method public final zzc(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V
    .registers 2

    return-void
.end method

.method public final zzd(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V
    .registers 2

    return-void
.end method

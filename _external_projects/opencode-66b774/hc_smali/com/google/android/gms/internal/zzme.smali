.class public final Lcom/google/android/gms/internal/zzme;
.super Lcom/google/android/gms/internal/zzkl;
.source ""


# instance fields
.field public final synthetic zzbgr:Lcom/google/android/gms/internal/zzmc;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/zzmc;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzme;->zzbgr:Lcom/google/android/gms/internal/zzmc;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzkl;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/zzmc;Lcom/google/android/gms/internal/zzmd;)V
    .registers 3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzme;-><init>(Lcom/google/android/gms/internal/zzmc;)V

    return-void
.end method


# virtual methods
.method public final getMediationAdapterClassName()Ljava/lang/String;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isLoading()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/zzjj;I)V
    .registers 3

    const-string p1, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->e(Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/internal/zzajr;->zzajw:Landroid/os/Handler;

    new-instance p2, Lcom/google/android/gms/internal/zzmf;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/zzmf;-><init>(Lcom/google/android/gms/internal/zzme;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final zzcp()Ljava/lang/String;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzd(Lcom/google/android/gms/internal/zzjj;)V
    .registers 3

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzme;->zza(Lcom/google/android/gms/internal/zzjj;I)V

    return-void
.end method

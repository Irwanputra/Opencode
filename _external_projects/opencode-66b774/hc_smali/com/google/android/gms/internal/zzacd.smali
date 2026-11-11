.class public final Lcom/google/android/gms/internal/zzacd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzcro:Lcom/google/android/gms/internal/zzaat;

.field private synthetic zzcrp:Lcom/google/android/gms/internal/zzabe;

.field private synthetic zzcrq:Lcom/google/android/gms/internal/zzacb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzacb;Lcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzabe;)V
    .registers 4

    iput-object p1, p0, Lcom/google/android/gms/internal/zzacd;->zzcrq:Lcom/google/android/gms/internal/zzacb;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzacd;->zzcro:Lcom/google/android/gms/internal/zzaat;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzacd;->zzcrp:Lcom/google/android/gms/internal/zzabe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzacd;->zzcrq:Lcom/google/android/gms/internal/zzacb;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacd;->zzcro:Lcom/google/android/gms/internal/zzaat;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzacb;->zzb(Lcom/google/android/gms/internal/zzaat;)Lcom/google/android/gms/internal/zzaax;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_8} :catch_9

    goto :goto_19

    :catch_9
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v1

    const-string v2, "AdRequestServiceImpl.loadAdAsync"

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/zzaft;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    const-string v1, "Could not fetch ad response due to an Exception."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_19
    if-nez v0, :cond_21

    new-instance v0, Lcom/google/android/gms/internal/zzaax;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaax;-><init>(I)V

    :cond_21
    :try_start_21
    iget-object v1, p0, Lcom/google/android/gms/internal/zzacd;->zzcrp:Lcom/google/android/gms/internal/zzabe;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/zzabe;->zza(Lcom/google/android/gms/internal/zzaax;)V
    :try_end_26
    .catch Landroid/os/RemoteException; {:try_start_21 .. :try_end_26} :catch_27

    return-void

    :catch_27
    move-exception v0

    const-string v1, "Fail to forward ad response."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

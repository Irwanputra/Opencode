.class public final Lcom/google/android/gms/internal/zzyn;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzckm:Lcom/google/android/gms/internal/zzalf;

.field private synthetic zzckn:Ljava/lang/String;

.field private synthetic zzcko:Lcom/google/android/gms/internal/zzym;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzym;Lcom/google/android/gms/internal/zzalf;Ljava/lang/String;)V
    .registers 4

    iput-object p1, p0, Lcom/google/android/gms/internal/zzyn;->zzcko:Lcom/google/android/gms/internal/zzym;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzyn;->zzckm:Lcom/google/android/gms/internal/zzalf;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzyn;->zzckn:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzyn;->zzckm:Lcom/google/android/gms/internal/zzalf;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzyn;->zzcko:Lcom/google/android/gms/internal/zzym;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzym;->zza(Lcom/google/android/gms/internal/zzym;)Lcom/google/android/gms/ads/internal/zzba;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/zzba;->zzdu()Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzyn;->zzckn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzqz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzalf;->set(Ljava/lang/Object;)V

    return-void
.end method

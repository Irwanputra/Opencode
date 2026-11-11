.class public final Lcom/google/android/gms/internal/zzgq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzaxn:Lcom/google/android/gms/internal/zzgp;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzgp;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzgq;->zzaxn:Lcom/google/android/gms/internal/zzgp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgq;->zzaxn:Lcom/google/android/gms/internal/zzgp;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzgp;->zza(Lcom/google/android/gms/internal/zzgp;I)V

    return-void
.end method

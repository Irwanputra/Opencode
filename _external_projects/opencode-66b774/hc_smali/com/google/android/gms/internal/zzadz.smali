.class public final Lcom/google/android/gms/internal/zzadz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzapt:Lcom/google/android/gms/internal/zzjj;

.field private synthetic zzcvm:Lcom/google/android/gms/internal/zzva;

.field private synthetic zzcvn:Lcom/google/android/gms/internal/zzady;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzady;Lcom/google/android/gms/internal/zzjj;Lcom/google/android/gms/internal/zzva;)V
    .registers 4

    iput-object p1, p0, Lcom/google/android/gms/internal/zzadz;->zzcvn:Lcom/google/android/gms/internal/zzady;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzadz;->zzapt:Lcom/google/android/gms/internal/zzjj;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzadz;->zzcvm:Lcom/google/android/gms/internal/zzva;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzcvn:Lcom/google/android/gms/internal/zzady;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadz;->zzapt:Lcom/google/android/gms/internal/zzjj;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzadz;->zzcvm:Lcom/google/android/gms/internal/zzva;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/zzady;->zza(Lcom/google/android/gms/internal/zzady;Lcom/google/android/gms/internal/zzjj;Lcom/google/android/gms/internal/zzva;)V

    return-void
.end method

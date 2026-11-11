.class public final synthetic Lcom/google/android/gms/internal/zzako;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbzb:Lcom/google/android/gms/internal/zzalf;

.field private final zzder:Lcom/google/android/gms/internal/zzakv;

.field private final zzdes:Lcom/google/android/gms/internal/zzakg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzalf;Lcom/google/android/gms/internal/zzakg;Lcom/google/android/gms/internal/zzakv;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzako;->zzbzb:Lcom/google/android/gms/internal/zzalf;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzako;->zzdes:Lcom/google/android/gms/internal/zzakg;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzako;->zzder:Lcom/google/android/gms/internal/zzakv;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzako;->zzbzb:Lcom/google/android/gms/internal/zzalf;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzako;->zzdes:Lcom/google/android/gms/internal/zzakg;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzako;->zzder:Lcom/google/android/gms/internal/zzakv;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/zzakl;->zza(Lcom/google/android/gms/internal/zzalf;Lcom/google/android/gms/internal/zzakg;Lcom/google/android/gms/internal/zzakv;)V

    return-void
.end method

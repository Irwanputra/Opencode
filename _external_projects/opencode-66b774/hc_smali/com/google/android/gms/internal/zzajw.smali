.class public final synthetic Lcom/google/android/gms/internal/zzajw;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzaka;


# instance fields
.field private final zzdec:Ljava/lang/String;

.field private final zzded:Ljava/lang/String;

.field private final zzdee:Ljava/util/Map;

.field private final zzdef:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzajw;->zzdec:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzajw;->zzded:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzajw;->zzdee:Ljava/util/Map;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzajw;->zzdef:[B

    return-void
.end method


# virtual methods
.method public final zza(Landroid/util/JsonWriter;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajw;->zzdec:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzajw;->zzded:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzajw;->zzdee:Ljava/util/Map;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzajw;->zzdef:[B

    invoke-static {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/zzajv;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BLandroid/util/JsonWriter;)V

    return-void
.end method

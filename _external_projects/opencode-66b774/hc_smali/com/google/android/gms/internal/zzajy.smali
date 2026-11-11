.class public final synthetic Lcom/google/android/gms/internal/zzajy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzaka;


# instance fields
.field private final zzdei:[B


# direct methods
.method public constructor <init>([B)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzajy;->zzdei:[B

    return-void
.end method


# virtual methods
.method public final zza(Landroid/util/JsonWriter;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzajy;->zzdei:[B

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzajv;->zza([BLandroid/util/JsonWriter;)V

    return-void
.end method

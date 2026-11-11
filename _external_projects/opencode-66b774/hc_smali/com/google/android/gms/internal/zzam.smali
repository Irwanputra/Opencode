.class public final Lcom/google/android/gms/internal/zzam;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final key:Ljava/lang/String;

.field public final zza:Ljava/lang/String;

.field public final zzb:J

.field public final zzc:J

.field public zzcb:J

.field public final zzd:J

.field public final zze:J

.field public final zzg:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzc;)V
    .registers 15

    iget-object v2, p2, Lcom/google/android/gms/internal/zzc;->zza:Ljava/lang/String;

    iget-wide v3, p2, Lcom/google/android/gms/internal/zzc;->zzb:J

    iget-wide v5, p2, Lcom/google/android/gms/internal/zzc;->zzc:J

    iget-wide v7, p2, Lcom/google/android/gms/internal/zzc;->zzd:J

    iget-wide v9, p2, Lcom/google/android/gms/internal/zzc;->zze:J

    iget-object v0, p2, Lcom/google/android/gms/internal/zzc;->zzg:Ljava/util/List;

    if-eqz v0, :cond_f

    goto :goto_15

    :cond_f
    iget-object v0, p2, Lcom/google/android/gms/internal/zzc;->zzf:Ljava/util/Map;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzao;->zza(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    :goto_15
    move-object v11, v0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/zzam;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/util/List;)V

    iget-object p1, p2, Lcom/google/android/gms/internal/zzc;->data:[B

    array-length p1, p1

    int-to-long p1, p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzam;->zzcb:J

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/util/List;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJJJ",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzam;->key:Ljava/lang/String;

    const-string p1, ""

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    const/4 p2, 0x0

    :cond_e
    iput-object p2, p0, Lcom/google/android/gms/internal/zzam;->zza:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/zzam;->zzb:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/zzam;->zzc:J

    iput-wide p7, p0, Lcom/google/android/gms/internal/zzam;->zzd:J

    iput-wide p9, p0, Lcom/google/android/gms/internal/zzam;->zze:J

    iput-object p11, p0, Lcom/google/android/gms/internal/zzam;->zzg:Ljava/util/List;

    return-void
.end method

.method public static zzc(Lcom/google/android/gms/internal/zzan;)Lcom/google/android/gms/internal/zzam;
    .registers 15

    invoke-static {p0}, Lcom/google/android/gms/internal/zzal;->zzb(Ljava/io/InputStream;)I

    move-result v0

    const v1, 0x20150306

    if-ne v0, v1, :cond_2c

    invoke-static {p0}, Lcom/google/android/gms/internal/zzal;->zza(Lcom/google/android/gms/internal/zzan;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Lcom/google/android/gms/internal/zzal;->zza(Lcom/google/android/gms/internal/zzan;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lcom/google/android/gms/internal/zzal;->zzc(Ljava/io/InputStream;)J

    move-result-wide v5

    invoke-static {p0}, Lcom/google/android/gms/internal/zzal;->zzc(Ljava/io/InputStream;)J

    move-result-wide v7

    invoke-static {p0}, Lcom/google/android/gms/internal/zzal;->zzc(Ljava/io/InputStream;)J

    move-result-wide v9

    invoke-static {p0}, Lcom/google/android/gms/internal/zzal;->zzc(Ljava/io/InputStream;)J

    move-result-wide v11

    invoke-static {p0}, Lcom/google/android/gms/internal/zzal;->zzb(Lcom/google/android/gms/internal/zzan;)Ljava/util/List;

    move-result-object v13

    new-instance p0, Lcom/google/android/gms/internal/zzam;

    move-object v2, p0

    invoke-direct/range {v2 .. v13}, Lcom/google/android/gms/internal/zzam;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/util/List;)V

    return-object p0

    :cond_2c
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final zza(Ljava/io/OutputStream;)Z
    .registers 7

    const v0, 0x20150306

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzal;->zza(Ljava/io/OutputStream;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzam;->key:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzal;->zza(Ljava/io/OutputStream;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzam;->zza:Ljava/lang/String;

    if-nez v0, :cond_13

    const-string v0, ""

    :cond_13
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzal;->zza(Ljava/io/OutputStream;Ljava/lang/String;)V

    iget-wide v3, p0, Lcom/google/android/gms/internal/zzam;->zzb:J

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/zzal;->zza(Ljava/io/OutputStream;J)V

    iget-wide v3, p0, Lcom/google/android/gms/internal/zzam;->zzc:J

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/zzal;->zza(Ljava/io/OutputStream;J)V

    iget-wide v3, p0, Lcom/google/android/gms/internal/zzam;->zzd:J

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/zzal;->zza(Ljava/io/OutputStream;J)V

    iget-wide v3, p0, Lcom/google/android/gms/internal/zzam;->zze:J

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/zzal;->zza(Ljava/io/OutputStream;J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzam;->zzg:Ljava/util/List;

    if-eqz v0, :cond_54

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {p1, v3}, Lcom/google/android/gms/internal/zzal;->zza(Ljava/io/OutputStream;I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_39
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_57

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzl;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzl;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/zzal;->zza(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzl;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/google/android/gms/internal/zzal;->zza(Ljava/io/OutputStream;Ljava/lang/String;)V

    goto :goto_39

    :cond_54
    invoke-static {p1, v2}, Lcom/google/android/gms/internal/zzal;->zza(Ljava/io/OutputStream;I)V

    :cond_57
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_5a
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5a} :catch_5b

    return v1

    :catch_5b
    move-exception p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v2

    const-string p1, "%s"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzae;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2
.end method

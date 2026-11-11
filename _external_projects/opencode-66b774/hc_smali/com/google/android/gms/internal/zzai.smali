.class public Lcom/google/android/gms/internal/zzai;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzm;


# static fields
.field private static DEBUG:Z


# instance fields
.field private zzbp:Lcom/google/android/gms/internal/zzaq;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private final zzbq:Lcom/google/android/gms/internal/zzah;

.field private zzbr:Lcom/google/android/gms/internal/zzaj;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    sget-boolean v0, Lcom/google/android/gms/internal/zzae;->DEBUG:Z

    sput-boolean v0, Lcom/google/android/gms/internal/zzai;->DEBUG:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzah;)V
    .registers 4

    new-instance v0, Lcom/google/android/gms/internal/zzaj;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaj;-><init>(I)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzai;-><init>(Lcom/google/android/gms/internal/zzah;Lcom/google/android/gms/internal/zzaj;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/zzah;Lcom/google/android/gms/internal/zzaj;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzai;->zzbq:Lcom/google/android/gms/internal/zzah;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzai;->zzbp:Lcom/google/android/gms/internal/zzaq;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzai;->zzbr:Lcom/google/android/gms/internal/zzaj;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzaq;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzaj;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaj;-><init>(I)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzai;-><init>(Lcom/google/android/gms/internal/zzaq;Lcom/google/android/gms/internal/zzaj;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/zzaq;Lcom/google/android/gms/internal/zzaj;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzai;->zzbp:Lcom/google/android/gms/internal/zzaq;

    new-instance v0, Lcom/google/android/gms/internal/zzag;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzag;-><init>(Lcom/google/android/gms/internal/zzaq;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzai;->zzbq:Lcom/google/android/gms/internal/zzah;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzai;->zzbr:Lcom/google/android/gms/internal/zzaj;

    return-void
.end method

.method private static zza(Ljava/util/List;Lcom/google/android/gms/internal/zzc;)Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzl;",
            ">;",
            "Lcom/google/android/gms/internal/zzc;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/zzl;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/TreeSet;

    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_25

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_25

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzl;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzl;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_25
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object p0, p1, Lcom/google/android/gms/internal/zzc;->zzg:Ljava/util/List;

    if-eqz p0, :cond_54

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_91

    iget-object p0, p1, Lcom/google/android/gms/internal/zzc;->zzg:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3a
    :goto_3a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_91

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzl;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3a

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3a

    :cond_54
    iget-object p0, p1, Lcom/google/android/gms/internal/zzc;->zzf:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_91

    iget-object p0, p1, Lcom/google/android/gms/internal/zzc;->zzf:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_66
    :goto_66
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_91

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_66

    new-instance v2, Lcom/google/android/gms/internal/zzl;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v2, v3, p1}, Lcom/google/android/gms/internal/zzl;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_66

    :cond_91
    return-object v1
.end method

.method private static zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzr;Lcom/google/android/gms/internal/zzad;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzr<",
            "*>;",
            "Lcom/google/android/gms/internal/zzad;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzr;->zzi()Lcom/google/android/gms/internal/zzaa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzr;->zzh()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    :try_start_b
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/zzaa;->zza(Lcom/google/android/gms/internal/zzad;)V
    :try_end_e
    .catch Lcom/google/android/gms/internal/zzad; {:try_start_b .. :try_end_e} :catch_22

    new-array p2, v4, [Ljava/lang/Object;

    aput-object p0, p2, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, p2, v2

    const-string p0, "%s-retry [timeout=%s]"

    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzr;->zzb(Ljava/lang/String;)V

    return-void

    :catch_22
    move-exception p2

    new-array v0, v4, [Ljava/lang/Object;

    aput-object p0, v0, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v0, v2

    const-string p0, "%s-timeout-giveup [timeout=%s]"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzr;->zzb(Ljava/lang/String;)V

    throw p2
.end method

.method private final zza(Ljava/io/InputStream;I)[B
    .registers 8

    new-instance v0, Lcom/google/android/gms/internal/zzat;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzai;->zzbr:Lcom/google/android/gms/internal/zzaj;

    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/internal/zzat;-><init>(Lcom/google/android/gms/internal/zzaj;I)V

    const-string p2, "Error occurred when closing InputStream"

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p1, :cond_38

    :try_start_d
    iget-object v3, p0, Lcom/google/android/gms/internal/zzai;->zzbr:Lcom/google/android/gms/internal/zzaj;

    const/16 v4, 0x400

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/zzaj;->zzb(I)[B

    move-result-object v2

    :goto_15
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_20

    invoke-virtual {v0, v2, v1, v3}, Lcom/google/android/gms/internal/zzat;->write([BII)V

    goto :goto_15

    :cond_20
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3
    :try_end_24
    .catchall {:try_start_d .. :try_end_24} :catchall_36

    :try_start_24
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_27
    .catch Ljava/io/IOException; {:try_start_24 .. :try_end_27} :catch_28

    goto :goto_2d

    :catch_28
    new-array p1, v1, [Ljava/lang/Object;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzae;->zza(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2d
    iget-object p1, p0, Lcom/google/android/gms/internal/zzai;->zzbr:Lcom/google/android/gms/internal/zzaj;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/zzaj;->zza([B)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzat;->close()V

    return-object v3

    :catchall_36
    move-exception v3

    goto :goto_3e

    :cond_38
    :try_start_38
    new-instance v3, Lcom/google/android/gms/internal/zzab;

    invoke-direct {v3}, Lcom/google/android/gms/internal/zzab;-><init>()V

    throw v3
    :try_end_3e
    .catchall {:try_start_38 .. :try_end_3e} :catchall_36

    :goto_3e
    if-eqz p1, :cond_49

    :try_start_40
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_43
    .catch Ljava/io/IOException; {:try_start_40 .. :try_end_43} :catch_44

    goto :goto_49

    :catch_44
    new-array p1, v1, [Ljava/lang/Object;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzae;->zza(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_49
    :goto_49
    iget-object p1, p0, Lcom/google/android/gms/internal/zzai;->zzbr:Lcom/google/android/gms/internal/zzaj;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/zzaj;->zza([B)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzat;->close()V

    goto :goto_53

    :goto_52
    throw v3

    :goto_53
    goto :goto_52
.end method


# virtual methods
.method public zzc(Lcom/google/android/gms/internal/zzr;)Lcom/google/android/gms/internal/zzp;
    .registers 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzr<",
            "*>;)",
            "Lcom/google/android/gms/internal/zzp;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    :goto_8
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    :try_start_10
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/zzr;->zze()Lcom/google/android/gms/internal/zzc;

    move-result-object v0

    if-nez v0, :cond_1b

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_3b

    :cond_1b
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    iget-object v11, v0, Lcom/google/android/gms/internal/zzc;->zza:Ljava/lang/String;

    if-eqz v11, :cond_29

    const-string v12, "If-None-Match"

    invoke-virtual {v10, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_29
    iget-wide v11, v0, Lcom/google/android/gms/internal/zzc;->zzc:J

    const-wide/16 v13, 0x0

    cmp-long v0, v11, v13

    if-lez v0, :cond_3a

    const-string v0, "If-Modified-Since"

    invoke-static {v11, v12}, Lcom/google/android/gms/internal/zzao;->zzb(J)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v0, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3a
    move-object v0, v10

    :goto_3b
    iget-object v10, v1, Lcom/google/android/gms/internal/zzai;->zzbq:Lcom/google/android/gms/internal/zzah;

    invoke-virtual {v10, v2, v0}, Lcom/google/android/gms/internal/zzah;->zza(Lcom/google/android/gms/internal/zzr;Ljava/util/Map;)Lcom/google/android/gms/internal/zzap;

    move-result-object v10
    :try_end_41
    .catch Ljava/net/SocketTimeoutException; {:try_start_10 .. :try_end_41} :catch_188
    .catch Ljava/net/MalformedURLException; {:try_start_10 .. :try_end_41} :catch_167
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_41} :catch_f8

    :try_start_41
    invoke-virtual {v10}, Lcom/google/android/gms/internal/zzap;->getStatusCode()I

    move-result v12

    invoke-virtual {v10}, Lcom/google/android/gms/internal/zzap;->zzp()Ljava/util/List;

    move-result-object v5

    const/16 v0, 0x130

    if-ne v12, v0, :cond_81

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/zzr;->zze()Lcom/google/android/gms/internal/zzc;

    move-result-object v0

    if-nez v0, :cond_67

    new-instance v0, Lcom/google/android/gms/internal/zzp;

    const/16 v14, 0x130

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    sub-long v17, v11, v3

    move-object v13, v0

    move-object/from16 v19, v5

    invoke-direct/range {v13 .. v19}, Lcom/google/android/gms/internal/zzp;-><init>(I[BZJLjava/util/List;)V

    return-object v0

    :cond_67
    invoke-static {v5, v0}, Lcom/google/android/gms/internal/zzai;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzc;)Ljava/util/List;

    move-result-object v25

    new-instance v11, Lcom/google/android/gms/internal/zzp;

    const/16 v20, 0x130

    iget-object v0, v0, Lcom/google/android/gms/internal/zzc;->data:[B

    const/16 v22, 0x1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    sub-long v23, v12, v3

    move-object/from16 v19, v11

    move-object/from16 v21, v0

    invoke-direct/range {v19 .. v25}, Lcom/google/android/gms/internal/zzp;-><init>(I[BZJLjava/util/List;)V

    return-object v11

    :cond_81
    invoke-virtual {v10}, Lcom/google/android/gms/internal/zzap;->getContent()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_90

    invoke-virtual {v10}, Lcom/google/android/gms/internal/zzap;->getContentLength()I

    move-result v11

    invoke-direct {v1, v0, v11}, Lcom/google/android/gms/internal/zzai;->zza(Ljava/io/InputStream;I)[B

    move-result-object v0

    goto :goto_92

    :cond_90
    new-array v0, v9, [B

    :goto_92
    move-object v8, v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v13

    sub-long/2addr v13, v3

    sget-boolean v0, Lcom/google/android/gms/internal/zzai;->DEBUG:Z

    if-nez v0, :cond_a2

    const-wide/16 v15, 0xbb8

    cmp-long v0, v13, v15

    if-lez v0, :cond_d4

    :cond_a2
    const-string v0, "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"

    const/4 v11, 0x5

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v2, v11, v9

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    aput-object v13, v11, v6

    if-eqz v8, :cond_b7

    array-length v13, v8

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    goto :goto_b9

    :cond_b7
    const-string v13, "null"

    :goto_b9
    aput-object v13, v11, v7

    const/4 v13, 0x3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v11, v13

    const/4 v13, 0x4

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/zzr;->zzi()Lcom/google/android/gms/internal/zzaa;

    move-result-object v14

    invoke-interface {v14}, Lcom/google/android/gms/internal/zzaa;->zzc()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v11, v13

    invoke-static {v0, v11}, Lcom/google/android/gms/internal/zzae;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_d4
    const/16 v0, 0xc8

    if-lt v12, v0, :cond_ec

    const/16 v0, 0x12b

    if-gt v12, v0, :cond_ec

    new-instance v0, Lcom/google/android/gms/internal/zzp;

    const/4 v14, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v15

    sub-long/2addr v15, v3

    move-object v11, v0

    move-object v13, v8

    move-object/from16 v17, v5

    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/internal/zzp;-><init>(I[BZJLjava/util/List;)V

    return-object v0

    :cond_ec
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
    :try_end_f2
    .catch Ljava/net/SocketTimeoutException; {:try_start_41 .. :try_end_f2} :catch_188
    .catch Ljava/net/MalformedURLException; {:try_start_41 .. :try_end_f2} :catch_167
    .catch Ljava/io/IOException; {:try_start_41 .. :try_end_f2} :catch_f2

    :catch_f2
    move-exception v0

    move-object/from16 v17, v5

    move-object v13, v8

    move-object v8, v10

    goto :goto_fc

    :catch_f8
    move-exception v0

    move-object/from16 v17, v5

    move-object v13, v8

    :goto_fc
    if-eqz v8, :cond_161

    invoke-virtual {v8}, Lcom/google/android/gms/internal/zzap;->getStatusCode()I

    move-result v0

    new-array v5, v7, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v9

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/zzr;->getUrl()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const-string v6, "Unexpected response code %d for %s"

    invoke-static {v6, v5}, Lcom/google/android/gms/internal/zzae;->zzc(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v13, :cond_159

    new-instance v5, Lcom/google/android/gms/internal/zzp;

    const/4 v14, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    sub-long v15, v6, v3

    move-object v11, v5

    move v12, v0

    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/internal/zzp;-><init>(I[BZJLjava/util/List;)V

    const/16 v6, 0x191

    if-eq v0, v6, :cond_151

    const/16 v6, 0x193

    if-ne v0, v6, :cond_12e

    goto :goto_151

    :cond_12e
    const/16 v2, 0x190

    if-lt v0, v2, :cond_13d

    const/16 v2, 0x1f3

    if-le v0, v2, :cond_137

    goto :goto_13d

    :cond_137
    new-instance v0, Lcom/google/android/gms/internal/zzg;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/zzg;-><init>(Lcom/google/android/gms/internal/zzp;)V

    throw v0

    :cond_13d
    :goto_13d
    const/16 v2, 0x1f4

    if-lt v0, v2, :cond_14b

    const/16 v2, 0x257

    if-gt v0, v2, :cond_14b

    new-instance v0, Lcom/google/android/gms/internal/zzab;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/zzab;-><init>(Lcom/google/android/gms/internal/zzp;)V

    throw v0

    :cond_14b
    new-instance v0, Lcom/google/android/gms/internal/zzab;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/zzab;-><init>(Lcom/google/android/gms/internal/zzp;)V

    throw v0

    :cond_151
    :goto_151
    new-instance v0, Lcom/google/android/gms/internal/zza;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/zza;-><init>(Lcom/google/android/gms/internal/zzp;)V

    const-string v5, "auth"

    goto :goto_18f

    :cond_159
    new-instance v0, Lcom/google/android/gms/internal/zzo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzo;-><init>()V

    const-string v5, "network"

    goto :goto_18f

    :cond_161
    new-instance v2, Lcom/google/android/gms/internal/zzq;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/zzq;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catch_167
    move-exception v0

    new-instance v3, Ljava/lang/RuntimeException;

    const-string v4, "Bad URL "

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/zzr;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_17f

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_184

    :cond_17f
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_184
    invoke-direct {v3, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_188
    new-instance v0, Lcom/google/android/gms/internal/zzac;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzac;-><init>()V

    const-string v5, "socket"

    :goto_18f
    invoke-static {v5, v2, v0}, Lcom/google/android/gms/internal/zzai;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzr;Lcom/google/android/gms/internal/zzad;)V

    goto/16 :goto_8
.end method

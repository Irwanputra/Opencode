.class public final Lcom/google/android/gms/internal/zzang;
.super Lcom/google/android/gms/internal/zzana;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field private static final zzdki:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdkj:Ljava/text/DecimalFormat;


# instance fields
.field private zzdkk:Ljava/io/File;

.field private zzdkl:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/zzang;->zzdki:Ljava/util/Set;

    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "#,###"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/zzang;->zzdkj:Ljava/text/DecimalFormat;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzamp;)V
    .registers 5

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzana;-><init>(Lcom/google/android/gms/internal/zzamp;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/zzana;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_11

    const-string p1, "Context.getCacheDir() returned null"

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void

    :cond_11
    new-instance v0, Ljava/io/File;

    const-string v1, "admobVideoStreams"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_4c

    iget-object p1, p0, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result p1

    if-nez p1, :cond_4c

    const-string p1, "Could not create preload cache directory at "

    iget-object v1, p0, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_40

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_46

    :cond_40
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v1

    :goto_46
    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    return-void

    :cond_4c
    iget-object p1, p0, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Ljava/io/File;->setReadable(ZZ)Z

    move-result p1

    if-eqz p1, :cond_60

    iget-object p1, p0, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    invoke-virtual {p1, v1, v2}, Ljava/io/File;->setExecutable(ZZ)Z

    move-result p1

    if-nez p1, :cond_5f

    goto :goto_60

    :cond_5f
    return-void

    :cond_60
    :goto_60
    const-string p1, "Could not set cache file permissions at "

    iget-object v1, p0, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_77

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_7d

    :cond_77
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, v1

    :goto_7d
    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    return-void
.end method

.method private final zzc(Ljava/io/File;)Ljava/io/File;
    .registers 5

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v2, ".done"

    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final abort()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzang;->zzdkl:Z

    return-void
.end method

.method public final zzcx(Ljava/lang/String;)Z
    .registers 30

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    iget-object v0, v8, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-nez v0, :cond_10

    const-string v0, "noCacheDir"

    :goto_c
    invoke-virtual {v8, v9, v10, v0, v10}, Lcom/google/android/gms/internal/zzana;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v11

    :cond_10
    iget-object v0, v8, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    if-nez v0, :cond_16

    const/4 v3, 0x0

    goto :goto_32

    :cond_16
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1d
    if-ge v2, v1, :cond_32

    aget-object v4, v0, v2

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".done"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2f

    add-int/lit8 v3, v3, 0x1

    :cond_2f
    add-int/lit8 v2, v2, 0x1

    goto :goto_1d

    :cond_32
    :goto_32
    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbie:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le v3, v0, :cond_93

    iget-object v0, v8, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    if-nez v0, :cond_4a

    :cond_48
    const/4 v0, 0x0

    goto :goto_88

    :cond_4a
    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v3, v0

    move-object v5, v10

    const/4 v4, 0x0

    :goto_56
    if-ge v4, v3, :cond_73

    aget-object v6, v0, v4

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v12, ".done"

    invoke-virtual {v7, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_70

    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    move-result-wide v12

    cmp-long v7, v12, v1

    if-gez v7, :cond_70

    move-object v5, v6

    move-wide v1, v12

    :cond_70
    add-int/lit8 v4, v4, 0x1

    goto :goto_56

    :cond_73
    if-eqz v5, :cond_48

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v0

    invoke-direct {v8, v5}, Lcom/google/android/gms/internal/zzang;->zzc(Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_88

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    and-int/2addr v0, v1

    :cond_88
    :goto_88
    if-nez v0, :cond_10

    const-string v0, "Unable to expire stream cache"

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    const-string v0, "expireFailed"

    goto/16 :goto_c

    :cond_93
    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzia()Lcom/google/android/gms/internal/zzajr;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/zzajr;->zzcp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v12, Ljava/io/File;

    iget-object v1, v8, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    invoke-direct {v12, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v8, v12}, Lcom/google/android/gms/internal/zzang;->zzc(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v12}, Ljava/io/File;->isFile()Z

    move-result v1

    const/4 v13, 0x1

    if-eqz v1, :cond_d9

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_d9

    invoke-virtual {v12}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v1, v0

    const-string v0, "Stream cache hit at "

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_c8

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_ce

    :cond_c8
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v2

    :goto_ce
    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v9, v0, v1}, Lcom/google/android/gms/internal/zzana;->zza(Ljava/lang/String;Ljava/lang/String;I)V

    return v13

    :cond_d9
    iget-object v1, v8, Lcom/google/android/gms/internal/zzang;->zzdkk:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_f3

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v14, v1

    goto :goto_f9

    :cond_f3
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v14, v2

    :goto_f9
    sget-object v1, Lcom/google/android/gms/internal/zzang;->zzdki:Ljava/util/Set;

    monitor-enter v1

    :try_start_fc
    invoke-interface {v1, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_127

    const-string v0, "Stream cache already in progress at "

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_113

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_119

    :cond_113
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v2

    :goto_119
    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "inProgress"

    invoke-virtual {v8, v9, v0, v2, v10}, Lcom/google/android/gms/internal/zzana;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v1

    return v11

    :cond_127
    invoke-interface {v1, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_12b
    .catchall {:try_start_fc .. :try_end_12b} :catchall_511

    const-string v15, "error"

    :try_start_12d
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzet()Lcom/google/android/gms/internal/zzalg;

    sget-object v2, Lcom/google/android/gms/internal/zznh;->zzbij:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v9, v2}, Lcom/google/android/gms/internal/zzalg;->zzb(Ljava/lang/String;I)Ljava/net/HttpURLConnection;

    move-result-object v2

    instance-of v3, v2, Ljava/net/HttpURLConnection;
    :try_end_146
    .catch Ljava/io/IOException; {:try_start_12d .. :try_end_146} :catch_476
    .catch Ljava/lang/RuntimeException; {:try_start_12d .. :try_end_146} :catch_474

    if-eqz v3, :cond_1a2

    :try_start_148
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    const/16 v4, 0x190

    if-lt v3, v4, :cond_1a2

    const-string v15, "badUrl"

    const-string v0, "HTTP request failed. Code: "

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_168

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto :goto_16d

    :cond_168
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    :try_end_16d
    .catch Ljava/io/IOException; {:try_start_148 .. :try_end_16d} :catch_19d
    .catch Ljava/lang/RuntimeException; {:try_start_148 .. :try_end_16d} :catch_19b

    :goto_16d
    :try_start_16d
    new-instance v0, Ljava/io/IOException;

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x20

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "HTTP status code "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " at "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_196
    .catch Ljava/io/IOException; {:try_start_16d .. :try_end_196} :catch_198
    .catch Ljava/lang/RuntimeException; {:try_start_16d .. :try_end_196} :catch_196

    :catch_196
    move-exception v0

    goto :goto_199

    :catch_198
    move-exception v0

    :goto_199
    move-object v2, v1

    goto :goto_19f

    :catch_19b
    move-exception v0

    goto :goto_19e

    :catch_19d
    move-exception v0

    :goto_19e
    move-object v2, v10

    :goto_19f
    move-object v1, v14

    goto/16 :goto_47c

    :cond_1a2
    :try_start_1a2
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentLength()I

    move-result v7
    :try_end_1a6
    .catch Ljava/io/IOException; {:try_start_1a2 .. :try_end_1a6} :catch_476
    .catch Ljava/lang/RuntimeException; {:try_start_1a2 .. :try_end_1a6} :catch_474

    if-gez v7, :cond_1cf

    :try_start_1a8
    const-string v0, "Stream cache aborted, missing content-length header at "

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1b9

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1bf

    :cond_1b9
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v2

    :goto_1bf
    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "contentLengthMissing"

    invoke-virtual {v8, v9, v0, v2, v10}, Lcom/google/android/gms/internal/zzana;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v14}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1ce
    .catch Ljava/io/IOException; {:try_start_1a8 .. :try_end_1ce} :catch_19d
    .catch Ljava/lang/RuntimeException; {:try_start_1a8 .. :try_end_1ce} :catch_19b

    return v11

    :cond_1cf
    :try_start_1cf
    sget-object v3, Lcom/google/android/gms/internal/zzang;->zzdkj:Ljava/text/DecimalFormat;

    int-to-long v4, v7

    invoke-virtual {v3, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/zznh;->zzbif:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6
    :try_end_1e6
    .catch Ljava/io/IOException; {:try_start_1cf .. :try_end_1e6} :catch_476
    .catch Ljava/lang/RuntimeException; {:try_start_1cf .. :try_end_1e6} :catch_474

    if-le v7, v6, :cond_23b

    :try_start_1e8
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x21

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v0, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Content length "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " exceeds limit at "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    const-string v0, "File too big for full file cache. Size: "

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_228

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_22e

    :cond_228
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v2

    :goto_22e
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string v3, "sizeExceeded"

    invoke-virtual {v8, v9, v2, v3, v0}, Lcom/google/android/gms/internal/zzana;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v14}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_23a
    .catch Ljava/io/IOException; {:try_start_1e8 .. :try_end_23a} :catch_19d
    .catch Ljava/lang/RuntimeException; {:try_start_1e8 .. :try_end_23a} :catch_19b

    return v11

    :cond_23b
    :try_start_23b
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v1, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Caching "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " bytes from "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-static {v1}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;

    move-result-object v5

    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_277
    .catch Ljava/io/IOException; {:try_start_23b .. :try_end_277} :catch_476
    .catch Ljava/lang/RuntimeException; {:try_start_23b .. :try_end_277} :catch_474

    :try_start_277
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v3

    const/high16 v1, 0x100000

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v1
    :try_end_285
    .catch Ljava/io/IOException; {:try_start_277 .. :try_end_285} :catch_46a
    .catch Ljava/lang/RuntimeException; {:try_start_277 .. :try_end_285} :catch_468

    :try_start_285
    check-cast v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16
    :try_end_28e
    .catch Ljava/io/IOException; {:try_start_285 .. :try_end_28e} :catch_463
    .catch Ljava/lang/RuntimeException; {:try_start_285 .. :try_end_28e} :catch_45c

    .line 2
    :try_start_28e
    sget-object v1, Lcom/google/android/gms/internal/zznh;->zzbii:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v10

    invoke-virtual {v10, v1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;
    :try_end_29a
    .catch Ljava/io/IOException; {:try_start_28e .. :try_end_29a} :catch_46a
    .catch Ljava/lang/RuntimeException; {:try_start_28e .. :try_end_29a} :catch_468

    move-object v10, v14

    :try_start_29b
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    new-instance v1, Lcom/google/android/gms/internal/zzaji;

    invoke-direct {v1, v13, v14}, Lcom/google/android/gms/internal/zzaji;-><init>(J)V

    sget-object v13, Lcom/google/android/gms/internal/zznh;->zzbih:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v14

    invoke-virtual {v14, v13}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Long;

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    :goto_2b4
    invoke-interface {v5, v2}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v18
    :try_end_2b8
    .catch Ljava/io/IOException; {:try_start_29b .. :try_end_2b8} :catch_457
    .catch Ljava/lang/RuntimeException; {:try_start_29b .. :try_end_2b8} :catch_455

    if-ltz v18, :cond_3d6

    add-int v11, v11, v18

    if-le v11, v6, :cond_2f1

    :try_start_2be
    const-string v15, "sizeExceeded"

    const-string v0, "File too big for full file cache. Size: "

    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_2d6

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto :goto_2db

    :cond_2d6
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    :try_end_2db
    .catch Ljava/io/IOException; {:try_start_2be .. :try_end_2db} :catch_2eb
    .catch Ljava/lang/RuntimeException; {:try_start_2be .. :try_end_2db} :catch_2e9

    :goto_2db
    :try_start_2db
    new-instance v0, Ljava/io/IOException;

    const-string v2, "stream cache file size limit exceeded"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2e3
    .catch Ljava/io/IOException; {:try_start_2db .. :try_end_2e3} :catch_2e5
    .catch Ljava/lang/RuntimeException; {:try_start_2db .. :try_end_2e3} :catch_2e3

    :catch_2e3
    move-exception v0

    goto :goto_2e6

    :catch_2e5
    move-exception v0

    :goto_2e6
    move-object v2, v1

    move-object v1, v10

    goto :goto_2ee

    :catch_2e9
    move-exception v0

    goto :goto_2ec

    :catch_2eb
    move-exception v0

    :goto_2ec
    move-object v1, v10

    const/4 v2, 0x0

    :goto_2ee
    move-object v10, v4

    goto/16 :goto_47c

    :cond_2f1
    :try_start_2f1
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :cond_2f4
    invoke-virtual {v3, v2}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v18

    if-gtz v18, :cond_2f4

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;
    :try_end_2fd
    .catch Ljava/io/IOException; {:try_start_2f1 .. :try_end_2fd} :catch_3ce
    .catch Ljava/lang/RuntimeException; {:try_start_2f1 .. :try_end_2fd} :catch_3cc

    .line 3
    :try_start_2fd
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18
    :try_end_301
    .catch Ljava/io/IOException; {:try_start_2fd .. :try_end_301} :catch_3ca
    .catch Ljava/lang/RuntimeException; {:try_start_2fd .. :try_end_301} :catch_3c2

    sub-long v18, v18, v16

    const-wide/16 v20, 0x3e8

    mul-long v20, v20, v13

    cmp-long v22, v18, v20

    if-gtz v22, :cond_380

    move-object/from16 v18, v2

    .line 4
    :try_start_30d
    iget-boolean v2, v8, Lcom/google/android/gms/internal/zzang;->zzdkl:Z

    if-nez v2, :cond_370

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaji;->tryAcquire()Z

    move-result v2

    if-eqz v2, :cond_34c

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v19

    sget-object v2, Lcom/google/android/gms/internal/zzajr;->zzajw:Landroid/os/Handler;
    :try_end_31d
    .catch Ljava/io/IOException; {:try_start_30d .. :try_end_31d} :catch_3ce
    .catch Ljava/lang/RuntimeException; {:try_start_30d .. :try_end_31d} :catch_3cc

    move-object/from16 v20, v15

    :try_start_31f
    new-instance v15, Lcom/google/android/gms/internal/zzanb;
    :try_end_321
    .catch Ljava/io/IOException; {:try_start_31f .. :try_end_321} :catch_346
    .catch Ljava/lang/RuntimeException; {:try_start_31f .. :try_end_321} :catch_344

    const/16 v21, 0x0

    move-object/from16 v22, v1

    move-object v1, v15

    move-object/from16 v23, v10

    move-object v10, v2

    move-object/from16 v2, p0

    move-object/from16 v24, v3

    move-object/from16 v3, p1

    move-object/from16 v25, v4

    move-object/from16 v4, v19

    move-object/from16 v19, v5

    move v5, v11

    move/from16 v26, v6

    move v6, v7

    move/from16 v27, v7

    move/from16 v7, v21

    :try_start_33d
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/zzanb;-><init>(Lcom/google/android/gms/internal/zzana;Ljava/lang/String;Ljava/lang/String;IIZ)V

    invoke-virtual {v10, v15}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_35c

    :catch_344
    move-exception v0

    goto :goto_347

    :catch_346
    move-exception v0

    :goto_347
    move-object/from16 v25, v4

    move-object v1, v10

    goto/16 :goto_465

    :cond_34c
    move-object/from16 v22, v1

    move-object/from16 v24, v3

    move-object/from16 v25, v4

    move-object/from16 v19, v5

    move/from16 v26, v6

    move/from16 v27, v7

    move-object/from16 v23, v10

    move-object/from16 v20, v15

    :goto_35c
    move-object/from16 v2, v18

    move-object/from16 v5, v19

    move-object/from16 v15, v20

    move-object/from16 v1, v22

    move-object/from16 v10, v23

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    move/from16 v6, v26

    move/from16 v7, v27

    goto/16 :goto_2b4

    :cond_370
    move-object/from16 v25, v4

    move-object/from16 v23, v10

    move-object/from16 v20, v15

    const-string v15, "externalAbort"
    :try_end_378
    .catch Ljava/io/IOException; {:try_start_33d .. :try_end_378} :catch_41f
    .catch Ljava/lang/RuntimeException; {:try_start_33d .. :try_end_378} :catch_41d

    :try_start_378
    new-instance v0, Ljava/io/IOException;

    const-string v1, "abort requested"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_380
    .catch Ljava/io/IOException; {:try_start_378 .. :try_end_380} :catch_3c0
    .catch Ljava/lang/RuntimeException; {:try_start_378 .. :try_end_380} :catch_3be

    :cond_380
    move-object/from16 v25, v4

    move-object/from16 v23, v10

    move-object/from16 v20, v15

    :try_start_386
    const-string v15, "downloadTimeout"
    :try_end_388
    .catch Ljava/io/IOException; {:try_start_386 .. :try_end_388} :catch_41f
    .catch Ljava/lang/RuntimeException; {:try_start_386 .. :try_end_388} :catch_41d

    :try_start_388
    invoke-static {v13, v14}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Timeout exceeded. Limit: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " sec"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10
    :try_end_3ac
    .catch Ljava/io/IOException; {:try_start_388 .. :try_end_3ac} :catch_3c0
    .catch Ljava/lang/RuntimeException; {:try_start_388 .. :try_end_3ac} :catch_3be

    :try_start_3ac
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream cache time limit exceeded"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3b4
    .catch Ljava/io/IOException; {:try_start_3ac .. :try_end_3b4} :catch_3b6
    .catch Ljava/lang/RuntimeException; {:try_start_3ac .. :try_end_3b4} :catch_3b4

    :catch_3b4
    move-exception v0

    goto :goto_3b7

    :catch_3b6
    move-exception v0

    :goto_3b7
    move-object v2, v10

    move-object/from16 v1, v23

    move-object/from16 v10, v25

    goto/16 :goto_47c

    :catch_3be
    move-exception v0

    goto :goto_422

    :catch_3c0
    move-exception v0

    goto :goto_422

    :catch_3c2
    move-exception v0

    :goto_3c3
    move-object/from16 v25, v4

    move-object/from16 v23, v10

    move-object/from16 v20, v15

    goto :goto_420

    :catch_3ca
    move-exception v0

    goto :goto_3c3

    :catch_3cc
    move-exception v0

    goto :goto_3cf

    :catch_3ce
    move-exception v0

    :goto_3cf
    move-object/from16 v25, v4

    move-object/from16 v20, v15

    move-object v1, v10

    goto/16 :goto_470

    :cond_3d6
    move-object/from16 v25, v4

    move-object/from16 v23, v10

    move-object/from16 v20, v15

    :try_start_3dc
    invoke-virtual/range {v25 .. v25}, Ljava/io/FileOutputStream;->close()V

    const/4 v1, 0x3

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzae(I)Z

    move-result v1
    :try_end_3e4
    .catch Ljava/io/IOException; {:try_start_3dc .. :try_end_3e4} :catch_451
    .catch Ljava/lang/RuntimeException; {:try_start_3dc .. :try_end_3e4} :catch_44f

    if-eqz v1, :cond_425

    :try_start_3e6
    sget-object v1, Lcom/google/android/gms/internal/zzang;->zzdkj:Ljava/text/DecimalFormat;

    int-to-long v2, v11

    invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x16

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Preloaded "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " bytes from "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V
    :try_end_41c
    .catch Ljava/io/IOException; {:try_start_3e6 .. :try_end_41c} :catch_41f
    .catch Ljava/lang/RuntimeException; {:try_start_3e6 .. :try_end_41c} :catch_41d

    goto :goto_425

    :catch_41d
    move-exception v0

    goto :goto_420

    :catch_41f
    move-exception v0

    :goto_420
    move-object/from16 v15, v20

    :goto_422
    move-object/from16 v1, v23

    goto :goto_470

    :cond_425
    :goto_425
    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_427
    invoke-virtual {v12, v1, v2}, Ljava/io/File;->setReadable(ZZ)Z

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1
    :try_end_42e
    .catch Ljava/io/IOException; {:try_start_427 .. :try_end_42e} :catch_451
    .catch Ljava/lang/RuntimeException; {:try_start_427 .. :try_end_42e} :catch_44f

    if-eqz v1, :cond_438

    :try_start_430
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/io/File;->setLastModified(J)Z
    :try_end_437
    .catch Ljava/io/IOException; {:try_start_430 .. :try_end_437} :catch_41f
    .catch Ljava/lang/RuntimeException; {:try_start_430 .. :try_end_437} :catch_41d

    goto :goto_43b

    :cond_438
    :try_start_438
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_43b
    .catch Ljava/io/IOException; {:try_start_438 .. :try_end_43b} :catch_43b
    .catch Ljava/lang/RuntimeException; {:try_start_438 .. :try_end_43b} :catch_41d

    :catch_43b
    :goto_43b
    :try_start_43b
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v9, v0, v11}, Lcom/google/android/gms/internal/zzana;->zza(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v0, Lcom/google/android/gms/internal/zzang;->zzdki:Ljava/util/Set;
    :try_end_444
    .catch Ljava/io/IOException; {:try_start_43b .. :try_end_444} :catch_451
    .catch Ljava/lang/RuntimeException; {:try_start_43b .. :try_end_444} :catch_44f

    move-object/from16 v1, v23

    :try_start_446
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_449
    .catch Ljava/io/IOException; {:try_start_446 .. :try_end_449} :catch_44d
    .catch Ljava/lang/RuntimeException; {:try_start_446 .. :try_end_449} :catch_44b

    const/4 v0, 0x1

    return v0

    :catch_44b
    move-exception v0

    goto :goto_465

    :catch_44d
    move-exception v0

    goto :goto_465

    :catch_44f
    move-exception v0

    goto :goto_452

    :catch_451
    move-exception v0

    :goto_452
    move-object/from16 v1, v23

    goto :goto_465

    :catch_455
    move-exception v0

    goto :goto_458

    :catch_457
    move-exception v0

    :goto_458
    move-object/from16 v25, v4

    move-object v1, v10

    goto :goto_46e

    :catch_45c
    move-exception v0

    :goto_45d
    move-object/from16 v25, v4

    move-object v1, v14

    move-object/from16 v20, v15

    goto :goto_465

    :catch_463
    move-exception v0

    goto :goto_45d

    :goto_465
    move-object/from16 v15, v20

    goto :goto_470

    :catch_468
    move-exception v0

    goto :goto_46b

    :catch_46a
    move-exception v0

    :goto_46b
    move-object/from16 v25, v4

    move-object v1, v14

    :goto_46e
    move-object/from16 v20, v15

    :goto_470
    move-object/from16 v10, v25

    const/4 v2, 0x0

    goto :goto_47c

    :catch_474
    move-exception v0

    goto :goto_477

    :catch_476
    move-exception v0

    :goto_477
    move-object v1, v14

    move-object/from16 v20, v15

    const/4 v2, 0x0

    const/4 v10, 0x0

    :goto_47c
    instance-of v3, v0, Ljava/lang/RuntimeException;

    if-eqz v3, :cond_489

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v3

    const-string v4, "VideoStreamFullFileCache.preload"

    invoke-virtual {v3, v0, v4}, Lcom/google/android/gms/internal/zzaft;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_489
    :try_start_489
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_48c
    .catch Ljava/io/IOException; {:try_start_489 .. :try_end_48c} :catch_48d
    .catch Ljava/lang/NullPointerException; {:try_start_489 .. :try_end_48c} :catch_48d

    goto :goto_48e

    :catch_48d
    nop

    :goto_48e
    iget-boolean v3, v8, Lcom/google/android/gms/internal/zzang;->zzdkl:Z

    if-eqz v3, :cond_4b6

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1a

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Preload aborted for URL \""

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzct(Ljava/lang/String;)V

    goto :goto_4d9

    :cond_4b6
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x19

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Preload failed for URL \""

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\""

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4d9
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_503

    invoke-virtual {v12}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_503

    const-string v0, "Could not delete partial cache file at "

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_4fa

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_500

    :cond_4fa
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v3

    :goto_500
    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :cond_503
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v9, v0, v15, v2}, Lcom/google/android/gms/internal/zzana;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/zzang;->zzdki:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    return v1

    :catchall_511
    move-exception v0

    :try_start_512
    monitor-exit v1
    :try_end_513
    .catchall {:try_start_512 .. :try_end_513} :catchall_511

    goto :goto_515

    :goto_514
    throw v0

    :goto_515
    goto :goto_514
.end method

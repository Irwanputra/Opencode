.class public final L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final 〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;

.field public static final ぁごぐすすぃ:[Ljava/lang/String;

.field public static final づざかべべ:[B

.field public static final なぎぱいぢぎ:[Ljava/lang/String;


# instance fields
.field public final 〺つふすそ:Ljava/util/concurrent/CountDownLatch;

.field public くし〴〺ぅ:[B

.field public final げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public びぐびあび:[B


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/16 v2, 0x2a

    const/4 v3, 0x0

    aput-byte v2, v1, v3

    sput-object v1, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->づざかべべ:[B

    new-array v1, v3, [Ljava/lang/String;

    sput-object v1, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->なぎぱいぢぎ:[Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "*"

    aput-object v1, v0, v3

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->ぁごぐすすぃ:[Ljava/lang/String;

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;-><init>()V

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->〺つふすそ:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method

.method public static げつ〴ぬぐ([B[[BI)Ljava/lang/String;
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_7
    if-ge v4, v2, :cond_86

    add-int v5, v4, v2

    div-int/lit8 v5, v5, 0x2

    :goto_d
    const/16 v6, 0xa

    const/4 v7, -0x1

    if-le v5, v7, :cond_19

    aget-byte v8, v0, v5

    if-eq v8, v6, :cond_19

    add-int/lit8 v5, v5, -0x1

    goto :goto_d

    :cond_19
    add-int/lit8 v5, v5, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x1

    :goto_1d
    add-int v10, v5, v9

    aget-byte v11, v0, v10

    if-eq v11, v6, :cond_26

    add-int/lit8 v9, v9, 0x1

    goto :goto_1d

    :cond_26
    sub-int v6, v10, v5

    move/from16 v11, p2

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_2d
    if-eqz v9, :cond_33

    const/16 v9, 0x2e

    const/4 v14, 0x0

    goto :goto_3e

    :cond_33
    aget-object v14, v1, v11

    aget-byte v14, v14, v12

    and-int/lit16 v14, v14, 0xff

    move/from16 v16, v14

    move v14, v9

    move/from16 v9, v16

    :goto_3e
    add-int v15, v5, v13

    aget-byte v15, v0, v15

    and-int/lit16 v15, v15, 0xff

    sub-int/2addr v9, v15

    if-eqz v9, :cond_48

    goto :goto_58

    :cond_48
    add-int/lit8 v13, v13, 0x1

    add-int/lit8 v12, v12, 0x1

    if-ne v13, v6, :cond_4f

    goto :goto_58

    :cond_4f
    aget-object v15, v1, v11

    array-length v15, v15

    if-ne v15, v12, :cond_84

    array-length v14, v1

    sub-int/2addr v14, v8

    if-ne v11, v14, :cond_7f

    :goto_58
    if-gez v9, :cond_5b

    goto :goto_6f

    :cond_5b
    if-lez v9, :cond_5e

    goto :goto_74

    :cond_5e
    sub-int v7, v6, v13

    aget-object v9, v1, v11

    array-length v9, v9

    sub-int/2addr v9, v12

    :goto_64
    add-int/2addr v11, v8

    array-length v12, v1

    if-ge v11, v12, :cond_6d

    aget-object v12, v1, v11

    array-length v12, v12

    add-int/2addr v9, v12

    goto :goto_64

    :cond_6d
    if-ge v9, v7, :cond_72

    :goto_6f
    add-int/lit8 v2, v5, -0x1

    goto :goto_7

    :cond_72
    if-le v9, v7, :cond_77

    :goto_74
    add-int/lit8 v4, v10, 0x1

    goto :goto_7

    :cond_77
    new-instance v1, Ljava/lang/String;

    sget-object v2, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺぁあねじ:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v5, v6, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_87

    :cond_7f
    add-int/lit8 v11, v11, 0x1

    const/4 v9, 0x1

    const/4 v12, -0x1

    goto :goto_2d

    :cond_84
    move v9, v14

    goto :goto_2d

    :cond_86
    const/4 v1, 0x0

    :goto_87
    return-object v1
.end method


# virtual methods
.method public final 〺つふすそ()V
    .registers 4

    const-class v0, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;

    const-string v1, "publicsuffixes.gz"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    if-nez v0, :cond_b

    return-void

    :cond_b
    new-instance v1, Lぺぁあねじ/てぜきぽく;

    .line 1
    new-instance v2, Lぺぁあねじ/〻ぞまぎな〻;

    invoke-direct {v2}, Lぺぁあねじ/〻ぞまぎな〻;-><init>()V

    invoke-static {v0, v2}, Lぺぁあねじ/おぐぴう〸ず;->くし〴〺ぅ(Ljava/io/InputStream;Lぺぁあねじ/〻ぞまぎな〻;)Lぺぁあねじ/ぶでにく〼〳;

    move-result-object v0

    .line 2
    invoke-direct {v1, v0}, Lぺぁあねじ/てぜきぽく;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    .line 3
    new-instance v0, Lぺぁあねじ/ざとぅぼこ〺;

    invoke-direct {v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    .line 4
    :try_start_1e
    invoke-virtual {v0}, Lぺぁあねじ/ざとぅぼこ〺;->ぺぁあねじ()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;->ぺづげぺが([B)V

    invoke-virtual {v0}, Lぺぁあねじ/ざとぅぼこ〺;->ぺぁあねじ()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual {v0, v2}, Lぺぁあねじ/ざとぅぼこ〺;->ぺづげぺが([B)V
    :try_end_30
    .catchall {:try_start_1e .. :try_end_30} :catchall_42

    invoke-static {v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->づざかべべ(Ljava/io/Closeable;)V

    monitor-enter p0

    :try_start_34
    iput-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->くし〴〺ぅ:[B

    iput-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->びぐびあび:[B

    monitor-exit p0
    :try_end_39
    .catchall {:try_start_34 .. :try_end_39} :catchall_3f

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->〺つふすそ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :catchall_3f
    move-exception v0

    :try_start_40
    monitor-exit p0
    :try_end_41
    .catchall {:try_start_40 .. :try_end_41} :catchall_3f

    throw v0

    :catchall_42
    move-exception v1

    invoke-static {v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->づざかべべ(Ljava/io/Closeable;)V

    throw v1
.end method

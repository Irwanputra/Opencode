.class public final L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final 〳ぜぞぜべっ:Lぺぁあねじ/〳ぜぞぜべっ;

.field public static final 〺つふすそ:[Ljava/lang/String;

.field public static final ぁごぐすすぃ:Lぺぁあねじ/〳ぜぞぜべっ;

.field public static final いいにぽつ:Ljava/nio/charset/Charset;

.field public static final ぇぬぎばつ:Ljava/util/regex/Pattern;

.field public static final おぐぴう〸ず:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final くし〴〺ぅ:L〳ぜぞぜべっ/ぅみぱぎぎ;

.field public static final げつ〴ぬぐ:[B

.field public static final づざかべべ:Lぺぁあねじ/〳ぜぞぜべっ;

.field public static final てぜきぽく:Ljava/nio/charset/Charset;

.field public static final なぎぱいぢぎ:Lぺぁあねじ/〳ぜぞぜべっ;

.field public static final のぷのちつ:Ljava/nio/charset/Charset;

.field public static final びぐびあび:Lぺぁあねじ/〳ぜぞぜべっ;

.field public static final へぬ〴づぞ:Ljava/util/TimeZone;

.field public static final ぺぁあねじ:Ljava/nio/charset/Charset;

.field public static final ぺふねづ〺:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .registers 6

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ:[B

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〺つふすそ:[Ljava/lang/String;

    .line 1
    new-instance v0, Lぺぁあねじ/づざかべべ;

    invoke-direct {v0}, Lぺぁあねじ/づざかべべ;-><init>()V

    invoke-virtual {v0, v1}, Lぺぁあねじ/づざかべべ;->ておぞぞはね([B)Lぺぁあねじ/づざかべべ;

    array-length v2, v1

    int-to-long v2, v2

    .line 2
    new-instance v4, L〳ぜぞぜべっ/どぇぞほだ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v2, v3, v0}, L〳ぜぞぜべっ/どぇぞほだ;-><init>(L〳ぜぞぜべっ/ごづごきえ;JLぺぁあねじ/ぁごぐすすぃ;)V

    .line 3
    sput-object v4, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    invoke-static {v5, v1}, L〳ぜぞぜべっ/びえぁぜい;->びぐびあび(L〳ぜぞぜべっ/ごづごきえ;[B)L〳ぜぞぜべっ/びえぁぜい;

    const-string v0, "efbbbf"

    invoke-static {v0}, Lぺぁあねじ/〳ぜぞぜべっ;->〺つふすそ(Ljava/lang/String;)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->びぐびあび:Lぺぁあねじ/〳ぜぞぜべっ;

    const-string v0, "feff"

    invoke-static {v0}, Lぺぁあねじ/〳ぜぞぜべっ;->〺つふすそ(Ljava/lang/String;)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->づざかべべ:Lぺぁあねじ/〳ぜぞぜべっ;

    const-string v0, "fffe"

    invoke-static {v0}, Lぺぁあねじ/〳ぜぞぜべっ;->〺つふすそ(Ljava/lang/String;)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/〳ぜぞぜべっ;

    const-string v0, "0000ffff"

    invoke-static {v0}, Lぺぁあねじ/〳ぜぞぜべっ;->〺つふすそ(Ljava/lang/String;)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぁごぐすすぃ:Lぺぁあねじ/〳ぜぞぜべっ;

    const-string v0, "ffff0000"

    invoke-static {v0}, Lぺぁあねじ/〳ぜぞぜべっ;->〺つふすそ(Ljava/lang/String;)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〳ぜぞぜべっ:Lぺぁあねじ/〳ぜぞぜべっ;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺぁあねじ:Ljava/nio/charset/Charset;

    const-string v0, "ISO-8859-1"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    const-string v0, "UTF-16BE"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->いいにぽつ:Ljava/nio/charset/Charset;

    const-string v0, "UTF-16LE"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺふねづ〺:Ljava/nio/charset/Charset;

    const-string v0, "UTF-32BE"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->てぜきぽく:Ljava/nio/charset/Charset;

    const-string v0, "UTF-32LE"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->のぷのちつ:Ljava/nio/charset/Charset;

    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->へぬ〴づぞ:Ljava/util/TimeZone;

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ$げつ〴ぬぐ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ$げつ〴ぬぐ;-><init>()V

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->おぐぴう〸ず:Ljava/util/Comparator;

    const-string v0, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぇぬぎばつ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static 〳ぜぞぜべっ(Ljava/lang/String;II)Ljava/net/InetAddress;
    .registers 19
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const/16 v2, 0x10

    new-array v3, v2, [B

    const/4 v4, -0x1

    const/4 v5, 0x0

    move/from16 v6, p1

    const/4 v7, 0x0

    const/4 v8, -0x1

    const/4 v9, -0x1

    :goto_f
    const/4 v10, 0x0

    if-ge v6, v1, :cond_d5

    if-ne v7, v2, :cond_15

    return-object v10

    :cond_15
    add-int/lit8 v11, v6, 0x2

    const/4 v12, 0x4

    const/16 v13, 0xff

    if-gt v11, v1, :cond_32

    const-string v14, "::"

    const/4 v15, 0x2

    invoke-virtual {v0, v6, v14, v5, v15}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v14

    if-eqz v14, :cond_32

    if-eq v8, v4, :cond_28

    return-object v10

    :cond_28
    add-int/lit8 v7, v7, 0x2

    move v8, v7

    if-ne v11, v1, :cond_2f

    goto/16 :goto_d5

    :cond_2f
    move v9, v11

    goto/16 :goto_a2

    :cond_32
    if-eqz v7, :cond_a1

    const-string v11, ":"

    const/4 v14, 0x1

    invoke-virtual {v0, v6, v11, v5, v14}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v11

    if-eqz v11, :cond_41

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_a1

    :cond_41
    const-string v11, "."

    invoke-virtual {v0, v6, v11, v5, v14}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v6

    if-eqz v6, :cond_a0

    add-int/lit8 v6, v7, -0x2

    move v11, v6

    :goto_4c
    if-ge v9, v1, :cond_94

    if-ne v11, v2, :cond_51

    goto :goto_97

    :cond_51
    if-eq v11, v6, :cond_5e

    .line 1
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const/16 v14, 0x2e

    if-eq v15, v14, :cond_5c

    goto :goto_97

    :cond_5c
    add-int/lit8 v9, v9, 0x1

    :cond_5e
    move v14, v9

    const/4 v15, 0x0

    :goto_60
    if-ge v14, v1, :cond_82

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v2, 0x30

    if-lt v5, v2, :cond_82

    const/16 v4, 0x39

    if-le v5, v4, :cond_6f

    goto :goto_82

    :cond_6f
    if-nez v15, :cond_74

    if-eq v9, v14, :cond_74

    goto :goto_97

    :cond_74
    mul-int/lit8 v15, v15, 0xa

    add-int/2addr v15, v5

    sub-int/2addr v15, v2

    if-le v15, v13, :cond_7b

    goto :goto_97

    :cond_7b
    add-int/lit8 v14, v14, 0x1

    const/16 v2, 0x10

    const/4 v4, -0x1

    const/4 v5, 0x0

    goto :goto_60

    :cond_82
    :goto_82
    sub-int v2, v14, v9

    if-nez v2, :cond_87

    goto :goto_97

    :cond_87
    add-int/lit8 v2, v11, 0x1

    int-to-byte v4, v15

    aput-byte v4, v3, v11

    move v11, v2

    move v9, v14

    const/16 v2, 0x10

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v14, 0x1

    goto :goto_4c

    :cond_94
    add-int/2addr v6, v12

    if-eq v11, v6, :cond_99

    :goto_97
    const/4 v14, 0x0

    goto :goto_9a

    :cond_99
    const/4 v14, 0x1

    :goto_9a
    if-nez v14, :cond_9d

    return-object v10

    :cond_9d
    add-int/lit8 v7, v7, 0x2

    goto :goto_d5

    :cond_a0
    return-object v10

    :cond_a1
    :goto_a1
    move v9, v6

    :goto_a2
    move v6, v9

    const/4 v2, 0x0

    :goto_a4
    if-ge v6, v1, :cond_b8

    .line 2
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぁごぐすすぃ(C)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_b2

    goto :goto_b8

    :cond_b2
    shl-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v4

    add-int/lit8 v6, v6, 0x1

    goto :goto_a4

    :cond_b8
    :goto_b8
    sub-int v4, v6, v9

    if-eqz v4, :cond_d4

    if-le v4, v12, :cond_bf

    goto :goto_d4

    :cond_bf
    add-int/lit8 v4, v7, 0x1

    ushr-int/lit8 v5, v2, 0x8

    and-int/2addr v5, v13

    int-to-byte v5, v5

    aput-byte v5, v3, v7

    add-int/lit8 v7, v4, 0x1

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v3, v4

    const/16 v2, 0x10

    const/4 v4, -0x1

    const/4 v5, 0x0

    goto/16 :goto_f

    :cond_d4
    :goto_d4
    return-object v10

    :cond_d5
    :goto_d5
    const/16 v0, 0x10

    if-eq v7, v0, :cond_eb

    const/4 v1, -0x1

    if-ne v8, v1, :cond_dd

    return-object v10

    :cond_dd
    sub-int v1, v7, v8

    rsub-int/lit8 v2, v1, 0x10

    invoke-static {v3, v8, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    rsub-int/lit8 v2, v7, 0x10

    add-int/2addr v2, v8

    const/4 v0, 0x0

    invoke-static {v3, v8, v2, v0}, Ljava/util/Arrays;->fill([BIIB)V

    :cond_eb
    :try_start_eb
    invoke-static {v3}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v0
    :try_end_ef
    .catch Ljava/net/UnknownHostException; {:try_start_eb .. :try_end_ef} :catch_f0

    return-object v0

    :catch_f0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    goto :goto_f7

    :goto_f6
    throw v0

    :goto_f7
    goto :goto_f6
.end method

.method public static 〺つふすそ(Ljava/lang/String;)Ljava/lang/String;
    .registers 9

    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_9d

    const-string v0, "["

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_26

    const-string v0, "]"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-static {p0, v3, v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〳ぜぞぜべっ(Ljava/lang/String;II)Ljava/net/InetAddress;

    move-result-object v0

    goto :goto_2e

    :cond_26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {p0, v4, v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〳ぜぞぜべっ(Ljava/lang/String;II)Ljava/net/InetAddress;

    move-result-object v0

    :goto_2e
    if-nez v0, :cond_31

    return-object v2

    :cond_31
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v0

    array-length v2, v0

    const/16 v3, 0x10

    if-ne v2, v3, :cond_8f

    const/4 p0, 0x0

    const/4 v2, 0x0

    .line 1
    :goto_3c
    array-length v5, v0

    if-ge p0, v5, :cond_5b

    move v5, p0

    :goto_40
    if-ge v5, v3, :cond_4f

    aget-byte v6, v0, v5

    if-nez v6, :cond_4f

    add-int/lit8 v6, v5, 0x1

    aget-byte v6, v0, v6

    if-nez v6, :cond_4f

    add-int/lit8 v5, v5, 0x2

    goto :goto_40

    :cond_4f
    sub-int v6, v5, p0

    if-le v6, v2, :cond_58

    const/4 v7, 0x4

    if-lt v6, v7, :cond_58

    move v1, p0

    move v2, v6

    :cond_58
    add-int/lit8 p0, v5, 0x2

    goto :goto_3c

    :cond_5b
    new-instance p0, Lぺぁあねじ/づざかべべ;

    invoke-direct {p0}, Lぺぁあねじ/づざかべべ;-><init>()V

    :cond_60
    :goto_60
    array-length v5, v0

    if-ge v4, v5, :cond_8a

    const/16 v5, 0x3a

    if-ne v4, v1, :cond_71

    invoke-virtual {p0, v5}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    add-int/2addr v4, v2

    if-ne v4, v3, :cond_60

    invoke-virtual {p0, v5}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    goto :goto_60

    :cond_71
    if-lez v4, :cond_76

    invoke-virtual {p0, v5}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    :cond_76
    aget-byte v5, v0, v4

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x8

    add-int/lit8 v6, v4, 0x1

    aget-byte v6, v0, v6

    and-int/lit16 v6, v6, 0xff

    or-int/2addr v5, v6

    int-to-long v5, v5

    invoke-virtual {p0, v5, v6}, Lぺぁあねじ/づざかべべ;->こ〲しでおか(J)Lぺぁあねじ/づざかべべ;

    add-int/lit8 v4, v4, 0x2

    goto :goto_60

    :cond_8a
    invoke-virtual {p0}, Lぺぁあねじ/づざかべべ;->ぇぬぎばつ()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 2
    :cond_8f
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Invalid IPv6 address: \'"

    const-string v2, "\'"

    invoke-static {v1, p0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_9d
    :try_start_9d
    invoke-static {p0}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_ae

    return-object v2

    :cond_ae
    const/4 v0, 0x0

    .line 3
    :goto_af
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_ce

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x1f

    if-le v4, v5, :cond_cf

    const/16 v5, 0x7f

    if-lt v4, v5, :cond_c2

    goto :goto_cf

    :cond_c2
    const-string v5, " #%/:?@[\\]"

    invoke-virtual {v5, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4
    :try_end_c8
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9d .. :try_end_c8} :catch_d3

    if-eq v4, v1, :cond_cb

    goto :goto_cf

    :cond_cb
    add-int/lit8 v0, v0, 0x1

    goto :goto_af

    :cond_ce
    const/4 v3, 0x0

    :cond_cf
    :goto_cf
    if-eqz v3, :cond_d2

    return-object v2

    :cond_d2
    return-object p0

    :catch_d3
    return-object v2
.end method

.method public static 〻ぞまぎな〻(Ljava/lang/String;II)Ljava/lang/String;
    .registers 3

    invoke-static {p0, p1, p2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->でどあくず(Ljava/lang/String;II)I

    move-result p1

    invoke-static {p0, p1, p2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぶでにく〼〳(Ljava/lang/String;II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ぁごぐすすぃ(C)I
    .registers 3

    const/16 v0, 0x30

    if-lt p0, v0, :cond_a

    const/16 v1, 0x39

    if-gt p0, v1, :cond_a

    sub-int/2addr p0, v0

    return p0

    :cond_a
    const/16 v0, 0x61

    if-lt p0, v0, :cond_16

    const/16 v1, 0x66

    if-gt p0, v1, :cond_16

    :goto_12
    sub-int/2addr p0, v0

    add-int/lit8 p0, p0, 0xa

    return p0

    :cond_16
    const/16 v0, 0x41

    if-lt p0, v0, :cond_1f

    const/16 v1, 0x46

    if-gt p0, v1, :cond_1f

    goto :goto_12

    :cond_1f
    const/4 p0, -0x1

    return p0
.end method

.method public static いいにぽつ(Ljava/lang/String;IILjava/lang/String;)I
    .registers 6

    :goto_0
    if-ge p1, p2, :cond_11

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_e

    return p1

    :cond_e
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_11
    return p2
.end method

.method public static varargs ぇぬぎばつ([Ljava/lang/Object;)Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static ぉざぅち〻(Ljava/lang/String;)I
    .registers 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_18

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x1f

    if-le v2, v3, :cond_17

    const/16 v3, 0x7f

    if-lt v2, v3, :cond_14

    goto :goto_17

    :cond_14
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_17
    :goto_17
    return v1

    :cond_18
    const/4 p0, -0x1

    return p0
.end method

.method public static おぐぴう〸ず(Ljava/util/List;)Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static くし〴〺ぅ(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I
    .registers 10

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_3e

    if-eqz p3, :cond_36

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    const-wide/32 v4, 0x7fffffff

    cmp-long p3, v2, v4

    if-gtz p3, :cond_2a

    cmp-long p3, v2, v0

    if-nez p3, :cond_28

    cmp-long p3, p1, v0

    if-gtz p3, :cond_1c

    goto :goto_28

    :cond_1c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, " too small."

    invoke-static {p0, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_28
    :goto_28
    long-to-int p0, v2

    return p0

    :cond_2a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, " too large."

    invoke-static {p0, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_36
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "unit == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, " < 0"

    invoke-static {p0, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;
    .registers 3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    :try_start_5
    invoke-virtual {v0, p1}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_8} :catch_8

    :catch_8
    return-object v0
.end method

.method public static ごづごきえ(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_26

    if-eqz p2, :cond_26

    array-length v1, p1

    if-eqz v1, :cond_26

    array-length v1, p2

    if-nez v1, :cond_c

    goto :goto_26

    :cond_c
    array-length v1, p1

    const/4 v2, 0x0

    :goto_e
    if-ge v2, v1, :cond_26

    aget-object v3, p1, v2

    array-length v4, p2

    const/4 v5, 0x0

    :goto_14
    if-ge v5, v4, :cond_23

    aget-object v6, p2, v5

    invoke-interface {p0, v3, v6}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    if-nez v6, :cond_20

    const/4 p0, 0x1

    return p0

    :cond_20
    add-int/lit8 v5, v5, 0x1

    goto :goto_14

    :cond_23
    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_26
    :goto_26
    return v0
.end method

.method public static ざっざへづ(Lぺぁあねじ/ぶでにく〼〳;ILjava/util/concurrent/TimeUnit;)Z
    .registers 14

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-interface {p0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v2

    invoke-virtual {v2}, Lぺぁあねじ/〻ぞまぎな〻;->づざかべべ()Z

    move-result v2

    const-wide v3, 0x7fffffffffffffffL

    if-eqz v2, :cond_1d

    invoke-interface {p0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v2

    invoke-virtual {v2}, Lぺぁあねじ/〻ぞまぎな〻;->くし〴〺ぅ()J

    move-result-wide v5

    sub-long/2addr v5, v0

    goto :goto_1e

    :cond_1d
    move-wide v5, v3

    :goto_1e
    invoke-interface {p0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v2

    int-to-long v7, p1

    invoke-virtual {p2, v7, v8}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    invoke-static {v5, v6, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    add-long/2addr p1, v0

    invoke-virtual {v2, p1, p2}, Lぺぁあねじ/〻ぞまぎな〻;->びぐびあび(J)Lぺぁあねじ/〻ぞまぎな〻;

    :try_start_2f
    new-instance p1, Lぺぁあねじ/づざかべべ;

    invoke-direct {p1}, Lぺぁあねじ/づざかべべ;-><init>()V

    :goto_34
    const-wide/16 v7, 0x2000

    invoke-interface {p0, p1, v7, v8}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long p2, v7, v9

    if-eqz p2, :cond_44

    invoke-virtual {p1}, Lぺぁあねじ/づざかべべ;->じぜこほぱ()V
    :try_end_43
    .catch Ljava/io/InterruptedIOException; {:try_start_2f .. :try_end_43} :catch_68
    .catchall {:try_start_2f .. :try_end_43} :catchall_56

    goto :goto_34

    :cond_44
    const/4 p1, 0x1

    cmp-long p2, v5, v3

    invoke-interface {p0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object p0

    if-nez p2, :cond_51

    invoke-virtual {p0}, Lぺぁあねじ/〻ぞまぎな〻;->げつ〴ぬぐ()Lぺぁあねじ/〻ぞまぎな〻;

    goto :goto_55

    :cond_51
    add-long/2addr v0, v5

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/〻ぞまぎな〻;->びぐびあび(J)Lぺぁあねじ/〻ぞまぎな〻;

    :goto_55
    return p1

    :catchall_56
    move-exception p1

    cmp-long p2, v5, v3

    invoke-interface {p0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object p0

    if-nez p2, :cond_63

    invoke-virtual {p0}, Lぺぁあねじ/〻ぞまぎな〻;->げつ〴ぬぐ()Lぺぁあねじ/〻ぞまぎな〻;

    goto :goto_67

    :cond_63
    add-long/2addr v0, v5

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/〻ぞまぎな〻;->びぐびあび(J)Lぺぁあねじ/〻ぞまぎな〻;

    :goto_67
    throw p1

    :catch_68
    nop

    const/4 p1, 0x0

    cmp-long p2, v5, v3

    invoke-interface {p0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object p0

    if-nez p2, :cond_76

    invoke-virtual {p0}, Lぺぁあねじ/〻ぞまぎな〻;->げつ〴ぬぐ()Lぺぁあねじ/〻ぞまぎな〻;

    goto :goto_7a

    :cond_76
    add-long/2addr v0, v5

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/〻ぞまぎな〻;->びぐびあび(J)Lぺぁあねじ/〻ぞまぎな〻;

    :goto_7a
    return p1
.end method

.method public static ざとぅぼこ〺(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")[",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_8
    if-ge v3, v1, :cond_22

    aget-object v4, p1, v3

    array-length v5, p2

    const/4 v6, 0x0

    :goto_e
    if-ge v6, v5, :cond_1f

    aget-object v7, p2, v6

    invoke-interface {p0, v4, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    if-nez v7, :cond_1c

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :cond_1c
    add-int/lit8 v6, v6, 0x1

    goto :goto_e

    :cond_1f
    :goto_1f
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_22
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static づざかべべ(Ljava/io/Closeable;)V
    .registers 1

    if-eqz p0, :cond_8

    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_5} :catch_6
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_5} :catch_8

    goto :goto_8

    :catch_6
    move-exception p0

    throw p0

    :catch_8
    :cond_8
    :goto_8
    return-void
.end method

.method public static てぜきぽく(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 2

    if-eq p0, p1, :cond_d

    if-eqz p0, :cond_b

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    goto :goto_d

    :cond_b
    const/4 p0, 0x0

    goto :goto_e

    :cond_d
    :goto_d
    const/4 p0, 0x1

    :goto_e
    return p0
.end method

.method public static でどあくず(Ljava/lang/String;II)I
    .registers 5

    :goto_0
    if-ge p1, p2, :cond_1e

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1b

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1b

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1b

    const/16 v1, 0xd

    if-eq v0, v1, :cond_1b

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1b

    return p1

    :cond_1b
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1e
    return p2
.end method

.method public static なぎぱいぢぎ(Ljava/net/Socket;)V
    .registers 2

    if-eqz p0, :cond_11

    :try_start_2
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_5
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_5} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_5} :catch_6
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_5} :catch_11

    goto :goto_11

    :catch_6
    move-exception p0

    throw p0

    :catch_8
    move-exception p0

    invoke-static {p0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->は〲ぱなで(Ljava/lang/AssertionError;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_11

    :cond_10
    throw p0

    :catch_11
    :cond_11
    :goto_11
    return-void
.end method

.method public static varargs のぷのちつ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .registers 3

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static は〲ぱなで(Ljava/lang/AssertionError;)Z
    .registers 2

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getsockname failed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1a

    const/4 p0, 0x1

    goto :goto_1b

    :cond_1a
    const/4 p0, 0x0

    :goto_1b
    return p0
.end method

.method public static びぐびあび(JJJ)V
    .registers 11

    or-long v0, p2, p4

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_12

    cmp-long v0, p2, p0

    if-gtz v0, :cond_12

    sub-long/2addr p0, p2

    cmp-long p2, p0, p4

    if-ltz p2, :cond_12

    return-void

    :cond_12
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p0
.end method

.method public static ぶでにく〼〳(Ljava/lang/String;II)I
    .registers 5

    add-int/lit8 p2, p2, -0x1

    :goto_2
    if-lt p2, p1, :cond_22

    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1f

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1f

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1f

    const/16 v1, 0xd

    if-eq v0, v1, :cond_1f

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1f

    add-int/lit8 p2, p2, 0x1

    return p2

    :cond_1f
    add-int/lit8 p2, p2, -0x1

    goto :goto_2

    :cond_22
    return p1
.end method

.method public static へぬ〴づぞ(L〳ぜぞぜべっ/ざとぅぼこ〺;Z)Ljava/lang/String;
    .registers 6

    .line 1
    iget-object v0, p0, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    const-string v1, ":"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "["

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3
    iget-object v2, p0, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    const-string v3, "]"

    .line 4
    invoke-static {v0, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1b

    .line 5
    :cond_19
    iget-object v0, p0, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    :goto_1b
    if-nez p1, :cond_27

    .line 6
    iget p1, p0, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    .line 7
    iget-object v2, p0, L〳ぜぞぜべっ/ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/lang/String;

    .line 8
    invoke-static {v2}, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび(Ljava/lang/String;)I

    move-result v2

    if-eq p1, v2, :cond_34

    :cond_27
    invoke-static {v0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 9
    iget p0, p0, L〳ぜぞぜべっ/ざとぅぼこ〺;->づざかべべ:I

    .line 10
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_34
    return-object v0
.end method

.method public static ぺぁあねじ(Ljava/lang/String;IIC)I
    .registers 5

    :goto_0
    if-ge p1, p2, :cond_c

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, p3, :cond_9

    return p1

    :cond_9
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_c
    return p2
.end method

.method public static ぺふねづ〺(Lぺぁあねじ/ぶでにく〼〳;ILjava/util/concurrent/TimeUnit;)Z
    .registers 3

    :try_start_0
    invoke-static {p0, p1, p2}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ざっざへづ(Lぺぁあねじ/ぶでにく〼〳;ILjava/util/concurrent/TimeUnit;)Z

    move-result p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_4} :catch_5

    return p0

    :catch_5
    const/4 p0, 0x0

    return p0
.end method

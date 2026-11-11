.class public final Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〳ぜぞぜべっ:[Ljava/lang/String;

.field public final 〺つふすそ:Ljava/io/Reader;

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:I

.field public final げつ〴ぬぐ:[C

.field public づざかべべ:I

.field public なぎぱいぢぎ:I

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Ljava/io/Reader;I)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x200

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〳ぜぞぜべっ:[Ljava/lang/String;

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/io/Reader;->markSupported()Z

    move-result v0

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ばおぢでぎか(Z)V

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ:Ljava/io/Reader;

    const p1, 0x8000

    if-le p2, p1, :cond_1d

    const p2, 0x8000

    :cond_1d
    new-array p1, p2, [C

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    return-void
.end method

.method public static くし〴〺ぅ([C[Ljava/lang/String;II)Ljava/lang/String;
    .registers 13

    const/16 v0, 0xc

    if-le p3, v0, :cond_a

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_a
    const/4 v0, 0x1

    if-ge p3, v0, :cond_10

    const-string p0, ""

    return-object p0

    :cond_10
    const/4 v1, 0x0

    move v4, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_14
    if-ge v2, p3, :cond_21

    mul-int/lit8 v3, v3, 0x1f

    add-int/lit8 v5, v4, 0x1

    aget-char v4, p0, v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    move v4, v5

    goto :goto_14

    :cond_21
    array-length v2, p1

    sub-int/2addr v2, v0

    and-int/2addr v2, v3

    aget-object v3, p1, v2

    if-nez v3, :cond_30

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    aput-object v0, p1, v2

    goto :goto_59

    .line 1
    :cond_30
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-ne p3, v4, :cond_4e

    move v5, p2

    move v4, p3

    const/4 v6, 0x0

    :goto_39
    add-int/lit8 v7, v4, -0x1

    if-eqz v4, :cond_4f

    add-int/lit8 v4, v5, 0x1

    aget-char v5, p0, v5

    add-int/lit8 v8, v6, 0x1

    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v5, v6, :cond_4a

    goto :goto_4e

    :cond_4a
    move v5, v4

    move v4, v7

    move v6, v8

    goto :goto_39

    :cond_4e
    :goto_4e
    const/4 v0, 0x0

    :cond_4f
    if-eqz v0, :cond_52

    return-object v3

    .line 2
    :cond_52
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    aput-object v0, p1, v2

    :goto_59
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 5

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    sub-int/2addr v3, v2

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public varargs 〳ぜぞぜべっ([C)Ljava/lang/String;
    .registers 6

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    :goto_9
    iget v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    if-ge v3, v1, :cond_1d

    aget-char v3, v2, v3

    invoke-static {p1, v3}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result v3

    if-ltz v3, :cond_16

    goto :goto_1d

    :cond_16
    iget v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    goto :goto_9

    :cond_1d
    :goto_1d
    iget p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    if-le p1, v0, :cond_2b

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〳ぜぞぜべっ:[Ljava/lang/String;

    sub-int/2addr p1, v0

    invoke-static {v1, v2, v0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    goto :goto_2d

    :cond_2b
    const-string p1, ""

    :goto_2d
    return-object p1
.end method

.method public final 〺つふすそ()V
    .registers 5

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->びぐびあび:I

    if-ge v0, v1, :cond_7

    return-void

    :cond_7
    :try_start_7
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ:Ljava/io/Reader;

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Ljava/io/Reader;->skip(J)J

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ:Ljava/io/Reader;

    const v1, 0x8000

    invoke-virtual {v0, v1}, Ljava/io/Reader;->mark(I)V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ:Ljava/io/Reader;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    invoke-virtual {v0, v1}, Ljava/io/Reader;->read([C)I

    move-result v0

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ:Ljava/io/Reader;

    invoke-virtual {v1}, Ljava/io/Reader;->reset()V

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3b

    iput v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/2addr v1, v2

    iput v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    const/4 v1, 0x0

    iput v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iput v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    const/16 v1, 0x6000

    if-le v0, v1, :cond_39

    const/16 v0, 0x6000

    :cond_39
    iput v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->びぐびあび:I
    :try_end_3b
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_3b} :catch_3c

    :cond_3b
    return-void

    :catch_3c
    move-exception v0

    new-instance v1, Lいいにぽつ/〺つふすそ/〺つふすそ;

    invoke-direct {v1, v0}, Lいいにぽつ/〺つふすそ/〺つふすそ;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public varargs ぁごぐすすぃ([C)Ljava/lang/String;
    .registers 9

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    :goto_9
    iget v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    if-ge v3, v1, :cond_24

    array-length v3, p1

    const/4 v4, 0x0

    :goto_f
    if-ge v4, v3, :cond_1d

    aget-char v5, p1, v4

    iget v6, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    aget-char v6, v2, v6

    if-ne v6, v5, :cond_1a

    goto :goto_24

    :cond_1a
    add-int/lit8 v4, v4, 0x1

    goto :goto_f

    :cond_1d
    iget v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    goto :goto_9

    :cond_24
    :goto_24
    iget p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    if-le p1, v0, :cond_32

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〳ぜぞぜべっ:[Ljava/lang/String;

    sub-int/2addr p1, v0

    invoke-static {v1, v2, v0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    goto :goto_34

    :cond_32
    const-string p1, ""

    :goto_34
    return-object p1
.end method

.method public いいにぽつ()C
    .registers 3

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->てぜきぽく()Z

    move-result v0

    if-eqz v0, :cond_d

    const v0, 0xffff

    goto :goto_13

    :cond_d
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    aget-char v0, v0, v1

    :goto_13
    return v0
.end method

.method public varargs ぇぬぎばつ([C)Z
    .registers 7

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぺふねづ〺()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    return v1

    :cond_8
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    aget-char v0, v0, v2

    array-length v2, p1

    const/4 v3, 0x0

    :goto_13
    if-ge v3, v2, :cond_1e

    aget-char v4, p1, v3

    if-ne v4, v0, :cond_1b

    const/4 p1, 0x1

    return p1

    :cond_1b
    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_1e
    return v1
.end method

.method public ぉざぅち〻()Z
    .registers 4

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぺふねづ〺()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    return v1

    :cond_8
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    aget-char v0, v0, v2

    const/16 v2, 0x41

    if-lt v0, v2, :cond_16

    const/16 v2, 0x5a

    if-le v0, v2, :cond_24

    :cond_16
    const/16 v2, 0x61

    if-lt v0, v2, :cond_1e

    const/16 v2, 0x7a

    if-le v0, v2, :cond_24

    :cond_1e
    invoke-static {v0}, Ljava/lang/Character;->isLetter(C)Z

    move-result v0

    if-eqz v0, :cond_25

    :cond_24
    const/4 v1, 0x1

    :cond_25
    return v1
.end method

.method public おぐぴう〸ず(C)Z
    .registers 4

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぺふねづ〺()Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    aget-char v0, v0, v1

    if-ne v0, p1, :cond_10

    const/4 p1, 0x1

    goto :goto_11

    :cond_10
    const/4 p1, 0x0

    :goto_11
    return p1
.end method

.method public げつ〴ぬぐ()V
    .registers 2

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    return-void
.end method

.method public ごづごきえ()V
    .registers 2

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    return-void
.end method

.method public ざとぅぼこ〺(Ljava/lang/CharSequence;)I
    .registers 10

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    :goto_a
    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-ge v1, v2, :cond_49

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    aget-char v2, v2, v1

    const/4 v3, 0x1

    if-eq v0, v2, :cond_21

    :goto_15
    add-int/2addr v1, v3

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-ge v1, v2, :cond_21

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    aget-char v2, v2, v1

    if-eq v0, v2, :cond_21

    goto :goto_15

    :cond_21
    add-int/lit8 v2, v1, 0x1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    add-int/2addr v4, v2

    sub-int/2addr v4, v3

    iget v5, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-ge v1, v5, :cond_47

    if-gt v4, v5, :cond_47

    move v5, v2

    :goto_30
    if-ge v5, v4, :cond_41

    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    iget-object v7, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    aget-char v7, v7, v5

    if-ne v6, v7, :cond_41

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_30

    :cond_41
    if-ne v5, v4, :cond_47

    iget p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    sub-int/2addr v1, p1

    return v1

    :cond_47
    move v1, v2

    goto :goto_a

    :cond_49
    const/4 p1, -0x1

    return p1
.end method

.method public づざかべべ()Ljava/lang/String;
    .registers 5

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    :goto_5
    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-ge v1, v2, :cond_2c

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    aget-char v1, v2, v1

    const/16 v2, 0x41

    if-lt v1, v2, :cond_17

    const/16 v2, 0x5a

    if-le v1, v2, :cond_25

    :cond_17
    const/16 v2, 0x61

    if-lt v1, v2, :cond_1f

    const/16 v2, 0x7a

    if-le v1, v2, :cond_25

    :cond_1f
    invoke-static {v1}, Ljava/lang/Character;->isLetter(C)Z

    move-result v1

    if-eqz v1, :cond_2c

    :cond_25
    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    goto :goto_5

    :cond_2c
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〳ぜぞぜべっ:[Ljava/lang/String;

    iget v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    sub-int/2addr v3, v0

    invoke-static {v1, v2, v0, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final てぜきぽく()Z
    .registers 3

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-lt v0, v1, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    return v0
.end method

.method public なぎぱいぢぎ(C)Ljava/lang/String;
    .registers 5

    .line 1
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    :goto_5
    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    const/4 v2, -0x1

    if-ge v0, v1, :cond_17

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    aget-char v1, v1, v0

    if-ne p1, v1, :cond_14

    iget p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    sub-int/2addr v0, p1

    goto :goto_18

    :cond_14
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_17
    const/4 v0, -0x1

    :goto_18
    if-eq v0, v2, :cond_2a

    .line 2
    iget-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〳ぜぞぜべっ:[Ljava/lang/String;

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    invoke-static {p1, v1, v2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/2addr v1, v0

    iput v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    return-object p1

    :cond_2a
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぺぁあねじ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public のぷのちつ(Ljava/lang/String;)Z
    .registers 9

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    .line 1
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v0, v1, :cond_14

    goto :goto_24

    :cond_14
    const/4 v1, 0x0

    :goto_15
    if-ge v1, v0, :cond_29

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    iget-object v5, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget v6, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/2addr v6, v1

    aget-char v5, v5, v6

    if-eq v4, v5, :cond_26

    :goto_24
    const/4 v0, 0x0

    goto :goto_2a

    :cond_26
    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    :cond_29
    const/4 v0, 0x1

    :goto_2a
    if-eqz v0, :cond_36

    .line 2
    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    return v3

    :cond_36
    return v2
.end method

.method public は〲ぱなで()I
    .registers 3

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public びぐびあび()C
    .registers 3

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->てぜきぽく()Z

    move-result v0

    if-eqz v0, :cond_d

    const v0, 0xffff

    goto :goto_13

    :cond_d
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    aget-char v0, v0, v1

    :goto_13
    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    return v0
.end method

.method public へぬ〴づぞ(Ljava/lang/String;)Z
    .registers 9

    .line 1
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le v0, v1, :cond_11

    goto :goto_29

    :cond_11
    const/4 v1, 0x0

    :goto_12
    if-ge v1, v0, :cond_2e

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    iget-object v5, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget v6, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/2addr v6, v1

    aget-char v5, v5, v6

    invoke-static {v5}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v5

    if-eq v4, v5, :cond_2b

    :goto_29
    const/4 v0, 0x0

    goto :goto_2f

    :cond_2b
    add-int/lit8 v1, v1, 0x1

    goto :goto_12

    :cond_2e
    const/4 v0, 0x1

    :goto_2f
    if-eqz v0, :cond_3b

    .line 2
    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    return v3

    :cond_3b
    return v2
.end method

.method public ぺぁあねじ()Ljava/lang/String;
    .registers 5

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〳ぜぞぜべっ:[Ljava/lang/String;

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    sub-int/2addr v3, v2

    invoke-static {v0, v1, v2, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    iput v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    return-object v0
.end method

.method public ぺふねづ〺()Z
    .registers 3

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-lt v0, v1, :cond_b

    const/4 v0, 0x1

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    return v0
.end method

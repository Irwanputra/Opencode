.class public Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:I

.field public げつ〴ぬぐ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    return-void
.end method

.method public static のぷのちつ(Ljava/lang/String;)Ljava/lang/String;
    .registers 7

    invoke-static {}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->ぁごぐすすぃ()Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_b
    if-ge v2, v1, :cond_1e

    aget-char v4, p0, v2

    const/16 v5, 0x5c

    if-ne v4, v5, :cond_17

    if-eqz v3, :cond_1a

    if-ne v3, v5, :cond_1a

    :cond_17
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1a
    add-int/lit8 v2, v2, 0x1

    move v3, v4

    goto :goto_b

    :cond_1e
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〳ぜぞぜべっ(Ljava/lang/String;)Z
    .registers 3

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    const/4 p1, 0x1

    return p1

    :cond_11
    const/4 p1, 0x0

    return p1
.end method

.method public 〺つふすそ(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    .line 1
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v0, p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1d

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    goto :goto_21

    :cond_1d
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->てぜきぽく()Ljava/lang/String;

    move-result-object v0

    .line 2
    :goto_21
    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    return-object v0
.end method

.method public ぁごぐすすぃ()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_d

    const/4 v0, 0x1

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    return v0
.end method

.method public varargs いいにぽつ([Ljava/lang/String;)Z
    .registers 6

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v0, :cond_12

    aget-object v3, p1, v2

    invoke-virtual {p0, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_f

    const/4 p1, 0x1

    return p1

    :cond_f
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_12
    return v1
.end method

.method public くし〴〺ぅ()C
    .registers 4

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0
.end method

.method public げつ〴ぬぐ(CC)Ljava/lang/String;
    .registers 12

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, -0x1

    :cond_7
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v7

    if-eqz v7, :cond_f

    goto/16 :goto_78

    :cond_f
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->くし〴〺ぅ()C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v7

    if-eqz v0, :cond_1d

    const/16 v8, 0x5c

    if-eq v0, v8, :cond_6c

    :cond_1d
    const/16 v8, 0x27

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Character;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_34

    invoke-virtual {v7}, Ljava/lang/Character;->charValue()C

    move-result v8

    if-eq v8, p1, :cond_34

    if-nez v2, :cond_34

    xor-int/lit8 v3, v3, 0x1

    goto :goto_4a

    :cond_34
    const/16 v8, 0x22

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Character;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4a

    invoke-virtual {v7}, Ljava/lang/Character;->charValue()C

    move-result v8

    if-eq v8, p1, :cond_4a

    if-nez v3, :cond_4a

    xor-int/lit8 v2, v2, 0x1

    :cond_4a
    :goto_4a
    if-nez v3, :cond_76

    if-eqz v2, :cond_4f

    goto :goto_76

    :cond_4f
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Character;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_60

    add-int/lit8 v4, v4, 0x1

    if-ne v5, v1, :cond_6c

    iget v5, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    goto :goto_6c

    :cond_60
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Character;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6c

    add-int/lit8 v4, v4, -0x1

    :cond_6c
    :goto_6c
    if-lez v4, :cond_72

    if-eqz v0, :cond_72

    iget v6, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    :cond_72
    invoke-virtual {v7}, Ljava/lang/Character;->charValue()C

    move-result v0

    :cond_76
    :goto_76
    if-gtz v4, :cond_7

    :goto_78
    if-ltz v6, :cond_81

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {p1, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    goto :goto_83

    :cond_81
    const-string p1, ""

    :goto_83
    if-gtz v4, :cond_86

    return-object p1

    :cond_86
    const-string p2, "Did not find balanced marker at \'"

    const-string v0, "\'"

    invoke-static {p2, p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_95

    :goto_94
    throw p2

    :goto_95
    goto :goto_94
.end method

.method public づざかべべ()Ljava/lang/String;
    .registers 10

    iget v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    :goto_2
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v1

    if-nez v1, :cond_39

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺふねづ〺()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_33

    const/4 v1, 0x2

    new-array v3, v1, [C

    fill-array-data v3, :array_42

    .line 1
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1d

    goto :goto_31

    :cond_1d
    const/4 v4, 0x0

    :goto_1e
    if-ge v4, v1, :cond_31

    aget-char v6, v3, v4

    iget-object v7, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v8, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v7, v8}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v6, :cond_2e

    const/4 v5, 0x1

    goto :goto_31

    :cond_2e
    add-int/lit8 v4, v4, 0x1

    goto :goto_1e

    :cond_31
    :goto_31
    if-eqz v5, :cond_39

    .line 2
    :cond_33
    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    add-int/2addr v1, v2

    iput v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    goto :goto_2

    :cond_39
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :array_42
    .array-data 2
        0x2ds
        0x5fs
    .end array-data
.end method

.method public てぜきぽく()Ljava/lang/String;
    .registers 4

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iput v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    return-object v0
.end method

.method public なぎぱいぢぎ()Z
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1
    :goto_3
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v3

    if-nez v3, :cond_19

    iget-object v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v4, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->びぐびあび(I)Z

    move-result v3

    if-eqz v3, :cond_19

    const/4 v3, 0x1

    goto :goto_1a

    :cond_19
    const/4 v3, 0x0

    :goto_1a
    if-eqz v3, :cond_23

    .line 2
    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    add-int/2addr v2, v1

    iput v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    const/4 v2, 0x1

    goto :goto_3

    :cond_23
    return v2
.end method

.method public びぐびあび(Ljava/lang/String;)V
    .registers 4

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    .line 1
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_19

    add-int/2addr v1, p1

    .line 2
    iput v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    return-void

    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Queue not long enough to consume sequence"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_21
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Queue did not match expected sequence"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ぺぁあねじ(Ljava/lang/String;)Z
    .registers 8

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v1, 0x1

    const/4 v4, 0x0

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p1

    return p1
.end method

.method public ぺふねづ〺()Z
    .registers 3

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v0

    if-nez v0, :cond_16

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v0

    if-eqz v0, :cond_16

    const/4 v0, 0x1

    goto :goto_17

    :cond_16
    const/4 v0, 0x0

    :goto_17
    return v0
.end method

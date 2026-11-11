.class public Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "L\u3044\u3044\u306b\u307d\u3064/\u303a\u3064\u3075\u3059\u305d/\u3073\u3050\u3073\u3042\u3073/\u3052\u3064\u3034\u306c\u3050;",
        ">;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field public static final づざかべべ:[Ljava/lang/String;


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:[Ljava/lang/String;

.field public びぐびあび:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->づざかべべ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    sget-object v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->づざかべべ:[Ljava/lang/String;

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    return-void
.end method

.method public static づざかべべ([Ljava/lang/String;I)[Ljava/lang/String;
    .registers 4

    new-array v0, p1, [Ljava/lang/String;

    array-length v1, p0

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび()Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 5

    if-ne p0, p1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 v0, 0x0

    if-eqz p1, :cond_2d

    const-class v1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_10

    goto :goto_2d

    :cond_10
    check-cast p1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    iget v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    iget v2, p1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    if-eq v1, v2, :cond_19

    return v0

    :cond_19
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    iget-object v2, p1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v0

    :cond_24
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2d
    :goto_2d
    return v0
.end method

.method public hashCode()I
    .registers 3

    iget v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "L\u3044\u3044\u306b\u307d\u3064/\u303a\u3064\u3075\u3059\u305d/\u3073\u3050\u3073\u3042\u3073/\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation

    new-instance v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;-><init>(Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :try_start_5
    new-instance v1, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    const-string v2, ""

    invoke-direct {v1, v2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;-><init>(Ljava/lang/String;)V

    .line 2
    iget-object v1, v1, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;->いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    .line 3
    invoke-virtual {p0, v0, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〳ぜぞぜべっ(Ljava/lang/Appendable;Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_11} :catch_16

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_16
    move-exception v0

    new-instance v1, Lいいにぽつ/〺つふすそ/げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lいいにぽつ/〺つふすそ/げつ〴ぬぐ;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final 〳ぜぞぜべっ(Ljava/lang/Appendable;Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 13

    iget v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    const/4 v1, 0x0

    :goto_3
    if-ge v1, v0, :cond_36

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    aget-object v2, v2, v1

    iget-object v3, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    aget-object v3, v3, v1

    const/16 v4, 0x20

    invoke-interface {p1, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-static {v2, v3, p2}, Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)Z

    move-result v2

    if-nez v2, :cond_33

    const-string v2, "=\""

    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    if-nez v3, :cond_25

    const-string v3, ""

    :cond_25
    move-object v5, v3

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, p1

    move-object v6, p2

    invoke-static/range {v4 .. v9}, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ;->〺つふすそ(Ljava/lang/Appendable;Ljava/lang/String;Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;ZZZ)V

    const/16 v2, 0x22

    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_33
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_36
    return-void
.end method

.method public 〺つふすそ(Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;)V
    .registers 4

    .line 1
    iget v0, p1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    if-nez v0, :cond_5

    return-void

    .line 2
    :cond_5
    iget v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ(I)V

    .line 3
    new-instance v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;-><init>(Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;)V

    .line 4
    :goto_10
    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_20

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->てぜきぽく(Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    goto :goto_10

    :cond_20
    return-void
.end method

.method public ぁごぐすすぃ(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->いいにぽつ(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_8

    goto :goto_e

    :cond_8
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    aget-object p1, v0, p1

    if-nez p1, :cond_10

    :goto_e
    const-string p1, ""

    :cond_10
    return-object p1
.end method

.method public final いいにぽつ(Ljava/lang/String;)I
    .registers 4

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_4
    iget v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    if-ge v0, v1, :cond_16

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    return v0

    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_16
    const/4 p1, -0x1

    return p1
.end method

.method public final くし〴〺ぅ(I)V
    .registers 5

    iget v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    if-lt p1, v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ばおぢでぎか(Z)V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    array-length v1, v0

    if-lt v1, p1, :cond_10

    return-void

    :cond_10
    const/4 v2, 0x4

    if-lt v1, v2, :cond_17

    iget v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    mul-int/lit8 v2, v1, 0x2

    :cond_17
    if-le p1, v2, :cond_1a

    goto :goto_1b

    :cond_1a
    move p1, v2

    :goto_1b
    invoke-static {v0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->づざかべべ([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    invoke-static {v0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->づざかべべ([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    return-void
.end method

.method public final げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    iget v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ(I)V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    iget v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    aput-object p1, v0, v1

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    aput-object p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    return-void
.end method

.method public てぜきぽく(Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;)Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;
    .registers 4

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    .line 1
    iget-object v0, p1, Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    .line 2
    iget-object v1, p1, Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    .line 3
    invoke-virtual {p0, v0, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->ぺふねづ〺(Ljava/lang/String;Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    iput-object p0, p1, Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;->びぐびあび:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    return-object p0
.end method

.method public なぎぱいぢぎ(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->ぺぁあねじ(Ljava/lang/String;)I

    move-result p1

    const-string v0, ""

    const/4 v1, -0x1

    if-ne p1, v1, :cond_a

    goto :goto_12

    :cond_a
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    aget-object p1, v1, p1

    if-nez p1, :cond_11

    goto :goto_12

    :cond_11
    move-object v0, p1

    :goto_12
    return-object v0
.end method

.method public びぐびあび()Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;
    .registers 4

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;
    :try_end_6
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_6} :catch_1f

    iget v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    iput v1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    iget v2, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    invoke-static {v1, v2}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->づざかべべ([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    iget v2, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    invoke-static {v1, v2}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->づざかべべ([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    return-object v0

    :catch_1f
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public ぺぁあねじ(Ljava/lang/String;)I
    .registers 4

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_4
    iget v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    if-ge v0, v1, :cond_16

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    return v0

    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_16
    const/4 p1, -0x1

    return p1
.end method

.method public ぺふねづ〺(Ljava/lang/String;Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;
    .registers 5

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->ぺぁあねじ(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_c

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    aput-object p2, p1, v0

    goto :goto_f

    :cond_c
    invoke-virtual {p0, p1, p2}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_f
    return-object p0
.end method

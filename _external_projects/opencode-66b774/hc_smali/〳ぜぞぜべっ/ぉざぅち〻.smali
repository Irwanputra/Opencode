.class public final L〳ぜぞぜべっ/ぉざぅち〻;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final げつ〴ぬぐ:[Ljava/lang/String;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ:[Ljava/lang/String;

    return-void
.end method

.method public static varargs びぐびあび([Ljava/lang/String;)L〳ぜぞぜべっ/ぉざぅち〻;
    .registers 7

    array-length v0, p0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_6c

    invoke-virtual {p0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_d
    array-length v2, p0

    if-ge v1, v2, :cond_27

    aget-object v2, p0, v1

    if-eqz v2, :cond_1f

    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_1f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Headers cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_27
    const/4 v1, 0x0

    :goto_28
    array-length v2, p0

    if-ge v1, v2, :cond_66

    aget-object v2, p0, v1

    add-int/lit8 v3, v1, 0x1

    aget-object v3, p0, v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_47

    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_47

    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ne v4, v5, :cond_47

    add-int/lit8 v1, v1, 0x2

    goto :goto_28

    :cond_47
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected header: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_66
    new-instance v0, L〳ぜぞぜべっ/ぉざぅち〻;

    invoke-direct {v0, p0}, L〳ぜぞぜべっ/ぉざぅち〻;-><init>([Ljava/lang/String;)V

    return-object v0

    :cond_6c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected alternating header names and values"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_75

    :goto_74
    throw p0

    :goto_75
    goto :goto_74
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    instance-of v0, p1, L〳ぜぞぜべっ/ぉざぅち〻;

    if-eqz v0, :cond_12

    check-cast p1, L〳ぜぞぜべっ/ぉざぅち〻;

    iget-object p1, p1, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ:[Ljava/lang/String;

    iget-object v0, p0, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ:[Ljava/lang/String;

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    const/4 p1, 0x1

    goto :goto_13

    :cond_12
    const/4 p1, 0x0

    :goto_13
    return p1
.end method

.method public hashCode()I
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, L〳ぜぞぜべっ/ぉざぅち〻;->づざかべべ()I

    move-result v1

    const/4 v2, 0x0

    :goto_a
    if-ge v2, v1, :cond_27

    invoke-virtual {p0, v2}, L〳ぜぞぜべっ/ぉざぅち〻;->〺つふすそ(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, L〳ぜぞぜべっ/ぉざぅち〻;->なぎぱいぢぎ(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ(I)Ljava/lang/String;
    .registers 3

    iget-object v0, p0, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ:[Ljava/lang/String;

    mul-int/lit8 p1, p1, 0x2

    aget-object p1, v0, p1

    return-object p1
.end method

.method public くし〴〺ぅ()L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;
    .registers 4

    new-instance v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;-><init>()V

    iget-object v1, v0, L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    iget-object v2, p0, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ:[Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object v0
.end method

.method public げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;
    .registers 5
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ:[Ljava/lang/String;

    .line 1
    array-length v1, v0

    :cond_3
    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_14

    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    add-int/lit8 v1, v1, 0x1

    aget-object p1, v0, v1

    goto :goto_15

    :cond_14
    const/4 p1, 0x0

    :goto_15
    return-object p1
.end method

.method public づざかべべ()I
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ:[Ljava/lang/String;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public なぎぱいぢぎ(I)Ljava/lang/String;
    .registers 3

    iget-object v0, p0, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ:[Ljava/lang/String;

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1
.end method

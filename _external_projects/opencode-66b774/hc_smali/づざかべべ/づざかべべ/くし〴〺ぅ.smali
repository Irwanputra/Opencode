.class public final Lづざかべべ/づざかべべ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Collection;
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Collection<",
        "TE;>;",
        "Ljava/util/Set<",
        "TE;>;"
    }
.end annotation


# static fields
.field public static 〳ぜぞぜべっ:[Ljava/lang/Object;

.field public static final ぁごぐすすぃ:[Ljava/lang/Object;

.field public static いいにぽつ:[Ljava/lang/Object;

.field public static final なぎぱいぢぎ:[I

.field public static ぺぁあねじ:I

.field public static ぺふねづ〺:I


# instance fields
.field public 〺つふすそ:[I

.field public くし〴〺ぅ:[Ljava/lang/Object;

.field public づざかべべ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3041\u3054\u3050\u3059\u3059\u3043<",
            "TE;TE;>;"
        }
    .end annotation
.end field

.field public びぐびあび:I


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    const/4 v0, 0x0

    new-array v1, v0, [I

    sput-object v1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->なぎぱいぢぎ:[I

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぁごぐすすぃ:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lづざかべべ/づざかべべ/くし〴〺ぅ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_e

    sget-object p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->なぎぱいぢぎ:[I

    iput-object p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    sget-object p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぁごぐすすぃ:[Ljava/lang/Object;

    iput-object p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    goto :goto_11

    :cond_e
    invoke-virtual {p0, p1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->げつ〴ぬぐ(I)V

    :goto_11
    const/4 p1, 0x0

    iput p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    return-void
.end method

.method public static 〺つふすそ([I[Ljava/lang/Object;I)V
    .registers 10

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/16 v4, 0xa

    const/4 v5, 0x1

    const/16 v6, 0x8

    if-ne v0, v6, :cond_2c

    const-class v0, Lづざかべべ/づざかべべ/くし〴〺ぅ;

    monitor-enter v0

    :try_start_e
    sget v6, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺:I

    if-ge v6, v4, :cond_27

    sget-object v4, Lづざかべべ/づざかべべ/くし〴〺ぅ;->いいにぽつ:[Ljava/lang/Object;

    aput-object v4, p1, v3

    aput-object p0, p1, v5

    sub-int/2addr p2, v5

    :goto_19
    if-lt p2, v2, :cond_20

    aput-object v1, p1, p2

    add-int/lit8 p2, p2, -0x1

    goto :goto_19

    :cond_20
    sput-object p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->いいにぽつ:[Ljava/lang/Object;

    sget p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺:I

    add-int/2addr p0, v5

    sput p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺:I

    :cond_27
    monitor-exit v0

    goto :goto_51

    :catchall_29
    move-exception p0

    monitor-exit v0
    :try_end_2b
    .catchall {:try_start_e .. :try_end_2b} :catchall_29

    throw p0

    :cond_2c
    array-length v0, p0

    const/4 v6, 0x4

    if-ne v0, v6, :cond_51

    const-class v0, Lづざかべべ/づざかべべ/くし〴〺ぅ;

    monitor-enter v0

    :try_start_33
    sget v6, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぺぁあねじ:I

    if-ge v6, v4, :cond_4c

    sget-object v4, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〳ぜぞぜべっ:[Ljava/lang/Object;

    aput-object v4, p1, v3

    aput-object p0, p1, v5

    sub-int/2addr p2, v5

    :goto_3e
    if-lt p2, v2, :cond_45

    aput-object v1, p1, p2

    add-int/lit8 p2, p2, -0x1

    goto :goto_3e

    :cond_45
    sput-object p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〳ぜぞぜべっ:[Ljava/lang/Object;

    sget p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぺぁあねじ:I

    add-int/2addr p0, v5

    sput p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぺぁあねじ:I

    :cond_4c
    monitor-exit v0

    goto :goto_51

    :catchall_4e
    move-exception p0

    monitor-exit v0
    :try_end_50
    .catchall {:try_start_33 .. :try_end_50} :catchall_4e

    throw p0

    :cond_51
    :goto_51
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_9

    invoke-virtual {p0}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび()I

    move-result v1

    const/4 v2, 0x0

    goto :goto_14

    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {p0, p1, v1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ(Ljava/lang/Object;I)I

    move-result v2

    move v7, v2

    move v2, v1

    move v1, v7

    :goto_14
    if-ltz v1, :cond_17

    return v0

    :cond_17
    xor-int/lit8 v1, v1, -0x1

    iget v3, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    iget-object v4, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    array-length v5, v4

    if-lt v3, v5, :cond_46

    const/4 v5, 0x4

    const/16 v6, 0x8

    if-lt v3, v6, :cond_29

    shr-int/lit8 v5, v3, 0x1

    add-int/2addr v5, v3

    goto :goto_2d

    :cond_29
    if-lt v3, v5, :cond_2d

    const/16 v5, 0x8

    :cond_2d
    :goto_2d
    iget-object v3, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    invoke-virtual {p0, v5}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->げつ〴ぬぐ(I)V

    iget-object v5, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    array-length v6, v5

    if-lez v6, :cond_41

    array-length v6, v4

    invoke-static {v4, v0, v5, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v5, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    array-length v6, v3

    invoke-static {v3, v0, v5, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_41
    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    invoke-static {v4, v3, v0}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ([I[Ljava/lang/Object;I)V

    :cond_46
    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    if-ge v1, v0, :cond_5a

    iget-object v3, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    add-int/lit8 v4, v1, 0x1

    sub-int/2addr v0, v1

    invoke-static {v3, v1, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    iget v3, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    sub-int/2addr v3, v1

    invoke-static {v0, v1, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5a
    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    aput v2, v0, v1

    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aput-object p1, v0, v1

    iget p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    return v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    .line 1
    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    array-length v2, v0

    const/4 v3, 0x0

    if-ge v2, v1, :cond_27

    iget-object v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->げつ〴ぬぐ(I)V

    iget v1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    if-lez v1, :cond_22

    iget-object v4, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    invoke-static {v0, v3, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    iget v4, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    invoke-static {v2, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_22
    iget v1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    invoke-static {v0, v2, v1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ([I[Ljava/lang/Object;I)V

    .line 2
    :cond_27
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->add(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v3, v0

    goto :goto_2b

    :cond_3b
    return v3
.end method

.method public clear()V
    .registers 4

    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    if-eqz v0, :cond_16

    iget-object v1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    iget-object v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ([I[Ljava/lang/Object;I)V

    sget-object v0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->なぎぱいぢぎ:[I

    iput-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    sget-object v0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぁごぐすすぃ:[Ljava/lang/Object;

    iput-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    :cond_16
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .registers 2

    invoke-virtual {p0, p1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_8

    const/4 p1, 0x1

    goto :goto_9

    :cond_8
    const/4 p1, 0x0

    :goto_9
    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 p1, 0x0

    return p1

    :cond_16
    const/4 p1, 0x1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_28

    check-cast p1, Ljava/util/Set;

    .line 1
    iget v1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    .line 2
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    const/4 v1, 0x0

    :goto_15
    :try_start_15
    iget v3, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    if-ge v1, v3, :cond_27

    .line 3
    iget-object v3, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object v3, v3, v1

    .line 4
    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3
    :try_end_21
    .catch Ljava/lang/NullPointerException; {:try_start_15 .. :try_end_21} :catch_28
    .catch Ljava/lang/ClassCastException; {:try_start_15 .. :try_end_21} :catch_28

    if-nez v3, :cond_24

    return v2

    :cond_24
    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    :cond_27
    return v0

    :catch_28
    :cond_28
    return v2
.end method

.method public hashCode()I
    .registers 6

    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    iget v1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_6
    if-ge v2, v1, :cond_e

    aget v4, v0, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_e
    return v3
.end method

.method public indexOf(Ljava/lang/Object;)I
    .registers 3

    if-nez p1, :cond_7

    invoke-virtual {p0}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび()I

    move-result p1

    goto :goto_f

    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ(Ljava/lang/Object;I)I

    move-result p1

    :goto_f
    return p1
.end method

.method public isEmpty()Z
    .registers 2

    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    if-gtz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->づざかべべ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    if-nez v0, :cond_b

    new-instance v0, Lづざかべべ/づざかべべ/〺つふすそ;

    invoke-direct {v0, p0}, Lづざかべべ/づざかべべ/〺つふすそ;-><init>(Lづざかべべ/づざかべべ/くし〴〺ぅ;)V

    iput-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->づざかべべ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    :cond_b
    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->づざかべべ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    .line 2
    iget-object v1, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;

    if-nez v1, :cond_18

    new-instance v1, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;

    invoke-direct {v1, v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;-><init>(Lづざかべべ/づざかべべ/ぁごぐすすぃ;)V

    iput-object v1, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;

    :cond_18
    iget-object v0, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;

    .line 3
    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .registers 2

    invoke-virtual {p0, p1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_b

    invoke-virtual {p0, p1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->づざかべべ(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_b
    const/4 p1, 0x0

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->remove(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    goto :goto_5

    :cond_15
    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    :goto_5
    if-ltz v0, :cond_18

    iget-object v3, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object v3, v3, v0

    invoke-interface {p1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    invoke-virtual {p0, v0}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->づざかべべ(I)Ljava/lang/Object;

    const/4 v2, 0x1

    :cond_15
    add-int/lit8 v0, v0, -0x1

    goto :goto_5

    :cond_18
    return v2
.end method

.method public size()I
    .registers 2

    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .registers 5

    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    new-array v1, v0, [Ljava/lang/Object;

    iget-object v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    array-length v0, p1

    iget v1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    if-ge v0, v1, :cond_15

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    :cond_15
    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    iget v1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, p1

    iget v1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    if-le v0, v1, :cond_25

    const/4 v0, 0x0

    aput-object v0, p1, v1

    :cond_25
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    invoke-virtual {p0}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "{}"

    return-object v0

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    mul-int/lit8 v1, v1, 0xe

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_18
    iget v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    if-ge v1, v2, :cond_35

    if-lez v1, :cond_23

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1
    :cond_23
    iget-object v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object v2, v2, v1

    if-eq v2, p0, :cond_2d

    .line 2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_32

    :cond_2d
    const-string v2, "(this Set)"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_32
    add-int/lit8 v1, v1, 0x1

    goto :goto_18

    :cond_35
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final くし〴〺ぅ(Ljava/lang/Object;I)I
    .registers 8

    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    const/4 v1, -0x1

    if-nez v0, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    invoke-static {v2, v0, p2}, Lづざかべべ/づざかべべ/びぐびあび;->げつ〴ぬぐ([III)I

    move-result v2

    if-gez v2, :cond_f

    return v2

    :cond_f
    iget-object v3, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object v3, v3, v2

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1a

    return v2

    :cond_1a
    add-int/lit8 v3, v2, 0x1

    :goto_1c
    if-ge v3, v0, :cond_32

    iget-object v4, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    aget v4, v4, v3

    if-ne v4, p2, :cond_32

    iget-object v4, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object v4, v4, v3

    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2f

    return v3

    :cond_2f
    add-int/lit8 v3, v3, 0x1

    goto :goto_1c

    :cond_32
    add-int/2addr v2, v1

    :goto_33
    if-ltz v2, :cond_49

    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    aget v0, v0, v2

    if-ne v0, p2, :cond_49

    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object v0, v0, v2

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_46

    return v2

    :cond_46
    add-int/lit8 v2, v2, -0x1

    goto :goto_33

    :cond_49
    xor-int/lit8 p1, v3, -0x1

    return p1
.end method

.method public final げつ〴ぬぐ(I)V
    .registers 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x8

    if-ne p1, v3, :cond_2c

    const-class v3, Lづざかべべ/づざかべべ/くし〴〺ぅ;

    monitor-enter v3

    :try_start_a
    sget-object v4, Lづざかべべ/づざかべべ/くし〴〺ぅ;->いいにぽつ:[Ljava/lang/Object;

    if-eqz v4, :cond_27

    iput-object v4, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object p1, v4, v1

    check-cast p1, [Ljava/lang/Object;

    sput-object p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->いいにぽつ:[Ljava/lang/Object;

    aget-object p1, v4, v2

    check-cast p1, [I

    iput-object p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    aput-object v0, v4, v2

    aput-object v0, v4, v1

    sget p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺:I

    sub-int/2addr p1, v2

    sput p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺:I

    monitor-exit v3

    return-void

    :cond_27
    monitor-exit v3

    goto :goto_54

    :catchall_29
    move-exception p1

    monitor-exit v3
    :try_end_2b
    .catchall {:try_start_a .. :try_end_2b} :catchall_29

    throw p1

    :cond_2c
    const/4 v3, 0x4

    if-ne p1, v3, :cond_54

    const-class v3, Lづざかべべ/づざかべべ/くし〴〺ぅ;

    monitor-enter v3

    :try_start_32
    sget-object v4, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〳ぜぞぜべっ:[Ljava/lang/Object;

    if-eqz v4, :cond_4f

    iput-object v4, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object p1, v4, v1

    check-cast p1, [Ljava/lang/Object;

    sput-object p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〳ぜぞぜべっ:[Ljava/lang/Object;

    aget-object p1, v4, v2

    check-cast p1, [I

    iput-object p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    aput-object v0, v4, v2

    aput-object v0, v4, v1

    sget p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぺぁあねじ:I

    sub-int/2addr p1, v2

    sput p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぺぁあねじ:I

    monitor-exit v3

    return-void

    :cond_4f
    monitor-exit v3

    goto :goto_54

    :catchall_51
    move-exception p1

    monitor-exit v3
    :try_end_53
    .catchall {:try_start_32 .. :try_end_53} :catchall_51

    throw p1

    :cond_54
    :goto_54
    new-array v0, p1, [I

    iput-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    return-void
.end method

.method public づざかべべ(I)Ljava/lang/Object;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object v1, v0, p1

    iget v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gt v2, v4, :cond_1a

    iget-object p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    invoke-static {p1, v0, v2}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ([I[Ljava/lang/Object;I)V

    sget-object p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->なぎぱいぢぎ:[I

    iput-object p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    sget-object p1, Lづざかべべ/づざかべべ/くし〴〺ぅ;->ぁごぐすすぃ:[Ljava/lang/Object;

    iput-object p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    iput v3, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    goto :goto_6f

    :cond_1a
    iget-object v5, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    array-length v6, v5

    const/16 v7, 0x8

    if-le v6, v7, :cond_55

    array-length v6, v5

    div-int/lit8 v6, v6, 0x3

    if-ge v2, v6, :cond_55

    if-le v2, v7, :cond_2c

    shr-int/lit8 v6, v2, 0x1

    add-int v7, v2, v6

    :cond_2c
    invoke-virtual {p0, v7}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->げつ〴ぬぐ(I)V

    iget v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    sub-int/2addr v2, v4

    iput v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    if-lez p1, :cond_40

    iget-object v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    invoke-static {v5, v3, v2, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    invoke-static {v0, v3, v2, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_40
    iget v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    if-ge p1, v2, :cond_6f

    add-int/lit8 v3, p1, 0x1

    iget-object v4, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    sub-int/2addr v2, p1

    invoke-static {v5, v3, v4, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    iget v4, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    sub-int/2addr v4, p1

    invoke-static {v0, v3, v2, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_6f

    :cond_55
    sub-int/2addr v2, v4

    iput v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    if-ge p1, v2, :cond_68

    add-int/lit8 v0, p1, 0x1

    sub-int/2addr v2, p1

    invoke-static {v5, v0, v5, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    iget v3, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    sub-int/2addr v3, p1

    invoke-static {v2, v0, v2, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_68
    iget-object p1, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    const/4 v2, 0x0

    aput-object v2, p1, v0

    :cond_6f
    :goto_6f
    return-object v1
.end method

.method public final びぐびあび()I
    .registers 6

    iget v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    const/4 v1, -0x1

    if-nez v0, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    const/4 v3, 0x0

    invoke-static {v2, v0, v3}, Lづざかべべ/づざかべべ/びぐびあび;->げつ〴ぬぐ([III)I

    move-result v2

    if-gez v2, :cond_10

    return v2

    :cond_10
    iget-object v3, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object v3, v3, v2

    if-nez v3, :cond_17

    return v2

    :cond_17
    add-int/lit8 v3, v2, 0x1

    :goto_19
    if-ge v3, v0, :cond_2b

    iget-object v4, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    aget v4, v4, v3

    if-nez v4, :cond_2b

    iget-object v4, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object v4, v4, v3

    if-nez v4, :cond_28

    return v3

    :cond_28
    add-int/lit8 v3, v3, 0x1

    goto :goto_19

    :cond_2b
    add-int/lit8 v2, v2, -0x1

    :goto_2d
    if-ltz v2, :cond_3f

    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->〺つふすそ:[I

    aget v0, v0, v2

    if-nez v0, :cond_3f

    iget-object v0, p0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object v0, v0, v2

    if-nez v0, :cond_3c

    return v2

    :cond_3c
    add-int/lit8 v2, v2, -0x1

    goto :goto_2d

    :cond_3f
    xor-int/lit8 v0, v3, -0x1

    return v0
.end method

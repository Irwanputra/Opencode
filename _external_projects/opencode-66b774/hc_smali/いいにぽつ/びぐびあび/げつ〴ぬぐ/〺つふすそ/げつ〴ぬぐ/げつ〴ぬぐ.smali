.class public Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/げつ〴ぬぐ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    check-cast p1, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/げつ〴ぬぐ;

    if-eq p1, p0, :cond_1a

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p0, p1, p1}, Lいいにぽつ/びぐびあび/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1b

    :cond_1a
    const/4 v1, 0x1

    :cond_1b
    return v1
.end method

.method public hashCode()I
    .registers 2

    const/16 v0, 0x20

    return v0
.end method

.method public final げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 3

    const/4 p1, 0x1

    return p1
.end method

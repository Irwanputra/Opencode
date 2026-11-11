.class public abstract Lぺぁあねじ/ぺぁあねじ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/でどあくず;


# instance fields
.field public final 〺つふすそ:Lぺぁあねじ/でどあくず;


# direct methods
.method public constructor <init>(Lぺぁあねじ/でどあくず;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_8

    iput-object p1, p0, Lぺぁあねじ/ぺぁあねじ;->〺つふすそ:Lぺぁあねじ/でどあくず;

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public close()V
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/ぺぁあねじ;->〺つふすそ:Lぺぁあねじ/でどあくず;

    invoke-interface {v0}, Lぺぁあねじ/でどあくず;->close()V

    return-void
.end method

.method public flush()V
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/ぺぁあねじ;->〺つふすそ:Lぺぁあねじ/でどあくず;

    invoke-interface {v0}, Lぺぁあねじ/でどあくず;->flush()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lぺぁあねじ/ぺぁあねじ;->〺つふすそ:Lぺぁあねじ/でどあくず;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/ぺぁあねじ;->〺つふすそ:Lぺぁあねじ/でどあくず;

    invoke-interface {v0}, Lぺぁあねじ/でどあくず;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

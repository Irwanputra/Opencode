.class public Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "L\u3044\u3044\u306b\u307d\u3064/\u303a\u3064\u3075\u3059\u305d/\u3073\u3050\u3073\u3042\u3073/\u3052\u3064\u3034\u306c\u3050;",
        ">;"
    }
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;


# direct methods
.method public constructor <init>(Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;)V
    .registers 2

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .registers 3

    iget v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:I

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    .line 1
    iget v1, v1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    if-ge v0, v1, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method

.method public next()Ljava/lang/Object;
    .registers 6

    .line 1
    new-instance v0, Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    iget-object v2, v1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    iget v3, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:I

    aget-object v2, v2, v3

    iget-object v4, v1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    aget-object v3, v4, v3

    invoke-direct {v0, v2, v3, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>(Ljava/lang/String;Ljava/lang/String;Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;)V

    iget v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:I

    return-object v0
.end method

.method public remove()V
    .registers 7

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    iget v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    iput v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:I

    .line 1
    iget v3, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    if-lt v1, v3, :cond_e

    const/4 v4, 0x1

    goto :goto_f

    :cond_e
    const/4 v4, 0x0

    :goto_f
    if-nez v4, :cond_30

    sub-int/2addr v3, v1

    sub-int/2addr v3, v2

    if-lez v3, :cond_21

    iget-object v4, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    add-int/lit8 v5, v1, 0x1

    invoke-static {v4, v5, v4, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v4, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    invoke-static {v4, v5, v4, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_21
    iget v1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    sub-int/2addr v1, v2

    iput v1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    iget-object v2, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v3, v2, v1

    iget-object v0, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    aput-object v3, v0, v1

    return-void

    .line 2
    :cond_30
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must be false"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

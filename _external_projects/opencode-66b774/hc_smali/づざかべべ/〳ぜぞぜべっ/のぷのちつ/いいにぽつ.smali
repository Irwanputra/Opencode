.class public Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:I

.field public げつ〴ぬぐ:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(I)V
    .registers 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_7

    iput v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->〺つふすそ:I

    goto :goto_9

    :cond_7
    iput v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ:I

    :goto_9
    return-void
.end method

.method public げつ〴ぬぐ()I
    .registers 3

    iget v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ:I

    iget v1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->〺つふすそ:I

    or-int/2addr v0, v1

    return v0
.end method

.class public Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

.field public final synthetic くし〴〺ぅ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;


# direct methods
.method public constructor <init>(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ$〺つふすそ;->くし〴〺ぅ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .registers 3

    check-cast p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

    iget v0, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:I

    iget p1, p1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

    const-string v1, "[ "

    if-eqz v0, :cond_24

    const/4 v0, 0x0

    :goto_7
    const/16 v2, 0x9

    if-ge v0, v2, :cond_24

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

    iget-object v2, v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->〳ぜぞぜべっ:[F

    aget v2, v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_24
    const-string v0, "] "

    invoke-static {v1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;
.super Ljava/util/concurrent/FutureTask;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask<",
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3041\u3054\u3050\u3059\u3059\u3043/\u306a\u304e\u3071\u3044\u3062\u304e;",
        ">;",
        "Ljava/lang/Comparable<",
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050$\u3052\u3064\u3034\u306c\u3050;",
        ">;"
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;

    return-void
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .registers 5

    check-cast p1, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;

    .line 2
    iget-object v1, v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;

    .line 3
    iget-object p1, p1, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;

    .line 4
    iget-object v2, p1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;

    if-ne v1, v2, :cond_12

    .line 5
    iget v0, v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->くし〴〺ぅ:I

    iget p1, p1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;->くし〴〺ぅ:I

    sub-int/2addr v0, p1

    goto :goto_1c

    :cond_12
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sub-int v0, p1, v0

    :goto_1c
    return v0
.end method

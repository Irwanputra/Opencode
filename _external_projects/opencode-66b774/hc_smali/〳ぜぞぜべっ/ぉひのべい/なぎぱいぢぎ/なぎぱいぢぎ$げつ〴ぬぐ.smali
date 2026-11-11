.class public final L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public final げつ〴ぬぐ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3058\u305c\u3053\u307b\u3071;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3058\u305c\u3053\u307b\u3071;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:I

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()Z
    .registers 3

    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:I

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    return v0
.end method

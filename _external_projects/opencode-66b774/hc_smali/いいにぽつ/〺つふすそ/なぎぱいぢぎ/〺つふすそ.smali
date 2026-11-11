.class public abstract Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;,
        Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public final げつ〴ぬぐ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3044\u3044\u306b\u307d\u3064/\u303a\u3064\u3075\u3059\u305d/\u306a\u304e\u3071\u3044\u3062\u304e/\u3073\u3050\u3073\u3042\u3073;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->〺つふすそ:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()V
    .registers 2

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->〺つふすそ:I

    return-void
.end method

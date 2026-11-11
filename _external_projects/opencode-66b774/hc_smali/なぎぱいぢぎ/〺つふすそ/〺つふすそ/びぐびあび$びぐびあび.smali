.class public Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u3073\u3050\u3073\u3042\u3073$\u3073\u3050\u3073\u3042\u3073;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public 〺つふすそ:Ljava/lang/Object;

.field public ぁごぐすすぃ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:Landroid/graphics/Bitmap$Config;

.field public げつ〴ぬぐ:Ljava/lang/String;

.field public づざかべべ:I

.field public なぎぱいぢぎ:Landroid/widget/ImageView$ScaleType;

.field public びぐびあび:I

.field public ぺぁあねじ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;->ぁごぐすすぃ:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;->〳ぜぞぜべっ:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;->ぺぁあねじ:Ljava/util/HashMap;

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;->げつ〴ぬぐ:Ljava/lang/String;

    return-void
.end method

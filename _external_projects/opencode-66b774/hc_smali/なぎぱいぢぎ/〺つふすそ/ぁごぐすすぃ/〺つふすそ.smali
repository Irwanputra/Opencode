.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;,
        Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;,
        Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$づざかべべ;,
        Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$くし〴〺ぅ;
    }
.end annotation


# static fields
.field public static final 〳ぜぞぜべっ:I

.field public static final ぁごぐすすぃ:I

.field public static ぺぁあねじ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;


# instance fields
.field public final 〺つふすそ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3041\u3054\u3050\u3059\u3059\u3043/\u303a\u3064\u3075\u3059\u305d$\u303a\u3064\u3075\u3059\u305d;",
            ">;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3041\u3054\u3050\u3059\u3059\u3043/\u303a\u3064\u3075\u3059\u305d$\u303a\u3064\u3075\u3059\u305d;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$くし〴〺ぅ;

.field public づざかべべ:Ljava/lang/Runnable;

.field public なぎぱいぢぎ:Landroid/graphics/BitmapFactory$Options;

.field public final びぐびあび:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    const-wide/16 v2, 0x400

    div-long/2addr v0, v2

    long-to-int v1, v0

    sput v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->ぁごぐすすぃ:I

    div-int/lit8 v1, v1, 0x8

    sput v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->〳ぜぞぜべっ:I

    return-void
.end method

.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$くし〴〺ぅ;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:Ljava/util/HashMap;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->びぐびあび:Landroid/os/Handler;

    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->なぎぱいぢぎ:Landroid/graphics/BitmapFactory$Options;

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$くし〴〺ぅ;

    return-void
.end method


# virtual methods
.method public final げつ〴ぬぐ(Ljava/lang/String;Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;)V
    .registers 5

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->づざかべべ:Ljava/lang/Runnable;

    if-nez p1, :cond_18

    new-instance p1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {p1, p0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;)V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->づざかべべ:Ljava/lang/Runnable;

    iget-object p2, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->びぐびあび:Landroid/os/Handler;

    const/16 v0, 0x64

    int-to-long v0, v0

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_18
    return-void
.end method

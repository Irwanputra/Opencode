.class public final Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/いいにぽつ$くし〴〺ぅ;
.super Lなぎぱいぢぎ/ぁごぐすすぃ/〺つふすそ/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/いいにぽつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u3041\u3054\u3050\u3059\u3059\u3043/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/〺つふすそ/〺つふすそ;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, Landroid/view/View;

    .line 1
    invoke-static {p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ(Landroid/view/View;)Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;

    move-result-object p1

    .line 2
    iget-object p1, p1, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-nez p1, :cond_12

    const/4 p1, 0x0

    goto :goto_16

    :cond_12
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    .line 3
    :goto_16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
